package me.stormcph.warden;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import me.stormcph.warden.registry.ModItems;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier WARDEN_ID
            = new Identifier("minecraft", "entities/warden");
    //private static final Identifier COAL_ORE_LOOT_TABLE_ID = Blocks.COAL_ORE.getLootTableId();

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {

            if (setter.isBuiltin() && WARDEN_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.75f)) // Drops 100% of the time
                    .with(ItemEntry.builder(ModItems.WARDEN_INGOT));
                supplier.pool(poolBuilder);
            }
        }));
    }
}
package me.stormcph.warden;

import me.stormcph.warden.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Warden implements ModInitializer {


    public static final String MOD_ID = "wpp";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("warden", "other"))
            .icon(() -> new ItemStack(ModItems.WARDEN_INGOT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.WARDEN_INGOT));
                stacks.add(new ItemStack(ModItems.WARDEN_HELMET));
                stacks.add(new ItemStack(ModItems.WARDEN_CHESTPLATE));
                stacks.add(new ItemStack(ModItems.WARDEN_LEGGINGS));
                stacks.add(new ItemStack(ModItems.WARDEN_BOOTS));
                stacks.add(new ItemStack(ModItems.WARDEN_SWORD));
                stacks.add(new ItemStack(ModItems.WARDEN_PICKAXE));
                stacks.add(new ItemStack(ModItems.WARDEN_AXE));
                stacks.add(new ItemStack(ModItems.WARDEN_SHOVEL));
                stacks.add(new ItemStack(ModItems.WARDEN_HOE));
                stacks.add(new ItemStack(ModItems.WARDEN_NUGGET));
            })
            .build();
    // ...


    @Override
    public void onInitialize() {

ModItems.registerItems();
ModLootTableModifiers.modifyLootTables();



    }
}

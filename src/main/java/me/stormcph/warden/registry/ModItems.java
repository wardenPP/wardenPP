package me.stormcph.warden.registry;

import me.stormcph.warden.Warden;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WARDEN_INGOT = new Item(new Item.Settings().group(Warden.ITEM_GROUP));
    public static final Item WARDEN_NUGGET = new Item(new Item.Settings().group(Warden.ITEM_GROUP));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Warden.MOD_ID, "warden_ingot"), WARDEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Warden.MOD_ID, "warden_nugget"), WARDEN_NUGGET);
    }

    //armor
    public static final Item WARDEN_HELMET = registerItem("warden_helmet",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));
    public static final Item WARDEN_CHESTPLATE = registerItem("warden_chestplate",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));
    public static final Item WARDEN_LEGGINGS = registerItem("warden_leggings",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));
    public static final Item WARDEN_BOOTS = registerItem("warden_boots",
            new ArmorItem(ModArmorMaterials.WARDEN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    //tools

    public static final Item WARDEN_SWORD = registerItem("warden_sword",
            new SwordItem(ModToolMaterials.WARDEN, 0, 2f,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    public static final Item WARDEN_AXE = registerItem("warden_axe",
            new ModAxeItem(ModToolMaterials.WARDEN, 2.2f, 1f,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    public static final Item WARDEN_PICKAXE = registerItem("warden_pickaxe",
            new ModpickaxeItem(ModToolMaterials.WARDEN, 0, 2f,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    public static final Item WARDEN_HOE = registerItem("warden_hoe",
            new ModHoeItem(ModToolMaterials.WARDEN, 0, 2f,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    public static final Item WARDEN_SHOVEL = registerItem("warden_shovel",
            new ModShovelItem(ModToolMaterials.WARDEN, 0, 2f,
                    new FabricItemSettings().group(Warden.ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Warden.MOD_ID, name), item);
    }
}
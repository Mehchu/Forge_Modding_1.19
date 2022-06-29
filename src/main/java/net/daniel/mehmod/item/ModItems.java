package net.daniel.mehmod.item;

import net.daniel.mehmod.MehMod;
import net.daniel.mehmod.item.custom.EightBallItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MehMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.MEH_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FARROW = ITEMS.register("farrow",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> HARPER = ITEMS.register("harper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> HOLT = ITEMS.register("holt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> KHAN = ITEMS.register("khan",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> MCLOUGHLIN = ITEMS.register("mcloughlin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> PHELPS = ITEMS.register("phelps",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));
    public static final RegistryObject<Item> TORRE = ITEMS.register("torre",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FACE_TAB)));

    public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));











    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

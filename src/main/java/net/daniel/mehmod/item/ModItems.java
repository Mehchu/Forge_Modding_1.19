package net.daniel.mehmod.item;

import net.daniel.mehmod.MehMod;
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
    public static final RegistryObject<Item> PHELPS = ITEMS.register("phelps",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));
    public static final RegistryObject<Item> TORRE = ITEMS.register("torre",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MEH_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

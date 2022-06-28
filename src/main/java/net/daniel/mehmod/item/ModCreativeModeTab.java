package net.daniel.mehmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MEH_TAB = new CreativeModeTab("mehtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
    public static final CreativeModeTab FACE_TAB = new CreativeModeTab("facetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PHELPS.get());
        }
    };
}

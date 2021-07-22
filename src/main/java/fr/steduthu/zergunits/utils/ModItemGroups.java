package fr.steduthu.zergunits.utils;

import fr.steduthu.zergunits.init.ModItems;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup zergunits_tab = new ItemGroup("zergunits_tab") {

        @Override
        @MethodsReturnNonnullByDefault
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.ZERG_FLESH.get());
        }
    };
}

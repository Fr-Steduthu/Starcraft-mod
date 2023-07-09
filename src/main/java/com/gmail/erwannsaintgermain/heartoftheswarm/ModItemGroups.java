package com.gmail.erwannsaintgermain.heartoftheswarm;

import com.gmail.erwannsaintgermain.heartoftheswarm.init.Registration;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups
{

    public static final ItemGroup zergunits_tab = new ItemGroup("heartoftheswarm_zerg_tab")
    {
        @Override
        @MethodsReturnNonnullByDefault
        public ItemStack makeIcon(){
            return new ItemStack(Registration.ZERG_FLESH.get());
        }
    };
}

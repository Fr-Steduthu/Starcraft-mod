package fr.steduthu.zergunits.init;

import fr.steduthu.zergunits.ZERGUNITS;
import fr.steduthu.zergunits.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZERGUNITS.MODID);

    public static final Item.Properties groupedItems = new Item.Properties().tab(ModItemGroups.zergunits_tab);

    //public static final RegistryObject<Item> ZERG_FLESH = ITEMS.register("zerg_flesh",()->new Item.Properties()));
    public static final RegistryObject<Item> ZERG_FLESH = ITEMS.register("zerg_flesh",()-> new Item(new Item.Properties().tab(ModItemGroups.zergunits_tab).stacksTo(16)));

}

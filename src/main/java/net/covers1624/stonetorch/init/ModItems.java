package net.covers1624.stonetorch.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by covers1624 on 15/07/2017.
 */
public class ModItems {

    public static Item stone_rod;

    public static void init() {
        stone_rod = new Item();
        stone_rod.setTranslationKey("stone_torches:stone_rod");
        stone_rod.setRegistryName("stone_rod");
        stone_rod.setCreativeTab(CreativeTabs.MATERIALS);
        ForgeRegistries.ITEMS.register(stone_rod);
        OreDictionary.registerOre("rodStone", stone_rod);
    }

    @SideOnly (Side.CLIENT)
    public static void initModels() {
        ModelResourceLocation location = new ModelResourceLocation("stone_torches:items", "type=stone_rod");
        ModelLoader.setCustomModelResourceLocation(stone_rod, 0, location);
    }

}

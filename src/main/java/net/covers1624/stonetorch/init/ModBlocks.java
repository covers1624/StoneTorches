package net.covers1624.stonetorch.init;

import net.covers1624.stonetorch.block.BlockStoneTorch;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by covers1624 on 15/07/2017.
 */
public class ModBlocks {

    public static Block torch_block;
    public static Item torch_item;

    public static void init() {
        torch_block = new BlockStoneTorch();
        torch_item = new ItemBlock(torch_block).setRegistryName("stone_torch").setTranslationKey("stone_torches:stone_torch");

        ForgeRegistries.BLOCKS.register(torch_block);
        ForgeRegistries.ITEMS.register(torch_item);
    }

    @SideOnly (Side.CLIENT)
    public static void initModels() {
        ModelResourceLocation location = new ModelResourceLocation(torch_item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(torch_item, 0, location);
    }

}

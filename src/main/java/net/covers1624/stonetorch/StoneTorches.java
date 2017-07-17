package net.covers1624.stonetorch;

import net.covers1624.stonetorch.proxy.Proxy;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by covers1624 on 15/07/2017.
 */
@Mod(modid = StoneTorches.MOD_ID, name = StoneTorches.MOD_NAME)
public class StoneTorches {

    public static final String MOD_ID = "stone_torches";
    public static final String MOD_NAME = "Stone Torches";


    @SidedProxy(clientSide = "net.covers1624.stonetorch.proxy.ProxyClient", serverSide = "net.covers1624.stonetorch.proxy.Proxy")
    public static Proxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        OreDictionary.registerOre("coal", new ItemStack(Items.COAL, 1, 0));
        OreDictionary.registerOre("charcoal", new ItemStack(Items.COAL, 1, 1));
    }
}

package net.covers1624.stonetorch.proxy;

import net.covers1624.stonetorch.init.ModBlocks;
import net.covers1624.stonetorch.init.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by covers1624 on 15/07/2017.
 */
public class Proxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }


}

package net.covers1624.stonetorch.proxy;

import net.covers1624.stonetorch.init.ModBlocks;
import net.covers1624.stonetorch.init.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by covers1624 on 15/07/2017.
 */
public class ProxyClient extends Proxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ModBlocks.initModels();
        ModItems.initModels();
    }
}

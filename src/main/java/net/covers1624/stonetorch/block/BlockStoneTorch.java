package net.covers1624.stonetorch.block;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;

/**
 * Created by covers1624 on 15/07/2017.
 */
public class BlockStoneTorch extends BlockTorch {

    public BlockStoneTorch() {
        super();
        setTranslationKey("stone_torches:stone_torch");
        setRegistryName("stone_torch");
        setHardness(0.0F);
        setLightLevel(0.9375F);
        setSoundType(SoundType.STONE);
    }

}

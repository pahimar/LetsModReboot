package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.block.BlockFlag;
import com.pahimar.letsmodreboot.block.BlockLMRB;
import com.pahimar.letsmodreboot.reference.Names;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}

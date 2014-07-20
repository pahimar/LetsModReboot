package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.item.ItemLMRB;
import com.pahimar.letsmodreboot.item.ItemMapleLeaf;
import com.pahimar.letsmodreboot.reference.Names;
import com.pahimar.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
    }
}

package com.pahimar.letsmodreboot.init;

import com.pahimar.letsmodreboot.item.ItemLMRB;
import com.pahimar.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}

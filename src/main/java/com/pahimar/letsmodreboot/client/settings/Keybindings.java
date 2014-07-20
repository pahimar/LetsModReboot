package com.pahimar.letsmodreboot.client.settings;

import com.pahimar.letsmodreboot.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}

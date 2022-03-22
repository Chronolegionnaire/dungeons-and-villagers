package com.chrono.dungeonsandvillagers;

import com.chrono.dungeonsandvillagers.registry.Moditems;
import net.fabricmc.api.ModInitializer;

public class dungeonsandvillagers implements ModInitializer {

    public static final String MOD_ID = "dandv";

    @Override
    public void onInitialize() {
        Moditems.registerItems();

    }
}

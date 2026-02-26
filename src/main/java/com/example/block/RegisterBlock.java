package com.example.block;

import com.example.FirstCustomModelMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterBlock {
    public static final Block TABLET_ALEX_LOH = registerBlock("alex_loh", new Block(FabricBlockSettings.create()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(FirstCustomModelMod.MODID, name), block);
    }
    public static void register(){

    }
}

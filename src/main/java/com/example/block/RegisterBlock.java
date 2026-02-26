package com.example.block;

import com.example.FirstCustomModelMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterBlock {
    public static final Block TABLET_ALEX_LOH = registerBlock("alex_loh", new Block(FabricBlockSettings.create()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FirstCustomModelMod.MODID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(FirstCustomModelMod.MODID, name), new BlockItem(block, new Item.Settings()));
    }
    public static void register(){

    }
}

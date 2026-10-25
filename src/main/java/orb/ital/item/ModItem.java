package orb.ital.item;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.SemanticContext;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CushionItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import orb.ital.Orbital2;
import orb.ital.food.ModFoods;
import orb.ital.item.custom.CustomItem;

import java.util.function.Function;

public class ModItem {






    public static final Item NUKE =registerItem("nuke",properties -> new Item(properties.food(
            ModFoods.NUKE,ModFoods.NUKE_CONSUMABLE).stacksTo(1).durability(0)));

    public static final Item STAB =registerItem("stab",properties -> new Item(properties.food(
            ModFoods.NUKE,ModFoods.NUKE_CONSUMABLE).stacksTo(1).durability(0)));























    public static void registerModItems(){
        Orbital2.LOGGER.info("Registering Mod Items for"+ Orbital2.MOD_ID) ;
    }


    private static Item registerItem(String name, Function<Item.Properties,Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Orbital2.MOD_ID,name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,Identifier.fromNamespaceAndPath(
                        Orbital2.MOD_ID,name
                ) ))));



}}

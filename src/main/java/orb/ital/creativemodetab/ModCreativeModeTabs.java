package orb.ital.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import orb.ital.Orbital2;
import orb.ital.block.ModBlocks;
import orb.ital.item.ModItem;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ORBITAL_ALL_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Orbital2.MOD_ID,
            "orbital2_items"        ), FabricCreativeModeTab.builder().icon( () -> new ItemStack(ModItem.NUKE))
            .title(Component.translatable("creativemodtab.mod.orbital2_items"))
            .displayItems((parameters, output) -> {

                output.accept(ModItem.NUKE);
                output.accept(ModItem.STAB);
            }).build());
    public static void registerModCreativeModeTabs(){
        Orbital2.LOGGER.info("Registering Creative Mode Tabs For" + Orbital2.MOD_ID);}}



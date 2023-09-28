package com.github.neptuneluke.aworldoficeandfire.item;

import com.github.neptuneluke.aworldoficeandfire.AWorldOfIceAndFire;
import com.github.neptuneluke.aworldoficeandfire.block.AWOIAFBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AWOIAFCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AWorldOfIceAndFire.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ANIMALS_TAB =
            CREATIVE_TABS.register("animals_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(AWOIAFItems.WEIRWOOD_STICK.get()))
                    .title(Component.translatable("creativetab.animals_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(AWOIAFItems.WEIRWOOD_STICK.get());
                        pOutput.accept(AWOIAFItems.WEIRWOOD_ARROW.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB =
        CREATIVE_TABS.register("items_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(AWOIAFItems.WEIRWOOD_STICK.get()))
                    .title(Component.translatable("creativetab.items_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(AWOIAFItems.WEIRWOOD_STICK.get());
                        pOutput.accept(AWOIAFItems.RAW_BRONZE.get());
                        pOutput.accept(AWOIAFItems.BRONZE_INGOT.get());
                        pOutput.accept(AWOIAFItems.STEEL_SCRAP.get());
                        pOutput.accept(AWOIAFItems.STEEL_INGOT.get());
                        pOutput.accept(AWOIAFItems.DRAGON_GLASS_SHARD.get());
                        pOutput.accept(AWOIAFItems.DRAGON_GLASS_FLAKE.get());
                        pOutput.accept(AWOIAFItems.VALYRIAN_STEEL_SHARD.get());
                        pOutput.accept(AWOIAFItems.VALYRIAN_STEEL_INGOT.get());

                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB =
            CREATIVE_TABS.register("blocks_tab", () -> CreativeModeTab.builder()
                    .icon( () -> new ItemStack(AWOIAFBlocks.BRONZE_ORE.get()))
                    .title(Component.translatable("creativetab.blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(AWOIAFBlocks.BRONZE_ORE.get());
                        pOutput.accept(AWOIAFBlocks.BRONZE_BLOCK.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB =
            CREATIVE_TABS.register("weapons_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(AWOIAFItems.WEIRWOOD_STICK.get()))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(AWOIAFItems.WEIRWOOD_ARROW.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {

        CREATIVE_TABS.register(eventBus);
    }
}

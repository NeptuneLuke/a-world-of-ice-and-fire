package com.github.neptuneluke.aworldoficeandfire.item;

import com.github.neptuneluke.aworldoficeandfire.AWorldOfIceAndFire;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AWOIAFItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AWorldOfIceAndFire.MOD_ID);

    public static final RegistryObject<Item> WEIRWOOD_STICK =
            ITEMS.register("weirwood_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEIRWOOD_ARROW =
            ITEMS.register("weirwood_arrow", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}

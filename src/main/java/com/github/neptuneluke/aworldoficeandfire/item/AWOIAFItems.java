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

    public static final RegistryObject<Item> WEIRWOOD_STICK = ITEMS.register("weirwood_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEIRWOOD_ARROW = ITEMS.register("weirwood_arrow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SCRAP = ITEMS.register("steel_scrap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_GLASS_FLAKE = ITEMS.register("dragon_glass_flake", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_GLASS_SHARD = ITEMS.register("dragon_glass_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_INGOT = ITEMS.register("valyrian_steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_SHARD = ITEMS.register("valyrian_steel_shard", () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}

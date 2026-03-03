package de.moddy.testmod.item;

import de.moddy.testmod.Testmod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModIteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MODID);

    public static final RegistryObject<Item> PHOENIX_FEATHER = ITEMS.register(
            "phoenix_feather",
            () -> new Item(new Item.Properties().stacksTo(4).rarity(Rarity.COMMON))
    );

    public static final RegistryObject<Item> WAND = ITEMS.register(
            "wand",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .fireResistant()
                    .durability(40)
            )
    );

    public static void register(IEventBus iEventBus) {
        ITEMS.register(iEventBus);
    }
}

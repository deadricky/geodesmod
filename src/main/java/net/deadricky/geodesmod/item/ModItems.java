package net.deadricky.geodesmod.item;

import net.deadricky.geodesmod.GeodesMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items  ITEMS = DeferredRegister.createItems(GeodesMod.MOD_ID);

    public static final DeferredItem<Item> GEODE = ITEMS.register("geode",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

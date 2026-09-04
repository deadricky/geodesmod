package net.deadricky.geodesmod.item;

import net.deadricky.geodesmod.GeodesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    GeodesMod.MOD_ID
            );

    public static final Supplier<CreativeModeTab> GEODES_ITEMS_TAB =
            CREATIVE_MODE_TABS.register(
                    "geodes_items_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable(
                                    "itemGroup.geodesmod.geodes_items_tab"
                            ))
                            .icon(() -> new ItemStack(ModItems.GEODE.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.GEODE.get());


                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
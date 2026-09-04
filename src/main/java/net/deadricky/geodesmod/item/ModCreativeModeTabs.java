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
                                output.accept(ModItems.AERINITE.get());
                                output.accept(ModItems.ALAMITE.get());
                                output.accept(ModItems.AMETHYST.get());
                                output.accept(ModItems.AMPHIBIAN_FOSSIL.get());
                                output.accept(ModItems.ANCHOR.get());
                                output.accept(ModItems.ANCIENT_DOLL.get());
                                output.accept(ModItems.ANCIENT_DRUM.get());
                                output.accept(ModItems.ANCIENT_SEED.get());
                                output.accept(ModItems.ANCIENT_SWORD.get());
                                output.accept(ModItems.AQUAMARINE.get());
                                output.accept(ModItems.BARYTE.get());
                                output.accept(ModItems.BASALT.get());
                                output.accept(ModItems.BIXITE.get());
                                output.accept(ModItems.BONE_FLUTE.get());
                                output.accept(ModItems.CALCITE.get());
                                output.accept(ModItems.CELESTINE.get());
                                output.accept(ModItems.CHEWING_STICK.get());
                                output.accept(ModItems.CHICKEN_STATUE.get());
                                output.accept(ModItems.CHIPPED_AMPHORA.get());
                                output.accept(ModItems.DIAMOND.get());
                                output.accept(ModItems.DINOSAUR_EGG.get());
                                output.accept(ModItems.DOLOMITE.get());
                                output.accept(ModItems.DRIED_STARFISH.get());
                                output.accept(ModItems.DWARF_GADGET.get());
                                output.accept(ModItems.DWARF_SCROLL_I.get());
                                output.accept(ModItems.DWARF_SCROLL_II.get());
                                output.accept(ModItems.DWARF_SCROLL_III.get());
                                output.accept(ModItems.DWARF_SCROLL_VI.get());
                                output.accept(ModItems.DWARVISH_HELM.get());
                                output.accept(ModItems.EARTH_CRYSTAL.get());
                                output.accept(ModItems.ELVISH_JEWELRY.get());
                                output.accept(ModItems.EMERALD.get());
                                output.accept(ModItems.ESPERITE.get());
                                output.accept(ModItems.FAIRY_STONE.get());
                                output.accept(ModItems.FIRE_OPAL.get());
                                output.accept(ModItems.FIRE_QUARTZ.get());
                                output.accept(ModItems.FLUORAPATITE.get());
                                output.accept(ModItems.FROZEN_GEODE.get());
                                output.accept(ModItems.FROZEN_TEAR.get());
                                output.accept(ModItems.GEM_NODE.get());
                                output.accept(ModItems.GEMINITE.get());
                                output.accept(ModItems.GHOST_CRYSTAL.get());
                                output.accept(ModItems.GLASS_SHARDS.get());
                                output.accept(ModItems.GOLDEN_MASK.get());
                                output.accept(ModItems.GOLDEN_RELIC.get());
                                output.accept(ModItems.GRANITE.get());
                                output.accept(ModItems.HELVITE.get());
                                output.accept(ModItems.HEMATITE.get());
                                output.accept(ModItems.JADE.get());
                                output.accept(ModItems.JAGOITE.get());
                                output.accept(ModItems.JAMBORITE.get());
                                output.accept(ModItems.JASPER.get());
                                output.accept(ModItems.KYANITE.get());
                                output.accept(ModItems.LEMON_STONE.get());
                                output.accept(ModItems.LIMESTONE.get());
                                output.accept(ModItems.LUNARITE.get());
                                output.accept(ModItems.MAGMA_GEODE.get());
                                output.accept(ModItems.MALACHITE.get());
                                output.accept(ModItems.MARBLE.get());
                                output.accept(ModItems.MUDSTONE.get());
                                output.accept(ModItems.NAUTILUS_FOSSIL.get());
                                output.accept(ModItems.NEKOITE.get());
                                output.accept(ModItems.NEPTUNITE.get());
                                output.accept(ModItems.OBSIDIAN.get());
                                output.accept(ModItems.OCEAN_STONE.get());
                                output.accept(ModItems.OPAL.get());
                                output.accept(ModItems.ORNAMENTAL_FAN.get());
                                output.accept(ModItems.ORPIMENT.get());
                                output.accept(ModItems.PETRIFIED_STONE.get());
                                output.accept(ModItems.PREHISTORIC_HANDAXE.get());
                                output.accept(ModItems.PREHISTORIC_RIB.get());
                                output.accept(ModItems.PREHISTORIC_SKULL.get());
                                output.accept(ModItems.PREHISTORIC_TIBIA.get());
                                output.accept(ModItems.PREHISTORIC_TOOL.get());
                                output.accept(ModItems.PREHISTORIC_VERTEBRA.get());
                                output.accept(ModItems.PRISMATIC_SHARD.get());
                                output.accept(ModItems.PYRITE.get());
                                output.accept(ModItems.QUARTZ.get());
                                output.accept(ModItems.RARE_DISC.get());
                                output.accept(ModItems.RUBY.get());
                                output.accept(ModItems.RUSTY_COG.get());
                                output.accept(ModItems.RUSTY_SPOON.get());
                                output.accept(ModItems.RUSTY_SPUR.get());
                                output.accept(ModItems.SANDSTONE.get());
                                output.accept(ModItems.SKELETAL_HAND.get());
                                output.accept(ModItems.SKELETAL_TAIL.get());
                                output.accept(ModItems.SLATE.get());
                                output.accept(ModItems.SOAPSTONE.get());
                                output.accept(ModItems.STRANGE_GREEN_DOLL.get());
                                output.accept(ModItems.STRANGE_YELLOW_DOLL.get());
                                output.accept(ModItems.STAR_SHARD.get());
                                output.accept(ModItems.STONE.get());
                                output.accept(ModItems.THUNDER_EGG.get());
                                output.accept(ModItems.TIGERSEYE.get());
                                output.accept(ModItems.TOPAZ.get());
                                output.accept(ModItems.TRILOBITE.get());


                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
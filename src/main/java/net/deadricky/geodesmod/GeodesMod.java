package net.deadricky.geodesmod;

import com.mojang.logging.LogUtils;
import net.deadricky.geodesmod.item.ModCreativeModeTabs;
import net.deadricky.geodesmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;


@Mod(GeodesMod.MOD_ID)
public class GeodesMod {
    public static final String MOD_ID = "geodesmod";
    public static final Logger LOGGER = LogUtils.getLogger();


    public GeodesMod(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);

        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) { }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == ModCreativeModeTabs.GEODES_ITEMS_TAB) {
            event.accept(ModItems.GEODE);
            event.accept(ModItems.AERINITE);
            event.accept(ModItems.AMETHYST);
            event.accept(ModItems.ALAMITE);
            event.accept(ModItems.AMPHIBIAN_FOSSIL);
            event.accept(ModItems.ANCHOR);
            event.accept(ModItems.ANCIENT_DOLL);
            event.accept(ModItems.ANCIENT_DRUM);
            event.accept(ModItems.ANCIENT_SEED);
            event.accept(ModItems.ANCIENT_SWORD);
            event.accept(ModItems.AQUAMARINE);
            event.accept(ModItems.BARYTE);
            event.accept(ModItems.BASALT);
            event.accept(ModItems.BIXITE);
            event.accept(ModItems.BONE_FLUTE);
            event.accept(ModItems.CALCITE);
            event.accept(ModItems.CELESTINE);
            event.accept(ModItems.CHEWING_STICK);
            event.accept(ModItems.CHICKEN_STATUE);
            event.accept(ModItems.CHIPPED_AMPHORA);
            event.accept(ModItems.DIAMOND);
            event.accept(ModItems.DINOSAUR_EGG);
            event.accept(ModItems.DOLOMITE);
            event.accept(ModItems.DRIED_STARFISH);
            event.accept(ModItems.DWARF_SCROLL_VI);
            event.accept(ModItems.DWARF_SCROLL_III);
            event.accept(ModItems.DWARF_SCROLL_II);
            event.accept(ModItems.DWARF_SCROLL_I);
            event.accept(ModItems.DWARF_GADGET);
            event.accept(ModItems.DWARVISH_HELM);
            event.accept(ModItems.EARTH_CRYSTAL);
            event.accept(ModItems.ELVISH_JEWELRY);
            event.accept(ModItems.EMERALD);
            event.accept(ModItems.ESPERITE);
            event.accept(ModItems.FAIRY_STONE);
            event.accept(ModItems.FIRE_OPAL);
            event.accept(ModItems.FIRE_QUARTZ);
            event.accept(ModItems.FLUORAPATITE);
            event.accept(ModItems.FROZEN_GEODE);
            event.accept(ModItems.FROZEN_TEAR);
            event.accept(ModItems.GEM_NODE);
            event.accept(ModItems.GEMINITE);
            event.accept(ModItems.GHOST_CRYSTAL);
            event.accept(ModItems.GLASS_SHARDS);
            event.accept(ModItems.GOLDEN_MASK);
            event.accept(ModItems.GOLDEN_RELIC);
            event.accept(ModItems.GRANITE);
            event.accept(ModItems.HELVITE);
            event.accept(ModItems.HEMATITE);
            event.accept(ModItems.JADE);
            event.accept(ModItems.JAMBORITE);
            event.accept(ModItems.JAGOITE);
            event.accept(ModItems.JASPER);
            event.accept(ModItems.KYANITE);
            event.accept(ModItems.LEMON_STONE);
            event.accept(ModItems.LIMESTONE);
            event.accept(ModItems.LUNARITE);
            event.accept(ModItems.MAGMA_GEODE);
            event.accept(ModItems.MALACHITE);
            event.accept(ModItems.MARBLE);
            event.accept(ModItems.MUDSTONE);
            event.accept(ModItems.NAUTILUS_FOSSIL);
            event.accept(ModItems.NEKOITE);
            event.accept(ModItems.NEPTUNITE);
            event.accept(ModItems.OBSIDIAN);
            event.accept(ModItems.OCEAN_STONE);
            event.accept(ModItems.OMNI_GEODE);
            event.accept(ModItems.OPAL);
            event.accept(ModItems.ORNAMENTAL_FAN);
            event.accept(ModItems.ORPIMENT);
            event.accept(ModItems.PETRIFIED_STONE);
            event.accept(ModItems.PREHISTORIC_HANDAXE);
            event.accept(ModItems.PREHISTORIC_RIB);
            event.accept(ModItems.PREHISTORIC_SKULL);
            event.accept(ModItems.PREHISTORIC_TIBIA);
            event.accept(ModItems.PREHISTORIC_TOOL);
            event.accept(ModItems.PREHISTORIC_VERTEBRA);
            event.accept(ModItems.PRISMATIC_SHARD);
            event.accept(ModItems.PYRITE);
            event.accept(ModItems.QUARTZ);
            event.accept(ModItems.RARE_DISC);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.RUSTY_COG);
            event.accept(ModItems.RUSTY_SPOON);
            event.accept(ModItems.RUSTY_SPUR);
            event.accept(ModItems.SANDSTONE);
            event.accept(ModItems.SKELETAL_HAND);
            event.accept(ModItems.SKELETAL_TAIL);
            event.accept(ModItems.SLATE);
            event.accept(ModItems.SOAPSTONE);
            event.accept(ModItems.STAR_SHARD);
            event.accept(ModItems.STONE);
            event.accept(ModItems.STRANGE_GREEN_DOLL);
            event.accept(ModItems.STRANGE_YELLOW_DOLL);
            event.accept(ModItems.THUNDER_EGG);
            event.accept(ModItems.TIGERSEYE);
            event.accept(ModItems.TOPAZ);
            event.accept(ModItems.TRILOBITE);


        }
    }
    @SubscribeEvent public void onServerStarting(ServerStartingEvent event) { }

}
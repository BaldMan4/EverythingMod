package net.baldman.everythingmod.item;

import net.baldman.everythingmod.EverythingMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EverythingMod.MOD_ID);

    public static final Supplier<CreativeModeTab> EVERYTHING_MOD_TOOLS_AND_UTILITIES_TAB = CREATIVE_MODE_TAB.register("everything_mod_tools_and_utilities_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.EMERALD_PICKAXE.get()))
                    .title(Component.translatable("creativetab.everythingmod.tools_and_utilities"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.COPPER_SHOVEL);
                        output.accept(ModItems.COPPER_PICKAXE);
                        output.accept(ModItems.COPPER_AXE);
                        output.accept(ModItems.COPPER_HOE);


                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_HOE);

                    }).build());

    public static final Supplier<CreativeModeTab> EVERYTHING_MOD_COMBAT_TAB = CREATIVE_MODE_TAB.register("everything_mod_combat_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.EMERALD_SWORD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EverythingMod.MOD_ID, "everything_mod_tools_and_utilities_tab"))
                    .title(Component.translatable("creativetab.everythingmod.combat"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.COPPER_HELMET);
                        output.accept(ModItems.COPPER_CHESTPLATE);
                        output.accept(ModItems.COPPER_LEGGINGS);
                        output.accept(ModItems.COPPER_BOOTS);

                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);

                        output.accept(ModItems.COPPER_SWORD);
                        output.accept(ModItems.COPPER_AXE);

                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_AXE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

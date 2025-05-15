package net.baldman.everythingmod.item;

import net.baldman.everythingmod.EverythingMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EverythingMod.MOD_ID);

    public static final Supplier<CreativeModeTab> EVERYTHING_MOD_COMBAT_TAB = CREATIVE_MODE_TAB.register("everything_mod_combat_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.COPPER_HELMET.get()))
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

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

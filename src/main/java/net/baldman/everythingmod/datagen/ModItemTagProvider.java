package net.baldman.everythingmod.datagen;

import net.baldman.everythingmod.EverythingMod;
import net.baldman.everythingmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EverythingMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_BOOTS.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_HELMET.get())

                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_HELMET.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get())
                .add(ModItems.EMERALD_SHOVEL.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get());

        tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get())
                .add(ModItems.EMERALD_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get())
                .add(ModItems.EMERALD_HOE.get());
    }
}

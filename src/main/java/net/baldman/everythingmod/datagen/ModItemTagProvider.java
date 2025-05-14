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
                .add(ModItems.COPPER_HELMET.get());
    }
}

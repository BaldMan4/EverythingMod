package net.baldman.everythingmod.item;

import net.baldman.everythingmod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            155, 10F, 1.0F, 20, () -> Ingredient.of(Items.COPPER_INGOT));

    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            906, 7.0F, 2.5F, 12, () -> Ingredient.of(Items.EMERALD));
}

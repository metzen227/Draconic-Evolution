package com.brandon3055.draconicevolution.items.tools;

import com.brandon3055.brandonscore.lib.Pair;
import com.brandon3055.draconicevolution.client.DETextures;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by brandon3055 on 2/06/2016.
 */
public class WyvernPick extends MiningToolBase {
    public WyvernPick(Properties properties) {
        super(properties, MiningToolBase.PICKAXE_OVERRIDES);
    }

    //    public WyvernPick(/*double attackDamage, double attackSpeed, */Set<Block> effectiveBlocks) {
//        super(/*attackDamage, attackSpeed, */effectiveBlocks);
//    }
//
//    public WyvernPick() {
//        super(/*ToolStats.WYV_PICK_ATTACK_DAMAGE, ToolStats.WYV_PICK_ATTACK_SPEED, */PICKAXE_OVERRIDES);
////        this.baseMiningSpeed = (float) ToolStats.WYV_PICK_MINING_SPEED;
////        this.baseAOE = ToolStats.BASE_WYVERN_MINING_AOE;
////        setEnergyStats(ToolStats.WYVERN_BASE_CAPACITY, 512000, 0);
//        this.setHarvestLevel("pickaxe", 10);
//    }

    @Override
    public double getBaseMinSpeedConfig() {
        return ToolStats.WYV_PICK_MINING_SPEED;
    }

    @Override
    public int getBaseMinAOEConfig() {
        return ToolStats.BASE_WYVERN_MINING_AOE;
    }

    @Override
    public double getBaseAttackSpeedConfig() {
        return ToolStats.WYV_PICK_ATTACK_SPEED;
    }

    @Override
    public double getBaseAttackDamageConfig() {
        return ToolStats.WYV_PICK_ATTACK_DAMAGE;
    }

    @Override
    public void loadEnergyStats() {
        setEnergyStats(ToolStats.WYVERN_BASE_CAPACITY, 512000, 0);
    }

    @Override
    public int getMaxUpgradeLevel(ItemStack stack, String upgrade) {
        return 2;
    }

    @Override
    public int getToolTier(ItemStack stack) {
        return 0;
    }

    //region Rendering

    @Override
    public Pair<TextureAtlasSprite, ResourceLocation> getModels(ItemStack stack) {
        return new Pair<>(DETextures.WYVERN_PICKAXE, new ResourceLocation("draconicevolution", "models/item/tools/wyvern_pickaxe.obj"));
    }

    //endregion
}

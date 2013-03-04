package communityMod.common;

import communityMod.common.blocks.BlockConcrete;
import communityMod.common.blocks.BlockIronGirder;
import communityMod.common.blocks.BlockMetal;
import communityMod.common.blocks.BlockOre;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocksHelper {

	//Blocks
	public static Block siliconOre;
	public static Block leadOre;
	public static Block titaniumOre;
	public static Block leadBlock;
	public static Block titaniumBlock;
	public static Block copperOre;
	public static Block siliconBlock;
	public static Block ironGirder;
	public static Block concrete;
	public static Block ligniteOre;
	public static Block bituminousOre;
	public static Block anthraciteOre;
	public static Block platinumOre;
	public static Block tungstenOre;
	public static Block arsmiumOre;
	public static Block urdiumOre;
	public static Block franciumOre;
	public static Block franciumBlock;

	public static void setupBlocks() {
		//Block Loading
		siliconOre = new BlockOre(CommunityMod.siliconOreID, 0).setHardness(10F).setResistance(0.2F).setBlockName("SiliconOre").setCreativeTab(CommunityMod.modTab);
		leadOre = new BlockOre(CommunityMod.leadOreID, 1).setHardness(10F).setResistance(0.2F).setBlockName("LeadOre").setCreativeTab(CommunityMod.modTab);
		titaniumOre = new BlockOre(CommunityMod.titaniumOreID, 2).setHardness(10F).setResistance(0.2F).setBlockName("TitaniumOre").setCreativeTab(CommunityMod.modTab);				
		leadBlock = new BlockMetal(CommunityMod.leadBlockID, 4).setHardness(12F).setResistance(10F).setBlockName("LeadBlock").setCreativeTab(CommunityMod.modTab);
		titaniumBlock = new BlockMetal(CommunityMod.titaniumBlockID, 3).setHardness(12F).setResistance(10F).setBlockName("TitaniumBlock").setCreativeTab(CommunityMod.modTab);
		copperOre = new BlockOre(CommunityMod.copperOreID, 6).setHardness(10F).setResistance(0.2F).setBlockName("CopperOre").setCreativeTab(CommunityMod.modTab);
		siliconBlock = new BlockMetal(CommunityMod.siliconBlockID, 5).setHardness(12F).setResistance(10F).setBlockName("SiliconBlock").setCreativeTab(CommunityMod.modTab);
		ironGirder = new BlockIronGirder(CommunityMod.ironGirderID, 8, Material.iron).setBlockName("Iron Girder").setHardness(2F).setStepSound(Block.soundMetalFootstep);
		concrete = new BlockConcrete(CommunityMod.concreteID, 10, Material.iron).setBlockName("Concrete").setHardness(2F).setStepSound(Block.soundStoneFootstep);
		ligniteOre = new BlockOre(CommunityMod.ligniteOreID, 11).setBlockName("LigniteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		bituminousOre = new BlockOre(CommunityMod.bituminousOreID, 12).setBlockName("BituminousOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		anthraciteOre = new BlockOre(CommunityMod.anthraciteOreID, 13).setBlockName("AnthraciteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		platinumOre = new BlockOre(CommunityMod.platinumOreID, 17).setHardness(18F).setResistance(22F).setBlockName("PlatinumOre").setCreativeTab(CommunityMod.modTab);
		tungstenOre = new BlockOre(CommunityMod.tungstenOreID, 19).setHardness(18F).setResistance(22F).setBlockName("TungstenOre").setCreativeTab(CommunityMod.modTab);
		arsmiumOre = new BlockOre(CommunityMod.arsmiumOreID, 18).setHardness(18F).setResistance(22F).setBlockName("ArsmiumOre").setCreativeTab(CommunityMod.modTab);
		urdiumOre = new BlockOre(CommunityMod.urdiumOreID, 16).setHardness(18F).setResistance(22F).setBlockName("UrdiumOre").setCreativeTab(CommunityMod.modTab);
		franciumOre = new BlockOre(CommunityMod.franciumOreID, 14).setHardness(18F).setResistance(22F).setBlockName("FranciumOre").setCreativeTab(CommunityMod.modTab);
		franciumBlock = new BlockMetal(CommunityMod.franciumBlockID, 15).setHardness(18F).setResistance(22F).setBlockName("FranciumBlock").setCreativeTab(CommunityMod.modTab);
		
		gameRegisters();
		languageRegisters();
	}

	private static void gameRegisters() {
		//Block Registry
		GameRegistry.registerBlock(siliconOre, "SiliconOre");
		GameRegistry.registerBlock(leadOre, "LeadOre");
		GameRegistry.registerBlock(titaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(leadBlock, "LeadBlock");
		GameRegistry.registerBlock(titaniumBlock, "TitaniumBlock");
		GameRegistry.registerBlock(copperOre, "CopperOre");
		GameRegistry.registerBlock(siliconBlock, "SiliconBlock");
		GameRegistry.registerBlock(ironGirder, "IronGirder");
		GameRegistry.registerBlock(concrete, "Concrete");
		GameRegistry.registerBlock(ligniteOre, "Lignite Ore");
		GameRegistry.registerBlock(bituminousOre, "Bituminous Ore");
		GameRegistry.registerBlock(anthraciteOre, "Anthracite Ore");
		GameRegistry.registerBlock(platinumOre, "PlatinumOre");
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		GameRegistry.registerBlock(arsmiumOre, "ArsmiumOre");
		GameRegistry.registerBlock(urdiumOre, "UrdiumOre");
		GameRegistry.registerBlock(franciumOre, "FranciumOre");
		GameRegistry.registerBlock(franciumBlock, "FranciumBlock");
	}
	
	private static void languageRegisters() {
		//Blocks
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
		LanguageRegistry.addName(leadOre, "Lead Ore");
		LanguageRegistry.addName(titaniumOre, "Titanium Ore");
		LanguageRegistry.addName(leadBlock, "Lead Block");
		LanguageRegistry.addName(titaniumBlock, "Titanium Block");
		LanguageRegistry.addName(copperOre, "Copper Ore");
		LanguageRegistry.addName(siliconBlock, "Silicon Block");
		LanguageRegistry.addName(ironGirder, "Iron Girder");
		LanguageRegistry.addName(concrete, "Concrete");
		LanguageRegistry.addName(ligniteOre, "Lignite Ore");
		LanguageRegistry.addName(bituminousOre, "Bituminous Coal Ore");
		LanguageRegistry.addName(anthraciteOre, "Anthracite Ore");
		LanguageRegistry.addName(platinumOre, "Platinum Ore");
		LanguageRegistry.addName(tungstenOre, "Tungsten Ore");
		LanguageRegistry.addName(arsmiumOre, "Arsmium Ore");
		LanguageRegistry.addName(urdiumOre, "Urdium Ore");
		LanguageRegistry.addName(franciumOre, "Francium Ore");
		LanguageRegistry.addName(franciumBlock, "Francium Block");
	}

}
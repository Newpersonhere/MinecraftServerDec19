package net.minecraft.server;

import java.util.Set;

import com.google.common.collect.Sets;

public class Blocks {
	
	private static final Set BLOCK_REGISTRY;
	public static final Block AIR;
	public static final Block STONE;
	public static final BlockGrass GRASS;
	public static final Block DIRT;
	public static final Block COBBLESTONE;
	public static final Block PLANKS;
	public static final Block SAPLING;
	public static final Block BEDROCK;
	public static final BlockFlowing FLOWING_WATER;
	public static final BlockStationary WATER;
	public static final BlockFlowing FLOWING_LAVA;
	public static final BlockStationary LAVA;
	public static final BlockSand SAND;
	public static final Block GRAVEL;
	public static final Block GOLD_ORE;
	public static final Block IRON_ORE;
	public static final Block COAL_ORE;
	public static final Block LOG;
	public static final Block LOG2;
	public static final class_alc LEAVES;
	public static final class_alc LEAVES2;
	public static final Block SPONGE;
	public static final Block GLASS;
	public static final Block LAPIS_ORE;
	public static final Block LAPIS_BLOCK;
	public static final Block DISPENSER;
	public static final Block SANDSTONE;
	public static final Block NOTEBLOCK;
	public static final Block BED;
	public static final Block GOLDEN_RAIL;
	public static final Block DETECTOR_RAIL;
	public static final BlockPiston F;
	public static final Block G;
	public static final BlockLongGrass H;
	public static final BlockDeadBush I;
	public static final BlockPiston J;
	public static final BlockPistonExtension K;
	public static final Block L;
	public static final BlockPistonMoving M;
	public static final BlockFlowers N;
	public static final BlockFlowers O;
	public static final BlockPlant P;
	public static final BlockPlant Q;
	public static final Block R;
	public static final Block S;
	public static final BlockStepAbstract T;
	public static final BlockStepAbstract U;
	public static final Block V;
	public static final Block W;
	public static final Block X;
	public static final Block Y;
	public static final Block Z;
	public static final Block aa;
	public static final BlockFire ab;
	public static final Block ac;
	public static final Block ad;
	public static final BlockChest ae;
	public static final BlockRedstoneWire af;
	public static final Block ag;
	public static final Block ah;
	public static final Block ai;
	public static final Block aj;
	public static final Block ak;
	public static final Block al;
	public static final Block am;
	public static final Block an;
	public static final Block ao;
	public static final Block ap;
	public static final Block aq;
	public static final Block ar;
	public static final Block as;
	public static final Block at;
	public static final Block au;
	public static final Block av;
	public static final Block aw;
	public static final Block ax;
	public static final Block ay;
	public static final Block az;
	public static final Block aA;
	public static final Block aB;
	public static final Block aC;
	public static final Block aD;
	public static final Block aE;
	public static final Block aF;
	public static final Block aG;
	public static final Block aH;
	public static final Block aI;
	public static final Block aJ;
	public static final BlockCactus aK;
	public static final Block aL;
	public static final BlockReed aM;
	public static final Block aN;
	public static final Block aO;
	public static final Block aP;
	public static final Block aQ;
	public static final Block aR;
	public static final Block aS;
	public static final Block aT;
	public static final Block aU;
	public static final Block aV;
	public static final Block aW;
	public static final Block aX;
	public static final BlockPortal aY;
	public static final Block aZ;
	public static final Block ba;
	public static final BlockRedstoneRepeater bb;
	public static final BlockRedstoneRepeater bc;
	public static final Block bd;
	public static final Block be;
	public static final Block bf;
	public static final Block bg;
	public static final Block bh;
	public static final Block bi;
	public static final Block bj;
	public static final Block bk;
	public static final Block bl;
	public static final Block bm;
	public static final Block bn;
	public static final Block bo;
	public static final Block bp;
	public static final Block bq;
	public static final Block br;
	public static final Block bs;
	public static final Block bt;
	public static final Block bu;
	public static final Block bv;
	public static final BlockMycel bw;
	public static final Block bx;
	public static final Block by;
	public static final Block bz;
	public static final Block bA;
	public static final Block bB;
	public static final Block bC;
	public static final Block bD;
	public static final BlockCauldron bE;
	public static final Block bF;
	public static final Block bG;
	public static final Block bH;
	public static final Block bI;
	public static final Block bJ;
	public static final Block bK;
	public static final BlockStepAbstract bL;
	public static final BlockStepAbstract bM;
	public static final Block bN;
	public static final Block bO;
	public static final Block bP;
	public static final Block bQ;
	public static final BlockTripwireHook bR;
	public static final Block bS;
	public static final Block bT;
	public static final Block bU;
	public static final Block bV;
	public static final Block bW;
	public static final Block bX;
	public static final BlockBeacon bY;
	public static final Block bZ;
	public static final Block ca;
	public static final Block cb;
	public static final Block cc;
	public static final Block cd;
	public static final BlockSkull ce;
	public static final Block cf;
	public static final Block cg;
	public static final Block ch;
	public static final Block ci;
	public static final BlockRedstoneComparator cj;
	public static final BlockRedstoneComparator ck;
	public static final BlockRedstoneDetector cl;
	public static final BlockRedstoneDetector cm;
	public static final Block cn;
	public static final Block co;
	public static final BlockHopper cp;
	public static final Block cq;
	public static final Block cr;
	public static final Block cs;
	public static final Block ct;
	public static final Block cu;
	public static final Block cv;
	public static final Block cw;
	public static final Block cx;
	public static final Block cy;
	public static final Block cz;
	public static final Block cA;
	public static final Block cB;
	public static final Block cC;
	public static final Block cD;
	public static final Block cE;
	public static final BlockTallPlant cF;
	public static final BlockStainedGlass cG;
	public static final BlockStainedGlassPane cH;
	public static final Block cI;
	public static final Block cJ;
	public static final Block cK;
	public static final Block cL;
	public static final Block cM;
	public static final Block cN;
	public static final BlockStepAbstract cO;
	public static final BlockStepAbstract cP;
	public static final Block cQ;
	public static final Block cR;
	public static final Block cS;
	public static final Block cT;
	public static final Block cU;
	public static final Block cV;
	public static final BlockStepAbstract cW;
	public static final BlockStepAbstract cX;
	public static final Block cY;
	public static final Block cZ;
	public static final Block da;
	public static final Block db;
	public static final Block dc;
	public static final Block dd;
	public static final Block de;

	private static Block getByName(String var0) {
		Block var1 = (Block) Block.c.c(new class_ke(var0));
		if (!BLOCK_REGISTRY.add(var1)) {
			throw new IllegalStateException("Invalid Block requested: " + var0);
		} else {
			return var1;
		}
	}

	static {
		if (!Bootstrap.isInitDone()) {
			throw new RuntimeException("Accessed Blocks before Bootstrap!");
		} else {
			BLOCK_REGISTRY = Sets.newHashSet();
			AIR = getByName("air");
			STONE = getByName("stone");
			GRASS = (BlockGrass) getByName("grass");
			DIRT = getByName("dirt");
			COBBLESTONE = getByName("cobblestone");
			PLANKS = getByName("planks");
			SAPLING = getByName("sapling");
			BEDROCK = getByName("bedrock");
			FLOWING_WATER = (BlockFlowing) getByName("flowing_water");
			WATER = (BlockStationary) getByName("water");
			FLOWING_LAVA = (BlockFlowing) getByName("flowing_lava");
			LAVA = (BlockStationary) getByName("lava");
			SAND = (BlockSand) getByName("sand");
			GRAVEL = getByName("gravel");
			GOLD_ORE = getByName("gold_ore");
			IRON_ORE = getByName("iron_ore");
			COAL_ORE = getByName("coal_ore");
			LOG = getByName("log");
			LOG2 = getByName("log2");
			LEAVES = (class_alc) getByName("leaves");
			LEAVES2 = (class_alc) getByName("leaves2");
			SPONGE = getByName("sponge");
			GLASS = getByName("glass");
			LAPIS_ORE = getByName("lapis_ore");
			LAPIS_BLOCK = getByName("lapis_block");
			DISPENSER = getByName("dispenser");
			SANDSTONE = getByName("sandstone");
			NOTEBLOCK = getByName("noteblock");
			BED = getByName("bed");
			GOLDEN_RAIL = getByName("golden_rail");
			DETECTOR_RAIL = getByName("detector_rail");
			F = (BlockPiston) getByName("sticky_piston");
			G = getByName("web");
			H = (BlockLongGrass) getByName("tallgrass");
			I = (BlockDeadBush) getByName("deadbush");
			J = (BlockPiston) getByName("piston");
			K = (BlockPistonExtension) getByName("piston_head");
			L = getByName("wool");
			M = (BlockPistonMoving) getByName("piston_extension");
			N = (BlockFlowers) getByName("yellow_flower");
			O = (BlockFlowers) getByName("red_flower");
			P = (BlockPlant) getByName("brown_mushroom");
			Q = (BlockPlant) getByName("red_mushroom");
			R = getByName("gold_block");
			S = getByName("iron_block");
			T = (BlockStepAbstract) getByName("double_stone_slab");
			U = (BlockStepAbstract) getByName("stone_slab");
			V = getByName("brick_block");
			W = getByName("tnt");
			X = getByName("bookshelf");
			Y = getByName("mossy_cobblestone");
			Z = getByName("obsidian");
			aa = getByName("torch");
			ab = (BlockFire) getByName("fire");
			ac = getByName("mob_spawner");
			ad = getByName("oak_stairs");
			ae = (BlockChest) getByName("chest");
			af = (BlockRedstoneWire) getByName("redstone_wire");
			ag = getByName("diamond_ore");
			ah = getByName("diamond_block");
			ai = getByName("crafting_table");
			aj = getByName("wheat");
			ak = getByName("farmland");
			al = getByName("furnace");
			am = getByName("lit_furnace");
			an = getByName("standing_sign");
			ao = getByName("wooden_door");
			ap = getByName("spruce_door");
			aq = getByName("birch_door");
			ar = getByName("jungle_door");
			as = getByName("acacia_door");
			at = getByName("dark_oak_door");
			au = getByName("ladder");
			av = getByName("rail");
			aw = getByName("stone_stairs");
			ax = getByName("wall_sign");
			ay = getByName("lever");
			az = getByName("stone_pressure_plate");
			aA = getByName("iron_door");
			aB = getByName("wooden_pressure_plate");
			aC = getByName("redstone_ore");
			aD = getByName("lit_redstone_ore");
			aE = getByName("unlit_redstone_torch");
			aF = getByName("redstone_torch");
			aG = getByName("stone_button");
			aH = getByName("snow_layer");
			aI = getByName("ice");
			aJ = getByName("snow");
			aK = (BlockCactus) getByName("cactus");
			aL = getByName("clay");
			aM = (BlockReed) getByName("reeds");
			aN = getByName("jukebox");
			aO = getByName("fence");
			aP = getByName("spruce_fence");
			aQ = getByName("birch_fence");
			aR = getByName("jungle_fence");
			aS = getByName("dark_oak_fence");
			aT = getByName("acacia_fence");
			aU = getByName("pumpkin");
			aV = getByName("netherrack");
			aW = getByName("soul_sand");
			aX = getByName("glowstone");
			aY = (BlockPortal) getByName("portal");
			aZ = getByName("lit_pumpkin");
			ba = getByName("cake");
			bb = (BlockRedstoneRepeater) getByName("unpowered_repeater");
			bc = (BlockRedstoneRepeater) getByName("powered_repeater");
			bd = getByName("trapdoor");
			be = getByName("monster_egg");
			bf = getByName("stonebrick");
			bg = getByName("brown_mushroom_block");
			bh = getByName("red_mushroom_block");
			bi = getByName("iron_bars");
			bj = getByName("glass_pane");
			bk = getByName("melon_block");
			bl = getByName("pumpkin_stem");
			bm = getByName("melon_stem");
			bn = getByName("vine");
			bo = getByName("fence_gate");
			bp = getByName("spruce_fence_gate");
			bq = getByName("birch_fence_gate");
			br = getByName("jungle_fence_gate");
			bs = getByName("dark_oak_fence_gate");
			bt = getByName("acacia_fence_gate");
			bu = getByName("brick_stairs");
			bv = getByName("stone_brick_stairs");
			bw = (BlockMycel) getByName("mycelium");
			bx = getByName("waterlily");
			by = getByName("nether_brick");
			bz = getByName("nether_brick_fence");
			bA = getByName("nether_brick_stairs");
			bB = getByName("nether_wart");
			bC = getByName("enchanting_table");
			bD = getByName("brewing_stand");
			bE = (BlockCauldron) getByName("cauldron");
			bF = getByName("end_portal");
			bG = getByName("end_portal_frame");
			bH = getByName("end_stone");
			bI = getByName("dragon_egg");
			bJ = getByName("redstone_lamp");
			bK = getByName("lit_redstone_lamp");
			bL = (BlockStepAbstract) getByName("double_wooden_slab");
			bM = (BlockStepAbstract) getByName("wooden_slab");
			bN = getByName("cocoa");
			bO = getByName("sandstone_stairs");
			bP = getByName("emerald_ore");
			bQ = getByName("ender_chest");
			bR = (BlockTripwireHook) getByName("tripwire_hook");
			bS = getByName("tripwire");
			bT = getByName("emerald_block");
			bU = getByName("spruce_stairs");
			bV = getByName("birch_stairs");
			bW = getByName("jungle_stairs");
			bX = getByName("command_block");
			bY = (BlockBeacon) getByName("beacon");
			bZ = getByName("cobblestone_wall");
			ca = getByName("flower_pot");
			cb = getByName("carrots");
			cc = getByName("potatoes");
			cd = getByName("wooden_button");
			ce = (BlockSkull) getByName("skull");
			cf = getByName("anvil");
			cg = getByName("trapped_chest");
			ch = getByName("light_weighted_pressure_plate");
			ci = getByName("heavy_weighted_pressure_plate");
			cj = (BlockRedstoneComparator) getByName("unpowered_comparator");
			ck = (BlockRedstoneComparator) getByName("powered_comparator");
			cl = (BlockRedstoneDetector) getByName("daylight_detector");
			cm = (BlockRedstoneDetector) getByName("daylight_detector_inverted");
			cn = getByName("redstone_block");
			co = getByName("quartz_ore");
			cp = (BlockHopper) getByName("hopper");
			cq = getByName("quartz_block");
			cr = getByName("quartz_stairs");
			cs = getByName("activator_rail");
			ct = getByName("dropper");
			cu = getByName("stained_hardened_clay");
			cv = getByName("barrier");
			cw = getByName("iron_trapdoor");
			cx = getByName("hay_block");
			cy = getByName("carpet");
			cz = getByName("hardened_clay");
			cA = getByName("coal_block");
			cB = getByName("packed_ice");
			cC = getByName("acacia_stairs");
			cD = getByName("dark_oak_stairs");
			cE = getByName("slime");
			cF = (BlockTallPlant) getByName("double_plant");
			cG = (BlockStainedGlass) getByName("stained_glass");
			cH = (BlockStainedGlassPane) getByName("stained_glass_pane");
			cI = getByName("prismarine");
			cJ = getByName("sea_lantern");
			cK = getByName("standing_banner");
			cL = getByName("wall_banner");
			cM = getByName("red_sandstone");
			cN = getByName("red_sandstone_stairs");
			cO = (BlockStepAbstract) getByName("double_stone_slab2");
			cP = (BlockStepAbstract) getByName("stone_slab2");
			cQ = getByName("end_rod");
			cR = getByName("chorus_plant");
			cS = getByName("chorus_flower");
			cT = getByName("purpur_block");
			cU = getByName("purpur_pillar");
			cV = getByName("purpur_stairs");
			cW = (BlockStepAbstract) getByName("purpur_double_slab");
			cX = (BlockStepAbstract) getByName("purpur_slab");
			cY = getByName("end_bricks");
			cZ = getByName("beetroots");
			da = getByName("grass_path");
			db = getByName("end_gateway");
			dc = getByName("repeating_command_block");
			dd = getByName("chain_command_block");
			de = getByName("structure_block");
			BLOCK_REGISTRY.clear();
		}
	}
}

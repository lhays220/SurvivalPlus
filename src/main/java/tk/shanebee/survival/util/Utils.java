package tk.shanebee.survival.util;

import com.google.common.collect.ImmutableSet;
import org.bukkit.*;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import tk.shanebee.survival.Survival;
import tk.shanebee.survival.managers.ItemManager;
import tk.shanebee.survival.managers.Items;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Utils {

    private static final ImmutableSet<Material> CONCRETE_BLOCKS = ImmutableSet.<Material>builder()
            .add(Material.CYAN_CONCRETE)
            .add(Material.BLACK_CONCRETE)
            .add(Material.BLUE_CONCRETE)
            .add(Material.BROWN_CONCRETE)
            .add(Material.GRAY_CONCRETE)
            .add(Material.GREEN_CONCRETE)
            .add(Material.LIGHT_BLUE_CONCRETE)
            .add(Material.LIGHT_GRAY_CONCRETE)
            .add(Material.LIME_CONCRETE)
            .add(Material.MAGENTA_CONCRETE)
            .add(Material.ORANGE_CONCRETE)
            .add(Material.PINK_CONCRETE)
            .add(Material.PURPLE_CONCRETE)
            .add(Material.RED_CONCRETE)
            .add(Material.WHITE_CONCRETE)
            .add(Material.YELLOW_CONCRETE)
            .build();

    public static boolean isConcrete(Material material) {
        return CONCRETE_BLOCKS.contains(material);
    }

    private static final ImmutableSet<Material> CONCRETE_POWDER = ImmutableSet.<Material>builder()
            .add(Material.BLACK_CONCRETE_POWDER)
            .add(Material.BLUE_CONCRETE_POWDER)
            .add(Material.BROWN_CONCRETE_POWDER)
            .add(Material.CYAN_CONCRETE_POWDER)
            .add(Material.GRAY_CONCRETE_POWDER)
            .add(Material.GREEN_CONCRETE_POWDER)
            .add(Material.LIME_CONCRETE_POWDER)
            .add(Material.MAGENTA_CONCRETE_POWDER)
            .add(Material.ORANGE_CONCRETE_POWDER)
            .add(Material.PINK_CONCRETE_POWDER)
            .add(Material.PURPLE_CONCRETE_POWDER)
            .add(Material.RED_CONCRETE_POWDER)
            .add(Material.WHITE_CONCRETE_POWDER)
            .add(Material.YELLOW_CONCRETE_POWDER)
            .add(Material.LIGHT_BLUE_CONCRETE_POWDER)
            .add(Material.LIGHT_GRAY_CONCRETE_POWDER)
            .build();

    public static boolean isConcretePowder(Material material) {
        return CONCRETE_POWDER.contains(material);
    }

    private final static ImmutableSet<Material> GLAZED_TERRACOTTA = ImmutableSet.<Material>builder()
            .add(Material.BLACK_GLAZED_TERRACOTTA)
            .add(Material.BLUE_GLAZED_TERRACOTTA)
            .add(Material.BROWN_GLAZED_TERRACOTTA)
            .add(Material.CYAN_GLAZED_TERRACOTTA)
            .add(Material.GRAY_GLAZED_TERRACOTTA)
            .add(Material.GREEN_GLAZED_TERRACOTTA)
            .add(Material.LIGHT_BLUE_GLAZED_TERRACOTTA)
            .add(Material.LIME_GLAZED_TERRACOTTA)
            .add(Material.MAGENTA_GLAZED_TERRACOTTA)
            .add(Material.ORANGE_GLAZED_TERRACOTTA)
            .add(Material.PINK_GLAZED_TERRACOTTA)
            .add(Material.PURPLE_GLAZED_TERRACOTTA)
            .add(Material.RED_GLAZED_TERRACOTTA)
            .add(Material.LIGHT_GRAY_GLAZED_TERRACOTTA)
            .add(Material.WHITE_GLAZED_TERRACOTTA)
            .add(Material.YELLOW_GLAZED_TERRACOTTA)
            .build();

    public static boolean isGlazedTerracotta(Material material) {
        return GLAZED_TERRACOTTA.contains(material);
    }

    private final static ImmutableSet<Material> TERRACOTTA = ImmutableSet.<Material>builder()
			.add(Material.BLACK_TERRACOTTA)
			.add(Material.BLUE_TERRACOTTA)
			.add(Material.BROWN_TERRACOTTA)
			.add(Material.CYAN_TERRACOTTA)
			.add(Material.GRAY_TERRACOTTA)
			.add(Material.GREEN_TERRACOTTA)
			.add(Material.LIGHT_BLUE_TERRACOTTA)
			.add(Material.LIME_TERRACOTTA)
			.add(Material.MAGENTA_TERRACOTTA)
			.add(Material.ORANGE_TERRACOTTA)
			.add(Material.PINK_TERRACOTTA)
			.add(Material.PURPLE_TERRACOTTA)
			.add(Material.RED_TERRACOTTA)
			.add(Material.LIGHT_GRAY_TERRACOTTA)
			.add(Material.WHITE_TERRACOTTA)
			.add(Material.YELLOW_TERRACOTTA)
			.build();

    public static boolean isTerracotta(Material material) {
        return TERRACOTTA.contains(material);
    }

    private final static ImmutableSet<Material> NATURAL_ORE_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.COAL_ORE)
			.add(Material.DIAMOND_ORE)
			.add(Material.EMERALD_ORE)
			.add(Material.GOLD_ORE)
			.add(Material.IRON_ORE)
			.add(Material.LAPIS_ORE)
			.add(Material.NETHER_QUARTZ_ORE)
			.add(Material.REDSTONE_ORE)
			.build();

    public static boolean isNaturalOreBlock(Material material) {
        return NATURAL_ORE_BLOCK.contains(material);
    }

    private final static ImmutableSet<Material> ORE_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.COAL_BLOCK)
			.add(Material.DIAMOND_BLOCK)
			.add(Material.EMERALD_BLOCK)
			.add(Material.GOLD_BLOCK)
			.add(Material.IRON_BLOCK)
			.add(Material.LAPIS_BLOCK)
			.add(Material.QUARTZ_BLOCK)
			.add(Material.REDSTONE_BLOCK)
			.build();

    public static boolean isOreBlock(Material material) {
        return ORE_BLOCK.contains(material);
    }

    private final static ImmutableSet<Material> COOKING_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.FURNACE)
			.add(Material.BLAST_FURNACE)
			.add(Material.SMOKER)
			.build();

    public static boolean isCookingBlock(Material material) {
        return COOKING_BLOCK.contains(material);
    }

    private final static ImmutableSet<Material> UTILITY_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.CARTOGRAPHY_TABLE)
			.add(Material.FLETCHING_TABLE)
			.add(Material.LECTERN)
			.add(Material.LOOM)
			.add(Material.STONECUTTER)
			.add(Material.GRINDSTONE)
			.add(Material.SMITHING_TABLE)
			.add(Material.ANVIL)
			.add(Material.ENCHANTING_TABLE)
			.add(Material.JUKEBOX)
			.add(Material.NOTE_BLOCK)
			.add(Material.BREWING_STAND)
			.add(Material.CAULDRON)
			.add(Material.COMPOSTER)
			.build();

    public static boolean isUtilityBlock(Material material) {
        return UTILITY_BLOCK.contains(material);
    }

    private final static ImmutableSet<Material> SHULKER_BOX = ImmutableSet.<Material>builder()
			.add(Material.SHULKER_BOX)
			.add(Material.BLACK_SHULKER_BOX)
			.add(Material.BLUE_SHULKER_BOX)
			.add(Material.BROWN_SHULKER_BOX)
			.add(Material.CYAN_SHULKER_BOX)
			.add(Material.GRAY_SHULKER_BOX)
			.add(Material.GREEN_SHULKER_BOX)
			.add(Material.LIGHT_BLUE_SHULKER_BOX)
			.add(Material.LIGHT_GRAY_SHULKER_BOX)
			.add(Material.LIME_SHULKER_BOX)
			.add(Material.MAGENTA_SHULKER_BOX)
			.add(Material.ORANGE_SHULKER_BOX)
			.add(Material.PINK_SHULKER_BOX)
			.add(Material.PURPLE_SHULKER_BOX)
			.add(Material.RED_SHULKER_BOX)
			.add(Material.WHITE_SHULKER_BOX)
			.add(Material.YELLOW_SHULKER_BOX)
			.build();

    public static boolean isShulkerBox(Material material) {
        return SHULKER_BOX.contains(material);
    }

    private final static ImmutableSet<Material> STORAGE_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.CHEST)
			.add(Material.ENDER_CHEST)
			.add(Material.TRAPPED_CHEST)
			.add(Material.BARREL)
			.build();

    public static boolean isStorageBlock(Material material) {
        return STORAGE_BLOCK.contains(material);
    }

    private final static ImmutableSet<Material> STONE_TYPE_BLOCK = ImmutableSet.<Material>builder()
			.add(Material.STONE)
			.add(Material.COBBLESTONE)
			.add(Material.MOSSY_COBBLESTONE)
			.add(Material.INFESTED_COBBLESTONE)
			.add(Material.ANDESITE)
			.add(Material.POLISHED_ANDESITE)
			.add(Material.DIORITE)
			.add(Material.POLISHED_DIORITE)
			.add(Material.GRANITE)
			.add(Material.POLISHED_GRANITE)
			.add(Material.BRICKS)
			.add(Material.NETHER_BRICKS)
			.add(Material.SANDSTONE)
			.add(Material.CHISELED_SANDSTONE)
			.add(Material.SMOOTH_SANDSTONE)
			.add(Material.CUT_SANDSTONE)
			.add(Material.RED_SANDSTONE)
			.add(Material.CHISELED_RED_SANDSTONE)
			.add(Material.CUT_RED_SANDSTONE)
			.add(Material.SMOOTH_RED_SANDSTONE)
			.add(Material.PRISMARINE)
			.add(Material.NETHERRACK)
			.add(Material.END_STONE)
			.add(Material.END_STONE_BRICKS)
			.add(Material.PURPUR_BLOCK)
			.add(Material.PURPUR_PILLAR)
			.build();

    public static boolean isStoneTypeBlock(Material material) {
        if (STONE_TYPE_BLOCK.contains(material)) return true;
        if (isNonWoodSlab(material)) return true;
        if (isNonWoodStairs(material)) return true;
        return Tag.STONE_BRICKS.isTagged(material) || Tag.WALLS.isTagged(material);
    }

    public static boolean isNonWoodDoor(Material material) {
        return (Tag.DOORS.isTagged(material) && !Tag.WOODEN_DOORS.isTagged(material));
    }

    public static boolean isNonWoodSlab(Material material) {
        return (Tag.SLABS.isTagged(material) && !Tag.WOODEN_SLABS.isTagged(material));
    }

    public static boolean isNonWoodStairs(Material material) {
        return (Tag.STAIRS.isTagged(material) && !Tag.WOODEN_STAIRS.isTagged(material));
    }

    private final static ImmutableSet<Material> WOOD_GATE = ImmutableSet.<Material>builder()
			.add(Material.ACACIA_FENCE_GATE)
			.add(Material.BIRCH_FENCE_GATE)
			.add(Material.DARK_OAK_FENCE_GATE)
			.add(Material.JUNGLE_FENCE_GATE)
			.add(Material.OAK_FENCE_GATE)
			.add(Material.SPRUCE_FENCE_GATE)
			.build();

    public static boolean isWoodGate(Material material) {
        return WOOD_GATE.contains(material);
    }

    private final static ImmutableSet<Material> FARMABLE = ImmutableSet.<Material>builder()
			.add(Material.MELON)
			.add(Material.MELON_STEM)
			.add(Material.PUMPKIN)
			.add(Material.PUMPKIN_STEM)
			.add(Material.JACK_O_LANTERN)
			.add(Material.CHORUS_FLOWER)
			.add(Material.CHORUS_PLANT)
			.add(Material.CARROTS)
			.add(Material.POTATOES)
			.add(Material.BEETROOTS)
			.add(Material.WHEAT)
			.add(Material.SWEET_BERRY_BUSH)
			.add(Material.COCOA)
			.build();

    public static boolean isFarmable(Material material) {
        return FARMABLE.contains(material);
    }

    private final static ImmutableSet<Material> SHOVEL = ImmutableSet.<Material>builder()
			.add(Material.STONE_SHOVEL)
			.add(Material.IRON_SHOVEL)
			.add(Material.DIAMOND_SHOVEL)
			.add(Material.GOLDEN_SHOVEL)
			.add(Material.WOODEN_SHOVEL)
			.build();

    public static boolean isShovel(Material material) {
        return SHOVEL.contains(material);
    }

    private final static ImmutableSet<Material> REQUIRES_SHOVEL = ImmutableSet.<Material>builder()
			.add(Material.GRASS_BLOCK)
			.add(Material.DIRT)
			.add(Material.PODZOL)
			.add(Material.COARSE_DIRT)
			.add(Material.GRASS_PATH)
			.add(Material.FARMLAND)
			.add(Material.SOUL_SAND)
			.add(Material.SAND)
			.add(Material.RED_SAND)
			.add(Material.CLAY)
			.add(Material.MYCELIUM)
			.add(Material.SNOW)
			.add(Material.SNOW_BLOCK)
			.build();

    public static boolean requiresShovel(Material material) {
		return REQUIRES_SHOVEL.contains(material) || isConcretePowder(material);
	}

	private final static ImmutableSet<Material> PICKAXE = ImmutableSet.<Material>builder()
			.add(Material.GOLDEN_PICKAXE)
			.add(Material.WOODEN_PICKAXE)
			.add(Material.DIAMOND_PICKAXE)
			.add(Material.IRON_PICKAXE)
			.add(Material.STONE_PICKAXE)
			.build();

    public static boolean isPickaxe(Material material) {
        return PICKAXE.contains(material);
    }

    private final static ImmutableSet<Material> REQUIRES_PICKAXE = ImmutableSet.<Material>builder()
			.add(Material.NETHER_BRICK_FENCE)
			.add(Material.NETHER_BRICKS)
			.add(Material.RED_NETHER_BRICKS)
			.add(Material.SPAWNER)
			.add(Material.SEA_LANTERN)
			.add(Material.GLOWSTONE)
			.add(Material.END_ROD)
			.add(Material.DISPENSER)
			.add(Material.DROPPER)
			.add(Material.OBSERVER)
			.add(Material.PISTON)
			.add(Material.PISTON_HEAD)
			.add(Material.STICKY_PISTON)
			.add(Material.MOVING_PISTON)
			.add(Material.ENCHANTING_TABLE)
			.add(Material.ANVIL)
			.add(Material.GRINDSTONE)
			.add(Material.STONECUTTER)
			.add(Material.ENDER_CHEST)
			.add(Material.HOPPER)
			.add(Material.CAULDRON)
			.add(Material.BREWING_STAND)
			.add(Material.STONE_PRESSURE_PLATE)
			.add(Material.HEAVY_WEIGHTED_PRESSURE_PLATE)
			.add(Material.LIGHT_WEIGHTED_PRESSURE_PLATE)
			.add(Material.BEACON)
			.add(Material.OBSIDIAN)
			.build();

    public static boolean requiresPickaxe(Material material) {
        if (REQUIRES_PICKAXE.contains(material)) return true;
        if (Utils.isOreBlock(material)) return true;
        if (Utils.isNaturalOreBlock(material)) return true;
        if (Utils.isNonWoodDoor(material)) return true;
        if (Utils.isNonWoodSlab(material)) return true;
        if (Utils.isNonWoodStairs(material)) return true;
        if (Utils.isTerracotta(material)) return true;
        if (Utils.isGlazedTerracotta(material)) return true;
        if (Utils.isConcrete(material)) return true;
        if (Utils.isStoneTypeBlock(material)) return true;
        if (Utils.isCookingBlock(material)) return true;
        if (Tag.WALLS.isTagged(material)) return true;
        if (Tag.ICE.isTagged(material)) return true;
        if (Tag.CORAL_BLOCKS.isTagged(material)) return true;
        return Tag.RAILS.isTagged(material);
    }

    private final static ImmutableSet<Material> AXE = ImmutableSet.<Material>builder()
			.add(Material.WOODEN_AXE)
			.add(Material.STONE_AXE)
			.add(Material.GOLDEN_AXE)
			.add(Material.IRON_AXE)
			.add(Material.DIAMOND_AXE)
			.build();

    public static boolean isAxe(Material material) {
        return AXE.contains(material);
    }

    private final static ImmutableSet<Material> REQUIRES_AXE = ImmutableSet.<Material>builder()
			.add(Material.CHEST)
			.add(Material.TRAPPED_CHEST)
			.add(Material.BARREL)
			.add(Material.CRAFTING_TABLE)
			.add(Material.CARTOGRAPHY_TABLE)
			.add(Material.FLETCHING_TABLE)
			.add(Material.SMITHING_TABLE)
			.add(Material.LOOM)
			.add(Material.LECTERN)
			.add(Material.CAMPFIRE)
			.add(Material.COMPOSTER)
			.add(Material.BOOKSHELF)
			.add(Material.LADDER)
			.add(Material.JUKEBOX)
			.add(Material.NOTE_BLOCK)
			.add(Material.DAYLIGHT_DETECTOR)
			.add(Material.SCAFFOLDING)
			.build();

    public static boolean requiresAxe(Material material) {
        if (REQUIRES_AXE.contains(material)) return true;
        if (Tag.WOODEN_DOORS.isTagged(material)) return true;
        if (Tag.PLANKS.isTagged(material)) return true;
        if (Tag.LOGS.isTagged(material)) return true;
        if (Tag.WOODEN_STAIRS.isTagged(material)) return true;
        if (Tag.WOODEN_SLABS.isTagged(material)) return true;
        if (Tag.WOODEN_FENCES.isTagged(material)) return true;
        if (Tag.WOODEN_PRESSURE_PLATES.isTagged(material)) return true;
        if (Tag.BANNERS.isTagged(material)) return true;
        if (Tag.SIGNS.isTagged(material)) return true;
        return Utils.isWoodGate(material);
    }

    private final static ImmutableSet<Material> REQUIRES_SHEARS = ImmutableSet.<Material>builder()
			.add(Material.COBWEB)
			.add(Material.TRIPWIRE)
			.add(Material.TNT)
			.add(Material.MUSHROOM_STEM)
			.build();

    public static boolean requiresShears(Material material) {
        return REQUIRES_SHEARS.contains(material);
    }

    private final static ImmutableSet<Material> REQUIRES_HAMMER = ImmutableSet.<Material>builder()
			.add(Material.BOOKSHELF)
			.add(Material.LADDER)
			.add(Material.SEA_LANTERN)
			.add(Material.GLOWSTONE)
			.add(Material.END_ROD)
			.add(Material.DISPENSER)
			.add(Material.DROPPER)
			.add(Material.HOPPER)
			.add(Material.STONE_PRESSURE_PLATE)
			.add(Material.LIGHT_WEIGHTED_PRESSURE_PLATE)
			.add(Material.HEAVY_WEIGHTED_PRESSURE_PLATE)
			.add(Material.DAYLIGHT_DETECTOR)
			.add(Material.PISTON)
			.add(Material.STICKY_PISTON)
			.add(Material.REDSTONE_LAMP)
			.add(Material.REPEATER)
			.add(Material.COMPARATOR)
			.add(Material.TRIPWIRE_HOOK)
			.add(Material.BEACON)
			.add(Material.IRON_BARS)
			.add(Material.SCAFFOLDING)
			.build();

    public static boolean requiresHammer(Material material) {
        if (REQUIRES_HAMMER.contains(material)) return true;
        return Tag.DOORS.isTagged(material)

                || isWoodGate(material)
                || isTerracotta(material)
                || isGlazedTerracotta(material)
                || isConcrete(material)
                || isStoneTypeBlock(material)
                || isCookingBlock(material)
                || isStorageBlock(material)
                || isUtilityBlock(material)
                || isShulkerBox(material)
                || isOreBlock(material)

                || Tag.BEDS.isTagged(material)
                || Tag.LOGS.isTagged(material)
                || Tag.STAIRS.isTagged(material)
                || Tag.SLABS.isTagged(material)
                || Tag.PLANKS.isTagged(material)
                || Tag.WOODEN_PRESSURE_PLATES.isTagged(material)
                || Tag.WOODEN_FENCES.isTagged(material)
                || Tag.RAILS.isTagged(material)
                || Tag.BANNERS.isTagged(material)
                || Tag.FENCES.isTagged(material)
                || Tag.SIGNS.isTagged(material);
    }

    public static List<Material> getDrops(Material material, Boolean grown) {
        List<Material> mat = new ArrayList<>();
        switch (material) {
            case PUMPKIN:
                mat.add(Material.PUMPKIN);
                break;
            case JACK_O_LANTERN:
                mat.add(Material.JACK_O_LANTERN);
                break;
            case MELON_STEM:
                mat.add(Material.MELON_SEEDS);
                break;
            case MELON:
                mat.add(Material.MELON_SLICE);
                break;
            case PUMPKIN_STEM:
                mat.add(Material.PUMPKIN_SEEDS);
                break;
            case CHORUS_FLOWER:
                mat.add(Material.CHORUS_FLOWER);
                break;
            case CARROTS:
                mat.add(Material.CARROT);
                break;
            case POTATOES:
                mat.add(Material.POTATO);
                break;
            case BEETROOTS:
                if (grown) {
                    mat.add(Material.BEETROOT);
                    mat.add(Material.BEETROOT_SEEDS);
                }
                else mat.add(Material.BEETROOT_SEEDS);
                break;
            case WHEAT:
                if (grown) {
                    mat.add(Material.WHEAT);
                    mat.add(Material.WHEAT_SEEDS);
                }
                else mat.add(Material.WHEAT_SEEDS);
                break;
            case SWEET_BERRY_BUSH:
                mat.add(Material.SWEET_BERRIES);
                break;
            case COCOA:
                mat.add(Material.COCOA_BEANS);
                break;
            default:
                mat.add(Material.AIR);
        }
        return mat;
    }

    /** Send a colored string to a Player
     * <p>
     *     Does not require ChatColor methods
     * </p>
     * @param player The player to send a colored string to
     * @param msg The string to send including color codes
     */
    public static void sendColoredMsg(CommandSender player, String msg) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

    public static void sendColoredConsoleMsg(String msg) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

	public static void log(String msg) {
		sendColoredConsoleMsg(Survival.getInstance().getLang().prefix + msg);
	}

    /** Gets a colored string
     * @param string The string including color codes
     * @return Returns a formatted string
     */
    public static String getColoredString(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    /** Spawn a particle at a location for all players
     * @param location The location to spawn a particle at
     * @param particle The particle to spawn
     * @param amount The amount of particles
     * @param offsetX Offset by x
     * @param offsetY Offset by y
     * @param offsetZ Offset by z
     */
    public static void spawnParticle(Location location, Particle particle, int amount, double offsetX, double offsetY, double offsetZ) {
        assert location.getWorld() != null;
        location.getWorld().spawnParticle(particle, location, amount, offsetX, offsetY, offsetZ);
    }

    /** Spawn a particle at a location for a player
     * @param location The location to spawn a particle at
     * @param particle The particle to spawn
     * @param amount The amount of particles
     * @param offsetX Offset by x
     * @param offsetY Offset by y
     * @param offsetZ Offset by z
     * @param player The player to spawn a particle for
     */
    public static void spawnParticle(Location location, Particle particle, int amount, double offsetX, double offsetY, double offsetZ, Player player) {
        player.spawnParticle(particle, location, amount, offsetX, offsetY, offsetZ);
    }

    /** Set the durability of an ItemStack
     * @param item The ItemStack to set
     * @param durability The durability to set
     */
    public static void setDurability(ItemStack item, int durability) {
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        ((Damageable) meta).setDamage(durability);
        item.setItemMeta(meta);
    }

    /** Check the durability of an ItemStack
     * @param item The ItemStack to check
     * @return The durability of the ItemStack
     */
    public static int getDurability(ItemStack item) {
        assert item.getItemMeta() != null;
        return ((Damageable) item.getItemMeta()).getDamage();
    }

    public static List<ItemStack> getItemStackDura(Items item, int maxDurability) {
        List<ItemStack> itemStacks = new ArrayList<>();
        for (int i = 0; i < maxDurability; i++) {
            ItemStack stack = ItemManager.get(item);
            ItemMeta meta = stack.getItemMeta();
            assert meta != null;
            ((Damageable) meta).setDamage(i);
            stack.setItemMeta(meta);
            itemStacks.add(stack);
        }
        return itemStacks;
    }

    /** Gets the minutes a player has played on the server
     * @param player The player to check
     * @return The number of minutes they have played on the server
     */
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
	public static int getMinutesPlayed(Player player) {
        int played = player.getStatistic(Statistic.PLAY_ONE_MINUTE);
        return Math.round(played / 1200);
    }

    /** Check if server is running a minimum Minecraft version
     * @param major Major version to check (Most likely just going to be 1)
     * @param minor Minor version to check
     * @return True if running this version or higher
     */
    public static boolean isRunningMinecraft(int major, int minor) {
        return isRunningMinecraft(major, minor, 0);
    }

    /** Check if server is running a minimum Minecraft version
     * @param major Major version to check (Most likely just going to be 1)
     * @param minor Minor version to check
     * @param revision Revision to check
     * @return True if running this version or higher
     */
    public static boolean isRunningMinecraft(int major, int minor, int revision) {
        String[] version = Bukkit.getServer().getBukkitVersion().split("-")[0].split("\\.");
        int maj = Integer.parseInt(version[0]);
        int min = Integer.parseInt(version[1]);
        int rev;
        try {
            rev = Integer.parseInt(version[2]);
        } catch (Exception ignore) {
            rev = 0;
        }
        return maj >= major && min >= minor && rev >= revision;
    }

	/** Check if a class exists
	 * @param className The {@link Class#getCanonicalName() canonical name} of the class
	 * @return True if the class exists
	 */
    public static boolean classExists(final String className) {
    	try {
    		Class.forName(className);
    		return true;
		} catch (ClassNotFoundException ex) {
    		return false;
		}
	}

	/** Check if a method exists
	 * @param c Class the method belongs to
	 * @param methodName Name of method
	 * @param parameterTypes Parameter types for this method
	 * @return True if the method exists
	 */
	public static boolean methodExists(final Class<?> c, final String methodName, final Class<?>... parameterTypes) {
    	try {
    		c.getDeclaredMethod(methodName, parameterTypes);
			return true;
		} catch (NoSuchMethodException ex) {
			return false;
		}
	}

}
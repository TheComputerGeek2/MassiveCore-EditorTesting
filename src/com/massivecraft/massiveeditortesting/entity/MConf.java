package com.massivecraft.massiveeditortesting.entity;

import com.massivecraft.massivecore.Aspect;
import com.massivecraft.massivecore.Multiverse;
import com.massivecraft.massivecore.PotionEffectWrap;
import com.massivecraft.massivecore.SoundEffect;
import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.command.editor.annotation.EditorType;
import com.massivecraft.massivecore.command.type.TypeColor;
import com.massivecraft.massivecore.command.type.TypeDate;
import com.massivecraft.massivecore.command.type.TypeEnchantment;
import com.massivecraft.massivecore.command.type.TypeMillisDiff;
import com.massivecraft.massivecore.command.type.TypePS;
import com.massivecraft.massivecore.command.type.TypePermission;
import com.massivecraft.massivecore.command.type.TypeStringCommand;
import com.massivecraft.massivecore.command.type.combined.TypeDataBannerPattern;
import com.massivecraft.massivecore.command.type.combined.TypePotionEffectWrap;
import com.massivecraft.massivecore.command.type.container.TypeItemStacks;
import com.massivecraft.massivecore.command.type.enumeration.TypeItemFlag;
import com.massivecraft.massivecore.command.type.enumeration.TypePatternType;
import com.massivecraft.massivecore.command.type.enumeration.TypeWeatherType;
import com.massivecraft.massivecore.command.type.enumeration.TypeWorldType;
import com.massivecraft.massivecore.command.type.primitive.TypeBooleanOn;
import com.massivecraft.massivecore.command.type.primitive.TypeBooleanTrue;
import com.massivecraft.massivecore.command.type.primitive.TypeBooleanYes;
import com.massivecraft.massivecore.command.type.primitive.TypeShort;
import com.massivecraft.massivecore.command.type.primitive.TypeStringParsed;
import com.massivecraft.massivecore.command.type.store.TypeAspect;
import com.massivecraft.massivecore.command.type.store.TypeMultiverse;
import com.massivecraft.massivecore.item.DataBannerPattern;
import com.massivecraft.massivecore.item.DataFireworkEffect;
import com.massivecraft.massivecore.item.DataItemStack;
import com.massivecraft.massivecore.item.DataPotionEffect;
import com.massivecraft.massivecore.particleeffect.ParticleEffect;
import com.massivecraft.massivecore.ps.PS;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.teleport.Destination;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Difficulty;
import org.bukkit.DyeColor;
import org.bukkit.FireworkEffect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.WeatherType;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.block.Biome;
import org.bukkit.block.banner.PatternType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.potion.PotionEffectType;

import java.util.Date;
import java.util.List;
import java.util.Map;

@EditorName("config")
public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	// Aliases
	public List<String> aliasesEt = MUtil.list("et", "massiveeditortest");
	public List<String> aliasesEtConfig = MUtil.list("config");
	
	// Test Maps
	public Map<String, String> mapStringToString = MUtil.map(
		"key", "value"
	);
	
	public Map<String, List<String>> mapStringToListString = MUtil.map(
		"key1", MUtil.list(
			"value1-1"
		)
	);
	
	public Map<String, Map<String, String>> mapToMapOfStringToString = MUtil.map(
		"key1", MUtil.map(
			"innerkey1", "innervalue1"
		),
		"key2", MUtil.map(
			"innerkey2", "innervalue2"
		),
		"key3", MUtil.map(
			"innerkey3", "innervalue3"
		)
	);
	
	// Test lists
	public List<String> list = MUtil.list(
		"list item"
	);
	
	public List<List<String>> listNested = MUtil.list(
		MUtil.list(
			"list item"
		)
	);
	
	public List<List<List<List<List<String>>>>> listNested2 = MUtil.list(
		MUtil.list(
			MUtil.list(
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				),
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				)
			),
			MUtil.list(
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				),
				MUtil.list(
					MUtil.list(
						"list item", "list item"
					),
					MUtil.list(
						"list item", "list item"
					)
				)
			)
		)
	);
	
	
	// Let's check some Types
	@EditorType(TypeMillisDiff.class)
	public Long millisecondDiffCheck = 0L;
	
	@EditorType(TypeBooleanYes.class)
	public Boolean booleanYesTest = true;
	
	@EditorType(TypeBooleanOn.class)
	public Boolean booleanOnTest = true;
	// working
	@EditorType(TypeBooleanTrue.class)
	public Boolean booleanTrueTest = true;
	
	public PotionEffectType potionEffectTypeTest = null;
	public ItemStack itemStackTest = null;
	 // working
	// TypePermission
	@EditorType(TypePermission.class)
	public Permission permissionTypeTest = null;
	
	// TypeColor
	@EditorType(TypeColor.class)
	public Color colorTest = Color.AQUA;
	
	// TypeDataFireworkEffect
	public DataFireworkEffect dataFireworkEffectTest = null;
	
	// TypeDataItemStack
	public DataItemStack dataItemStackTest = null;
	
	// TypeDate
	@EditorType(TypeDate.class)
	public Date dateTest = null;
	
	// TypeDestination
	public Destination destinationTest = null;
	
	// TypeEnchantment
	@EditorType(TypeEnchantment.class)
	public Enchantment enchantmentTest = Enchantment.ARROW_DAMAGE;
	
	// TypePS
	@EditorType(TypePS.class)
	public PS psTest = PS.NULL;
	
	// TypeAspect
	@EditorType(TypeAspect.class)
	public Aspect aspectTest = null;
	
	// TypeStringCommand
	@EditorType(TypeStringCommand.class)
	public String stringCommandTest = null;
	
	// TypeMultiverse
	@EditorType(TypeMultiverse.class)
	public Multiverse multiverseTest = null;
	
	// TypeDataBannerPattern
	@EditorType(TypeDataBannerPattern.class)
	public DataBannerPattern dataBannerPatternTest = null;
	
	// TypeDataPotionEffect
	public DataPotionEffect dataPotionEffectTest = null;
	
	// TypePotionEffectWrap
	@EditorType(TypePotionEffectWrap.class)
	public PotionEffectWrap potionEffectWrapTest = null;
	
	// TypeSoundEffect
	public SoundEffect soundEffectTest = null;
	
	// TypeItemStacks
	@EditorType(TypeItemStacks.class)
	public List<ItemStack> itemStacksTest = MUtil.list(new ItemStack(Material.ACACIA_DOOR, 1));
	
	// TypeBiome
	public Biome biomeTest = Biome.BEACHES;
	
	// TypeChatColor
	public ChatColor chatColorTest = ChatColor.AQUA;
	
	// TypeDamageModifier
	public EntityDamageEvent.DamageModifier damageModifierTest = EntityDamageEvent.DamageModifier.ABSORPTION;
	
	// TypeDifficulty
	public Difficulty difficultyTest = Difficulty.EASY;
	
	// TypeDyeColor
	public DyeColor dyeColorTest = DyeColor.BLACK;
	
	// TypeEntityType
	public EntityType entityTypeTest = EntityType.AREA_EFFECT_CLOUD;
	
	// TypeEnvironment
	public World.Environment environmentTest = World.Environment.NETHER;
	
	// TypeEventPriority
	public EventPriority eventPriorityTest = EventPriority.HIGH;
	
	// TypeFireworkEffectType
	public FireworkEffect.Type fireworkEffectTypeTest = FireworkEffect.Type.BALL_LARGE;
	
	// TypeGameMode
	public GameMode gameModeTest = GameMode.ADVENTURE;
	
	// TypeHorseColor
	public Horse.Color horseColorTest = Horse.Color.BLACK;
	
	// TypeHorseStyle
	public Horse.Style horseStyleTest = Horse.Style.BLACK_DOTS;
	
	// TypeHorseVariant
	public Horse.Variant horseVariantTest = Horse.Variant.HORSE;
	
	// TypeItemFlag
	@EditorType(TypeItemFlag.class)
	public ItemFlag itemFlagTest = ItemFlag.HIDE_ATTRIBUTES;
	
	// TypeMaterial
	public Material materialTest = Material.ACTIVATOR_RAIL;
	
	// TypeOcelotType
	public Ocelot.Type ocelotTypeTest = Ocelot.Type.WILD_OCELOT;
	
	// TypeParticleEffect
	public ParticleEffect particleEffectTest = ParticleEffect.BARRIER;
	
	// TypePatternType
	@EditorType(TypePatternType.class)
	public PatternType patternTypeTest = PatternType.SQUARE_BOTTOM_LEFT;
	
	// TypeRabbitType
	public Rabbit.Type rabbitTypeTest = Rabbit.Type.BLACK;
	
	// TypeSkeletonType
	public Skeleton.SkeletonType skeletonTypeTest = Skeleton.SkeletonType.NORMAL;
	
	// TypeSound
	public Sound soundTest = Sound.AMBIENT_CAVE;
	
	// TypeVillagerProfession
	public Villager.Profession villagerProfessionTest = Villager.Profession.BLACKSMITH;
	
	// TypeWeatherType
	@EditorType(TypeWeatherType.class)
	public WeatherType weatherTypeTest = WeatherType.CLEAR;
	
	// TypeWorldType
	@EditorType(TypeWorldType.class)
	public WorldType worldTypeTest = WorldType.AMPLIFIED;
	
	// TypeShort
	@EditorType(TypeShort.class)
	public Short shortTest = null;
	
	// TypeString
	public String stringTest = null;
	
	// TypeStringParsed
	@EditorType(TypeStringParsed.class)
	public String stringParsedTest = null;
	
	// TypeBooleanOn
	// TypeBooleanTrue
	// TypeBooleanYes
	// TypeByte
	// TypeDouble
	// TypeFloat
	// TypeInteger
	// TypeLong
	// TypePlayer
	// TypeStringId
	// TypeSender
	// TypeSenderEntity
	// TypeSenderEntityId
	// TypeSenderId
	// TypeSenderName
	// TypeEnum
	// TypeId
	// TypeItemStack
	// TypeMaterialId
	// TypeNullable
	// TypeList
	// TypeMap
	// TypeMassiveTreeSetInsensitive
	// TypeSet
	// TypeConverter
	// TypeReflection
	// TypeSingleton
	// TypeUniverse
	// TypeWorld
	// TypeWorldId
	// TypeWrapper
	// TypeColl
	// TypeEntity
	// TypeEntityId
	// TypeConverterBannerPatternType
	// TypeConverterColor
	// TypeConverterDyeColor
	// TypeConverterEnchant
	// TypeConverterFireworkEffectType
	// TypeConverterItemFlag
	// TypeConverterPotionEffectType
	// TypeSoundId
	// TypeEntry
	// TypeExceptionSet
	
	
}

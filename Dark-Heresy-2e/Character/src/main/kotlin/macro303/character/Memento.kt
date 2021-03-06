package macro303.character

interface Memento {
	val value: String

	enum class AdministratumMemento(override val value: String) : Memento {
		BRASS_QUILL_TIP(value = "Brass Quill Tip"),
		RIBBON_BOOKMARK(value = "Ribbon Bookmark"),
		CRACKED_LENS(value = "Cracked Lens"),
		SINGED_PARCHMENT(value = "Singed Parchment"),
		VIAL_OF_POWDERED_INK(value = "Vial of Powdered Ink"),
		RUSTY_SCALPEL(value = "Rusty Scalpel"),
		MAP_FRAGMENT(value = "Map Fragment"),
		FINGER_BONE(value = "Finger Bone"),
		WIRE_COIL(value = "Wire Coil"),
		LUMP_OF_CANDLE_WAX(value = "Lump of Candle Wax"),
		GLASS_KEY(value = "Glass Key"),
		CHARCOAL_STICK(value = "Charcoal Stick"),
		CURLED_FINGERNAIL(value = "Curled Fingernail (Yours)"),
		COPPER_KEY_PUNCH(value = "Copper Key Punch"),
		METAL_BOOK_CLASP(value = "Metal Book Clasp"),
		FESNEL_HAIR_PAINT_BRUSH(value = "Fesnel Hair Paint Brush"),
		AQUILA_PAPERWEIGHT(value = "Aquila Paperweight"),
		STITCHING_NEEDLE(value = "Stitching Needle"),
		ANCIENT_MAGNIFYING_LENS(value = "Ancient Magnifying Lens"),
		BLANK_VELUM_FOLIO(value = "Blank Velum Folio")
	}

	enum class ArbitesMemento(override val value: String) : Memento {
		SHORT_LENGTH_OF_CHAIN(value = "Short Length of Chain"),
		EXPIRED_WANTED_POSTER(value = "Expired Wanted Poster"),
		BAG_OF_SHOT_PELLETS(value = "Bag of Shot Pellets"),
		DENTED_STEEL_TOE_CAP(value = "Dented Steel Toe Cap"),
		BROKEN_SPY_EYE_LENS(value = "Broken Spy Eye Lens"),
		LEATHER_WRIST_BAND(value = "Leather Wrist Band"),
		BENT_KEY(value = "Bent Key"),
		LOCK_OF_HAIR(value = "Lock of Hair"),
		KNIFE_HANDLE(value = "Knife Handle"),
		METAL_SHOT_GLASS(value = "Metal Shot Glass"),
		STICK_OF_CHALK(value = "Stick of Chalk"),
		CRACKED_DATA_SLATE(value = "Cracked Data-Slate"),
		OLD_NAMEPLATE(value = "Old Nameplate"),
		SCRAP_OF_CHAIN_MAIL(value = "Scrap of Chain Mail"),
		SMALL_BRUSH(value = "Small Brush"),
		BRAIDED_DOG_HAIR(value = "Braided Dog Hair"),
		POMMEL_WEIGHT(value = "Pommel Weight"),
		SECTION_OF_CHEST_PLATE(value = "Section of Chest Plate"),
		BAG_OF_BROKEN_TEETH(value = "Bag of Broken Teeth"),
		AMASEC_BOTTLE_TOP(value = "Amasec Bottle Top")
	}

	enum class AstraMemento(override val value: String) : Memento {
		MYRRHINE_MUSK_STICK(value = "Myrrhine Musk Stick"),
		BENT_SPOON(value = "Bent Spoon"),
		TORN_TAROT_CARD(value = "Torn Tarot Card"),
		DECK_PLATING_FRAGMENT(value = "Deck Plating Fragment"),
		PRESSED_FLOWER_PETAL(value = "Pressed Flower Petal"),
		WOODEN_EGG(value = "Wooden Egg"),
		NECKLACE_OF_BEADS(value = "Necklace of Beads"),
		METAL_TUBE(value = "Metal Tube (5cm)"),
		WIDE_BLACK_RIBBON(value = "Wide Black Ribbon (30cm)"),
		CRACKED_LOOKING_GLASS(value = "Cracked Looking Glass"),
		ANIMAL_HORN_CHIP(value = "Animal Horn Chip"),
		SWATH_OF_METALLIC_CLOTH(value = "Swath of Metallic Cloth"),
		CHARRED_MAHOGONITE_CHIP(value = "Charred Mahogonite Chip"),
		BAG_OF_TOENAIL_CLIPPINGS(value = "Bag of Toenail Clippings"),
		THIN_GLASSTEEL_DISC(value = "Thin Glassteel Disc"),
		CRYSTAL_RING(value = "Crystal Ring"),
		RUSTED_IRON_NAIL(value = "Rusted Iron Nail"),
		CHIPPED_TRILOBITE_FOSSIL(value = "Chipped Trilobite Fossil"),
		BROKEN_CHRONO(value = "Broken Chrono"),
		CHIPPED_PEARL(value = "Chipped Pearl")
	}

	enum class MechanicusMemento(override val value: String) : Memento {
		BRASS_COG_WHEEL(value = "Brass Cog Wheel"),
		SULPHUR_CRYSTAL(value = "Sulphur Crystal"),
		LENGTH_OF_COILED_WIRE(value = "Length of Coiled Wire"),
		PLASTEEL_CUBE(value = "Plasteel Cube (1cm)"),
		BAG_OF_RED_SAND(value = "Bag of Red Sand"),
		TINY_HAND_GYROSCOPE(value = "Tiny Hand-Gyroscope"),
		NUGGET_OF_COPPER_ORE(value = "Nugget of Copper Ore"),
		BAR_MAGNET_IN_GLASS_BLOCK(value = "Bar Magnet in Glass Block"),
		LUMP_OF_MUMMIFIED_FLESH(value = "Lump of Mummified Flesh (Yours)"),
		CRACKED_CRYSTAL_WAFER(value = "Cracked Crystal Wafer"),
		HEMATITE_STONE(value = "Hematite Stone"),
		PHIAL_OF_IRON_FILINGS(value = "Phial of Iron Filings"),
		SMALL_BRASS_INGOT(value = "Small Brass Ingot"),
		OILY_CLEANING_RAGS(value = "Oily Cleaning Rags"),
		TWISTED_METAL_WRENCH(value = "Twisted Metal Wrench"),
		PHIAL_OF_GELATINOUS_LIQUID(value = "Phial of Gelatinous Liquid"),
		SMALL_METAL_PYRAMID(value = "Small Metal Pyramid"),
		FRAGMENT_OF_STAINED_GLASS(value = "Fragment of Stained Glass"),
		FINGER_BONE(value = "Finger Bone"),
		METAL_CARBON_ROD(value = "Metal Carbon Rod (3cm)")
	}

	enum class MinistorumMemento(override val value: String) : Memento {
		BROKEN_SEXTANT(value = "Broken Sextant"),
		LAMP_WICK(value = "Lamp Wick"),
		LEAKING_HOURGLASS(value = "Leaking Hourglass"),
		MATCH(value = "Match (Used)"),
		TIN_OF_SOFT_WAX(value = "Tin of Soft Wax"),
		DRIED_LEACH(value = "Dried Leach"),
		BALL_OF_FEATHERS(value = "Ball of Feathers"),
		LARGE_SALT_CRYSTAL(value = "Large Salt Crystal (5cm)"),
		BONE_DRILL_BIT(value = "Bone Drill Bit"),
		PHIAL_OF_DUST(value = "Phial of Dust"),
		FRAGMENT_OF_STONE_TABLET(value = "Fragment of Stone Tablet"),
		STAINED_WOODEN_TOOTH(value = "Stained Wooden Tooth"),
		REGICIDE_PIECE(value = "Regicide Piece"),
		LUMP_OF_CANDLE_WAX(value = "Lump of Candle Wax"),
		TATTERED_BOOKMARK(value = "Tattered Bookmark"),
		CORD_FROM_A_WHIP(value = "Cord from a Whip"),
		BRASS_KEY_PUNCH(value = "Brass Key Punch"),
		SCORCHED_FRAGMENT_OF_SKIN(value = "Scorched Fragment of Skin (Possibly Yours)"),
		SLIVER_OF_SILVER_IN_PLASTEEL_DISC(value = "Sliver of Silver in Plasteel Disc"),
		BURNED_FEATHER_QUILL(value = "Burned Feather Quill")
	}

	enum class ImperialMemento(override val value: String) : Memento {
		BURNT_LAS_POWER_PACK(value = "Burnt Las Power Pack"),
		XENOS_SKIN_FRAGMENT(value = "Xenos Skin Fragment"),
		BRAIDED_BOOT_LACE(value = "Braided Boot Lace"),
		BENT_GRENADE_PIN(value = "Bent Grenade Pin"),
		BLOODSTAINED_ROCK(value = "Bloodstained Rock"),
		CHIP_OF_TANK_TREAD(value = "Chip of Tank Tread"),
		SHARD_OF_CERAMITE_ARMOUR(value = "Shard of Ceramite Armour"),
		RATION_PACK_FOIL(value = "Ration Pack Foil"),
		SMALL_IRON_HORSESHOE(value = "Small Iron Horseshoe"),
		ROCK_THAT_GLOWS_IN_DARK(value = "Rock that Glows in Dark"),
		CRACKED_BATON(value = "Cracked Baton"),
		ORK_TOOF_NECKLACE(value = "Ork Toof Necklace"),
		CHUNK_OF_FUSED_SAND(value = "Chunk of Fused Sand"),
		BLOODSTAINED_BANDAGE(value = "Bloodstained Bandage"),
		SMOKED_GLASS_SHARD(value = "Smoked Glass Shard"),
		FRAYED_PENNANT(value = "Frayed Pennant"),
		OLD_HELMET_STRAP(value = "Old Helmet Strap"),
		DENTED_BELT_BUCKLE(value = "Dented Belt Buckle"),
		FORM_4111_JUN_555(value = "Form 4111-JUN-555"),
		BURNT_AND_CRACKED_COMMENDATION_MEDAL(value = "Burnt and Cracked Commendation Medal")
	}

	enum class OutcastMemento(override val value: String) : Memento {
		BOX_OF_USED_MATCHES(value = "Box of Used Matches"),
		BOTTLE_OF_SHRAPNEL(value = "Bottle of Shrapnel"),
		EYE_PATCH(value = "Eye Patch"),
		SILK_GORGET(value = "Silk Gorget"),
		ANKLE_BRACELET(value = "Ankle Bracelet"),
		SHOTGUN_SHELL_CASING(value = "Shotgun Shell Casing"),
		LEATHER_HAIR_STRAP(value = "Leather Hair Strap"),
		CORK_BOTTLE_STOPPER(value = "Cork Bottle Stopper"),
		BENT_COIN(value = "Bent Coin"),
		LEATHER_POUCH(value = "Leather Pouch"),
		FLAGON_HANDLE(value = "Flagon Handle"),
		CLOTH_ARMBAND(value = "Cloth Armband"),
		METAL_ARTIFICIAL_NOSE(value = "Metal Artificial Nose"),
		CRACKED_AUTO_PISTOL_CLIP(value = "Cracked Auto-pistol Clip"),
		TUBE_OF_BRIGHT_LIPSTICK(value = "Tube of Bright Lipstick"),
		MOUTH_HARP(value = "Mouth Harp"),
		LOADED_DICE(value = "Loaded Dice (2)"),
		BADLY_FORGED_COIN(value = "Badly Forged Coin"),
		BAG_OF_DUST(value = "Bag of Dust"),
		PLASTEEL_TOOTHPICK(value = "Plasteel Toothpick")
	}

	enum class FeralMemento(override val value: String) : Memento {
		LENGTH_OF_BRAIDED_HAIR(value = "Length of Braided Hair"),
		ANIMAL_SKULL(value = "Animal Skull"),
		BAG_OF_HOMEWORLD_DIRT(value = "Bag of Homeworld Dirt"),
		BROKEN_SPEAR_TIP(value = "Broken Spear Tip"),
		LEATHER_POUCH(value = "Leather Pouch"),
		COLLECTION_OF_DRIED_LEAVES(value = "Collection of Dried Leaves"),
		CARVED_IDOL(value = "Carved Idol"),
		STONE_FINGER_RING(value = "Stone Finger Ring"),
		UMBILICAL_CORD(value = "Umbilical Cord (Yours)"),
		FIRE_STICK(value = "Fire Stick"),
		FUR_SKIN_CLOAK(value = "Fur/Skin Cloak"),
		STONE_KNIFE(value = "Stone Knife"),
		HIDE_BOOTS(value = "Hide Boots"),
		HUMAN_SKULL(value = "Human Skull"),
		LEATHER_BRACERS(value = "Leather Bracers"),
		BAG_OF_ASHES(value = "Bag of Ashes"),
		NECKLACE_OF_TEETH(value = "Necklace of Teeth"),
		TALLOW_CANDLE(value = "Tallow Candle"),
		CEREMONIAL_MASK(value = "Ceremonial Mask"),
		DRIED_FROG(value = "Dried Frog")
	}

	enum class ForgeMemento(override val value: String) : Memento {
		SKULL_FRAGMENT(value = "Skull Fragment"),
		SMALL_COPPER_DISK(value = "Small Copper Disk"),
		VIAL_OF_SAND(value = "Vial of Sand"),
		SNAPPED_LOCK(value = "Snapped Lock"),
		PLASTEEL_MARBLE(value = "Plasteel Marble"),
		PRESSED_LEAF(value = "Pressed Leaf"),
		TWISTED_WIRE(value = "Twisted Wire"),
		CHUNK_OF_COAL(value = "Chunk of Coal"),
		GREASY_ROD(value = "Greasy Rod (2cm)"),
		TIN_OF_ASHES(value = "Tin of Ashes"),
		STRIP_OF_CONDUIT_INSULATION(value = "Strip of Conduit Insulation"),
		HANDKERCHIEF_WITH_BURN_HOLES(value = "Handkerchief with Burn Holes"),
		BOOT_LACE(value = "Boot Lace"),
		SMUDGED_OPTIC_LENS(value = "Smudged Optic Lens"),
		BROKEN_TOOTH(value = "Broken Tooth (Not yours)"),
		PHIAL_OF_USED_LUBRICANT_OIL(value = "Phial of Used Lubricant Oil"),
		BLOODSTAINED_KERCHIEF(value = "Bloodstained Kerchief"),
		SNAPPED_CALLIPERS(value = "Snapped Callipers"),
		BROKEN_BIONIC_FINGER(value = "Broken Bionic Finger"),
		CRACKED_GUNSIGHT(value = "Cracked Gunsight")
	}

	enum class HighbornMemento(override val value: String) : Memento {
		BROCADE_COAT(value = "Brocade Coat"),
		METAL_LHO_STICK_CASE(value = "Metal Lho-Stick Case"),
		TATTERED_CAPE(value = "Tattered Cape"),
		ANCESTRAL_SABRE(value = "Ancestral Sabre (Broken)"),
		GLASSTEEL_DISK(value = "Glassteel Disc"),
		NECKLACE(value = "Necklace"),
		METAL_FLUTE(value = "Metal Flute"),
		BOOK_OF_INSPIRING_WORDS(value = "Book of Inspiring Words"),
		ICON_OF_THE_EMPEROR(value = "Icon of the Emperor"),
		METAL_COIN(value = "Metal Coin (Bent)"),
		ANTIQUE_EARRING(value = "Antique Earring"),
		TATTERED_VELVET_CLOAK(value = "Tattered Velvet Cloak"),
		IMPRESSIVE_HAT(value = "Impressive Hat"),
		INCENSE_STICKS(value = "Incense Sticks"),
		OLD_KEY(value = "Old Key"),
		SHARD_OF_STAINED_GLASS(value = "Shard of Stained Glass"),
		HEADBAND(value = "Headband"),
		SKULL_CHARM(value = "Skull Charm"),
		PILGRIMAGE_TOKEN(value = "Pilgrimage Token"),
		VIAL_OF_BLESSED_WATER(value = "Vial of Blessed Water")
	}

	enum class HiveMemento(override val value: String) : Memento {
		HEAVY_GLOVES(value = "Heavy Gloves"),
		GANG_HIVE_JACKET(value = "Gang/Hive Jacket"),
		DECK_OF_CARDS(value = "Deck of Cards"),
		WOODEN_DICE(value = "Wooden Dice"),
		SPENT_BULLET_CASING(value = "Spent Bullet Casing"),
		ENGRAVED_KNIFE(value = "Engraved Knife"),
		HIPFLASK(value = "Hipflask"),
		IDENTITY_CARD(value = "Identity Card"),
		TATTOO_KIT(value = "Tattoo Kit"),
		CHIP_FROM_HIVE_WALL(value = "Chip from Hive Wall"),
		LEATHER_CAP(value = "Leather Cap"),
		VIAL_OF_GLOWING_WATER(value = "Vial of Glowing Water"),
		SMOKING_PIPE(value = "Smoking Pipe"),
		MASS_OF_MELTED_BULLETS(value = "Mass of Melted Bullets"),
		CRYSTALLINE_CARVING(value = "Crystalline Carving"),
		STEEL_TOECAP_BOOTS(value = "Steel Toecap Boots"),
		SMALL_LENGTH_OF_CHAIN(value = "Small Length of Chain"),
		LUCKY_COG(value = "Lucky Cog"),
		TUBE_OF_GREASE(value = "Tube of Grease"),
		FANCY_VEST(value = "Fancy Vest")
	}

	enum class ShrineMemento(override val value: String) : Memento {
		PINFEATHER(value = "Pinfeather"),
		BURNED_PILGRIMAGE_RIBBON(value = "Burned Pilgrimage Ribbon"),
		FRAGMENT_OF_TANNED_SKIN(value = "Fragment of Tanned Skin"),
		BAG_OF_WAX_SCRAPINGS(value = "Bag of Wax Scrapings"),
		CLOTH_SASH(value = "Cloth Sash"),
		CHIP_OF_INSCRIBED_BONE(value = "Chip of Inscribed Bone"),
		BAG_OF_BLESSED_DIRT(value = "Bag of Blessed Dirt"),
		SMALL_STONE_BOWL(value = "Small Stone Bowl"),
		BAG_OF_DEAD_SPICES(value = "Bag of Dead Spices"),
		TORN_PAGE_FROM_A_PRAYER_SCROLL(value = "Torn Page from a Prayer Scroll"),
		PHIAL_OF_ASHES(value = "Phial of Ashes"),
		VIAL_OF_BLOOD(value = "Vial of Blood"),
		HANDMADE_AQUILA(value = "Handmade Aquila"),
		RAT_TAIL(value = "Rat Tail"),
		BONE_FLUTE(value = "Bone Flute"),
		BUNDLE_OF_DRIED_GRASS(value = "Bundle of Dried Grass"),
		BONE_RING(value = "Bone Ring"),
		CHIP_FROM_FALLEN_SERVO_SKULL(value = "Chip from Fallen Servo-Skull"),
		FRAGMENT_FROM_STATUE(value = "Fragment from Statue"),
		CARVED_ANIMAL_TOOTH(value = "Carved Animal Tool")
	}

	enum class VoidbornMemento(override val value: String) : Memento {
		BAG_OF_SALT(value = "Bag of Salt"),
		CEREMONIAL_SWORD(value = "Ceremonial Sword (Broken)"),
		CORPSE_HAIR_AMULET(value = "Corpse Hair Amulet"),
		THREE_QUARTZ_MARBLES(value = "Three Quartz Marbles"),
		BONE_DICE(value = "Bone Dice"),
		WOODEN_BEADS(value = "Wooden Beads"),
		INDENT_TAGS(value = "Indent Tags"),
		GLOW_LANTERN(value = "Glow Lantern"),
		AQUILA_PENDENT(value = "Aquila Pendent"),
		SQUEEZEBOX(value = "Squeezebox"),
		LODESTONE(value = "Lodestone"),
		LUCKY_RATS_FOOT(value = "Lucky Rat's Foot"),
		MIRROR(value = "Mirror"),
		ASTEROID_FRAGMENT(value = "Asteroid Fragment"),
		DECK_PLATE_SECTION(value = "Deck Plate Section"),
		EXPIRED_RAD_COUNTER(value = "Expired Rad Counter"),
		GLASS_LENS(value = "Glass Lens"),
		BAG_OF_SEEDS(value = "Bag of Seeds"),
		POLISHED_CORAL_ICON(value = "Polished Coral Icon"),
		WHITTLING_KNIFE(value = "Whittling Knife")
	}
}
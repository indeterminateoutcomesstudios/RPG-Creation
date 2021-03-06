package macro303.character

interface Quirk{
	val value: String

	enum class FeralQuirk(override val value: String): Quirk{
		HAIRY_KNUCKLES(value = "Hairy Knuckles"),
		JOINED_EYEBROWS(value = "Joined Eyebrows"),
		WARPAINT(value = "Warpaint"),
		HUGE_HANDS(value = "Huge Hands"),
		FILED_TEETH(value = "Filed Teeth"),
		BEETLING_BROWS(value = "Beetling Brows"),
		MUSKY_SMELL(value = "Musky Smell"),
		HAIRY(value = "Hairy"),
		RIPPED_EARS(value = "Ripped Ears"),
		LONG_FINGERNAILS(value = "Long Fingernails"),
		TRIBAL_TATTOOING(value = "Tribal Tattooing"),
		SCARRING(value = "Scarring"),
		PIERCED_NOSE(value = "Pierced Nose"),
		CATS_EYES(value = "Cat's Eyes"),
		SMALL_HEAD(value = "Small Head"),
		THICK_JAW(value = "Thick Jaw")
	}

	enum class ForgeQuirk(override val value: String): Quirk{
		RADIATION_SCAR(value = "Radiation Scar"),
		LARGE_HEAD(value = "Large Head"),
		MECHANICUM_TATTOO(value = "Mechanicum Tattoo"),
		CROOKED_NOSE(value = "Crooked Nose"),
		METALLIC_SMELL(value = "Metallic Smell"),
		SMALL_EYES(value = "Small Eyes"),
		SOOT_STAINED_SKIN(value = "Soot-Stained Skin"),
		ACID_BURNS(value = "Acid Burns"),
		MISSING_EYEBROWS(value = "Missing Eyebrows"),
		WHEEZING_SPEECH(value = "Wheezing Speech"),
		MISSING_ONE_EAR(value = "Missing One Ear"),
		SMASHED_TOE(value = "Smashed Toe"),
		SQUINTED_EYES(value = "Squinted Eyes"),
		SHORT_FINGERS(value = "Short Fingers"),
		WIRE_GRILL_OVER_EYES(value = "Wire Grill Over Eyes"),
		DISCOLOURED_FINGERNAIL(value = "Discoloured Fingernail")
	}

	enum class HighbornQuirk(override val value: String): Quirk{
		MISSING_FINGERTIP(value = "Missing Fingertip"),
		AQUILINE_NOSE(value = "Aquiline Nose"),
		BRIGHT_WHITE_TEETH(value = "Bright White Teeth"),
		DUELLING_SCAR(value = "Duelling Scar"),
		PIERCED_NOSE(value = "Pierced Nose"),
		SHINY_HAIR(value = "Shiny Hair"),
		AQUILA_TATTOO(value = "Aquila Tattoo"),
		PERFUMED_ODOUR(value = "Perfumed Odour"),
		POX_MARKS(value = "Pox Marks"),
		DEVOTIONAL_SCAR(value = "Devotional Scar"),
		DECORATIVE_ELECTOO(value = "Decorative Electoo"),
		QUIVERING_FINGERS(value = "Quivering Fingers"),
		PIERCED_EARS(value = "Pierced Ears"),
		SINISTER_BOIL(value = "Sinister Boil"),
		SHARP_CHEEKBONES(value = "Sharp Cheekbones"),
		SLOUCHED_GAIT(value = "Slouched Gait")
	}

	enum class HiveQuirk(override val value: String): Quirk{
		THIN_LIPS(value = "Thin Lips"),
		GRIMY_SKIN(value = "Grimy Skin"),
		PAINTED_FINGERNAILS(value = "Painted Fingernails"),
		ROTTEN_TEETH(value = "Rotten Teeth"),
		FADED_ELECTOO(value = "Faded Electoo"),
		PIERCED_EYEBROW(value = "Pierced Eyebrow"),
		WIRE_MESH_ALONG_CHEEK(value = "Wire Mesh Along Cheek"),
		HACKING_COUGH(value = "Hacking Cough"),
		TATTOO_OVER_ONE_EYE(value = "Tattoo Over One Eye"),
		BULLET_WOUND_SCAR(value = "Bullet Wound Scar"),
		NERVOUS_TIC(value = "Nervous Tic"),
		LARGE_MOLE(value = "Large Mole"),
		POLLUTION_SCARS(value = "Pollution Scars"),
		HUMP(value = "Hump"),
		SMALL_HANDS(value = "Small Hands"),
		CHEMICAL_SMELL(value = "Chemical Smell")
	}

	enum class ShrineQuirk(override val value: String): Quirk{
		HEAVY_BROWS(value = "Heavy Brows"),
		LONG_NOSE(value = "Long Nose"),
		MINISTORUM_TATTOO(value = "Ministorum Tattoo"),
		RIDGED_FINGERNAILS(value = "Ridged Fingernails"),
		CROOKED_TEETH(value = "Crooked Teeth"),
		CLEFTED_CHIN(value = "Clefted Chin"),
		DRY_SKIN(value = "Dry Skin"),
		THICK_EYEBROWS(value = "Thick Eyebrows"),
		INK_STAINED_FINGERNAILS(value = "Ink-Stained Fingernails"),
		SHRIVELLED_EAR(value = "Shrivelled Ear"),
		RITUAL_SCARS(value = "Ritual Scars"),
		THIRD_NIPPLE(value = "Third Nipple"),
		BLOODSHOT_EYES(value = "Bloodshot Eyes"),
		MOULDY_SCENT(value = "Mouldy Scent"),
		WINESTAIN_BIRTHMARK(value = "Winestain Birthmark"),
		BROAD_SHOULDERS(value = "Broad Shoulders")
	}

	enum class VoidbornQuirk(override val value: String): Quirk{
		LONG_TOES(value = "Long Toes"),
		FINE_HAIR(value = "Fine Hair"),
		LONG_FINGERS(value = "Long Fingers"),
		TINY_EARS(value = "Tiny Ears"),
		SPINDLY_LIMBS(value = "Spindly Limbs"),
		YELLOW_FINGERNAILS(value = "Yellow Fingernails"),
		STUMPY_TEETH(value = "Stumpy Teeth"),
		WIDELY_SPACED_EYES(value = "Widely Spaced Eyes"),
		LARGE_HEAD(value = "Large Head"),
		CURVED_SPINE(value = "Curved Spine"),
		HAIRLESS(value = "Hairless"),
		ELEGANT_HANDS(value = "Elegant Hands"),
		SLIGHTLY_CROSS_EYED(value = "Slightly Cross-Eyed"),
		WEBBED_TOES(value = "Webbed Toes"),
		MINOR_LIMP(value = "Minor Limp"),
		MISMATCHED_EYES(value = "Mismatched Eyes")
	}
}
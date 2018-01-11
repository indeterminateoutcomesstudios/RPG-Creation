package macro303.dh2e

import macro303.dh2e.Background.*
import macro303.dh2e.Homeworld.*
import java.util.*
import kotlin.collections.ArrayList

object Builder {
	private fun ClosedRange<Int>.randomInt() = Random().nextInt(endInclusive + 1 - start) + start
	private fun randomBoolean() = Random().nextBoolean()

	fun buildCharacter(
			isMale: Boolean = rollGender(),
			homeworld: Homeworld = rollHomeworld(),
			background: Background = rollBackground(homeworld = homeworld),
			role: Role = rollRole(background = background),
			build: Build = rollBuild(homeworld = homeworld),
			ageStatus: AgeStatus = rollAgeStatus(homeworld = homeworld),
			age: Int = rollAge(ageStatus = ageStatus),
			skinColour: SkinColour = rollSkinColour(homeworld = homeworld),
			hairColour: HairColour = rollHairColour(homeworld = homeworld),
			eyeColour: EyeColour = rollEyeColour(homeworld = homeworld),
			quirks: ArrayList<Quirk> = ArrayList(),
			superstition: Superstition = rollSuperstition(homeworld = homeworld),
			homeworldMemento: HomeworldMemento = rollHomeworldMemento(homeworld = homeworld),
			backgroundMemento: BackgroundMemento = rollBackgroundMemento(background = background)
	): Character {
		val tempQuirks = if (quirks.isNotEmpty()) quirks else rollQuirks(homeworld = homeworld)
		return Character(
				isMale = isMale,
				homeworld = homeworld,
				background = background,
				role = role,
				build = build,
				ageStatus = ageStatus,
				age = age,
				skinColour = skinColour,
				hairColour = hairColour,
				eyeColour = eyeColour,
				quirks = tempQuirks,
				superstition = superstition,
				homeworldMemento = homeworldMemento,
				backgroundMemento = backgroundMemento
		)
	}

	private fun rollGender(): Boolean {
		return randomBoolean()
	}

	private fun rollHomeworld(): Homeworld {
		val it = (1..100).randomInt()
		return when (it) {
			in 1..15 -> FERAL_WORLD
			in 16..33 -> FORGE_WORLD
			in 34..44 -> HIGHBORN
			in 45..69 -> HIVE_WORLD
			in 70..85 -> SHRINE_WORLD
			in 86..100 -> VOIDBORN
			else -> throw Exception("Impossible Roll: $it")
		}
	}

	private fun rollBackground(homeworld: Homeworld): Background {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..10 -> ADEPTUS_ADMINISTRATUM
					in 11..25 -> ADEPTUS_ARBITES
					in 26..40 -> ADEPTUS_ASTRA_TELEPATHICA
					in 41..50 -> ADEPTUS_MECHANICUS
					in 51..60 -> ADEPTUS_MINISOTRUM
					in 61..80 -> IMPERIAL_GUARD
					in 81..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..20 -> ADEPTUS_ADMINISTRATUM
					in 21..35 -> ADEPTUS_ARBITES
					in 36..45 -> ADEPTUS_ASTRA_TELEPATHICA
					in 46..65 -> ADEPTUS_MECHANICUS
					in 66..75 -> ADEPTUS_MINISOTRUM
					in 76..90 -> IMPERIAL_GUARD
					in 91..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..20 -> ADEPTUS_ADMINISTRATUM
					in 21..40 -> ADEPTUS_ARBITES
					in 41..55 -> ADEPTUS_ASTRA_TELEPATHICA
					in 56..65 -> ADEPTUS_MECHANICUS
					in 66..80 -> ADEPTUS_MINISOTRUM
					in 81..90 -> IMPERIAL_GUARD
					in 91..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..10 -> ADEPTUS_ADMINISTRATUM
					in 11..30 -> ADEPTUS_ARBITES
					in 31..40 -> ADEPTUS_ASTRA_TELEPATHICA
					in 41..55 -> ADEPTUS_MECHANICUS
					in 56..65 -> ADEPTUS_MINISOTRUM
					in 66..80 -> IMPERIAL_GUARD
					in 81..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..15 -> ADEPTUS_ADMINISTRATUM
					in 16..30 -> ADEPTUS_ARBITES
					in 31..40 -> ADEPTUS_ASTRA_TELEPATHICA
					in 41..50 -> ADEPTUS_MECHANICUS
					in 51..70 -> ADEPTUS_MINISOTRUM
					in 71..90 -> IMPERIAL_GUARD
					in 91..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..10 -> ADEPTUS_ADMINISTRATUM
					in 11..20 -> ADEPTUS_ARBITES
					in 21..40 -> ADEPTUS_ASTRA_TELEPATHICA
					in 41..60 -> ADEPTUS_MECHANICUS
					in 61..75 -> ADEPTUS_MINISOTRUM
					in 76..85 -> IMPERIAL_GUARD
					in 86..100 -> OUTCAST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollRole(background: Background): Role {
		val it = (1..100).randomInt()
		return when (background) {
			ADEPTUS_ADMINISTRATUM -> {
				when (it) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRUGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_ARBITES -> {
				when (it) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRUGEON
					in 26..40 -> Role.DESPERADO
					in 41..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..70 -> Role.SAGE
					in 71..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_ASTRA_TELEPATHICA -> {
				when (it) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRUGEON
					in 26..35 -> Role.DESPERADO
					in 36..45 -> Role.HIEROPHANT
					in 46..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_MECHANICUS -> {
				when (it) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRUGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_MINISOTRUM -> {
				when (it) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRUGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..70 -> Role.SAGE
					in 71..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			IMPERIAL_GUARD -> {
				when (it) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRUGEON
					in 26..40 -> Role.DESPERADO
					in 41..55 -> Role.HIEROPHANT
					in 56..65 -> Role.MYSTIC
					in 66..75 -> Role.SAGE
					in 76..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			OUTCAST -> {
				when (it) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRUGEON
					in 26..45 -> Role.DESPERADO
					in 46..55 -> Role.HIEROPHANT
					in 56..65 -> Role.MYSTIC
					in 66..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollBuild(homeworld: Homeworld): Build {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..20 -> Build.RANGY
					in 21..50 -> Build.LEAN
					in 51..80 -> Build.MUSCULAR
					in 81..90 -> Build.SQUAT
					in 91..100 -> Build.STRAPPING
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..20 -> Build.MINIMAL
					in 21..50 -> Build.LOW_NOMINAL
					in 51..80 -> Build.OPTIMAL
					in 81..90 -> Build.HIGH_NOMINAL
					in 91..100 -> Build.MAXIMAL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..20 -> Build.SLENDER
					in 21..50 -> Build.SVELTE
					in 51..80 -> Build.FIT
					in 81..90 -> Build.WELL_BUILT
					in 91..100 -> Build.POWERFUL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..20 -> Build.RUNT
					in 21..50 -> Build.SCRAWNY
					in 51..80 -> Build.WIRY
					in 81..90 -> Build.LANKY
					in 91..100 -> Build.BRAWNY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..20 -> Build.DIMINISHED
					in 21..50 -> Build.LESSENED
					in 51..80 -> Build.FAITHFUL
					in 81..90 -> Build.COMMENDED
					in 91..100 -> Build.ABUNDANT
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..20 -> Build.SKELETAL
					in 21..50 -> Build.STUNTED
					in 51..80 -> Build.GAUNT
					in 81..90 -> Build.GANGLING
					in 91..100 -> Build.SPINDLY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollAgeStatus(homeworld: Homeworld): AgeStatus {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..70 -> AgeStatus.WARRIOR
					in 71..100 -> AgeStatus.OLD_ONE
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..20 -> AgeStatus.YOUNG
					in 21..80 -> AgeStatus.MATURE_F
					in 81..100 -> AgeStatus.VENERATED
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..50 -> AgeStatus.SCION
					in 51..80 -> AgeStatus.PRIME
					in 81..100 -> AgeStatus.AUTHORITY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..30 -> AgeStatus.NIPPER
					in 31..90 -> AgeStatus.ADULT
					in 91..100 -> AgeStatus.OLD_TIMER
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..20 -> AgeStatus.NOVATE
					in 21..80 -> AgeStatus.VITAL
					in 81..100 -> AgeStatus.ELDER
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..40 -> AgeStatus.YOUTH
					in 41..70 -> AgeStatus.MATURE_V
					in 71..100 -> AgeStatus.METHUSELAH
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollAge(ageStatus: AgeStatus): Int {
		return (1..10).randomInt() + (ageStatus.multiplier)
	}

	private fun rollSkinColour(homeworld: Homeworld): SkinColour {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..30 -> SkinColour.DARK
					in 31..50 -> SkinColour.TAN
					in 51..70 -> SkinColour.FAIR
					in 71..90 -> SkinColour.RUDDY
					in 91..100 -> SkinColour.BRONZE
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..30 -> SkinColour.DARK
					in 31..50 -> SkinColour.TAN
					in 51..70 -> SkinColour.FAIR
					in 71..90 -> SkinColour.RUDDY
					in 91..100 -> SkinColour.PALE
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..30 -> SkinColour.DARK
					in 31..50 -> SkinColour.TAN
					in 51..70 -> SkinColour.FAIR
					in 71..90 -> SkinColour.RUDDY
					in 91..100 -> SkinColour.DYED
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..30 -> SkinColour.DARK
					in 31..50 -> SkinColour.TAN
					in 51..70 -> SkinColour.FAIR
					in 71..90 -> SkinColour.RUDDY
					in 91..100 -> SkinColour.STAINED
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..30 -> SkinColour.DARK
					in 31..50 -> SkinColour.TAN
					in 51..70 -> SkinColour.FAIR
					in 71..90 -> SkinColour.RUDDY
					in 91..100 -> SkinColour.FRECKLED
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..30 -> SkinColour.PORCELAIN
					in 31..50 -> SkinColour.FAIR
					in 51..70 -> SkinColour.BLUISH
					in 71..90 -> SkinColour.GREYISH
					in 91..100 -> SkinColour.MILKY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollHairColour(homeworld: Homeworld): HairColour {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..30 -> HairColour.RED
					in 31..50 -> HairColour.BLONDE
					in 51..70 -> HairColour.BROWN
					in 71..90 -> HairColour.BLACK
					in 91..100 -> HairColour.GREY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..30 -> HairColour.RUST
					in 31..50 -> HairColour.BLONDE
					in 51..70 -> HairColour.BROWN
					in 71..90 -> HairColour.BLACK
					in 91..100 -> HairColour.NONE
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..30 -> HairColour.DYED
					in 31..50 -> HairColour.BLONDE
					in 51..70 -> HairColour.BROWN
					in 71..90 -> HairColour.BLACK
					in 91..100 -> HairColour.GREY
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..30 -> HairColour.BROWN
					in 31..50 -> HairColour.MOUSY
					in 51..70 -> HairColour.DYED
					in 71..90 -> HairColour.GREY
					in 91..100 -> HairColour.BLACK
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..30 -> HairColour.NONE
					in 31..50 -> HairColour.BLONDE
					in 51..70 -> HairColour.BLACK
					in 71..90 -> HairColour.BROWN
					in 91..100 -> HairColour.RUSSET
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..30 -> HairColour.RED
					in 31..50 -> HairColour.BLONDE
					in 51..70 -> HairColour.COPPER
					in 71..90 -> HairColour.BLACK
					in 91..100 -> HairColour.AUBURN
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollEyeColour(homeworld: Homeworld): EyeColour {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..30 -> EyeColour.BLUE
					in 31..50 -> EyeColour.GREY
					in 51..70 -> EyeColour.BROWN
					in 71..90 -> EyeColour.GREEN
					in 91..100 -> EyeColour.YELLOW
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..30 -> EyeColour.BROWN
					in 31..50 -> EyeColour.GREEN
					in 51..70 -> EyeColour.BLUE
					in 71..90 -> EyeColour.GREY
					in 91..100 -> EyeColour.LENSES
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..30 -> EyeColour.BLUE
					in 31..50 -> EyeColour.GREY
					in 51..70 -> EyeColour.BROWN
					in 71..90 -> EyeColour.GREEN
					in 91..100 -> EyeColour.LENSES
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..30 -> EyeColour.BLUE
					in 31..50 -> EyeColour.GREY
					in 51..70 -> EyeColour.BROWN
					in 71..90 -> EyeColour.GREEN
					in 91..100 -> EyeColour.LENSES
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..30 -> EyeColour.AMBER
					in 31..50 -> EyeColour.BROWN
					in 51..70 -> EyeColour.GREY
					in 71..90 -> EyeColour.BLUE
					in 91..100 -> EyeColour.EMERALD
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..30 -> EyeColour.WATERY_BLUE
					in 31..50 -> EyeColour.GREY
					in 51..70 -> EyeColour.BLACK
					in 71..90 -> EyeColour.GREEN
					in 91..100 -> EyeColour.VIOLET
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	@Suppress("UNCHECKED_CAST")
	private fun rollQuirks(homeworld: Homeworld): ArrayList<Quirk> {
		val temp = ArrayList<Quirk>()
		var remaining = 1
		do {
			val quirk = rollQuirk(homeworld = homeworld)
			if (quirk == null)
				remaining++
			else {
				temp.add(quirk)
				remaining--
			}
		} while (remaining > 0)
		return temp
	}

	private fun rollQuirk(homeworld: Homeworld): Quirk? {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..6 -> Quirk.HAIRY_KNUCKLES
					in 7..12 -> Quirk.JOINED_EYEBROWS
					in 13..18 -> Quirk.WARPAINT
					in 19..24 -> Quirk.HUGE_HANDS
					in 25..30 -> Quirk.FILED_TEETH
					in 31..36 -> Quirk.BEETLING_BROWS
					in 37..42 -> Quirk.MUSKY_SMELL
					in 43..48 -> Quirk.HAIRY
					in 49..54 -> Quirk.RIPPED_EARS
					in 55..60 -> Quirk.LONG_FINGERNAILS
					in 61..66 -> Quirk.TRIBAL_TATTOOING
					in 67..72 -> Quirk.SCARRING
					in 73..78 -> Quirk.PIERCED_NOSE
					in 79..84 -> Quirk.CATS_EYES
					in 85..90 -> Quirk.SMALL_HEAD
					in 91..96 -> Quirk.THICK_JAW
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..6 -> Quirk.RADIATION_SCAR
					in 7..12 -> Quirk.LARGE_HEAD
					in 13..18 -> Quirk.MECHANICUM_TATTOO
					in 19..24 -> Quirk.CROOKED_NOSE
					in 25..30 -> Quirk.METALLIC_SMELL
					in 31..36 -> Quirk.SMALL_EYES
					in 37..42 -> Quirk.SOOT_STAINED_SKIN
					in 43..48 -> Quirk.ACID_BURNS
					in 49..54 -> Quirk.MISSING_EYEBROWS
					in 55..60 -> Quirk.WHEEZING_SPEECH
					in 61..66 -> Quirk.MISSING_ONE_EAR
					in 67..72 -> Quirk.SMASHED_TOE
					in 73..78 -> Quirk.SQUINTED_EYES
					in 79..84 -> Quirk.SHORT_FINGERS
					in 85..90 -> Quirk.WIRE_GRILL_OVER_EYES
					in 91..96 -> Quirk.DISCOLOURED_FINGERNAIL
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..6 -> Quirk.MISSING_FINGERTIP
					in 7..12 -> Quirk.AQUILINE_NOSE
					in 13..18 -> Quirk.BRIGHT_WHITE_TEETH
					in 19..24 -> Quirk.DUELLING_SCAR
					in 25..30 -> Quirk.PIERCED_NOSE
					in 31..36 -> Quirk.SHINY_HAIR
					in 37..42 -> Quirk.AQUILA_TATTOO
					in 43..48 -> Quirk.PERFUMED_ODOUR
					in 49..54 -> Quirk.POX_MARKS
					in 55..60 -> Quirk.DEVOTIONAL_SCAR
					in 61..66 -> Quirk.DECORATIVE_ELECTOO
					in 67..72 -> Quirk.QUIVERING_FINGERS
					in 73..78 -> Quirk.PIERCED_EARS
					in 79..84 -> Quirk.SINISTER_BOIL
					in 85..90 -> Quirk.SHARP_CHEEKBONES
					in 91..96 -> Quirk.SLOUCHED_GAIT
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..6 -> Quirk.THIN_LIPS
					in 7..12 -> Quirk.GRIMY_SKIN
					in 13..18 -> Quirk.PAINTED_FINGERNAILS
					in 19..24 -> Quirk.ROTTEN_TEETH
					in 25..30 -> Quirk.FADED_ELECTOO
					in 31..36 -> Quirk.PIERCED_EYEBROW
					in 37..42 -> Quirk.WIRE_MESH_ALONG_CHEEK
					in 43..48 -> Quirk.HACKING_COUGH
					in 49..54 -> Quirk.TATTOO_OVER_ONE_EYE
					in 55..60 -> Quirk.BULLET_WOUND_SCAR
					in 61..66 -> Quirk.NERVOUS_TIC
					in 67..72 -> Quirk.LARGE_MOLE
					in 73..78 -> Quirk.POLLUTION_SCARS
					in 79..84 -> Quirk.HUMP
					in 85..90 -> Quirk.SMALL_HANDS
					in 91..96 -> Quirk.CHEMICAL_SMELL
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..6 -> Quirk.HEAVY_BROWS
					in 7..12 -> Quirk.LONG_NOSE
					in 13..18 -> Quirk.MINISTORUM_TATTOO
					in 19..24 -> Quirk.RIDGED_FINGERNAILS
					in 25..30 -> Quirk.CROOKED_TEETH
					in 31..36 -> Quirk.CLEFTED_CHIN
					in 37..42 -> Quirk.DRY_SKIN
					in 43..48 -> Quirk.THICK_EYEBROWS
					in 49..54 -> Quirk.INK_STAINED_FINGERNAILS
					in 55..60 -> Quirk.SHRIVELLED_EAR
					in 61..66 -> Quirk.RITUAL_SCARS
					in 67..72 -> Quirk.THIRD_NIPPLE
					in 73..78 -> Quirk.BLOODSHOT_EYES
					in 79..84 -> Quirk.MOULDY_SCENT
					in 85..90 -> Quirk.WINESTAIN_BIRTHMARK
					in 91..96 -> Quirk.BROAD_SHOULDERS
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..6 -> Quirk.LONG_TOES
					in 7..12 -> Quirk.FINE_HAIR
					in 13..18 -> Quirk.LONG_FINGERS
					in 19..24 -> Quirk.TINY_EARS
					in 25..30 -> Quirk.SPINDLY_LIMBS
					in 31..36 -> Quirk.YELLOW_FINGERNAILS
					in 37..42 -> Quirk.STUMPY_TEETH
					in 43..48 -> Quirk.WIDELY_SPACED_EYES
					in 49..54 -> Quirk.LARGE_HEAD
					in 55..60 -> Quirk.CURVED_SPINE
					in 61..66 -> Quirk.HAIRLESS
					in 67..72 -> Quirk.ELEGANT_HANDS
					in 73..78 -> Quirk.SLIGHTLY_CROSS_EYED
					in 79..84 -> Quirk.WEBBED_TOES
					in 85..90 -> Quirk.MINOR_LIMP
					in 91..96 -> Quirk.MISMATCHED_EYES
					in 97..100 -> null
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollSuperstition(homeworld: Homeworld): Superstition {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..10 -> Superstition.WARD_OF_SOIL
					in 11..20 -> Superstition.UNLUCKY_COLOUR
					in 21..30 -> Superstition.HUNTERS_OATH
					in 31..40 -> Superstition.THIRSTY_BLADE
					in 41..50 -> Superstition.SPIRIT_SHACKLE
					in 51..60 -> Superstition.A_GOOD_DEATH
					in 61..70 -> Superstition.POWER_OF_NAMES
					in 71..80 -> Superstition.LONELY_DEAD
					in 81..90 -> Superstition.LIVING_RECORD
					in 91..100 -> Superstition.SACRED_GROUND
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..10 -> Superstition.NATIVE_METAL
					in 11..20 -> Superstition.WASTE_NOT
					in 21..30 -> Superstition.BINARY_PERFECTION
					in 31..40 -> Superstition.CASTIGATE_THE_FLESH
					in 41..50 -> Superstition.PURIFYING_HEAT
					in 51..60 -> Superstition.PLACATE_THE_MACHINE_SPIRIT
					in 61..70 -> Superstition.NEVER_TO_DUST
					in 71..80 -> Superstition.TAPPING_FOR_BLESSING
					in 81..90 -> Superstition.HONOUR_THE_METAL
					in 91..100 -> Superstition.ABHOR_THE_NATURAL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..10 -> Superstition.COUNT_THE_BLESSINGS
					in 11..20 -> Superstition.EACH_LAND_A_CONQUEST
					in 21..30 -> Superstition.LAYERS_OF_PROTECTION
					in 31..40 -> Superstition.ARMS_LENGTH
					in 41..50 -> Superstition.NOTHING_LEFT_BEHIND
					in 51..60 -> Superstition.SPEAK_STRONGLY
					in 61..70 -> Superstition.COMPORT_IN_STYLE
					in 71..80 -> Superstition.BEWARE_THE_POISONER
					in 81..90 -> Superstition.TRAPPINGS_OF_POWER
					in 91..100 -> Superstition.DISGUISE_STRENGTH
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..10 -> Superstition.TOUCH_THE_SKY
					in 11..20 -> Superstition.BLIGHT_IN_DARKNESS
					in 21..30 -> Superstition.COMBAT_STRENGTH
					in 31..40 -> Superstition.COMFORTABLE_NUMBERS
					in 41..50 -> Superstition.DISTRUST_THE_STRANGE
					in 51..60 -> Superstition.STRENGTHEN_THE_HIVE
					in 61..70 -> Superstition.FEAR_THE_SILENCE
					in 71..80 -> Superstition.KEEP_NATURE_AT_BAY
					in 81..90 -> Superstition.HIVE_AND_SKIN
					in 91..100 -> Superstition.SOLITUDE_IS_GOLDEN
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD -> {
				when (it) {
					in 1..10 -> Superstition.HONOUR_THE_SKULLS
					in 11..20 -> Superstition.ENDLESS_REPOSE
					in 21..30 -> Superstition.SUFFER_THE_PILGRIMS
					in 31..40 -> Superstition.NEVER_DISTURB_THE_DEAD
					in 41..50 -> Superstition.CLOUD_REVELATIONS
					in 51..60 -> Superstition.CHALLENGE_THE_SUN
					in 61..70 -> Superstition.STONE_ABIDES
					in 71..80 -> Superstition.DEATH_IN_THE_ODDS
					in 81..90 -> Superstition.DRINK_TO_THE_DEAD
					in 91..100 -> Superstition.AQUILA_BLESSING
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			VOIDBORN -> {
				when (it) {
					in 1..10 -> Superstition.NAILED_HULLS
					in 11..20 -> Superstition.HAUNTED_DECKS
					in 21..30 -> Superstition.WELCOMING_HATCHES
					in 31..40 -> Superstition.UNLUCKY_ECLIPSES
					in 41..50 -> Superstition.FEARED_OCTET
					in 51..60 -> Superstition.THIRD_SHIP_OMEN
					in 61..70 -> Superstition.RUMBLING_PLASMA
					in 71..80 -> Superstition.LUCKY_RUB
					in 81..90 -> Superstition.KNOCKING_SHELLS
					in 91..100 -> Superstition.EBON_OFFERINGS
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}

	private fun rollHomeworldMemento(homeworld: Homeworld): HomeworldMemento {
		val it = (1..100).randomInt()
		return when (homeworld) {
			FERAL_WORLD -> {
				when (it) {
					in 1..5 -> HomeworldMemento.LENGTH_OF_BRAIDED_HAIR
					in 6..10 -> HomeworldMemento.ANIMAL_SKULL
					in 11..15 -> HomeworldMemento.BAG_OF_HOMEWORLD_DIRT
					in 16..20 -> HomeworldMemento.BROKEN_SPEAR_TIP
					in 21..25 -> HomeworldMemento.LEATHER_POUCH
					in 26..30 -> HomeworldMemento.COLLECTION_OF_DRIED_LEAVES
					in 31..35 -> HomeworldMemento.CARVED_IDOL
					in 36..40 -> HomeworldMemento.STONE_FINGER_RING
					in 41..45 -> HomeworldMemento.UMBILICAL_CORD
					in 46..50 -> HomeworldMemento.FIRE_STICK
					in 51..55 -> HomeworldMemento.FUR_SKIN_CLOAK
					in 56..60 -> HomeworldMemento.STONE_KNIFE
					in 61..65 -> HomeworldMemento.HIDE_BOOTS
					in 66..70 -> HomeworldMemento.HUMAN_SKULL
					in 71..75 -> HomeworldMemento.LEATHER_BRACERS
					in 76..80 -> HomeworldMemento.BAG_OF_ASHES
					in 81..85 -> HomeworldMemento.NECKLACE_OF_TEETH
					in 86..90 -> HomeworldMemento.TALLOW_CANDLE
					in 91..95 -> HomeworldMemento.CEREMONIAL_MASK
					in 96..100 -> HomeworldMemento.DRIED_FROG
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			FORGE_WORLD -> {
				when (it) {
					in 1..5 -> HomeworldMemento.SKULL_FRAGMENT
					in 6..10 -> HomeworldMemento.SMALL_COPPER_DISK
					in 11..15 -> HomeworldMemento.VIAL_OF_SAND
					in 16..20 -> HomeworldMemento.SNAPPED_LOCK
					in 21..25 -> HomeworldMemento.PLASTEEL_MARBLE
					in 26..30 -> HomeworldMemento.PRESSED_LEAF
					in 31..35 -> HomeworldMemento.TWISTED_WIRE
					in 36..40 -> HomeworldMemento.CHUNK_OF_COAL
					in 41..45 -> HomeworldMemento.GREASY_ROD
					in 46..50 -> HomeworldMemento.TIN_OF_ASHES
					in 51..55 -> HomeworldMemento.STRIP_OF_CONDUIT_INSULATION
					in 56..60 -> HomeworldMemento.HANDKERCHIEF_WITH_BURN_HOLES
					in 61..65 -> HomeworldMemento.BOOT_LACE
					in 66..70 -> HomeworldMemento.SMUDGED_OPTIC_LENS
					in 71..75 -> HomeworldMemento.BROKEN_TOOTH
					in 76..80 -> HomeworldMemento.PHIAL_OF_USED_LUBRICANT_OIL
					in 81..85 -> HomeworldMemento.BLOODSTAINED_KERCHIEF
					in 86..90 -> HomeworldMemento.SNAPPED_CALLIPERS
					in 91..95 -> HomeworldMemento.BROKEN_BIONIC_FINGER
					in 96..100 -> HomeworldMemento.CRACKED_GUNSIGHT
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIGHBORN -> {
				when (it) {
					in 1..5 -> HomeworldMemento.BROCADE_COAT
					in 6..10 -> HomeworldMemento.METAL_LHO_STICK_CASE
					in 11..15 -> HomeworldMemento.TATTERED_CAPE
					in 16..20 -> HomeworldMemento.ANCESTRAL_SABRE
					in 21..25 -> HomeworldMemento.GLASSTEEL_DISK
					in 26..30 -> HomeworldMemento.NECKLACE
					in 31..35 -> HomeworldMemento.METAL_FLUTE
					in 36..40 -> HomeworldMemento.BOOK_OF_INSPIRING_WORDS
					in 41..45 -> HomeworldMemento.ICON_OF_THE_EMPEROR
					in 46..50 -> HomeworldMemento.METAL_COIN
					in 51..55 -> HomeworldMemento.ANTIQUE_EARRING
					in 56..60 -> HomeworldMemento.TATTERED_VELVET_CLOAK
					in 57..65 -> HomeworldMemento.IMPRESSIVE_HAT
					in 66..70 -> HomeworldMemento.INCENSE_STICKS
					in 71..75 -> HomeworldMemento.OLD_KEY
					in 76..80 -> HomeworldMemento.SHARD_OF_STAINED_GLASS
					in 81..85 -> HomeworldMemento.HEADBAND
					in 86..90 -> HomeworldMemento.SKULL_CHARM
					in 91..95 -> HomeworldMemento.PILGRIMAGE_TOKEN
					in 96..100 -> HomeworldMemento.VIAL_OF_BLESSED_WATER
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			HIVE_WORLD -> {
				when (it) {
					in 1..5 -> HomeworldMemento.HEAVY_GLOVES
					in 6..10 -> HomeworldMemento.GANG_HIVE_JACKET
					in 11..15 -> HomeworldMemento.DECK_OF_CARDS
					in 16..20 -> HomeworldMemento.WOODEN_DICE
					in 21..25 -> HomeworldMemento.SPENT_BULLET_CASING
					in 26..30 -> HomeworldMemento.ENGRAVED_KNIFE
					in 31..35 -> HomeworldMemento.HIPFLASK
					in 36..40 -> HomeworldMemento.IDENTITY_CARD
					in 41..45 -> HomeworldMemento.TATTOO_KIT
					in 46..50 -> HomeworldMemento.CHIP_FROM_HIVE_WALL
					in 51..55 -> HomeworldMemento.LEATHER_CAP
					in 56..60 -> HomeworldMemento.VIAL_OF_GLOWING_WATER
					in 61..65 -> HomeworldMemento.SMOKING_PIPE
					in 66..70 -> HomeworldMemento.MASS_OF_MELTED_BULLETS
					in 71..75 -> HomeworldMemento.CRYSTALLINE_CARVING
					in 76..80 -> HomeworldMemento.STEEL_TOECAP_BOOTS
					in 81..85 -> HomeworldMemento.SMALL_LENGTH_OF_CHAIN
					in 86..90 -> HomeworldMemento.LUCKY_COG
					in 91..95 -> HomeworldMemento.TUBE_OF_GREASE
					in 96..100 -> HomeworldMemento.FANCY_VEST
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			SHRINE_WORLD ->
				when (it) {
					in 1..5 -> HomeworldMemento.PINFEATHER
					in 6..10 -> HomeworldMemento.BURNED_PILGRIMAGE_RIBBON
					in 11..15 -> HomeworldMemento.FRAGMENT_OF_TANNED_SKIN
					in 16..20 -> HomeworldMemento.BAG_OF_WAX_SCRAPINGS
					in 21..25 -> HomeworldMemento.CLOTH_SASH
					in 26..30 -> HomeworldMemento.CHIP_OF_INSCRIBED_BONE
					in 31..35 -> HomeworldMemento.BAG_OF_BLESSED_DIRT
					in 36..40 -> HomeworldMemento.SMALL_STONE_BOWL
					in 41..45 -> HomeworldMemento.BAG_OF_DEAD_SPICES
					in 46..50 -> HomeworldMemento.TORN_PAGE_FROM_A_PRAYER_SCROLL
					in 51..55 -> HomeworldMemento.PHIAL_OF_ASHES
					in 56..60 -> HomeworldMemento.VIAL_OF_BLOOD
					in 61..65 -> HomeworldMemento.HANDMADE_AQUILA
					in 66..70 -> HomeworldMemento.RAT_TAIL
					in 71..75 -> HomeworldMemento.BONE_FLUTE
					in 76..80 -> HomeworldMemento.BUNDLE_OF_DRIED_GRASS
					in 81..85 -> HomeworldMemento.BONE_RING
					in 86..90 -> HomeworldMemento.CHIP_FROM_FALLEN_SERVO_SKULL
					in 91..95 -> HomeworldMemento.FRAGMENT_FROM_STATUE
					in 96..100 -> HomeworldMemento.CARVED_ANIMAL_TOOTH
					else -> throw Exception("Impossible Roll: $it")
				}
			VOIDBORN ->
				when (it) {
					in 1..5 -> HomeworldMemento.BAG_OF_SALT
					in 6..10 -> HomeworldMemento.CEREMONIAL_SWORD
					in 11..15 -> HomeworldMemento.CORPSE_HAIR_AMULET
					in 16..20 -> HomeworldMemento.THREE_QUARTZ_MARBLES
					in 21..25 -> HomeworldMemento.BONE_DICE
					in 26..30 -> HomeworldMemento.WOODEN_BEADS
					in 31..35 -> HomeworldMemento.INDENT_TAGS
					in 36..40 -> HomeworldMemento.GLOW_LANTERN
					in 41..45 -> HomeworldMemento.AQUILA_PENDENT
					in 46..50 -> HomeworldMemento.SQUEEZEBOX
					in 51..55 -> HomeworldMemento.LODESTONE
					in 56..60 -> HomeworldMemento.LUCKY_RATS_FOOT
					in 61..65 -> HomeworldMemento.MIRROR
					in 66..70 -> HomeworldMemento.ASTEROID_FRAGMENT
					in 71..75 -> HomeworldMemento.DECK_PLATE_SECTION
					in 76..80 -> HomeworldMemento.EXPIRED_RAD_COUNTER
					in 81..85 -> HomeworldMemento.GLASS_LENS
					in 86..90 -> HomeworldMemento.BAG_OF_SEEDS
					in 91..95 -> HomeworldMemento.POLISHED_CORAL_ICON
					in 96..100 -> HomeworldMemento.WHITTLING_KNIFE
					else -> throw Exception("Impossible Roll: $it")
				}
		}
	}

	private fun rollBackgroundMemento(background: Background): BackgroundMemento {
		val it = (1..100).randomInt()
		return when (background) {
			ADEPTUS_ADMINISTRATUM -> {
				when (it) {
					in 1..5 -> BackgroundMemento.BRASS_QUILL_TIP
					in 6..10 -> BackgroundMemento.RIBBON_BOOKMARK
					in 11..15 -> BackgroundMemento.CRACKED_LENS
					in 16..20 -> BackgroundMemento.SINGED_PARCHMENT
					in 21..25 -> BackgroundMemento.VIAL_OF_POWDERED_INK
					in 26..30 -> BackgroundMemento.RUSTY_SCALPEL
					in 31..35 -> BackgroundMemento.MAP_FRAGMENT
					in 36..40 -> BackgroundMemento.FINGER_BONE
					in 41..45 -> BackgroundMemento.WIRE_COIL
					in 46..50 -> BackgroundMemento.LUMP_OF_CANDLE_WAX
					in 51..55 -> BackgroundMemento.GLASS_KEY
					in 56..60 -> BackgroundMemento.CHARCOAL_STICK
					in 61..65 -> BackgroundMemento.CURLED_FINGERNAIL
					in 66..70 -> BackgroundMemento.COPPER_KEY_PUNCH
					in 71..75 -> BackgroundMemento.METAL_BOOK_CLASP
					in 76..80 -> BackgroundMemento.FESNEL_HAIR_PAINT_BRUSH
					in 81..85 -> BackgroundMemento.AQUILA_PAPERWEIGHT
					in 86..90 -> BackgroundMemento.STITCHING_NEEDLE
					in 91..95 -> BackgroundMemento.ANCIENT_MAGNIFYING_LENS
					in 96..100 -> BackgroundMemento.BLANK_VELUM_FOLIO
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_ARBITES -> {
				when (it) {
					in 1..5 -> BackgroundMemento.SHORT_LENGTH_OF_CHAIN
					in 6..10 -> BackgroundMemento.EXPIRED_WANTED_POSTER
					in 11..15 -> BackgroundMemento.BAG_OF_SHOT_PELLETS
					in 16..20 -> BackgroundMemento.DENTED_STEEL_TOE_CAP
					in 21..25 -> BackgroundMemento.BROKEN_SPY_EYE_LENS
					in 26..30 -> BackgroundMemento.LEATHER_WRIST_BAND
					in 31..35 -> BackgroundMemento.BENT_KEY
					in 36..40 -> BackgroundMemento.LOCK_OF_HAIR
					in 41..45 -> BackgroundMemento.KNIFE_HANDLE
					in 46..50 -> BackgroundMemento.METAL_SHOT_GLASS
					in 51..55 -> BackgroundMemento.STICK_OF_CHALK
					in 56..60 -> BackgroundMemento.CRACKED_DATA_SLATE
					in 61..65 -> BackgroundMemento.OLD_NAMEPLATE
					in 66..70 -> BackgroundMemento.SCRAP_OF_CHAIN_MAIL
					in 71..75 -> BackgroundMemento.SMALL_BRUSH
					in 76..80 -> BackgroundMemento.BRAIDED_DOG_HAIR
					in 81..85 -> BackgroundMemento.POMMEL_WEIGHT
					in 86..90 -> BackgroundMemento.SECTION_OF_CHEST_PLATE
					in 91..95 -> BackgroundMemento.BAG_OF_BROKEN_TEETH
					in 96..100 -> BackgroundMemento.AMASEC_BOTTLE_TOP
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_ASTRA_TELEPATHICA -> {
				when (it) {
					in 1..5 -> BackgroundMemento.MYRRHINE_MUSK_STICK
					in 6..10 -> BackgroundMemento.BENT_SPOON
					in 11..15 -> BackgroundMemento.TORN_TAROT_CARD
					in 16..20 -> BackgroundMemento.DECK_PLATING_FRAGMENT
					in 21..25 -> BackgroundMemento.PRESSED_FLOWER_PETAL
					in 26..30 -> BackgroundMemento.WOODEN_EGG
					in 31..35 -> BackgroundMemento.NECKLACE_OF_BEADS
					in 36..40 -> BackgroundMemento.METAL_TUBE
					in 41..45 -> BackgroundMemento.WIDE_BLACK_RIBBON
					in 46..50 -> BackgroundMemento.CRACKED_LOOKING_GLASS
					in 51..55 -> BackgroundMemento.ANIMAL_HORN_CHIP
					in 56..60 -> BackgroundMemento.SWATH_OF_METALLIC_CLOTH
					in 61..65 -> BackgroundMemento.CHARRED_MAHOGONITE_CHIP
					in 66..70 -> BackgroundMemento.BAG_OF_TOENAIL_CLIPPINGS
					in 71..75 -> BackgroundMemento.THIN_GLASSTEEL_DISC
					in 76..80 -> BackgroundMemento.CRYSTAL_RING
					in 81..85 -> BackgroundMemento.RUSTED_IRON_NAIL
					in 86..90 -> BackgroundMemento.CHIPPED_TRILOBITE_FOSSIL
					in 91..95 -> BackgroundMemento.BROKEN_CHRONO
					in 96..100 -> BackgroundMemento.CHIPPED_PEARL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_MECHANICUS -> {
				when (it) {
					in 1..5 -> BackgroundMemento.BRASS_COG_WHEEL
					in 6..10 -> BackgroundMemento.SULPHUR_CRYSTAL
					in 11..15 -> BackgroundMemento.LENGTH_OF_COILED_WIRE
					in 16..20 -> BackgroundMemento.PLASTEEL_CUBE
					in 21..25 -> BackgroundMemento.BAG_OF_RED_SAND
					in 26..30 -> BackgroundMemento.TINY_HAND_GYROSCOPE
					in 31..35 -> BackgroundMemento.NUGGET_OF_COPPER_ORE
					in 36..40 -> BackgroundMemento.BAR_MAGNET_IN_GLASS_BLOCK
					in 41..45 -> BackgroundMemento.LUMP_OF_MUMMIFIED_FLESH
					in 46..50 -> BackgroundMemento.CRACKED_CRYSTAL_WAFER
					in 51..55 -> BackgroundMemento.HEMATITE_STONE
					in 56..60 -> BackgroundMemento.PHIAL_OF_IRON_FILINGS
					in 61..65 -> BackgroundMemento.SMALL_BRASS_INGOT
					in 66..70 -> BackgroundMemento.OILY_CLEANING_RAGS
					in 71..75 -> BackgroundMemento.TWISTED_METAL_WRENCH
					in 76..80 -> BackgroundMemento.PHIAL_OF_GELATINOUS_LIQUID
					in 81..85 -> BackgroundMemento.SMALL_METAL_PYRAMID
					in 86..90 -> BackgroundMemento.FRAGMENT_OF_STAINED_GLASS
					in 91..95 -> BackgroundMemento.FINGER_BONE
					in 96..100 -> BackgroundMemento.METAL_CARBON_ROD
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			ADEPTUS_MINISOTRUM -> {
				when (it) {
					in 1..5 -> BackgroundMemento.BROKEN_SEXTANT
					in 6..10 -> BackgroundMemento.LAMP_WICK
					in 11..15 -> BackgroundMemento.LEAKING_HOURGLASS
					in 16..20 -> BackgroundMemento.MATCH
					in 21..25 -> BackgroundMemento.TIN_OF_SOFT_WAX
					in 26..30 -> BackgroundMemento.DRIED_LEACH
					in 31..35 -> BackgroundMemento.BALL_OF_FEATHERS
					in 36..40 -> BackgroundMemento.LARGE_SALT_CRYSTAL
					in 41..45 -> BackgroundMemento.BONE_DRILL_BIT
					in 46..50 -> BackgroundMemento.PHIAL_OF_DUST
					in 51..55 -> BackgroundMemento.FRAGMENT_OF_STONE_TABLET
					in 56..60 -> BackgroundMemento.STAINED_WOODEN_TOOTH
					in 61..65 -> BackgroundMemento.REGICIDE_PIECE
					in 66..70 -> BackgroundMemento.LUMP_OF_CANDLE_WAX
					in 71..75 -> BackgroundMemento.TATTERED_BOOKMARK
					in 76..80 -> BackgroundMemento.CORD_FROM_A_WHIP
					in 81..85 -> BackgroundMemento.BRASS_KEY_PUNCH
					in 86..90 -> BackgroundMemento.SCORCHED_FRAGMENT_OF_SKIN
					in 91..95 -> BackgroundMemento.SLIVER_OF_SILVER_IN_PLASTEEL_DISC
					in 96..100 -> BackgroundMemento.BURNED_FEATHER_QUILL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			IMPERIAL_GUARD -> {
				when (it) {
					in 1..5 -> BackgroundMemento.BURNT_LAS_POWER_PACK
					in 6..10 -> BackgroundMemento.XENOS_SKIN_FRAGMENT
					in 11..15 -> BackgroundMemento.BRAIDED_BOOT_LACE
					in 16..20 -> BackgroundMemento.BENT_GRENADE_PIN
					in 21..25 -> BackgroundMemento.BLOODSTAINED_ROCK
					in 26..30 -> BackgroundMemento.CHIP_OF_TANK_TREAD
					in 31..35 -> BackgroundMemento.SHARD_OF_CERAMITE_ARMOUR
					in 36..40 -> BackgroundMemento.RATION_PACK_FOIL
					in 41..45 -> BackgroundMemento.SMALL_IRON_HORSESHOE
					in 46..50 -> BackgroundMemento.ROCK_THAT_GLOWS_IN_DARK
					in 51..55 -> BackgroundMemento.CRACKED_BATON
					in 56..60 -> BackgroundMemento.ORK_TOOF_NECKLACE
					in 61..65 -> BackgroundMemento.CHUNK_OF_FUSED_SAND
					in 66..70 -> BackgroundMemento.BLOODSTAINED_BANDAGE
					in 71..75 -> BackgroundMemento.SMOKED_GLASS_SHARD
					in 76..80 -> BackgroundMemento.FRAYED_PENNANT
					in 81..85 -> BackgroundMemento.OLD_HELMET_STRAP
					in 86..90 -> BackgroundMemento.DENTED_BELT_BUCKLE
					in 91..95 -> BackgroundMemento.FORM_4111_JUN_555
					in 96..100 -> BackgroundMemento.BURNT_AND_CRACKED_COMMENDATION_MEDAL
					else -> throw Exception("Impossible Roll: $it")
				}
			}
			OUTCAST -> {
				when (it) {
					in 1..5 -> BackgroundMemento.BOX_OF_USED_MATCHES
					in 6..10 -> BackgroundMemento.BOTTLE_OF_SHRAPNEL
					in 11..15 -> BackgroundMemento.EYE_PATCH
					in 16..20 -> BackgroundMemento.SILK_GORGET
					in 21..25 -> BackgroundMemento.ANKLE_BRACELET
					in 26..30 -> BackgroundMemento.SHOTGUN_SHELL_CASING
					in 31..35 -> BackgroundMemento.LEATHER_HAIR_STRAP
					in 36..40 -> BackgroundMemento.CORK_BOTTLE_STOPPER
					in 41..45 -> BackgroundMemento.BENT_COIN
					in 46..50 -> BackgroundMemento.LEATHER_POUCH
					in 51..55 -> BackgroundMemento.FLAGON_HANDLE
					in 56..60 -> BackgroundMemento.CLOTH_ARMBAND
					in 61..65 -> BackgroundMemento.METAL_ARTIFICIAL_NOSE
					in 66..70 -> BackgroundMemento.CRACKED_AUTO_PISTOL_CLIP
					in 71..75 -> BackgroundMemento.TUBE_OF_BRIGHT_LIPSTICK
					in 76..80 -> BackgroundMemento.MOUTH_HARP
					in 81..85 -> BackgroundMemento.LOADED_DICE
					in 86..90 -> BackgroundMemento.BADLY_FORGED_COIN
					in 91..95 -> BackgroundMemento.BAG_OF_DUST
					in 96..100 -> BackgroundMemento.PLASTEEL_TOOTHPICK
					else -> throw Exception("Impossible Roll: $it")
				}
			}
		}
	}
}
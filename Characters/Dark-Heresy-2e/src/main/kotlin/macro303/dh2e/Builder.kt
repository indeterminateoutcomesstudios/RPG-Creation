package macro303.dh2e

import macro303.dh2e.Background.*
import macro303.dh2e.Build.*
import macro303.dh2e.Colour.*
import macro303.dh2e.Homeworld.*
import macro303.dh2e.Quirk.*
import macro303.dh2e.Superstition.*
import java.util.*
import kotlin.collections.ArrayList

object Builder {
	private var isMale: Boolean? = null
	private var homeworld: Homeworld? = null
	private var background: Background? = null
	private var role: Role? = null
	private var build: Build? = null
	private var ageStatus: AgeStatus? = null
	private var age: Int? = null
	private var skin: Colour? = null
	private var hair: Colour? = null
	private var eyes: Colour? = null
	private var quirks: Array<Quirk> = emptyArray()
	private var superstition: Superstition? = null

	private fun ClosedRange<Int>.randomInt() = Random().nextInt(endInclusive + 1 - start) + start
	private fun randomBoolean() = Random().nextBoolean()

	fun createCharacter(): Character {
		return Character(isMale = isMale, homeworld = homeworld, background = background, role = role, build = build, ageStatus = ageStatus, age = age, skin = skin, hair = hair, eyes = eyes, quirks = quirks, superstition = superstition)
	}

	fun rollGender() {
		isMale = randomBoolean()
	}

	fun rollHomeworld() {
		homeworld = when ((1..100).randomInt()) {
			in 1..15 -> `Feral World`
			in 16..33 -> `Forge World`
			in 34..44 -> Highborn
			in 45..69 -> `Hive World`
			in 70..85 -> `Shrine World`
			in 86..100 -> Voidborn
			else -> throw Exception("Impossible")
		}
	}

	fun rollBackground() {
		background = when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `Adeptus Administratum`
					in 11..25 -> `Adeptus Arbites`
					in 26..40 -> `Adeptus Astra Telepathica`
					in 41..50 -> `Adeptus Mechanicus`
					in 51..60 -> `Adeptus Minisotrum`
					in 61..80 -> `Imperial Guard`
					in 81..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> `Adeptus Administratum`
					in 21..35 -> `Adeptus Arbites`
					in 36..45 -> `Adeptus Astra Telepathica`
					in 46..65 -> `Adeptus Mechanicus`
					in 66..75 -> `Adeptus Minisotrum`
					in 76..90 -> `Imperial Guard`
					in 91..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..20 -> `Adeptus Administratum`
					in 21..40 -> `Adeptus Arbites`
					in 41..55 -> `Adeptus Astra Telepathica`
					in 56..65 -> `Adeptus Mechanicus`
					in 66..80 -> `Adeptus Minisotrum`
					in 81..90 -> `Imperial Guard`
					in 91..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `Adeptus Administratum`
					in 11..30 -> `Adeptus Arbites`
					in 31..40 -> `Adeptus Astra Telepathica`
					in 41..55 -> `Adeptus Mechanicus`
					in 56..65 -> `Adeptus Minisotrum`
					in 66..80 -> `Imperial Guard`
					in 81..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> `Adeptus Administratum`
					in 16..30 -> `Adeptus Arbites`
					in 31..40 -> `Adeptus Astra Telepathica`
					in 41..50 -> `Adeptus Mechanicus`
					in 51..70 -> `Adeptus Minisotrum`
					in 71..90 -> `Imperial Guard`
					in 91..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `Adeptus Administratum`
					in 11..20 -> `Adeptus Arbites`
					in 21..40 -> `Adeptus Astra Telepathica`
					in 41..60 -> `Adeptus Mechanicus`
					in 61..75 -> `Adeptus Minisotrum`
					in 76..85 -> `Imperial Guard`
					in 86..100 -> Outcast
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollRole() {
		role = when (background) {
			`Adeptus Administratum` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.Assassin
					in 11..25 -> Role.Chirugeon
					in 26..35 -> Role.Desperado
					in 36..50 -> Role.Hierophant
					in 51..60 -> Role.Mystic
					in 61..75 -> Role.Sage
					in 76..90 -> Role.Seeker
					in 91..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			`Adeptus Arbites` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.Assassin
					in 16..25 -> Role.Chirugeon
					in 26..40 -> Role.Desperado
					in 41..50 -> Role.Hierophant
					in 51..60 -> Role.Mystic
					in 61..70 -> Role.Sage
					in 71..85 -> Role.Seeker
					in 86..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			`Adeptus Astra Telepathica` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.Assassin
					in 11..25 -> Role.Chirugeon
					in 26..35 -> Role.Desperado
					in 36..45 -> Role.Hierophant
					in 46..60 -> Role.Mystic
					in 61..75 -> Role.Sage
					in 76..90 -> Role.Seeker
					in 91..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			`Adeptus Mechanicus` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.Assassin
					in 11..25 -> Role.Chirugeon
					in 26..35 -> Role.Desperado
					in 36..50 -> Role.Hierophant
					in 51..60 -> Role.Mystic
					in 61..75 -> Role.Sage
					in 76..90 -> Role.Seeker
					in 91..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			`Adeptus Minisotrum` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.Assassin
					in 11..25 -> Role.Chirugeon
					in 26..35 -> Role.Desperado
					in 36..50 -> Role.Hierophant
					in 51..60 -> Role.Mystic
					in 61..70 -> Role.Sage
					in 71..85 -> Role.Seeker
					in 86..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			`Imperial Guard` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.Assassin
					in 16..25 -> Role.Chirugeon
					in 26..40 -> Role.Desperado
					in 41..55 -> Role.Hierophant
					in 56..65 -> Role.Mystic
					in 66..75 -> Role.Sage
					in 76..85 -> Role.Seeker
					in 86..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			Outcast -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.Assassin
					in 16..25 -> Role.Chirugeon
					in 26..45 -> Role.Desperado
					in 46..55 -> Role.Hierophant
					in 56..65 -> Role.Mystic
					in 66..75 -> Role.Sage
					in 76..90 -> Role.Seeker
					in 91..100 -> Role.Warrior
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollBuild() {
		build = when (homeworld) {
			`Feral World` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Rangy
					in 21..50 -> Lean
					in 51..80 -> Muscular
					in 81..90 -> Squat
					in 91..100 -> Strapping
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Minimal
					in 21..50 -> `Low Nominal`
					in 51..80 -> Optimal
					in 81..90 -> `High Nominal`
					in 91..100 -> Maximal
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Slender
					in 21..50 -> Svelte
					in 51..80 -> Fit
					in 81..90 -> `Well-Built`
					in 91..100 -> Powerful
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Runt
					in 21..50 -> Scrawny
					in 51..80 -> Wiry
					in 81..90 -> Lanky
					in 91..100 -> Brawny
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Diminished
					in 21..50 -> Lessened
					in 51..80 -> Faithful
					in 81..90 -> Commended
					in 91..100 -> Abundant
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((0..100).randomInt()) {
					in 1..20 -> Skeletal
					in 21..50 -> Stunted
					in 51..80 -> Gaunt
					in 81..90 -> Gangling
					in 91..100 -> Spindly
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollAgeStatus() {
		ageStatus = when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..70 -> AgeStatus.Warrior
					in 71..100 -> AgeStatus.`Old One`
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> AgeStatus.Young
					in 21..80 -> AgeStatus.Mature_F
					in 81..100 -> AgeStatus.Venerated
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..50 -> AgeStatus.Scion
					in 51..80 -> AgeStatus.Prime
					in 81..100 -> AgeStatus.Authority
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> AgeStatus.Nipper
					in 31..90 -> AgeStatus.Adult
					in 91..100 -> AgeStatus.`Old Timer`
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> AgeStatus.Novate
					in 21..80 -> AgeStatus.Vital
					in 81..100 -> AgeStatus.Elder
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..40 -> AgeStatus.Youth
					in 41..70 -> AgeStatus.Mature_V
					in 71..100 -> AgeStatus.Methuselah
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollAge() {
		rollAgeStatus()
		age = (1..10).randomInt() + (ageStatus?.multiplier ?: 0)
	}

	fun rollSkin() {
		skin = when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Dark
					in 31..50 -> Tan
					in 51..70 -> Fair
					in 71..90 -> Ruddy
					in 91..100 -> Bronze
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Dark
					in 31..50 -> Tan
					in 51..70 -> Fair
					in 71..90 -> Ruddy
					in 91..100 -> Pale
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Dark
					in 31..50 -> Tan
					in 51..70 -> Fair
					in 71..90 -> Ruddy
					in 91..100 -> `Dyed (Any)`
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Dark
					in 31..50 -> Tan
					in 51..70 -> Fair
					in 71..90 -> Ruddy
					in 91..100 -> `Stained (Any)`
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Dark
					in 31..50 -> Tan
					in 51..70 -> Fair
					in 71..90 -> Ruddy
					in 91..100 -> Freckled
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Porcelain
					in 31..50 -> Fair
					in 51..70 -> Bluish
					in 71..90 -> Greyish
					in 91..100 -> Milky
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollHair() {
		hair = when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Red
					in 31..50 -> Blonde
					in 51..70 -> Brown
					in 71..90 -> Black
					in 91..100 -> Grey
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Rust
					in 31..50 -> Blonde
					in 51..70 -> Brown
					in 71..90 -> Black
					in 91..100 -> None
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> `Dyed (Any)`
					in 31..50 -> Blonde
					in 51..70 -> Brown
					in 71..90 -> Black
					in 91..100 -> Grey
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Brown
					in 31..50 -> Mousy
					in 51..70 -> `Dyed (Any)`
					in 71..90 -> Grey
					in 91..100 -> Black
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> None
					in 31..50 -> Blonde
					in 51..70 -> Black
					in 71..90 -> Brown
					in 91..100 -> Russet
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Red
					in 31..50 -> Blonde
					in 51..70 -> Copper
					in 71..90 -> Black
					in 91..100 -> Auburn
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollEyes() {
		eyes = when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Blue
					in 31..50 -> Grey
					in 51..70 -> Brown
					in 71..90 -> Green
					in 91..100 -> Yellow
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Brown
					in 31..50 -> Green
					in 51..70 -> Blue
					in 71..90 -> Grey
					in 91..100 -> `Lenses (Any)`
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Blue
					in 31..50 -> Grey
					in 51..70 -> Brown
					in 71..90 -> Green
					in 91..100 -> `Lenses (Any)`
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Blue
					in 31..50 -> Grey
					in 51..70 -> Brown
					in 71..90 -> Green
					in 91..100 -> `Lenses (Any)`
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> Amber
					in 31..50 -> Brown
					in 51..70 -> Grey
					in 71..90 -> Blue
					in 91..100 -> Emerald
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..30 -> `Watery Blue`
					in 31..50 -> Grey
					in 51..70 -> Black
					in 71..90 -> Green
					in 91..100 -> Violet
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	@Suppress("UNCHECKED_CAST")
	fun rollQuirks() {
		val temp = ArrayList<Quirk>()
		var remaining = 1
		do {
			val quirk = rollQuirk()
			if (quirk == null)
				remaining++
			else {
				temp.add(quirk)
				remaining--
			}
		} while (remaining > 0)
		quirks = temp.toTypedArray()
	}

	private fun rollQuirk(): Quirk? {
		return when (homeworld) {
			`Feral World` -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Hairy Knuckles`
					in 7..12 -> `Joined Eyebrows`
					in 13..18 -> Warpaint
					in 19..24 -> `Huge Hands`
					in 25..30 -> `Filed Teeth`
					in 31..36 -> `Beetling Brows`
					in 37..42 -> `Musky Smell`
					in 43..48 -> Hairy
					in 49..54 -> `Ripped Ears`
					in 55..60 -> `Long Fingernails`
					in 61..66 -> `Tribal Tattooing`
					in 67..72 -> Scarring
					in 73..78 -> `Pierced Nose`
					in 79..84 -> `Cat's Eyes`
					in 85..90 -> `Small Head`
					in 91..96 -> `Thick Jaw`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Radiation Scar`
					in 7..12 -> `Large Head`
					in 13..18 -> `Mechanicum Tattoo`
					in 19..24 -> `Crooked Nose`
					in 25..30 -> `Metallic Smell`
					in 31..36 -> `Small Eyes`
					in 37..42 -> `Soot-Stained Skin`
					in 43..48 -> `Acid Burns`
					in 49..54 -> `Missing Eyebrows`
					in 55..60 -> `Wheezing Speech`
					in 61..66 -> `Missing One Ear`
					in 67..72 -> `Smashed Toe`
					in 73..78 -> `Squinted Eyes`
					in 79..84 -> `Short Fingers`
					in 85..90 -> `Wire Grill Over Eyes`
					in 91..96 -> `Discoloured Fingernail`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Missing Fingertip`
					in 7..12 -> `Aquiline Nose`
					in 13..18 -> `Bright White Teeth`
					in 19..24 -> `Duelling Scar`
					in 25..30 -> `Pierced Nose`
					in 31..36 -> `Shiny Hair`
					in 37..42 -> `Aquila Tattoo`
					in 43..48 -> `Perfumed Odour`
					in 49..54 -> `Pox Marks`
					in 55..60 -> `Devotional Scar`
					in 61..66 -> `Decorative Electoo`
					in 67..72 -> `Quivering Fingers`
					in 73..78 -> `Pierced Ears`
					in 79..84 -> `Sinister Boil`
					in 85..90 -> `Sharp Cheekbones`
					in 91..96 -> `Slouched Gait`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Thin Lips`
					in 7..12 -> `Grimy Skin`
					in 13..18 -> `Painted Fingernails`
					in 19..24 -> `Rotten Teeth`
					in 25..30 -> `Faded Electoo`
					in 31..36 -> `Pierced Eyebrow`
					in 37..42 -> `Wire Mesh Along Cheek`
					in 43..48 -> `Hacking Cough`
					in 49..54 -> `Tattoo Over One Eye`
					in 55..60 -> `Bullet Wound Scar`
					in 61..66 -> `Nervous Tic`
					in 67..72 -> `Large Mole`
					in 73..78 -> `Pollution Scars`
					in 79..84 -> Hump
					in 85..90 -> `Small Hands`
					in 91..96 -> `Chemical Smell`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Heavy Brows`
					in 7..12 -> `Long Nose`
					in 13..18 -> `Ministorum Tattoo`
					in 19..24 -> `Ridged Fingernails`
					in 25..30 -> `Crooked Teeth`
					in 31..36 -> `Clefted Chin`
					in 37..42 -> `Dry Skin`
					in 43..48 -> `Thick Eyebrows`
					in 49..54 -> `Ink-Stained Fingernails`
					in 55..60 -> `Shrivelled Ear`
					in 61..66 -> `Ritual Scars`
					in 67..72 -> `Third Nipple`
					in 73..78 -> `Bloodshot Eyes`
					in 79..84 -> `Mouldy Scent`
					in 85..90 -> `Winestain Birthmark`
					in 91..96 -> `Broad Shoulders`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((1..100).randomInt()) {
					in 1..6 -> `Long Toes`
					in 7..12 -> `Fine Hair`
					in 13..18 -> `Long Fingers`
					in 19..24 -> `Tiny Ears`
					in 25..30 -> `Spindly Limbs`
					in 31..36 -> `Yellow Fingernails`
					in 37..42 -> `Stumpy Teeth`
					in 43..48 -> `Widely Spaced Eyes`
					in 49..54 -> `Large Head`
					in 55..60 -> `Curved Spine`
					in 61..66 -> Hairless
					in 67..72 -> `Elegant Hands`
					in 73..78 -> `Slightly Cross-Eyed`
					in 79..84 -> `Webbed Toes`
					in 85..90 -> `Minor Limp`
					in 91..96 -> `Mismatched Eyes`
					in 97..100 -> null
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun rollSuperstition() {
		superstition = when (homeworld) {
			`Feral World` -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Ward of Soil`
					in 11..20 -> `Unlucky Colour`
					in 21..30 -> `Hunter's Oath`
					in 31..40 -> `Thirsty Blade`
					in 41..50 -> `Spirit Shackle`
					in 51..60 -> `A Good Death`
					in 61..70 -> `Power of Names`
					in 71..80 -> `Lonely Dead`
					in 81..90 -> `Living Record`
					in 91..100 -> `Sacred Ground`
					else -> throw Exception("Impossible")
				}
			}
			`Forge World` -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Native Metal`
					in 11..20 -> `Waste Not`
					in 21..30 -> `Binary Perfection`
					in 31..40 -> `Castigate the Flesh`
					in 41..50 -> `Purifying Heat`
					in 51..60 -> `Placate the Machine-Spirit`
					in 61..70 -> `Never to Dust`
					in 71..80 -> `Tapping for Blessing`
					in 81..90 -> `Honour the Metal`
					in 91..100 -> `Abhor the Natural`
					else -> throw Exception("Impossible")
				}
			}
			Highborn -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Count the Blessings`
					in 11..20 -> `Each Land a Conquest`
					in 21..30 -> `Layers of Protection`
					in 31..40 -> `Arms Length`
					in 41..50 -> `Nothing Left Behind`
					in 51..60 -> `Speak Strongly`
					in 61..70 -> `Comport in Style`
					in 71..80 -> `Beware the Poisoner`
					in 81..90 -> `Trappings of Power`
					in 91..100 -> `Disguise Strength`
					else -> throw Exception("Impossible")
				}
			}
			`Hive World` -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Touch the Sky`
					in 11..20 -> `Blight in Darkness`
					in 21..30 -> `Combat Strength`
					in 31..40 -> `Comfortable Numbers`
					in 41..50 -> `Distrust the Strange`
					in 51..60 -> `Strengthen the Hive`
					in 61..70 -> `Fear the Silence`
					in 71..80 -> `Keep Nature at Bay`
					in 81..90 -> `Hive and Skin`
					in 91..100 -> `Solitude is Golden`
					else -> throw Exception("Impossible")
				}
			}
			`Shrine World` -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Honour the Skulls`
					in 11..20 -> `Endless Repose`
					in 21..30 -> `Suffer the Pilgrims`
					in 31..40 -> `Never Disturb the Dead`
					in 41..50 -> `Cloud Revelations`
					in 51..60 -> `Challenge the Sun`
					in 61..70 -> `Stone Abides`
					in 71..80 -> `Death in the Odds`
					in 81..90 -> `Drink to the Dead`
					in 91..100 -> `Aquila Blessing`
					else -> throw Exception("Impossible")
				}
			}
			Voidborn -> {
				when ((0..100).randomInt()) {
					in 1..10 -> `Nailed Hulls`
					in 11..20 -> `Haunted Decks`
					in 21..30 -> `Welcoming Hatches`
					in 31..40 -> `Unlucky Eclipses`
					in 41..50 -> `Feared Octet`
					in 51..60 -> `Third Ship Omen`
					in 61..70 -> `Rumbling Plasma`
					in 71..80 -> `Lucky Rub`
					in 81..90 -> `Knocking Shells`
					in 91..100 -> `Ebon Offerings`
					else -> throw Exception("Impossible")
				}
			}
			else -> throw Exception("Impossible")
		}
	}

	fun reset() {
		isMale = null
		homeworld = null
		background = null
		role = null
		build = null
		ageStatus = null
		age = null
		skin = null
		hair = null
		eyes = null
		quirks = emptyArray()
	}
}
package macro303.character

import macro303.character.Background.*
import macro303.character.aptitude.CharacterAptitude
import macro303.character.aptitude.CharacterAptitude.*

enum class Homeworld(
	val value: String,
	val pos: Array<CharacterAptitude>,
	val neg: CharacterAptitude,
	val woundBonus: Int,
	val validBackgrounds: Array<Background>
) {
	FERAL_WORLD(
		value = "Feral World",
		pos = arrayOf(STRENGTH, TOUGHNESS),
		neg = INFLUENCE,
		woundBonus = 9,
		validBackgrounds = arrayOf(ADEPTUS_ARBITES, ADEPTUS_ASTRA_TELEPATHICA, IMPERIAL_GUARD, OUTCAST)
	),
	FORGE_WORLD(
		value = "Forge World",
		pos = arrayOf(INTELLIGENCE, TOUGHNESS),
		neg = FELLOWSHIP,
		woundBonus = 8,
		validBackgrounds = arrayOf(ADEPTUS_ADMINISTRATUM, ADEPTUS_ARBITES, ADEPTUS_MECHANICUS, IMPERIAL_GUARD)
	),
	HIGHBORN(
		value = "Highborn",
		pos = arrayOf(FELLOWSHIP, INFLUENCE),
		neg = TOUGHNESS,
		woundBonus = 9,
		validBackgrounds = arrayOf(
			ADEPTUS_ADMINISTRATUM,
			ADEPTUS_ARBITES,
			ADEPTUS_ASTRA_TELEPATHICA,
			ADEPTUS_MINISOTRUM
		)
	),
	HIVE_WORLD(
		value = "Hive World",
		pos = arrayOf(AGILITY, PERCEPTION),
		neg = WILLPOWER,
		woundBonus = 8,
		validBackgrounds = arrayOf(ADEPTUS_ARBITES, ADEPTUS_MECHANICUS, IMPERIAL_GUARD, OUTCAST)
	),
	SHRINE_WORLD(
		value = "Shrine World",
		pos = arrayOf(FELLOWSHIP, WILLPOWER),
		neg = PERCEPTION,
		woundBonus = 7,
		validBackgrounds = arrayOf(ADEPTUS_ADMINISTRATUM, ADEPTUS_ARBITES, ADEPTUS_MINISOTRUM, IMPERIAL_GUARD)
	),
	VOIDBORN(
		value = "Voidborn",
		pos = arrayOf(INTELLIGENCE, WILLPOWER),
		neg = STRENGTH,
		woundBonus = 7,
		validBackgrounds = arrayOf(ADEPTUS_ASTRA_TELEPATHICA, ADEPTUS_MECHANICUS, ADEPTUS_MINISOTRUM, OUTCAST)
	)
}
package macro303.character.aptitude

import macro303.character.aptitude.GeneralAptitude.*

enum class CharacterAptitude(override val value: String, private val _aptitudes: Array<Aptitude> = emptyArray()) :
	Aptitude {
	WEAPON_SKILL(value = "Weapon Skill", _aptitudes = arrayOf(OFFENCE)),
	BALLISTIC_SKILL(value = "Ballistic Skill", _aptitudes = arrayOf(FINESSE)),
	STRENGTH(value = "Strength", _aptitudes = arrayOf(OFFENCE)),
	TOUGHNESS(value = "Toughness", _aptitudes = arrayOf(DEFENCE)),
	AGILITY(value = "Agility", _aptitudes = arrayOf(FINESSE)),
	INTELLIGENCE(value = "Intelligence", _aptitudes = arrayOf(KNOWLEDGE)),
	PERCEPTION(value = "Perception", _aptitudes = arrayOf(FIELDCRAFT)),
	WILLPOWER(value = "Willpower", _aptitudes = arrayOf(PSYKER)),
	FELLOWSHIP(value = "Fellowship", _aptitudes = arrayOf(SOCIAL)),
	INFLUENCE(value = "Influence");

	val aptitudes: Array<Aptitude> = if (!value.equals("Influence", ignoreCase = true)) _aptitudes.plusElement(this) else emptyArray()

}
package macro303.character.aptitude

import macro303.character.aptitude.GeneralAptitude.*

enum class CharacterAptitude(override val value: String, val aptitudes: Array<Aptitude> = emptyArray()) : Aptitude {
	WEAPON_SKILL(value = "Weapon Skill", aptitudes = arrayOf(WEAPON_SKILL, OFFENCE)),
	BALLISTIC_SKILL(value = "Ballistic Skill", aptitudes = arrayOf(BALLISTIC_SKILL, FINESSE)),
	STRENGTH(value = "Strength", aptitudes = arrayOf(STRENGTH, OFFENCE)),
	TOUGHNESS(value = "Toughness", aptitudes = arrayOf(TOUGHNESS, DEFENCE)),
	AGILITY(value = "Agility", aptitudes = arrayOf(AGILITY, FINESSE)),
	INTELLIGENCE(value = "Intelligence", aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)),
	PERCEPTION(value = "Perception", aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)),
	WILLPOWER(value = "Willpower", aptitudes = arrayOf(WILLPOWER, PSYKER)),
	FELLOWSHIP(value = "Fellowship", aptitudes = arrayOf(FELLOWSHIP, SOCIAL)),
	INFLUENCE(value = "Influence");
}
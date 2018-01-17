package macro303.character

import macro303.character.Aptitude.GeneralAptitude.*
import macro303.character.Aptitude.CharacteristicAptitude.*

interface Aptitude {
	val value: String

	enum class GeneralAptitude(override val value: String) : Aptitude {
		GENERAL(value = "General"),
		OFFENCE(value = "Offence"),
		FINESSE(value = "Finesse"),
		DEFENCE(value = "Defence"),
		PSYKER(value = "Psyker"),
		TECH(value = "Tech"),
		KNOWLEDGE(value = "Knowledge"),
		LEADERSHIP(value = "Leadership"),
		FIELDCRAFT(value = "Fieldcraft"),
		SOCIAL(value = "Social")
	}

	enum class CharacteristicAptitude(override val value: String, val aptitudes: Array<Aptitude> ) : Aptitude {
		WEAPON_SKILL(value = "Weapon Skill", aptitudes = arrayOf(WEAPON_SKILL, OFFENCE)),
		BALLISTIC_SKILL(value = "Ballistic Skill", aptitudes = arrayOf(BALLISTIC_SKILL, FINESSE)),
		STRENGTH(value = "Strength", aptitudes = arrayOf(STRENGTH, OFFENCE)),
		TOUGHNESS(value = "Toughness", aptitudes = arrayOf(TOUGHNESS, DEFENCE)),
		AGILITY(value = "Agility", aptitudes = arrayOf(AGILITY, FINESSE)),
		INTELLIGENCE(value = "Intelligence", aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)),
		PERCEPTION(value = "Perception", aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)),
		WILLPOWER(value = "Willpower", aptitudes = arrayOf(WILLPOWER, PSYKER)),
		FELLOWSHIP(value = "Fellowship", aptitudes = arrayOf(FELLOWSHIP, SOCIAL)),
		INFLUENCE(value = "Influence", aptitudes = emptyArray());
	}

	enum class SkillAptitude(override val value: String, val characteristic: CharacteristicAptitude, val aptitudes: Array<Aptitude>, var level: Int): Aptitude{

	}
}
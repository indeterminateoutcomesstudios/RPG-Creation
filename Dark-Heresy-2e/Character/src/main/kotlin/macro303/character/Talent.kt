package macro303.character

import macro303.character.aptitude.Aptitude
import macro303.character.aptitude.CharacterAptitude.*
import macro303.character.aptitude.GeneralAptitude.*

enum class Talent(val value: String, val tier: Int, val aptitudes: Array<Aptitude>) {
	ADAMANTIUM_FAITH(
		value = "Adamantium Faith",
		tier = 3,
		aptitudes = arrayOf(WILLPOWER, DEFENCE)
	),
	AMBIDEXTROUS(
		value = "Ambidextrous",
		tier = 1,
		aptitudes = arrayOf(WEAPON_SKILL, BALLISTIC_SKILL)
	),
	ARMOUR_MONGER(
		value = "Armour Monger",
		tier = 2,
		aptitudes = arrayOf(INTELLIGENCE, TECH)
	),
	ASSASSIN_STRIKE(
		value = "Assassin Strike",
		tier = 3,
		aptitudes = arrayOf(WEAPON_SKILL, FIELDCRAFT)
	),
	BASTION_OF_IRON_WILL(
		value = "Bastion of Iron Will",
		tier = 3,
		aptitudes = arrayOf(WILLPOWER, PSYKER)
	),
	BATTLE_RAGE(
		value = "Battle Rage",
		tier = 2,
		aptitudes = arrayOf(STRENGTH, DEFENCE)
	),
	BLADEMASTER(
		value = "Blademaster",
		tier = 3,
		aptitudes = arrayOf(WEAPON_SKILL, FINESSE)
	),
	BLIND_FIGHTING(
		value = "Blind Fighting",
		tier = 1,
		aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)
	),
	BULGING_BICEPS(
		value = "Bulging Biceps",
		tier = 2,
		aptitudes = arrayOf(STRENGTH, OFFENCE)
	),
	CATFALL(
		value = "Catfall",
		tier = 1,
		aptitudes = arrayOf(AGILITY, FIELDCRAFT)
	),
	CLUES_FROM_THE_CROWDS(
		value = "Clues from the Crowds",
		tier = 1,
		aptitudes = arrayOf(GENERAL, SOCIAL)
	),
	COMBAT_MASTER(
		value = "Combat Master",
		tier = 2,
		aptitudes = arrayOf(WEAPON_SKILL, DEFENCE)
	),
	CONSTANT_VIGILANCE(
		value = "Constant Vigilance",
		tier = 2,
		aptitudes = arrayOf(PERCEPTION, DEFENCE)
	),
	CONTACT_NETWORK(
		value = "Contact Network",
		tier = 2,
		aptitudes = arrayOf(FELLOWSHIP, LEADERSHIP)
	),
	COORDINATED_INTERROGATION(
		value = "Coordinated Interrogation",
		tier = 2,
		aptitudes = arrayOf(INTELLIGENCE, SOCIAL)
	),
	COUNTER_ATTACK(
		value = "Counter Attack",
		tier = 2,
		aptitudes = arrayOf(WEAPON_SKILL, DEFENCE)
	),
	COVER_UP(
		value = "Cover-Up",
		tier = 2,
		aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)
	),
	CRUSHING_BLOW(
		value = "Crushing Blow",
		tier = 3,
		aptitudes = arrayOf(WEAPON_SKILL, OFFENCE)
	),
	DEATHDEALER(
		value = "Deathdealer",
		tier = 3,
		aptitudes = arrayOf(PERCEPTION, FINESSE)
	),
	DELICATE_INTERROGATION(
		value = "Delicate Interrogation",
		tier = 3,
		aptitudes = arrayOf(INTELLIGENCE, FINESSE)
	),
	DENY_THE_WITCH(
		value = "Deny the Witch",
		tier = 2,
		aptitudes = arrayOf(WILLPOWER, DEFENCE)
	),
	DEVASTATING_ASSAULT(
		value = "Devastating Assault",
		tier = 2,
		aptitudes = arrayOf(WEAPON_SKILL, OFFENCE)
	),
	DIE_HARD(
		value = "Die Hard",
		tier = 1,
		aptitudes = arrayOf(WILLPOWER, DEFENCE)
	),
	DISARM(
		value = "Disarm",
		tier = 1,
		aptitudes = arrayOf(WEAPON_SKILL, DEFENCE)
	),
	DOUBLE_TAP(
		value = "Double Tap",
		tier = 2,
		aptitudes = arrayOf(FINESSE, OFFENCE)
	),
	DOUBLE_TEAM(
		value = "Double Team",
		tier = 1,
		aptitudes = arrayOf(GENERAL, OFFENCE)
	),
	ENEMY(
		value = "Enemy",
		tier = 1,
		aptitudes = arrayOf(GENERAL, SOCIAL)
	),
	EXOTIC_WEAPON_TRAINING(
		value = "Exotic Weapon Training",
		tier = 2,
		aptitudes = arrayOf(INTELLIGENCE, FINESSE)
	),
	EYE_OF_VENGEANCE(
		value = "Eye of Vengeance",
		tier = 3,
		aptitudes = arrayOf(BALLISTIC_SKILL, OFFENCE)
	),
	FACE_IN_A_CROWD(
		value = "Face in a Crowd",
		tier = 2,
		aptitudes = arrayOf(FELLOWSHIP, SOCIAL)
	),
	FAVOURED_BY_THE_WARP(
		value = "Favoured by the Warp",
		tier = 3,
		aptitudes = arrayOf(WILLPOWER, PSYKER)
	),
	FERRIC_SUMMONS(
		value = "Ferric Summons",
		tier = 1,
		aptitudes = arrayOf(WILLPOWER, TECH)
	),
	FLASH_OF_INSIGHT(
		value = "Flash of Insight",
		tier = 3,
		aptitudes = arrayOf(PERCEPTION, KNOWLEDGE)
	),
	FRENZY(
		value = "Frenzy",
		tier = 1,
		aptitudes = arrayOf(STRENGTH, OFFENCE)
	),
	HALO_OF_COMMAND(
		value = "Halo of Command",
		tier = 3,
		aptitudes = arrayOf(FELLOWSHIP, LEADERSHIP)
	),
	HAMMER_BLOW(
		value = "Hammer Blow",
		tier = 3,
		aptitudes = arrayOf(STRENGTH, OFFENCE)
	),
	HARD_TARGET(
		value = "Hard Target",
		tier = 2,
		aptitudes = arrayOf(AGILITY, DEFENCE)
	),
	HARDY(
		value = "Hardy",
		tier = 2,
		aptitudes = arrayOf(TOUGHNESS, DEFENCE)
	),
	HATRED(
		value = "Hatred",
		tier = 2,
		aptitudes = arrayOf(WEAPON_SKILL, SOCIAL)
	),
	HIP_SHOOTING(
		value = "Hip Shooting",
		tier = 2,
		aptitudes = arrayOf(BALLISTIC_SKILL, FINESSE)
	),
	INDEPENDENT_TARGETING(
		value = "Independent Targeting",
		tier = 2,
		aptitudes = arrayOf(BALLISTIC_SKILL, FINESSE)
	),
	INESCAPABLE_ATTACK_MELEE(
		value = "Inescapable Attack (Melee)",
		tier = 2,
		aptitudes = arrayOf(WEAPON_SKILL, FINESSE)
	),
	INESCAPABLE_ATTACK_RANGED(
		value = "Inescapable Attack (Ranged)",
		tier = 2,
		aptitudes = arrayOf(BALLISTIC_SKILL, FINESSE)
	),
	INFUSED_KNOWLEDGE(
		value = "Infused Knowledge",
		tier = 3,
		aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)
	),
	IRON_JAW(
		value = "Iron Jaw",
		tier = 1,
		aptitudes = arrayOf(TOUGHNESS, DEFENCE)
	),
	JADED(
		value = "Jaded",
		tier = 1,
		aptitudes = arrayOf(WILLPOWER, DEFENCE)
	)
}
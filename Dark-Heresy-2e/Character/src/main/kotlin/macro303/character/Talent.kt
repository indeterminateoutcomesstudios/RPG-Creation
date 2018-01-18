package macro303.character

import macro303.character.aptitude.Aptitude
import macro303.character.aptitude.CharacterAptitude.*
import macro303.character.aptitude.GeneralAptitude.*

enum class Talent(val value: String, val tier: Int, val aptitudes: Array<Aptitude>) {
	ADAMANTIUM_FAITH(value = "Adamantium Faith", tier = 3, aptitudes = arrayOf(WILLPOWER, DEFENCE)),
	AMBIDEXTROUS(value = "Ambidextrous", tier = 1, aptitudes = arrayOf(WEAPON_SKILL, BALLISTIC_SKILL)),
	ARMOUR_MONGER(value = "Armour Monger", tier = 2, aptitudes = arrayOf(INTELLIGENCE, TECH)),
	ASSASSIN_STRIKE(value = "Assassin Strike", tier = 3, aptitudes = arrayOf(WEAPON_SKILL, FIELDCRAFT))
}
package macro303.character.ageStatus

enum class FeralAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	WARRIOR(value = "Warrior", multiplier = 15),
	OLD_ONE(value = "Old One", multiplier = 25)
}
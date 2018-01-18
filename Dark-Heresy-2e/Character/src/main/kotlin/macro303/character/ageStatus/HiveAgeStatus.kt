package macro303.character.ageStatus

enum class HiveAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	NIPPER(value = "Nipper", multiplier = 15),
	ADULT(value = "Adult", multiplier = 25),
	OLD_TIMER(value = "Old Timer", multiplier = 35)
}
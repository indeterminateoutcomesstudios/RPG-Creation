package macro303.character.ageStatus

enum class ShrineAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	NOVATE(value = "Novate", multiplier = 20),
	VITAL(value = "Vital", multiplier = 25),
	ELDER(value = "Elder", multiplier = 50)
}
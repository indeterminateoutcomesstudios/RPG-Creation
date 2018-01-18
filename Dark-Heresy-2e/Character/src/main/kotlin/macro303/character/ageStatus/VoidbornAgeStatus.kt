package macro303.character.ageStatus

enum class VoidbornAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	YOUTH(value = "Youth", multiplier = 15),
	MATURE(value = "Mature", multiplier = 20),
	METHUSELAH(value = "Methuselah", multiplier = 50)
}
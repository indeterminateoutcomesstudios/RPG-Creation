package macro303.character.ageStatus

enum class ForgeAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	YOUNG(value = "Young", multiplier = 15),
	MATURE(value = "Mature", multiplier = 25),
	VENERATED(value = "Venerated", multiplier = 45)
}
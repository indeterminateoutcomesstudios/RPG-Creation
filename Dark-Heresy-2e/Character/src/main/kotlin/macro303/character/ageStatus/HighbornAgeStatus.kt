package macro303.character.ageStatus

enum class HighbornAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
	SCION(value = "Scion", multiplier = 20),
	PRIME(value = "Prime", multiplier = 30),
	AUTHORITY(value = "Authority", multiplier = 40)
}
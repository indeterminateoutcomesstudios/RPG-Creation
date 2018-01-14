package macro303.character

interface AgeStatus {
	val value: String
	val multiplier: Int

	enum class FeralAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		WARRIOR(value = "Warrior", multiplier = 15),
		OLD_ONE(value = "Old One", multiplier = 25)
	}

	enum class ForgeAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		YOUNG(value = "Young", multiplier = 15),
		MATURE(value = "Mature", multiplier = 25),
		VENERATED(value = "Venerated", multiplier = 45)
	}

	enum class HighbornAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		SCION(value = "Scion", multiplier = 20),
		PRIME(value = "Prime", multiplier = 30),
		AUTHORITY(value = "Authority", multiplier = 40)
	}

	enum class HiveAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		NIPPER(value = "Nipper", multiplier = 15),
		ADULT(value = "Adult", multiplier = 25),
		OLD_TIMER(value = "Old Timer", multiplier = 35)
	}

	enum class ShrineAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		NOVATE(value = "Novate", multiplier = 20),
		VITAL(value = "Vital", multiplier = 25),
		ELDER(value = "Elder", multiplier = 50)
	}

	enum class VoidbornAgeStatus(override val value: String, override val multiplier: Int) : AgeStatus {
		YOUTH(value = "Youth", multiplier = 15),
		MATURE(value = "Mature", multiplier = 20),
		METHUSELAH(value = "Methuselah", multiplier = 50)
	}
}
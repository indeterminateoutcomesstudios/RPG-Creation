package macro303.character

enum class AgeStatus(val value: String, val multiplier: Int) {
	WARRIOR(value = "Warrior", multiplier = 15),
	OLD_ONE(value = "Old One", multiplier = 25),
	YOUNG(value = "Young", multiplier = 15),
	MATURE_F(value = "Mature", multiplier = 25),
	VENERATED(value = "Venerated", multiplier = 45),
	SCION(value = "Scion", multiplier = 20),
	PRIME(value = "Prime", multiplier = 30),
	AUTHORITY(value = "Authority", multiplier = 40),
	NIPPER(value = "Nipper", multiplier = 15),
	ADULT(value = "Adult", multiplier = 25),
	OLD_TIMER(value = "Old Timer", multiplier = 35),
	NOVATE(value = "Novate", multiplier = 20),
	VITAL(value = "Vital", multiplier = 25),
	ELDER(value = "Elder", multiplier = 50),
	YOUTH(value = "Youth", multiplier = 15),
	MATURE_V(value = "Mature", multiplier = 20),
	METHUSELAH(value = "Methuselah", multiplier = 50)
}
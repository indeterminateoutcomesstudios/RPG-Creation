package macro303.character.build

enum class HiveBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int) : Build {
	RUNT(value = "Runt", heightM = 1.6, weightM = 45, heightF = 1.55, weightF = 40),
	SCRAWNY(value = "Scrawny", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
	WIRY(value = "Wiry", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 55),
	LANKY(value = "Lanky", heightM = 1.8, weightM = 65, heightF = 1.7, weightF = 65),
	BRAWNY(value = "Brawny", heightM = 1.75, weightM = 80, heightF = 1.65, weightF = 75)
}
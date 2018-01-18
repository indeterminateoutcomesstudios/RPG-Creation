package macro303.character.build

enum class ShrineBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int) : Build {
	DIMINISHED(value = "Diminished", heightM = 1.6, weightM = 45, heightF = 1.55, weightF = 40),
	LESSENED(value = "Lessened", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
	FAITHFUL(value = "Faithful", heightM = 1.75, weightM = 60, heightF = 1.65, weightF = 55),
	COMMENDED(value = "Commended", heightM = 1.9, weightM = 95, heightF = 1.8, weightF = 70),
	ABUNDANT(value = "Abundant", heightM = 1.65, weightM = 85, heightF = 1.55, weightF = 75)
}
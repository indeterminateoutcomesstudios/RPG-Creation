package macro303.character.build

enum class ForgeBuild(
	override val value: String,
	override val heightM: Double,
	override val weightM: Int,
	override val heightF: Double,
	override val weightF: Int
) : Build {
	MINIMAL(value = "Minimal", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
	LOW_NOMINAL(value = "Low Nominal", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 50),
	OPTIMAL(value = "Optimal", heightM = 1.8, weightM = 75, heightF = 1.7, weightF = 70),
	HIGH_NOMINAL(value = "High Nominal", heightM = 1.85, weightM = 85, heightF = 1.7, weightF = 75),
	MAXIMAL(value = "Maximal", heightM = 1.9, weightM = 100, heightF = 1.8, weightF = 90)
}
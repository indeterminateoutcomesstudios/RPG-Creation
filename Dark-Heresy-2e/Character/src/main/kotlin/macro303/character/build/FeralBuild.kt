package macro303.character.build

enum class FeralBuild(
	override val value: String,
	override val heightM: Double,
	override val weightM: Int,
	override val heightF: Double,
	override val weightF: Int
) : Build {
	RANGY(value = "Rangy", heightM = 1.9, weightM = 65, heightF = 1.8, weightF = 60),
	LEAN(value = "Lean", heightM = 1.75, weightM = 60, heightF = 1.65, weightF = 55),
	MUSCULAR(value = "Muscular", heightM = 1.85, weightM = 85, heightF = 1.7, weightF = 70),
	SQUAT(value = "Squat", heightM = 1.65, weightM = 80, heightF = 1.55, weightF = 70),
	STRAPPING(value = "Strapping", heightM = 2.1, weightM = 120, heightF = 2.0, weightF = 100)
}
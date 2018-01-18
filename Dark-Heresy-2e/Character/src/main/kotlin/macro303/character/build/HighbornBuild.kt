package macro303.character.build

enum class HighbornBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int) : Build {
	SLENDER(value = "Slender", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 60),
	SVELTE(value = "Svelte", heightM = 1.85, weightM = 70, heightF = 1.75, weightF = 65),
	FIT(value = "Fit", heightM = 1.75, weightM = 70, heightF = 1.65, weightF = 60),
	WELL_BUILT(value = "Well-Built", heightM = 1.9, weightM = 90, heightF = 1.8, weightF = 80),
	POWERFUL(value = "Powerful", heightM = 1.8, weightM = 100, heightF = 1.7, weightF = 90)
}
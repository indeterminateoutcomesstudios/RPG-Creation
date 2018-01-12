package macro303.character

interface Build {
	val value: String
	val heightM: Double
	val weightM: Int
	val heightF: Double
	val weightF: Int

	enum class FeralWorldBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		RANGY(value = "Rangy", heightM = 1.9, weightM = 65, heightF = 1.8, weightF = 60),
		LEAN(value = "Lean", heightM = 1.75, weightM = 60, heightF = 1.65, weightF = 55),
		MUSCULAR(value = "Muscular", heightM = 1.85, weightM = 85, heightF = 1.7, weightF = 70),
		SQUAT(value = "Squat", heightM = 1.65, weightM = 80, heightF = 1.55, weightF = 70),
		STRAPPING(value = "Strapping", heightM = 2.1, weightM = 120, heightF = 2.0, weightF = 100)
	}

	enum class ForgeWorldBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		MINIMAL(value = "Minimal", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
		LOW_NOMINAL(value = "Low Nominal", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 50),
		OPTIMAL(value = "Optimal", heightM = 1.8, weightM = 75, heightF = 1.7, weightF = 70),
		HIGH_NOMINAL(value = "High Nominal", heightM = 1.85, weightM = 85, heightF = 1.7, weightF = 75),
		MAXIMAL(value = "Maximal", heightM = 1.9, weightM = 100, heightF = 1.8, weightF = 90)
	}

	enum class HighbornBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		SLENDER(value = "Slender", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 60),
		SVELTE(value = "Svelte", heightM = 1.85, weightM = 70, heightF = 1.75, weightF = 65),
		FIT(value = "Fit", heightM = 1.75, weightM = 70, heightF = 1.65, weightF = 60),
		WELL_BUILT(value = "Well-Built", heightM = 1.9, weightM = 90, heightF = 1.8, weightF = 80),
		POWERFUL(value = "Powerful", heightM = 1.8, weightM = 100, heightF = 1.7, weightF = 90)
	}

	enum class HiveWorldBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		RUNT(value = "Runt", heightM = 1.6, weightM = 45, heightF = 1.55, weightF = 40),
		SCRAWNY(value = "Scrawny", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
		WIRY(value = "Wiry", heightM = 1.75, weightM = 65, heightF = 1.65, weightF = 55),
		LANKY(value = "Lanky", heightM = 1.8, weightM = 65, heightF = 1.7, weightF = 65),
		BRAWNY(value = "Brawny", heightM = 1.75, weightM = 80, heightF = 1.65, weightF = 75)
	}

	enum class ShrineWorldBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		DIMINISHED(value = "Diminished", heightM = 1.6, weightM = 45, heightF = 1.55, weightF = 40),
		LESSENED(value = "Lessened", heightM = 1.7, weightM = 55, heightF = 1.6, weightF = 50),
		FAITHFUL(value = "Faithful", heightM = 1.75, weightM = 60, heightF = 1.65, weightF = 55),
		COMMENDED(value = "Commended", heightM = 1.9, weightM = 95, heightF = 1.8, weightF = 70),
		ABUNDANT(value = "Abundant", heightM = 1.65, weightM = 85, heightF = 1.55, weightF = 75)
	}

	enum class VoidbornBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int): Build {
		SKELETAL(value = "Skeletal", heightM = 1.75, weightM = 55, heightF = 1.7, weightF = 50),
		STUNTED(value = "Stunted", heightM = 1.65, weightM = 55, heightF = 1.55, weightF = 45),
		GAUNT(value = "Gaunt", heightM = 1.8, weightM = 60, heightF = 1.75, weightF = 60),
		GANGLING(value = "Gangling", heightM = 2.0, weightM = 80, heightF = 1.85, weightF = 70),
		SPINDLY(value = "Spindly", heightM = 2.1, weightM = 75, heightF = 1.95, weightF = 70)
	}
}
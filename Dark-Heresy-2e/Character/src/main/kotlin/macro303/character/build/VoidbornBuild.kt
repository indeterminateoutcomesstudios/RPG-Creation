package macro303.character.build

enum class VoidbornBuild(override val value: String, override val heightM: Double, override val weightM: Int, override val heightF: Double, override val weightF: Int) : Build {
	SKELETAL(value = "Skeletal", heightM = 1.75, weightM = 55, heightF = 1.7, weightF = 50),
	STUNTED(value = "Stunted", heightM = 1.65, weightM = 55, heightF = 1.55, weightF = 45),
	GAUNT(value = "Gaunt", heightM = 1.8, weightM = 60, heightF = 1.75, weightF = 60),
	GANGLING(value = "Gangling", heightM = 2.0, weightM = 80, heightF = 1.85, weightF = 70),
	SPINDLY(value = "Spindly", heightM = 2.1, weightM = 75, heightF = 1.95, weightF = 70)
}
package macro303.character.colour.hair

enum class HighbornHair(override val value: String) : Hair {
	DYED(value = "Dyed (Any Colour)"),
	BLONDE(value = "Blonde"),
	BROWN(value = "Brown"),
	BLACK(value = "Black"),
	GREY(value = "Grey")
}
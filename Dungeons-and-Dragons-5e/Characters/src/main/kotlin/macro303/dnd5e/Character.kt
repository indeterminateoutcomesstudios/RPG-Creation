package macro303.dnd5e

data class Character(
		val isMale: Boolean
) {

	fun display() {
		println("You are: ${if (isMale) "Male" else "Female"}")
	}

	override fun toString(): String {
		return "Character(isMale=$isMale)"
	}

}
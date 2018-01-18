package macro303.character

data class Character(
	val isMale: Boolean
) {

	fun display() {
		println("You are: ${if (isMale) "Male" else "Female"}")
	}

	override fun toString(): String {
		return "Character(isMale=$isMale)"
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			val total = 3
			(0 until total).forEach {
				val character = Builder.buildCharacter()
				if (total <= 3) {
					character.display()
					println("=".repeat(50))
				} else
					println("Character: $character")
			}
		}
	}
}
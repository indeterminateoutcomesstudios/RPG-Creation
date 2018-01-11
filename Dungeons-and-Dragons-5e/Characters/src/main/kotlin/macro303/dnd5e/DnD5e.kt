package macro303.dnd5e

object DnD5e {

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
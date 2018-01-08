package macro303.dh2e

object DH2e {

	@JvmStatic
	fun main(args: Array<String>) {
		val total = 0
		(0..total).forEach {
			val character = generateCharacter()
			if (total < 3)
				character.display()
			else
				println("Character: $character")
			Builder.reset()
		}
	}

	private fun generateCharacter(): Character {
		Builder.rollGender()
		Builder.rollHomeworld()
		Builder.rollBackground()
		Builder.rollRole()
		Builder.rollBuild()
		Builder.rollAge()
		Builder.rollSkin()
		Builder.rollHair()
		Builder.rollEyes()
		Builder.rollQuirks()
		Builder.rollSuperstition()
		return Builder.createCharacter()
	}
}
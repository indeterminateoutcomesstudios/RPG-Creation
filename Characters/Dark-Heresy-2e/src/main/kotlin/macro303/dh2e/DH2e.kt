package macro303.dh2e

object DH2e {

	@JvmStatic
	fun main(args: Array<String>) {
		generateCharacter()
	}

	private fun generateCharacter() {
		Builder.rollGender()
		Builder.rollHomeworld()
		Builder.rollBackground()
		Builder.rollRole()
		Builder.rollBuild()
		Builder.rollAge()
		Builder.rollSkin()
		Builder.rollHair()
		Builder.rollEyes()
		val character = Builder.createCharacter()
		println("Character: $character")
	}
}
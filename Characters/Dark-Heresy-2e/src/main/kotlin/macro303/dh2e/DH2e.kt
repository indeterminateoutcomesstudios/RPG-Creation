package macro303.dh2e

object DH2e {

	@JvmStatic
	fun main(args: Array<String>) {
		Builder.rollGender()
		Builder.rollHomeworld()
		Builder.rollBackground()
		Builder.rollRole()
		Builder.rollBuild()
		Builder.rollAge()
		Builder.rollSkin()
		val character = Builder.createCharacter()
		println("Character: $character")
	}
}
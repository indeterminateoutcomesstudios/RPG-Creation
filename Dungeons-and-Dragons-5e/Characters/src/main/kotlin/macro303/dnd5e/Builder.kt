package macro303.dnd5e

import java.util.*

object Builder {
	private fun ClosedRange<Int>.randomInt() = Random().nextInt(endInclusive + 1 - start) + start
	private fun randomBoolean() = Random().nextBoolean()

	fun buildCharacter(
			isMale: Boolean = rollGender()
	): Character {
		return Character(
				isMale = isMale
		)
	}

	private fun rollGender(): Boolean {
		return randomBoolean()
	}
}
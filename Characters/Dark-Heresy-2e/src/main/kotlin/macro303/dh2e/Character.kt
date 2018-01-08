package macro303.dh2e

import java.util.*

data class Character(
		val isMale: Boolean? = null,
		val homeworld: Homeworld? = null,
		val background: Background? = null,
		val role: Role? = null,
		val build: Build? = null,
		val ageStatus: AgeStatus? = null,
		val age: Int? = null,
		val skin: Colour? = null,
		val hair: Colour? = null,
		val eyes: Colour? = null,
		val quirks: Array<Quirk> = emptyArray(),
		val superstition: Superstition? = null
) {

	fun display() {
		if (isMale != null)
			println("You are: ${if (isMale) "Male" else "Female"}")
		if (homeworld != null) {
			if (homeworld != Homeworld.Highborn && homeworld != Homeworld.Voidborn)
				println("Your homeworld is known as a: $homeworld")
			else
				println("Due to your homeworld you are known as a: $homeworld")
		}
		if (background != null)
			println("Your background/skill is in being a: $background")
		if (role != null)
			println("Your role in society is: $role")
		if (build != null && isMale != null)
			println("Compared to others from your homeworld your build is: $build, with a rough height of ${if (isMale) build.heightM else build.heightF} and a rough weight of ${if (isMale) build.weightM else build.weightF}")
		if (ageStatus != null && age != null)
			println("Compared to others from your homeworld your age classes you as: $ageStatus, you are aged: $age")
		if (skin != null)
			println("Your skin colour is: $skin")
		if (hair != null)
			println("Your hair colour is: $hair")
		if (eyes != null)
			println("Your eye colour is: $eyes")
		if (quirks.isNotEmpty())
			println("The little quirks that make you different from everyone else are: ${Arrays.toString(quirks)}")
		if (superstition != null)
			println("You believe: $superstition\n\tMeaning: ${superstition.description}")
	}

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Character) return false

		if (isMale != other.isMale) return false
		if (homeworld != other.homeworld) return false
		if (background != other.background) return false
		if (role != other.role) return false
		if (build != other.build) return false
		if (ageStatus != other.ageStatus) return false
		if (age != other.age) return false
		if (skin != other.skin) return false
		if (hair != other.hair) return false
		if (eyes != other.eyes) return false
		if (!Arrays.equals(quirks, other.quirks)) return false
		if (superstition != other.superstition) return false

		return true
	}

	override fun hashCode(): Int {
		var result = isMale?.hashCode() ?: 0
		result = 31 * result + (homeworld?.hashCode() ?: 0)
		result = 31 * result + (background?.hashCode() ?: 0)
		result = 31 * result + (role?.hashCode() ?: 0)
		result = 31 * result + (build?.hashCode() ?: 0)
		result = 31 * result + (ageStatus?.hashCode() ?: 0)
		result = 31 * result + (age ?: 0)
		result = 31 * result + (skin?.hashCode() ?: 0)
		result = 31 * result + (hair?.hashCode() ?: 0)
		result = 31 * result + (eyes?.hashCode() ?: 0)
		result = 31 * result + Arrays.hashCode(quirks)
		result = 31 * result + (superstition?.hashCode() ?: 0)
		return result
	}

	override fun toString(): String {
		return "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age, skin=$skin, hair=$hair, eyes=$eyes, quirks=${Arrays.toString(quirks)}, superstition=$superstition)"
	}
}
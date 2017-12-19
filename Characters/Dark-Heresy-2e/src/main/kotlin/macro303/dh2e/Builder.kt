package macro303.dh2e

object Builder {
	var isMale: Boolean? = null
	var homeworld: Homeworld? = null
	var background: Background? = null
	var role: Role? = null
	var build: Build? = null
	var ageStatus: AgeStatus? = null
	var age: Int? = null

	fun createCharacter(): Character{
		return Character(isMale = isMale, homeworld = homeworld, background = background, role = role, build = build, ageStatus = ageStatus, age = age)
	}
}
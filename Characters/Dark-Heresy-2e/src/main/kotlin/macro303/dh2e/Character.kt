package macro303.dh2e

data class Character(val isMale: Boolean? = null, val homeworld: Homeworld? = null, val background: Background? = null, val role: Role? = null, val build: Build? = null, val ageStatus: AgeStatus? = null, val age: Int? = null) {

	override fun toString(): String = "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age)"
}
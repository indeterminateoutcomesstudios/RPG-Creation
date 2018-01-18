package macro303.character.aptitude

enum class SkillAptitude(override val value: String, val characteristic: CharacterAptitude, val aptitudes: Array<Aptitude>, var level: Int) : Aptitude {

}
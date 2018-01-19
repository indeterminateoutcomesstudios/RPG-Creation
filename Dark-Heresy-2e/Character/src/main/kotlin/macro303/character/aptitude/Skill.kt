package macro303.character.aptitude

interface Skill : Aptitude {
	override val value: String
	val characteristic: CharacterAptitude
	val aptitudes: Array<Aptitude>
}
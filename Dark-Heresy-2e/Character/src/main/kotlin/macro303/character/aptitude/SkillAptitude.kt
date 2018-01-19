package macro303.character.aptitude

import macro303.character.aptitude.CharacterAptitude.*
import macro303.character.aptitude.GeneralAptitude.*

enum class SkillAptitude(
	override val value: String,
	override val characteristic: CharacterAptitude,
	override val aptitudes: Array<Aptitude>
) : Skill {
	ACROBATICS(value = "Acrobatics", characteristic = AGILITY, aptitudes = arrayOf(AGILITY, GENERAL)),
	ATHLETICS(value = "Athletics", characteristic = STRENGTH, aptitudes = arrayOf(STRENGTH, GENERAL)),
	AWARENESS(value = "Awareness", characteristic = PERCEPTION, aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)),
	CHARM(value = "Charm", characteristic = FELLOWSHIP, aptitudes = arrayOf(FELLOWSHIP, SOCIAL)),
	COMMAND(value = "Command", characteristic = FELLOWSHIP, aptitudes = arrayOf(FELLOWSHIP, LEADERSHIP)),
	COMMERCE(value = "Commerce", characteristic = INTELLIGENCE, aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE));

	enum class CommonLore(override val value: String, val description: String) : Skill {
		ADEPTA_SORORITAS(
			value = "Adepta Sororitas",
			description = "Knowledge of the women of the Adepta Sororitas and their spiritual culture, as well as their highly specialised equipment."
		),
		ADEPTUS_ARBITES(
			value = "Adeptus Arbites",
			description = "Knowledge of its various arms and sub-sects, including details of rank structure, common procedures, and the basic tenets of Imperial Justice."
		),
		ADEPTUS_ASTARTES(
			value = "Adeptus Astartes",
			description = "Information concerning the physiologically and psychologically modified Space Marines, the Imperium’s most potent defenders. Few outside their ranks gain such knowledge, which can include the culture of a Chapter and its history, wargear, unusual physiology, and battle cants."
		),
		ADEPTUS_ASTRA_TELEPATHICA(
			value = "Adeptus Astra Telepathica",
			description = "Knowledge of how psykers are gathered and sanctioned, including how Astropaths are used throughout the Imperium, and the basics of astro-telepathy."
		),
		ADEPTUS_MECHANICUS(
			value = "Adeptus Mechanicus",
			description = "A general understanding of the symbols and practices that the Cult of the Machine God commonly uses. Administratum: Broad knowledge of the labyrinthine workings, rules, traditions, and dictates of the Adeptus Administratum"
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, GENERAL)
	}
}
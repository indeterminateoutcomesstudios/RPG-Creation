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
			description = "A general understanding of the symbols and practices that the Cult of the Machine God commonly uses. Administratum: Broad knowledge of the labyrinthine workings, rules, traditions, and dictates of the Adeptus Administratum."
		),
		ADMINISTRATUM(
			value = "Administratum",
			description = "Broad knowledge of the labyrinthine workings, rules, traditions, and dictates of the Adeptus Administratum."
		),
		ASKELLON_SECTOR(
			value = "Askellon Sector",
			description = "Information concerning the basic layout and history of the sector, including Juno and the Grand Worlds, plus many of the Tributary Worlds."
		),
		CHARTIST_CAPTAINS(
			value = "Chartist Captains",
			description = "Knowledge of the merchant vessels across Askellon, which complete centuries-long circuits through series of neighbouring worlds as the primary means of Imperial commerce."
		),
		COLLEGIA_TITANICUS(
			value = "Collegia Titanicus",
			description = "Familiarity with those who control the Battle Titans of the Adeptus Mechanicus, some of the most potent planet-bound weapons known to the Imperium."
		),
		ECCLESIARCHY(
			value = "Ecclesiarchy",
			description = "Understanding of the structure of the Adeptus Ministorum and its role in the worship of the Emperor."
		),
		IMPERIAL_CREED(
			value = "Imperial Creed",
			description = "Knowledge of the rites, practices, and personages of the Imperial Cult, the most common observances and festivals in honour of the Emperor."
		),
		IMPERIAL_GUARD(
			value = "Imperial Guard",
			description = "Basic information about the ranking system, logistics, structure, and basic tactical and strategic practices of the Imperial Guard, as well as particularly famed regiments."
		),
		IMPERIAL_NAVY(
			value = "Imperial Navy",
			description = "Basic information about the ranks, customs, uniforms, and particular traditions of the Imperial Navy, as well as famous admirals and ships."
		),
		IMPERIUM(
			value = "Imperium",
			description = "Knowledge of the segmenta, sectors, and best-known worlds of the Imperium."
		),
		NAVIGATORS(
			value = "Navigators",
			description = "Information regarding these valued mutants who are essential for Warp travel and the Imperium’s survival, including the various Navis Nobilite Houses operating within Askellon, their lineages, and methodologies."
		),
		PLANETARY_DEFENCE_FORCES(
			value = "Planetary Defence Forces",
			description = "Information concerning a planet’s standing force dedicated to defending itself as well as assisting any nearby Imperial systems. This includes composition, tactics, and equipment, which might vary substantially based on the culture and technological make-up of the world."
		),
		ROGUE_TRADERS(
			value = "Rogue Traders",
			description = "Information concerning the many Rogue Trader dynasties operating within the sector and beyond in search of profit and power."
		),
		SCHOLA_PROGENIUM(
			value = "Schola Progenium",
			description = "A strong familiarity with the Schola Progenium, which trains and indoctrinates the many Imperial orphans and prepares them for lives of faithful service as elite troopers in the Militarum Tempestus, Commissars in the Officio Prefectus, or adepts in one of the Imperium’s many other divisions."
		),
		TECH(
			value = "Tech",
			description = "An understanding of simple litanies and rituals to soothe and appease machine spirits."
		),
		UNDERWORLD(
			value = "Underworld",
			description = "The Acolyte is familiar with basic criminal elements and groups, such as pickpockets, debt-carnivores, and the like."
		),
		WAR(
			value = "War",
			description = "Knowledge of great battles, notable commanders, heroes, and famous stratagems employed by those who fight in the endless battles for and against the Imperium."
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, GENERAL)
	}
}
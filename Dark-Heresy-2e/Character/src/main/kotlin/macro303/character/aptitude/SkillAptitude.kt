package macro303.character.aptitude

import macro303.character.aptitude.CharacterAptitude.*
import macro303.character.aptitude.GeneralAptitude.*

enum class SkillAptitude(
	override val value: String,
	override val characteristic: CharacterAptitude,
	override val aptitudes: Array<Aptitude>
) : Skill {
	ACROBATICS(
		value = "Acrobatics",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, GENERAL)
	),
	ATHLETICS(
		value = "Athletics",
		characteristic = STRENGTH,
		aptitudes = arrayOf(STRENGTH, GENERAL)
	),
	AWARENESS(
		value = "Awareness",
		characteristic = PERCEPTION,
		aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)
	),
	CHARM(
		value = "Charm",
		characteristic = FELLOWSHIP,
		aptitudes = arrayOf(FELLOWSHIP, SOCIAL)
	),
	COMMAND(
		value = "Command",
		characteristic = FELLOWSHIP,
		aptitudes = arrayOf(FELLOWSHIP, LEADERSHIP)
	),
	COMMERCE(
		value = "Commerce",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)
	),
	DECEIVE(
		value = "Deceive",
		characteristic = FELLOWSHIP,
		aptitudes = arrayOf(FELLOWSHIP, SOCIAL)
	),
	DODGE(
		value = "Dodge",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, DEFENCE)
	),
	INQUIRY(
		value = "Inquiry",
		characteristic = FELLOWSHIP,
		aptitudes = arrayOf(FELLOWSHIP, SOCIAL)
	),
	INTERROGATION(
		value = "Interrogation",
		characteristic = WILLPOWER,
		aptitudes = arrayOf(WILLPOWER, SOCIAL)
	),
	INTIMIDATE(
		value = "Intimidate",
		characteristic = STRENGTH,
		aptitudes = arrayOf(STRENGTH, SOCIAL)
	),
	LOGIC(
		value = "Logic",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, KNOWLEDGE)
	),
	MEDICAE(
		value = "Medicae",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, FIELDCRAFT)
	),
	NAVIGATE_SURFACE(
		value = "Navigate (Surface)",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, FIELDCRAFT)
	),
	NAVIGATE_STELLAR(
		value = "Navigate (Stellar)",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, FIELDCRAFT)
	),
	NAVIGATE_WARP(
		value = "Navigate (Warp)",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, FIELDCRAFT)
	),
	OPERATE_SURFACE(
		value = "Operate (Surface)",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, FIELDCRAFT)
	),
	OPERATE_AERONAUTICA(
		value = "Operate (Aeronautica)",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, FIELDCRAFT)
	),
	OPERATE_VOIDSHIP(
		value = "Operate (Voidship)",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, FIELDCRAFT)
	),
	PARRY(
		value = "Parry",
		characteristic = WEAPON_SKILL,
		aptitudes = arrayOf(WEAPON_SKILL, DEFENCE)
	),
	PSYNISCIENCE(
		value = "Psyniscience",
		characteristic = PERCEPTION,
		aptitudes = arrayOf(PERCEPTION, PSYKER)
	),
	SCRUTINY(
		value = "Scrutiny",
		characteristic = PERCEPTION,
		aptitudes = arrayOf(PERCEPTION, GENERAL)
	),
	SECURITY(
		value = "Security",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, TECH)
	),
	SLEIGHT_OF_HAND(
		value = "Sleight of Hand",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, KNOWLEDGE)
	),
	STEALTH(
		value = "Stealth",
		characteristic = AGILITY,
		aptitudes = arrayOf(AGILITY, FIELDCRAFT)
	),
	SURVIVAL(
		value = "Survival",
		characteristic = PERCEPTION,
		aptitudes = arrayOf(PERCEPTION, FIELDCRAFT)
	),
	TECH_USE(
		value = "Tech-Use",
		characteristic = INTELLIGENCE,
		aptitudes = arrayOf(INTELLIGENCE, TECH)
	);

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

	enum class ForbiddenLore(override val value: String, val description: String) : Skill {
		ARCHAEOTECH(
			value = "Archaeotech",
			description = "Knowledge of the great, lost tech devices of times past, and clues to their mysterious functions and purposes."
		),
		CHAOS_SPACE_MARINES(
			value = "Chaos Space Marines",
			description = "Information concerning those Adeptus Astartes who turned traitor, as well as the paths they embrace and the equipment they use."
		),
		CRIMINAL_CARTELS_AND_SMUGGLERS(
			value = "Criminal Cartels and Smugglers",
			description = "Information regarding organised groups that flout the Emperor’s Law in Askellon, such as those engaging in the Faceless Trade of proscribed artefacts."
		),
		DAEMONOLOGY(
			value = "Daemonology",
			description = "Terrible knowledge about some of the most infamous Warp entities and their twisted physical manifestations."
		),
		HERESY(
			value = "Heresy",
			description = "Wisdom concerning acts and practices deemed anathema by the Imperium, plus the most contemptible heretics of history and their infamous and deplorable acts."
		),
		THE_HORUS_HERESY_AND_THE_LONG_WAR(
			value = "The Horus Heresy and the Long War",
			description = "The origins and history of the 10,000 year long struggle between the forces of the Ruinous Powers and the Imperium of Man."
		),
		INQUISITION(
			value = "Inquisition",
			description = "Though Acolytes exist to serve an Inquisitor, knowing too much about their masters can be dangerous. Those who chose to study the history and nature of the Inquisition’s authority often are exposed to information that can forever ruin their minds."
		),
		MUTANTS(
			value = "Mutants",
			description = "The study of stable and unstable mutations within humanity, their cancerous influence and mutagenic development over time, and some of the studies and tomes on the topic."
		),
		OFFICIO_ASSASSINORUM(
			value = "Officio Assassinorum",
			description = "This highly secretive agency exists to eliminate powerful, often singular threats to the Imperium, such as renegade planetary governors or apostate preachers. Acolytes who dare study the organisation may become familiar with their techniques and wargear."
		),
		PIRATES(
			value = "Pirates",
			description = "Knowledge of the scourges of the Warp lanes throughout Askellon, their tactics, infamous vessels, and notorious captains."
		),
		PSYKERS(
			value = "Psykers",
			description = "Skill in identifying psykers, the effects of their unnatural powers, their dangers, and the general extent of their capabilities."
		),
		THE_WARP(
			value = "The Warp",
			description = "An understanding of the energy of the Immaterium, its interaction and interrelation with realspace, and how its tides and eddies affect travel between the stars."
		),
		XENOS(
			value = "Xenos",
			description = "Knowledge of the minor and major alien species known to the Imperium, the threat they pose to Mankind, and their general appearance. The character should specify which xenos race in which he is specialising (for example, Xenos–Craftworld Eldar or Xenos–Orks) as each is a different Specialisation."
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, KNOWLEDGE)
	}

	enum class Linguistics(override val value: String, val description: String) : Skill {
		CHAPTER_RUNES(
			value = "Chapter Runes",
			description = "Each Chapter of the Adeptus Astartes has its own form of ciphers used to communicate between its warriors. These are closely-guarded secrets that are almost never taught to those outside the Chapter or Legion, and as such form a reliable way for those within the Chapter or Legion to quickly identify each other."
		),
		CHAOS_MARKS(
			value = "Chaos Marks",
			description = "There are countless symbols and signs that followers of the various Ruinous Powers use to share their dark secrets, each with its own subtle meaning or specific purpose."
		),
		ELDAR(
			value = "Eldar",
			description = "Though no human can hope to capture the subtle nuances and sub-tones of this extremely complex and ancient language, it is enough to make one’s meaning clear."
		),
		HIGH_GOTHIC(
			value = "High Gothic",
			description = "The official language of the Imperium, used by Imperial officials, nobility, members of the Ecclesiarchy, and those involved in high-level negotiations."
		),
		IMPERIAL_CODES(
			value = "Imperial Codes",
			description = "Both the Imperial Navy and the Imperial Guard employ a battle language which comprises mostly numbers and acronyms. Incomprehensible to those who do not know its meaning, it allows them to quickly signal for reinforcements, identify enemies, and call down fire support or artillery barrages."
		),
		LOW_GOTHIC(
			value = "Low Gothic",
			description = "The common tongue of the Imperium, used by the countless billions of ordinary citizens."
		),
		MERCENARY_CANT(
			value = "Mercenary Cant",
			description = "Many mercenary companies operate across Askellon, and each has an abbreviated, clipped battle language for orders and commands. Though there are some commonalities, each is essentially unique."
		),
		NECRONTYR(
			value = "Necrontyr",
			description = "The ancient and mechanical tones that the arisen Necron lords use to communicate with each other and their underlings as part of their reconquest of the galaxy."
		),
		ORK(
			value = "Ork",
			description = "More grunts and physical violence than an actual language, it is possible for humans to speak and understand this brutal tongue, though it is doubtful they would be able to survive a conversation."
		),
		TECHNA_LINGUA(
			value = "Techna-Lingua",
			description = "The language of the Adeptus Mechanicus, this binary cant has been optimised for rapid and efficient communication of technical data and servitor commands."
		),
		TAU(
			value = "Tau",
			description = "The language of the Tau Empire, spoken by the Tau themselves and understood by their multitude of alien subjects."
		),
		UNDERWORLD(
			value = "Underworld",
			description = "Crime lords have used ciphers for countless millennia, and their sophistication has only increased over time. Each organization, such as the Trade Sable, uses its own unique codes and glyphs to deter competition."
		),
		XENOS_MARKINGS(
			value = "Xenos Markings",
			description = "Many aliens make extensive use of symbolism and icons. Understanding these markings allows a broad understanding of their meaning such as where a race has marked its boundaries or areas marked as “dangerous.”"
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, GENERAL)
	}

	enum class ScholasticLore(override val value: String, val description: String) : Skill {
		ASTROMANCY(
			value = "Astromancy",
			description = "A knowledge of stars, singularities, and the worlds around them, as well as theoretical understanding of how to use magnascopes, astrolithic charts, and the like."
		),
		BEASTS(
			value = "Beasts",
			description = "An understanding of the genus and families of animals and familiarity with the characteristics and appearances of the many semi-sentient creatures to be found across the sector."
		),
		BUREAUCRACY(
			value = "Bureaucracy",
			description = "A familiarity with the rules and regulations involved with Askellian governments, particularly the Adeptus Administratum, and their many and varied departments, bureaus, and polices."
		),
		CHYMISTRY(
			value = "Chymistry",
			description = "A knowledge of chemicals, their alchemical applications in a number of uses, and their prevalence or scarcity throughout the Imperium."
		),
		CRYPTOLOGY(
			value = "Cryptology",
			description = "An understanding of codes, ciphers, cryptographs, secret languages, and numerical keys. This may be used to either create or decipher encryptions."
		),
		HERALDRY(
			value = "Heraldry",
			description = "A grasp of the principles and devices of heraldry, as well as a knowledge of the most common seals and heraldic devices used by the Askellon’s noble houses and families."
		),
		IMPERIAL_WARRANTS(
			value = "Imperial Warrants",
			description = "Information concerning the establishment, legal scope, and use of the warrants granted to Rogue Traders, as well as the best-known and dynastic warrants of the Imperium."
		),
		JUDGEMENT(
			value = "Judgement",
			description = "Knowledge of the proper sentences for the multitude of crimes and heresies punishable by Imperial law."
		),
		LEGEND(
			value = "Legend",
			description = "Going beyond archaic knowledge, this encompasses momentous portions of mythic history, such as the Dark Age of Technology, the Age of Strife, the Great Crusade, and the Horus Heresy, retold in the form of epic, apocryphal fables."
		),
		NUMEROLOGY(
			value = "Numerology",
			description = "An understanding of the mysterious link between numbers and the physical universe, from low kharmic theory to the infamous Kappellax Correlation."
		),
		OCCULT(
			value = "Occult",
			description = "An understanding of obscure and hermetic (though not clearly heretical) rituals, theories, and superstitions, as well as the better-known mystical uses of occult items."
		),
		PHILOSOPHY(
			value = "Philosophy",
			description = "Knowledge concerning the theories of thought, belief, existence, and other intangibles. As it also includes logic and debate, it may be used for crafting arguments or creating philosophical tracts."
		),
		TACTICA_IMPERIALIS(
			value = "Tactica Imperialis",
			description = "The codified military doctrines of the Imperial Guard and Imperial Navy, as well as other systems of troop deployment and battle techniques used by the Imperium. This knowledge may be used to devise a battle plan or deduce the likely flow of war fought by Imperial forces."
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, KNOWLEDGE)
	}

	enum class Trade(override val value: String, val description: String) : Skill {
		AGRI(
			value = "Agri",
			description = "Used to grow, care for, and harvest crops and animals."
		),
		ARCHAEOLOGIST(
			value = "Archaeologist",
			description = "Used to locate, examine, and analyse ancient ruins and artefacts."
		),
		ARMOURER(
			value = "Armourer",
			description = "Used to design, upgrade, and forge weaponry, from personal arms to starship batteries."
		),
		ASTROGRAPHER(
			value = "Astrographer",
			description = "Used to create two- and three-dimensional representations of stellar locations and Warp routes."
		),
		CHYMIST(
			value = "Chymist",
			description = "Used to create poisons, drugs, and a wide variety of other compounds."
		),
		CRYPTOGRAPHER(
			value = "Cryptographer",
			description = "Used to create or decode complicated ciphers, codes, and other puzzles."
		),
		COOK(
			value = "Cook",
			description = "Used to cook meals and determine if scavenged food is edible."
		),
		EXPLORATOR(
			value = "Explorator",
			description = "Used in the exploration of unknown stellar regions."
		),
		LINGUIST(
			value = "Linguist",
			description = "Used to learn or decipher new languages, both spoken and written, and even create new ones in some cases."
		),
		LOREMANCER(
			value = "Loremancer",
			description = "Used to recount events in a variety of ways, from dry recitations or texts to epic operas or statuary"
		),
		MORTICATOR(
			value = "Morticator",
			description = "Used to prepare, preserve, and often render down corpse remains into ingredients for a variety of preparations."
		),
		PERFORMANCER(
			value = "Performancer",
			description = "Used to perform for audiences in a variety of entertaining art forms, often using dance, song, and poetry."
		),
		PROSPECTOR(
			value = "Prospector",
			description = "Used to find and identify valuable minerals."
		),
		SCRIMSHAWER(
			value = "Scrimshawer",
			description = "Used to inscribe patterns, text, and art onto a variety of materials."
		),
		SCULPTOR(
			value = "Sculptor",
			description = "Used to create inspiring works of art in stone, metal, and other materials, often as part of Imperial edifices."
		),
		SHIPWRIGHT(
			value = "Shipwright",
			description = "Used to design, upgrade, and manufacture void-capable vessels."
		),
		SOOTHSAYER(
			value = "Soothsayer",
			description = "Used to “foretell” the future by a number of interpretative arts, though its effectiveness is suspect."
		),
		TECHNOMAT(
			value = "Technomat",
			description = "Used to maintain and repair technological devices, but through rote memorization rather than true understanding or comprehension."
		),
		VOIDFARER(
			value = "Voidfarer",
			description = "Used in the day-to-day operation, logistics, and defence of starships."
		);

		override val characteristic: CharacterAptitude = INTELLIGENCE
		override val aptitudes: Array<Aptitude> = arrayOf(INTELLIGENCE, GENERAL)
	}
}
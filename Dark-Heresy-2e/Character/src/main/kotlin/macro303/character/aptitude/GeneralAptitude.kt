package macro303.character.aptitude

enum class GeneralAptitude(override val value: String) : Aptitude {
	GENERAL(value = "General"),
	OFFENCE(value = "Offence"),
	FINESSE(value = "Finesse"),
	DEFENCE(value = "Defence"),
	PSYKER(value = "Psyker"),
	TECH(value = "Tech"),
	KNOWLEDGE(value = "Knowledge"),
	LEADERSHIP(value = "Leadership"),
	FIELDCRAFT(value = "Fieldcraft"),
	SOCIAL(value = "Social")
}
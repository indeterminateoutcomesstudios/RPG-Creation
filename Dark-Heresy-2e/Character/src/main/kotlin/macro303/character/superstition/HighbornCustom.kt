package macro303.character.superstition

enum class HighbornCustom(override val value: String, override val description: String) : Superstition {
	COUNT_THE_BLESSINGS(
		value = "Count the Blessings",
		description = "Knowledge of power is power continued; maintaining a ledger of debts and favours helps ensure power is retained and strengthened."
	),
	EACH_LAND_A_CONQUEST(
		value = "Each Land a Conquest",
		description = "To journey to a planet is to start the process of control; the first step onto a new world must be a firm stomp, to begin its taming."
	),
	LAYERS_OF_PROTECTION(
		value = "Layers of Protection",
		description = "A deed pawned to another is a deed disguised; whenever possible, have others conduct your directives so they can never be traced to their source."
	),
	ARMS_LENGTH(
		value = "Arms Length",
		description = "Nearness breeds contempt; always seek to keep lessers at a distance, lest they believe themselves equal."
	),
	NOTHING_LEFT_BEHIND(
		value = "Nothing Left Behind",
		description = "Fill the belly and enforce the station; never leave an unfinished meal which could allow lessers to dine far above their lot."
	),
	SPEAK_STRONGLY(
		value = "Speak Strongly",
		description = "None should be unaware when their betters speak; always vocalise with powerful tones to suitably impress those nearby."
	),
	COMPORT_IN_STYLE(
		value = "Comport in Style",
		description = "Proper conduct is the true test of blood; to never panic, to maintain the finest of manners, and to never embarrass the family name, are all marks of the lordly."
	),
	BEWARE_THE_POISONER(
		value = "Beware the Poisoner",
		description = "The quickest way to the heart is through the stomach; be wary of a meal from unknown sources, lest it be the last."
	),
	TRAPPINGS_OF_POWER(
		value = "Trappings of Power",
		description = "It is essential to display power in order to wield it properly; fine clothing, carrying batons or other devices of control, and well-styled hair should always be the goal."
	),
	DISGUISE_STRENGTH(
		value = "Disguise Strength",
		description = "Power Hidden is power multiplied; always refrain from showing the full extent of capabilities to ensure there are still surprises left to use."
	)
}
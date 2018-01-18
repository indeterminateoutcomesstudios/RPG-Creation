package macro303.character.superstition

enum class HiveTradition(override val value: String, override val description: String) : Superstition {
	TOUCH_THE_SKY(
		value = "Touch the Sky",
		description = "To feel the sturdy metal above is to know serenity; whenever entering a new enclosure, always reach upwards to the ceiling to honour the dwelling."
	),
	BLIGHT_IN_DARKNESS(
		value = "Blight in Darkness",
		description = "An area unlit is a dangerous area; whenever possible, leave glow-globes and torches lit and never wander from their comforting presence."
	),
	COMBAT_STRENGTH(
		value = "Combat Strength",
		description = "Tap a melee weapon against a wall or flooring before battle, allowing it to gain a sliver of the hive's strength and power."
	),
	COMFORTABLE_NUMBERS(
		value = "Comfortable Numbers",
		description = "Only when surrounded with fellow hivers is the hive complete, and rooms should never be allowed to become bereft of crowded flesh."
	),
	DISTRUST_THE_STRANGE(
		value = "Distrust the Strange",
		description = "Familiarity breeds comfort; new places, people, or sights should be avoided as they can only bring unwelcome change."
	),
	STRENGTHEN_THE_HIVE(
		value = "Strengthen the Hive",
		description = "Forming stray objects into pyramidal shapes bolsters the hive's spirit and brings good fortune until the next waking hour."
	),
	FEAR_THE_SILENCE(
		value = "Fear the Silence",
		description = "A hive is always filled with sound; quiet only means death is coming, and should silence descend, make noise to ward off ill-fortune."
	),
	KEEP_NATURE_AT_BAY(
		value = "Keep Nature at Bay",
		description = "Base life should never intrude; pluck and toss stray weeds to gain luck."
	),
	HIVE_AND_SKIN(
		value = "Hive and skin",
		description = "Make the hive part of the flesh, and honour its spirit; always rub dust or metal shavings from the ground under fingernails to ensure luck."
	),
	SOLITUDE_IS_GOLDEN(
		value = "Solitude is Golden",
		description = "For the crowded masses, the smallest measure of privacy is priceless; seclusion should be respected and honoured."
	)
}
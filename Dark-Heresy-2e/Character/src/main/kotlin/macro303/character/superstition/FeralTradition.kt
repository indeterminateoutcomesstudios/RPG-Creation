package macro303.character.superstition

enum class FeralTradition(override val value: String, override val description: String) : Superstition {
	WARD_OF_SOIL(
		value = "Ward of Soil",
		description = "Each world protects those who honour it; applying a handful of native soil to the skin helps keep foul spirits at bay."
	),
	UNLUCKY_COLOUR(
		value = "Unlucky Colour",
		description = "The sky flashed an unnatural shade just before the tribe's greatest disaster; this colour must be shunned whenever it appears."
	),
	HUNTERS_OATH(
		value = "Hunter's Oath",
		description = "Eating food that he did not personally kill brings bad luck, and only acts of contrition can appease the angry spirits."
	),
	THIRSTY_BLADE(
		value = "Thirsty Blade",
		description = "The spirit of a weapon is a hungry ghost; it must taste blood every time it is drawn lest great ill befall those around it."
	),
	SPIRIT_SHACKLE(
		value = "Spirit Shackle",
		description = "All items gain a portion of their owner's soul; taking a trophy from a vanquished foe brings the victor great luck."
	),
	A_GOOD_DEATH(
		value = "A Good Death",
		description = "Honour comes from a glorious death, while cowardice brings only shame to the tribe. The ancestors are watching; do not disappoint them."
	),
	POWER_OF_NAMES(
		value = "Power of Names",
		description = "Never use the true names of friends and loved ones; the shadows are always listening and ready to use them for evil."
	),
	LONELY_DEAD(
		value = "Lonely Dead",
		description = "Never utter the true names of the dead, lest they be summoned back from the void."
	),
	LIVING_RECORD(
		value = "Living Record",
		description = "Each victory must be recorded; scarred inscriptions and tattoos ensures the Emperor can read of their mighty deeds."
	),
	SACRED_GROUND(
		value = "Sacred Ground",
		description = "Distance from the living earth upsets the natural balance: time spent not in contact with a world is ill-omened and unnatural."
	)
}
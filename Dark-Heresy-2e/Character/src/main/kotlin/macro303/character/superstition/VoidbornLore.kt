package macro303.character.superstition

enum class VoidbornLore(override val value: String, override val description: String) : Superstition {
	NAILED_HULLS(
		value = "Nailed Hulls",
		description = "Leaving a pile of toenail clippings (the longer and more plentiful the better) at the base of a bulkhead bolsters its strength."
	),
	HAUNTED_DECKS(
		value = "Haunted Decks",
		description = "If the lights in an area fail three times in a shift, hold one hand over the eyes when passing through it. This allows passage without detection from the angry souls trapped within."
	),
	WELCOMING_HATCHES(
		value = "Welcoming Hatches",
		description = "Always leave hatchways open, to ensure the vessel's spirit can move freely."
	),
	UNLUCKY_ECLIPSES(
		value = "Unlucky Eclipses",
		description = "Refrain from important actions whenever the vessel is in shadow."
	),
	FEARED_OCTET(
		value = "Feared Octet",
		description = "When prominent stars are sighted in an eightfold symbol, make the sign of the Aquila, lest foul spirits notice the unprotected soul."
	),
	THIRD_SHIP_OMEN(
		value = "Third Ship Omen",
		description = "If a squadron comes alongside, the third vessel to pass along the viewport is destined to bring bad luck."
	),
	RUMBLING_PLASMA(
		value = "Rumbling Plasma",
		description = "If the ship's engines roar loudly in a burst of vibration, always stomp three times on the deck as an answering reply."
	),
	LUCKY_RUB(
		value = "Lucky Rub",
		description = "If offered real meat, first rub it up and down twice against a wall or bulkhead, so the ship's luck infuses the meal."
	),
	KNOCKING_SHELLS(
		value = "Knocking Shells",
		description = "Before loading a weapon, bounce three shells off the ceiling. If all are caught in one hand, the clip becomes lucky."
	),
	EBON_OFFERINGS(
		value = "Ebon Offerings",
		description = "To remove poor fortune, venture to the under decks and throw a day's rations into the darkness. If no impact is heard, good luck is certain to return."
	)
}
package macro303.character.superstition

enum class ShrineMore(override val value: String, override val description: String) : Superstition {
	HONOUR_THE_SKULLS(
		value = "Honour the Skulls",
		description = "Those who serve after death are especially favoured; always show signs of respect to all servo skills and honour their duty."
	),
	ENDLESS_REPOSE(
		value = "Endless Repose",
		description = "Respect the spirits of the fallen by refraining from sudden movements or gestures; perfect stillness is perfect honour."
	),
	SUFFER_THE_PILGRIMS(
		value = "Suffer the Pilgrims",
		description = "Only through pain can pilgrims properly appreciate the sacrifice of others; always scatter nails or sharp rocks along any pathways they would take."
	),
	NEVER_DISTURB_THE_DEAD(
		value = "Never Disturb the Dead",
		description = "Those Buried should be allowed their sleep; never walk over a grave or even any location where death occurred."
	),
	CLOUD_REVELATIONS(
		value = "Cloud Revelations",
		description = "The patterns above can reveal the faith below; the colours and shapes in aerial masses of smoke indicate true faith of the next pilgrim encountered."
	),
	CHALLENGE_THE_SUN(
		value = "Challenge the Sun",
		description = "Faith is stronger than nature; stare into the sun once a day until it is sufficiently cowed into submission to man's dominion."
	),
	STONE_ABIDES(
		value = "Stone Abides",
		description = "When entering a new building or habitation, press strongly against a wall to ensure it is as strong and eternal as faith."
	),
	DEATH_IN_THE_ODDS(
		value = "Death in the Odds",
		description = "Any group of pilgrims with an odd number of people will surely suffer a death before sundown, so ensure they are split or merged to create an even number."
	),
	DRINK_TO_THE_DEAD(
		value = "Drink to the Dead",
		description = "The first sip of any liquid should be spit unto the floor, as an offering to those who fell that the Imperium would survive."
	),
	AQUILA_BLESSING(
		value = "Aquila Blessing",
		description = "The sign of the Emperor is Sacred; always return the mark of the Aquila after it is given."
	)
}
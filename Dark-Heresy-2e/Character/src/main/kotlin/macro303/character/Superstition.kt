package macro303.character

interface Superstition {
	val value: String
	val description: String

	enum class FeralTradition(override val value: String, override val description: String) : Superstition {
		WARD_OF_SOIL(value = "Ward of Soil", description = "Each world protects those who honour it; applying a handful of native soil to the skin helps keep foul spirits at bay."),
		UNLUCKY_COLOUR(value = "Unlucky Colour", description = "The sky flashed an unnatural shade just before the tribe's greatest disaster; this colour must be shunned whenever it appears."),
		HUNTERS_OATH(value = "Hunter's Oath", description = "Eating food that he did not personally kill brings bad luck, and only acts of contrition can appease the angry spirits."),
		THIRSTY_BLADE(value = "Thirsty Blade", description = "The spirit of a weapon is a hungry ghost; it must taste blood every time it is drawn lest great ill befall those around it."),
		SPIRIT_SHACKLE(value = "Spirit Shackle", description = "All items gain a portion of their owner's soul; taking a trophy from a vanquished foe brings the victor great luck."),
		A_GOOD_DEATH(value = "A Good Death", description = "Honour comes from a glorious death, while cowardice brings only shame to the tribe. The ancestors are watching; do not disappoint them."),
		POWER_OF_NAMES(value = "Power of Names", description = "Never use the true names of friends and loved ones; the shadows are always listening and ready to use them for evil."),
		LONELY_DEAD(value = "Lonely Dead", description = "Never utter the true names of the dead, lest they be summoned back from the void."),
		LIVING_RECORD(value = "Living Record", description = "Each victory must be recorded; scarred inscriptions and tattoos ensures the Emperor can read of their mighty deeds."),
		SACRED_GROUND(value = "Sacred Ground", description = "Distance from the living earth upsets the natural balance: time spent not in contact with a world is ill-omened and unnatural.")
	}

	enum class ForgeCant(override val value: String, override val description: String) : Superstition {
		NATIVE_METAL(value = "Native Metal", description = "A forge's primary metal is linked to each birth there: when that alloy is encountered, it is wise to softly polish or oil it to improve probabilities."),
		WASTE_NOT(value = "Waste Not", description = "There is no such thing as unneeded materials; let nothing go to waste, and always seek to reuse and refurbish lest the spirits of the item become upset."),
		BINARY_PERFECTION(value = "Binary Perfection", description = "The machine speaks in binary to show the proper path. Life should also form in pairs, and whenever possible turn the odd into even to honour the balance."),
		CASTIGATE_THE_FLESH(value = "Castigate the Flesh", description = "The flesh must always be reminded of its inherent weakness; inflicting minor tortures and pain upon oneself brings strength to nearby machine spirits."),
		PURIFYING_HEAT(value = "Purifying Heat", description = "A forge purifies ores into refined metal; always seek out heat and steam to purify the mind and strengthen the will."),
		PLACATE_THE_MACHINE_SPIRIT(value = "Placate the Machine-Spirit", description = "To soothe the machine is to honour its spirit; soft humming and sub-vocal harmonics bring favour with devices."),
		NEVER_TO_DUST(value = "Never to Dust", description = "No machine should go still; always seek to utilise all moving parts on a device and activate its motive means, let its spirit grow quiet and fade."),
		TAPPING_FOR_BLESSING(value = "Tapping for Blessing", description = "A machine spirit that is acknowledged is one that responds well to its users; slightly tapping a device twice with two fingers soothes the spirit and brings fortune."),
		HONOUR_THE_METAL(value = "Honour the Metal", description = "No machine should fall forgotten; whenever a stray part of shard is found left in the dirt, raise it up and place it in a prominent spot to honour its service."),
		ABHOR_THE_NATURAL(value = "Abhor the Natural", description = "The flesh is best serviced with machine-blessed meals; avoid food and drink that have not been properly rendered and processed.")
	}

	enum class HighbornCustom(override val value: String, override val description: String) : Superstition {
		COUNT_THE_BLESSINGS(value = "Count the Blessings", description = "Knowledge of power is power continued; maintaining a ledger of debts and favours helps ensure power is retained and strengthened."),
		EACH_LAND_A_CONQUEST(value = "Each Land a Conquest", description = "To journey to a planet is to start the process of control; the first step onto a new world must be a firm stomp, to begin its taming."),
		LAYERS_OF_PROTECTION(value = "Layers of Protection", description = "A deed pawned to another is a deed disguised; whenever possible, have others conduct your directives so they can never be traced to their source."),
		ARMS_LENGTH(value = "Arms Length", description = "Nearness breeds contempt; always seek to keep lessers at a distance, lest they believe themselves equal."),
		NOTHING_LEFT_BEHIND(value = "Nothing Left Behind", description = "Fill the belly and enforce the station; never leave an unfinished meal which could allow lessers to dine far above their lot."),
		SPEAK_STRONGLY(value = "Speak Strongly", description = "None should be unaware when their betters speak; always vocalise with powerful tones to suitably impress those nearby."),
		COMPORT_IN_STYLE(value = "Comport in Style", description = "Proper conduct is the true test of blood; to never panic, to maintain the finest of manners, and to never embarrass the family name, are all marks of the lordly."),
		BEWARE_THE_POISONER(value = "Beware the Poisoner", description = "The quickest way to the heart is through the stomach; be wary of a meal from unknown sources, lest it be the last."),
		TRAPPINGS_OF_POWER(value = "Trappings of Power", description = "It is essential to display power in order to wield it properly; fine clothing, carrying batons or other devices of control, and well-styled hair should always be the goal."),
		DISGUISE_STRENGTH(value = "Disguise Strength", description = "Power Hidden is power multiplied; always refrain from showing the full extent of capabilities to ensure there are still surprises left to use.")
	}

	enum class HiveTradition(override val value: String, override val description: String) : Superstition {
		TOUCH_THE_SKY(value = "Touch the Sky", description = "To feel the sturdy metal above is to know serenity; whenever entering a new enclosure, always reach upwards to the ceiling to honour the dwelling."),
		BLIGHT_IN_DARKNESS(value = "Blight in Darkness", description = "An area unlit is a dangerous area; whenever possible, leave glow-globes and torches lit and never wander from their comforting presence."),
		COMBAT_STRENGTH(value = "Combat Strength", description = "Tap a melee weapon against a wall or flooring before battle, allowing it to gain a sliver of the hive's strength and power."),
		COMFORTABLE_NUMBERS(value = "Comfortable Numbers", description = "Only when surrounded with fellow hivers is the hive complete, and rooms should never be allowed to become bereft of crowded flesh."),
		DISTRUST_THE_STRANGE(value = "Distrust the Strange", description = "Familiarity breeds comfort; new places, people, or sights should be avoided as they can only bring unwelcome change."),
		STRENGTHEN_THE_HIVE(value = "Strengthen the Hive", description = "Forming stray objects into pyramidal shapes bolsters the hive's spirit and brings good fortune until the next waking hour."),
		FEAR_THE_SILENCE(value = "Fear the Silence", description = "A hive is always filled with sound; quiet only means death is coming, and should silence descend, make noise to ward off ill-fortune."),
		KEEP_NATURE_AT_BAY(value = "Keep Nature at Bay", description = "Base life should never intrude; pluck and toss stray weeds to gain luck."),
		HIVE_AND_SKIN(value = "Hive and Skin", description = "Make the hive part of the flesh, and honour its spirit; always rub dust or metal shavings from the ground under fingernails to ensure luck."),
		SOLITUDE_IS_GOLDEN(value = "Solitude is Golden", description = "For the crowded masses, the smallest measure of privacy is priceless; seclusion should be respected and honoured.")
	}

	enum class ShrineMore(override val value: String, override val description: String) : Superstition {
		HONOUR_THE_SKULLS(value = "Honour the Skulls", description = "Those who serve after death are especially favoured; always show signs of respect to all servo skills and honour their duty."),
		ENDLESS_REPOSE(value = "Endless Repose", description = "Respect the spirits of the fallen by refraining from sudden movements or gestures; perfect stillness is perfect honour."),
		SUFFER_THE_PILGRIMS(value = "Suffer the Pilgrims", description = "Only through pain can pilgrims properly appreciate the sacrifice of others; always scatter nails or sharp rocks along any pathways they would take."),
		NEVER_DISTURB_THE_DEAD(value = "Never Disturb the Dead", description = "Those Buried should be allowed their sleep; never walk over a grave or even any location where death occurred."),
		CLOUD_REVELATIONS(value = "Cloud Revelations", description = "The patterns above can reveal the faith below; the colours and shapes in aerial masses of smoke indicate true faith of the next pilgrim encountered."),
		CHALLENGE_THE_SUN(value = "Challenge the Sun", description = "Faith is stronger than nature; stare into the sun once a day until it is sufficiently cowed into submission to man's dominion."),
		STONE_ABIDES(value = "Stone Abides", description = "When entering a new building or habitation, press strongly against a wall to ensure it is as strong and eternal as faith."),
		DEATH_IN_THE_ODDS(value = "Death in the Odds", description = "Any group of pilgrims with an odd number of people will surely suffer a death before sundown, so ensure they are split or merged to create an even number."),
		DRINK_TO_THE_DEAD(value = "Drink to the Dead", description = "The first sip of any liquid should be spit unto the floor, as an offering to those who fell that the Imperium would survive."),
		AQUILA_BLESSING(value = "Aquila Blessing", description = "The sign of the Emperor is Sacred; always return the mark of the Aquila after it is given.")
	}

	enum class VoidbornLore(override val value: String, override val description: String) : Superstition {
		NAILED_HULLS(value = "Nailed Hulls", description = "Leaving a pile of toenail clippings (the longer and more plentiful the better) at the base of a bulkhead bolsters its strength."),
		HAUNTED_DECKS(value = "Haunted Decks", description = "If the lights in an area fail three times in a shift, hold one hand over the eyes when passing through it. This allows passage without detection from the angry souls trapped within."),
		WELCOMING_HATCHES(value = "Welcoming Hatches", description = "Always leave hatchways open, to ensure the vessel's spirit can move freely."),
		UNLUCKY_ECLIPSES(value = "Unlucky Eclipses", description = "Refrain from important actions whenever the vessel is in shadow."),
		FEARED_OCTET(value = "Feared Octet", description = "When prominent stars are sighted in an eightfold symbol, make the sign of the Aquila, lest foul spirits notice the unprotected soul."),
		THIRD_SHIP_OMEN(value = "Third Ship Omen", description = "If a squadron comes alongside, the third vessel to pass along the viewport is destined to bring bad luck."),
		RUMBLING_PLASMA(value = "Rumbling Plasma", description = "If the ship's engines roar loudly in a burst of vibration, always stomp three times on the deck as an answering reply."),
		LUCKY_RUB(value = "Lucky Rub", description = "If offered real meat, first rub it up and down twice against a wall or bulkhead, so the ship's luck infuses the meal."),
		KNOCKING_SHELLS(value = "Knocking Shells", description = "Before loading a weapon, bounce three shells off the ceiling. If all are caught in one hand, the clip becomes lucky."),
		EBON_OFFERINGS(value = "Ebon Offerings", description = "To remove poor fortune, venture to the under decks and throw a day's rations into the darkness. If no impact is heard, good luck is certain to return.")
	}
}
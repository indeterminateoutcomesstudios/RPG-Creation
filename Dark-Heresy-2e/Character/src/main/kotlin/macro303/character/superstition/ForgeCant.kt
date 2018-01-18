package macro303.character.superstition

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
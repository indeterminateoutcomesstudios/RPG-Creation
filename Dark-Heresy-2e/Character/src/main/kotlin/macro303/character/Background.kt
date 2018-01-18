package macro303.character

import macro303.character.Role.*

enum class Background(val value: String, val validRoles: Array<Role>) {
	ADEPTUS_ADMINISTRATUM(value = "Adeptus Administratum", validRoles = arrayOf(CHIRUGEON, HIEROPHANT, SAGE, SEEKER)),
	ADEPTUS_ARBITES(value = "Adeptus Arbites", validRoles = arrayOf(ASSASSIN, DESPERADO, SEEKER, WARRIOR)),
	ADEPTUS_ASTRA_TELEPATHICA(
		value = "Adeptus Astra Telepathica",
		validRoles = arrayOf(CHIRUGEON, MYSTIC, SAGE, SEEKER)
	),
	ADEPTUS_MECHANICUS(value = "Adeptus Mechanicus", validRoles = arrayOf(CHIRUGEON, HIEROPHANT, SAGE, SEEKER)),
	ADEPTUS_MINISOTRUM(value = "Adeptus Minisotrum", validRoles = arrayOf(CHIRUGEON, HIEROPHANT, SEEKER, WARRIOR)),
	IMPERIAL_GUARD(value = "Imperial Guard", validRoles = arrayOf(ASSASSIN, DESPERADO, HIEROPHANT, WARRIOR)),
	OUTCAST(value = "Outcast", validRoles = arrayOf(ASSASSIN, DESPERADO, SEEKER))
}
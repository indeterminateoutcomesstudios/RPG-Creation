package macro303.character

interface Colour {
	val value: String

	enum class FeralSkin(override val value: String) : Colour {
		DARK(value = "Dark"),
		TAN(value = "Tan"),
		FAIR(value = "Fair"),
		RUDDY(value = "Ruddy"),
		BRONZE(value = "Bronze")
	}

	enum class ForgeSkin(override val value: String) : Colour {
		DARK(value = "Dark"),
		TAN(value = "Tan"),
		FAIR(value = "Fair"),
		RUDDY(value = "Ruddy"),
		PALE(value = "Pale")
	}

	enum class HighbornSkin(override val value: String) : Colour {
		DARK(value = "Dark"),
		TAN(value = "Tan"),
		FAIR(value = "Fair"),
		RUDDY(value = "Ruddy"),
		DYED(value = "Dyed (Any Colour)")
	}

	enum class HiveSkin(override val value: String) : Colour {
		DARK(value = "Dark"),
		TAN(value = "Tan"),
		FAIR(value = "Fair"),
		RUDDY(value = "Ruddy"),
		STAINED(value = "Stained (Any Colour)")
	}

	enum class ShrineSkin(override val value: String) : Colour {
		DARK(value = "Dark"),
		TAN(value = "Tan"),
		FAIR(value = "Fair"),
		RUDDY(value = "Ruddy"),
		FRECKLED(value = "Freckled")
	}

	enum class VoidbornSkin(override val value: String) : Colour {
		PORCELAIN(value = "Porcelain"),
		BLUISH(value = "Bluish"),
		FAIR(value = "Fair"),
		GREYISH(value = "Greyish"),
		MILKY(value = "Milky")
	}

	enum class FeralHair(override val value: String) : Colour {
		RED(value = "Red"),
		BLONDE(value = "Blonde"),
		BROWN(value = "Brown"),
		BLACK(value = "Black"),
		GREY(value = "Grey")
	}

	enum class ForgeHair(override val value: String) : Colour {
		RUST(value = "Rust"),
		BLONDE(value = "Blonde"),
		BROWN(value = "Brown"),
		BLACK(value = "Black"),
		NONE(value = "None")
	}

	enum class HighbornHair(override val value: String) : Colour {
		DYED(value = "Dyed (Any Colour)"),
		BLONDE(value = "Blonde"),
		BROWN(value = "Brown"),
		BLACK(value = "Black"),
		GREY(value = "Grey")
	}

	enum class HiveHair(override val value: String) : Colour {
		DYED(value = "Dyed (Any Colour)"),
		MOUSY(value = "Mousy"),
		BROWN(value = "Brown"),
		BLACK(value = "Black"),
		GREY(value = "Grey")
	}

	enum class ShrineHair(override val value: String) : Colour {
		RUSSET(value = "Russet"),
		BLONDE(value = "Blonde"),
		BROWN(value = "Brown"),
		BLACK(value = "Black"),
		NONE(value = "None")
	}

	enum class VoidbornHair(override val value: String) : Colour {
		RED(value = "Red"),
		BLONDE(value = "Blonde"),
		COPPER(value = "Copper"),
		BLACK(value = "Black"),
		AUBURN(value = "Auburn")
	}

	enum class FeralEyes(override val value: String) : Colour {
		BLUE(value = "Blue"),
		GREY(value = "Grey"),
		BROWN(value = "Brown"),
		GREEN(value = "Green"),
		YELLOW(value = "Yellow")
	}

	enum class ForgeEyes(override val value: String) : Colour {
		BLUE(value = "Blue"),
		GREY(value = "Grey"),
		BROWN(value = "Brown"),
		GREEN(value = "Green"),
		LENSES(value = "Lenses (Any Colour)")
	}

	enum class HighbornEyes(override val value: String) : Colour {
		BLUE(value = "Blue"),
		GREY(value = "Grey"),
		BROWN(value = "Brown"),
		GREEN(value = "Green"),
		LENSES(value = "Lenses (Any Colour)")
	}

	enum class HiveEyes(override val value: String) : Colour {
		BLUE(value = "Blue"),
		GREY(value = "Grey"),
		BROWN(value = "Brown"),
		GREEN(value = "Green"),
		LENSES(value = "Lenses (Any Colour)")
	}

	enum class ShrineEyes(override val value: String) : Colour {
		BLUE(value = "Blue"),
		GREY(value = "Grey"),
		BROWN(value = "Brown"),
		EMERALD(value = "Emerald"),
		AMBER(value = "Amber")
	}

	enum class VoidbornEyes(override val value: String) : Colour {
		WATERY_BLUE(value = "Watery Blue"),
		GREY(value = "Grey"),
		BLACK(value = "Black"),
		GREEN(value = "Green"),
		VIOLET(value = "Violet")
	}
}
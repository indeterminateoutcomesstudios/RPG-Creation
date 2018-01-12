package macro303.character

data class Character(
		val isMale: Boolean,
		val homeworld: Homeworld,
		val background: Background,
		val role: Role,
		val build: Build,
		val ageStatus: AgeStatus,
		val age: Int,
		val skinColour: SkinColour,
		val hairColour: HairColour,
		val eyeColour: EyeColour,
		val quirks: ArrayList<Quirk>,
		val superstition: Superstition,
		val homeworldMemento: HomeworldMemento,
		val backgroundMemento: BackgroundMemento
) {

	fun display() {
		println("You are: ${if (isMale) "Male" else "Female"}")
		when (homeworld) {
			Homeworld.HIGHBORN, Homeworld.VOIDBORN -> println("Due to your homeworld you are known as a: ${homeworld.value}")
			else -> println("Your homeworld is known as a: ${homeworld.value}")
		}
		println("Your background is in being a: ${background.value}")
		println("Your role in society is: ${role.value}")
		println("Your build is: ${build.value}, with a rough height of ${if (isMale) build.heightM else build.heightF} and a rough weight of ${if (isMale) build.weightM else build.weightF}")
		println("Your age classes you as: ${ageStatus.value}, you are aged: $age")
		println("Your skin colour is: ${skinColour.value}")
		println("Your hair colour is: ${hairColour.value}")
		println("Your eye colour is: ${eyeColour.value}")
		println("The little quirks that make you different from everyone else are:")
		quirks.forEach { quirk -> println("\t${quirk.value}") }
		println("You believe: ${superstition.value}")
		println("\tMeaning: ${superstition.description}")
		println("The memento from your homeworld is a: ${homeworldMemento.value}")
		println("The memento from your background is a: ${backgroundMemento.value}")
	}

	override fun toString(): String {
		return "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age, skinColour=$skinColour, hairColour=$hairColour, eyeColour=$eyeColour, quirks=$quirks, superstition=$superstition, homeworldMemento=$homeworldMemento, backgroundMemento=$backgroundMemento)"
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			val total = 3
			(0 until total).forEach {
				val character = Builder.buildCharacter()
				if (total <= 3) {
					character.display()
					println("=".repeat(50))
				} else
					println("Character: $character")
			}
		}
	}
}
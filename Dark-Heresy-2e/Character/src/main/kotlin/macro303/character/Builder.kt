package macro303.character

import macro303.character.ageStatus.*
import macro303.character.build.*
import macro303.character.colour.eyes.*
import macro303.character.colour.hair.*
import macro303.character.colour.skin.*
import macro303.character.memento.*
import macro303.character.name.*
import macro303.character.quirk.*
import macro303.character.superstition.*
import java.util.*
import kotlin.collections.ArrayList

object Builder {
	private fun Int.rollDice() = Random().nextInt(this) + 1
	private fun randomSelection(items: Array<*>) = items[items.size.rollDice() - 1]

	fun buildCharacter(
			isMale: Boolean = rollGender(),
			homeworld: Homeworld = rollHomeworld(),
			background: Background = rollBackground(homeworld = homeworld),
			role: Role = rollRole(background = background),
			build: Build = rollBuild(homeworld = homeworld),
			ageStatus: AgeStatus = rollAgeStatus(homeworld = homeworld),
			age: Int = rollAge(ageStatus = ageStatus),
			skinColour: Skin = rollSkinColour(homeworld = homeworld),
			hairColour: Hair = rollHairColour(homeworld = homeworld),
			eyeColour: Eyes = rollEyeColour(homeworld = homeworld),
			quirks: ArrayList<Quirk> = ArrayList(),
			superstition: Superstition = rollSuperstition(homeworld = homeworld),
			homeworldMemento: Memento = rollHomeworldMemento(homeworld = homeworld),
			backgroundMemento: Memento = rollBackgroundMemento(background = background),
			nameStatus: NameStatus = rollNameStatus(),
			name: Name = rollName(nameStatus = nameStatus, isMale = isMale),
			divination: Divination = rollDivination()
	): Character {
		val tempQuirks = if (quirks.isNotEmpty()) quirks else rollQuirks(homeworld = homeworld)
		return Character(isMale = isMale, homeworld = homeworld, background = background, role = role, build = build, ageStatus = ageStatus, age = age, skinColour = skinColour, hairColour = hairColour, eyeColour = eyeColour, quirks = tempQuirks, superstition = superstition, homeworldMemento = homeworldMemento, backgroundMemento = backgroundMemento, nameStatus = nameStatus, name = name, divination = divination)
	}

	private fun rollGender(): Boolean {
		return 2.rollDice() == 1
	}

	private fun rollHomeworld(): Homeworld {
		return randomSelection(items = Homeworld.values()) as Homeworld
	}

	private fun rollBackground(homeworld: Homeworld): Background {
		return randomSelection(items = homeworld.validBackgrounds) as Background
	}

	private fun rollRole(background: Background): Role {
		return randomSelection(items = background.validRoles) as Role
	}

	private fun rollBuild(homeworld: Homeworld): Build {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralBuild.values()) as Build
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeBuild.values()) as Build
			Homeworld.HIGHBORN -> randomSelection(items = HighbornBuild.values()) as Build
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveBuild.values()) as Build
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineBuild.values()) as Build
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornBuild.values()) as Build
		}
	}

	private fun rollAgeStatus(homeworld: Homeworld): AgeStatus {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralAgeStatus.values()) as AgeStatus
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeAgeStatus.values()) as AgeStatus
			Homeworld.HIGHBORN -> randomSelection(items = HighbornAgeStatus.values()) as AgeStatus
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveAgeStatus.values()) as AgeStatus
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineAgeStatus.values()) as AgeStatus
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornAgeStatus.values()) as AgeStatus
		}
	}

	private fun rollAge(ageStatus: AgeStatus): Int {
		return 10.rollDice() + (ageStatus.multiplier)
	}

	private fun rollSkinColour(homeworld: Homeworld): Skin {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralSkin.values()) as Skin
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeSkin.values()) as Skin
			Homeworld.HIGHBORN -> randomSelection(items = HighbornSkin.values()) as Skin
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveSkin.values()) as Skin
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineSkin.values()) as Skin
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornSkin.values()) as Skin
		}
	}

	private fun rollHairColour(homeworld: Homeworld): Hair {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralHair.values()) as Hair
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeHair.values()) as Hair
			Homeworld.HIGHBORN -> randomSelection(items = HighbornHair.values()) as Hair
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveHair.values()) as Hair
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineHair.values()) as Hair
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornHair.values()) as Hair
		}
	}

	private fun rollEyeColour(homeworld: Homeworld): Eyes {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralEyes.values()) as Eyes
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeEyes.values()) as Eyes
			Homeworld.HIGHBORN -> randomSelection(items = HighbornEyes.values()) as Eyes
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveEyes.values()) as Eyes
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineEyes.values()) as Eyes
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornEyes.values()) as Eyes
		}
	}

	private fun rollQuirks(homeworld: Homeworld): ArrayList<Quirk> {
		val temp = ArrayList<Quirk>()
		var remaining = 1
		do {
			val quirk = rollQuirk(homeworld = homeworld)
			if (quirk == null)
				remaining++
			else {
				temp.add(quirk)
				remaining--
			}
		} while (remaining > 0)
		return temp
	}

	@Suppress("UNCHECKED_CAST")
	private fun rollQuirk(homeworld: Homeworld): Quirk? {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = (FeralQuirk.values() as Array<FeralQuirk?>).plusElement(null)) as Quirk?
			Homeworld.FORGE_WORLD -> randomSelection(items = (ForgeQuirk.values() as Array<ForgeQuirk?>).plusElement(null)) as Quirk?
			Homeworld.HIGHBORN -> randomSelection(items = (HighbornQuirk.values() as Array<HighbornQuirk?>).plusElement(null)) as Quirk?
			Homeworld.HIVE_WORLD -> randomSelection(items = (HiveQuirk.values() as Array<HiveQuirk?>).plusElement(null)) as Quirk?
			Homeworld.SHRINE_WORLD -> randomSelection(items = (ShrineQuirk.values() as Array<ShrineQuirk?>).plusElement(null)) as Quirk?
			Homeworld.VOIDBORN -> randomSelection(items = (VoidbornQuirk.values() as Array<VoidbornQuirk?>).plusElement(null)) as Quirk?
		}
	}

	private fun rollSuperstition(homeworld: Homeworld): Superstition {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralTradition.values()) as Superstition
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeCant.values()) as Superstition
			Homeworld.HIGHBORN -> randomSelection(items = HighbornCustom.values()) as Superstition
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveTradition.values()) as Superstition
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineMore.values()) as Superstition
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornLore.values()) as Superstition
		}
	}

	private fun rollHomeworldMemento(homeworld: Homeworld): Memento {
		return when (homeworld) {
			Homeworld.FERAL_WORLD -> randomSelection(items = FeralMemento.values()) as Memento
			Homeworld.FORGE_WORLD -> randomSelection(items = ForgeMemento.values()) as Memento
			Homeworld.HIGHBORN -> randomSelection(items = HighbornMemento.values()) as Memento
			Homeworld.HIVE_WORLD -> randomSelection(items = HiveMemento.values()) as Memento
			Homeworld.SHRINE_WORLD -> randomSelection(items = ShrineMemento.values()) as Memento
			Homeworld.VOIDBORN -> randomSelection(items = VoidbornMemento.values()) as Memento
		}
	}

	private fun rollBackgroundMemento(background: Background): Memento {
		return when (background) {
			Background.ADEPTUS_ADMINISTRATUM -> randomSelection(items = AdministratumMemento.values()) as Memento
			Background.ADEPTUS_ARBITES -> randomSelection(items = ArbitesMemento.values()) as Memento
			Background.ADEPTUS_ASTRA_TELEPATHICA -> randomSelection(items = AstraMemento.values()) as Memento
			Background.ADEPTUS_MECHANICUS -> randomSelection(items = MechanicusMemento.values()) as Memento
			Background.ADEPTUS_MINISOTRUM -> randomSelection(items = MinistorumMemento.values()) as Memento
			Background.IMPERIAL_GUARD -> randomSelection(items = ImperialMemento.values()) as Memento
			Background.OUTCAST -> randomSelection(items = OutcastMemento.values()) as Memento
		}
	}

	private fun rollNameStatus(): NameStatus {
		return randomSelection(items = NameStatus.values()) as NameStatus
	}

	@Suppress("UNCHECKED_CAST")
	private fun rollName(nameStatus: NameStatus, isMale: Boolean): Name {
		var name = when (nameStatus) {
			NameStatus.PRIMITIVE -> randomSelection(items = ((if (isMale) PrimitiveMaleName.values() else PrimitiveFemaleName.values()) as Array<Name?>).plusElement(null)) as Name?
			NameStatus.LOW_GOTHIC -> randomSelection(items = ((if (isMale) LowMaleName.values() else LowFemaleName.values()) as Array<Name?>).plusElement(null)) as Name?
			NameStatus.HIGH_GOTHIC -> randomSelection(items = ((if (isMale) HighMaleName.values() else HighFemaleName.values()) as Array<Name?>).plusElement(null)) as Name?
			NameStatus.ARCHAIC -> randomSelection(items = ((if (isMale) ArchaicMaleName.values() else ArchaicFemaleName.values()) as Array<Name?>).plusElement(null)) as Name?
			NameStatus.INFORMAL -> randomSelection(items = ((if (isMale) InformalMaleName.values() else InformalMaleName.values()) as Array<Name?>).plusElement(null)) as Name?
		}
		if (name == null)
			name = rollName(nameStatus = nameStatus, isMale = !isMale)
		return name
	}

	private fun rollDivination(): Divination {
		return randomSelection(Divination.values()) as Divination
	}
}
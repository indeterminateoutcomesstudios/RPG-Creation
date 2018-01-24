package macro303.character

import macro303.character.ageStatus.AgeStatus
import macro303.character.aptitude.CharacterAptitude
import macro303.character.aptitude.CharacterAptitude.*
import macro303.character.aptitude.SkillAptitude
import macro303.character.build.Build
import macro303.character.colour.eyes.Eyes
import macro303.character.colour.hair.Hair
import macro303.character.colour.skin.Skin
import macro303.character.memento.Memento
import macro303.character.name.Name
import macro303.character.quirk.Quirk
import macro303.character.superstition.Superstition
import java.util.*
import kotlin.collections.ArrayList

data class Character(
	val isMale: Boolean,
	val homeworld: Homeworld,
	val background: Background,
	val role: Role,
	val build: Build,
	val ageStatus: AgeStatus,
	val age: Int,
	val skinColour: Skin,
	val hairColour: Hair,
	val eyeColour: Eyes,
	val quirks: ArrayList<Quirk>,
	val superstition: Superstition,
	val homeworldMemento: Memento,
	val backgroundMemento: Memento,
	val nameStatus: NameStatus,
	val name: Name,
	val divination: Divination
) {
	private val characteristics: EnumMap<CharacterAptitude, Int> = EnumMap(CharacterAptitude::class.java)
	private val characterAptitudes: EnumMap<CharacterAptitude, Int> = EnumMap(CharacterAptitude::class.java)
	private val skillAptitudes: EnumMap<SkillAptitude, Int> = EnumMap(SkillAptitude::class.java)
	var totalWounds: Int

	init {
		rollStats()
		totalWounds = 5.rollDice() + homeworld.woundBonus
		divinationUpdateStats()
	}

	private fun rollStats() {
		CharacterAptitude.values().forEach {
			characteristics[it] = rollStat(
				count = if (homeworld.pos.contains(it)) 1 else if (homeworld.neg == it) -1 else 0
			) + 20
		}
		CharacterAptitude.values().forEach { aptitude -> characterAptitudes[aptitude] = 0 }
		SkillAptitude.values().forEach { aptitude -> skillAptitudes[aptitude] = 0 }
	}

	private fun rollStat(count: Int): Int {
		val rolls: ArrayList<Int> = ArrayList()
		rolls.add(10.rollDice())
		rolls.add(10.rollDice())
		if (count != 0)
			rolls.add(10.rollDice())
		rolls.sort()
		return rolls[1] + if (count == 1) rolls[2] else rolls[0]
	}

	@Suppress("NON_EXHAUSTIVE_WHEN")
	private fun divinationUpdateStats() {
		when (divination) {
			Divination.TRUST -> {
				characteristics[PERCEPTION] = characteristics[PERCEPTION]!! + 5
			}
			Divination.PAIN -> characteristics[AGILITY] = characteristics[AGILITY]!! - 3
			Divination.WISE -> {
				if (2.rollDice() == 1)
					characteristics[AGILITY] = characteristics[AGILITY]!! + 3
				else
					characteristics[INTELLIGENCE] = characteristics[INTELLIGENCE]!! + 3
				if (2.rollDice() == 1)
					characteristics[WEAPON_SKILL] = characteristics[WEAPON_SKILL]!! - 3
				else
					characteristics[BALLISTIC_SKILL] = characteristics[WEAPON_SKILL]!! - 3
			}
			Divination.TRUTH -> characteristics[PERCEPTION] = characteristics[PERCEPTION]!! + 3
			Divination.THOUGHT -> characteristics[INTELLIGENCE] = characteristics[INTELLIGENCE]!! - 3
			Divination.HERESY -> {
				if (2.rollDice() == 1)
					characteristics[FELLOWSHIP] = characteristics[FELLOWSHIP]!! + 3
				else
					characteristics[STRENGTH] = characteristics[STRENGTH]!! + 3
				if (2.rollDice() == 1)
					characteristics[TOUGHNESS] = characteristics[TOUGHNESS]!! - 3
				else
					characteristics[WILLPOWER] = characteristics[WILLPOWER]!! - 3
			}
			Divination.JOB -> {
				if (2.rollDice() == 1)
					characteristics[TOUGHNESS] = characteristics[TOUGHNESS]!! + 3
				else
					characteristics[WILLPOWER] = characteristics[WILLPOWER]!! + 3
				if (2.rollDice() == 1)
					characteristics[FELLOWSHIP] = characteristics[FELLOWSHIP]!! - 3
				else
					characteristics[STRENGTH] = characteristics[STRENGTH]!! - 3
			}
			Divination.VIOLENCE -> {
				if (2.rollDice() == 1)
					characteristics[WEAPON_SKILL] = characteristics[WEAPON_SKILL]!! + 3
				else
					characteristics[BALLISTIC_SKILL] = characteristics[WEAPON_SKILL]!! + 3
				if (2.rollDice() == 1)
					characteristics[AGILITY] = characteristics[AGILITY]!! - 3
				else
					characteristics[INTELLIGENCE] = characteristics[INTELLIGENCE]!! - 3
			}
			Divination.IGNORANCE -> characteristics[PERCEPTION] = characteristics[PERCEPTION]!! - 3
			Divination.INSANE -> characteristics[WILLPOWER] = characteristics[WILLPOWER]!! + 3
			Divination.SUSPICIOUS -> characteristics[PERCEPTION] = characteristics[PERCEPTION]!! - 2
			Divination.SUFFERING -> characteristics[TOUGHNESS] = characteristics[TOUGHNESS]!! - 3
		}
	}

	fun display() {
		println("Name = ${name.value}")
		println("\tStatus = ${nameStatus.value}")
		println("Gender = ${if (isMale) "Male" else "Female"}")
		println("Homeworld = ${homeworld.value}")
		println("\tMemento = ${homeworldMemento.value}")
		println("Background = ${background.value}")
		println("\tMemento = ${backgroundMemento.value}")
		println("Role = ${role.value}")
		println("Build = ${build.value}")
		println("\tHeight = ${if (isMale) build.heightM else build.heightF}")
		println("\tWeight = ${if (isMale) build.weightM else build.weightF}")
		println("Age = $age")
		println("\tStatus = ${ageStatus.value}")
		println("Colours:")
		println("\tskin = ${skinColour.value}")
		println("\tHair = ${hairColour.value}")
		println("\tEye = ${eyeColour.value}")
		println("Quirks:")
		quirks.forEach { quirk -> println("\t${quirk.value}") }
		println("Superstition = ${superstition.value}")
		println("\tMeaning = ${superstition.description}")
		println("Divination = ${divination.value}")
		println("\tEffect = ${divination.effect}")
		println("Stats:")
		CharacterAptitude.values().forEach {
			println("\t${it.value} = ${characteristics[it]}")
			if (it != INFLUENCE) {
				println("\t\tAptitudes = ${Arrays.toString(it.aptitudes)}")
				println("\t\tAptitude Level = ${characterAptitudes[it]}")
			}
		}
		println("\tTotal Wounds = $totalWounds")
	}

	private fun Int.rollDice() = Random().nextInt(this) + 1

	override fun toString(): String {
		return "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age, skinColour=$skinColour, hairColour=$hairColour, eyeColour=$eyeColour, quirks=$quirks, superstition=$superstition, homeworldMemento=$homeworldMemento, backgroundMemento=$backgroundMemento, nameStatus=$nameStatus, name=$name, divination=$divination, characteristics=$characteristics, characterAptitudes=$characterAptitudes, skillAptitudes=$skillAptitudes, totalWounds=$totalWounds)"
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
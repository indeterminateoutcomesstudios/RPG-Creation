package macro303.character

import macro303.character.ageStatus.AgeStatus
import macro303.character.aptitude.CharacterAptitude
import macro303.character.aptitude.CharacterAptitude.*
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
	var totalWounds: Int
	var aptitudes: ArrayList<String> = ArrayList()

	init {
		rollStats()
		totalWounds = 5.rollDice() + homeworld.woundBonus
		divinationUpdateStats()
	}

	private fun rollStats() {
		characteristics[WEAPON_SKILL] = rollStat(count = if (homeworld.pos.contains(WEAPON_SKILL)) 1 else if (homeworld.neg == WEAPON_SKILL) -1 else 0) +
				20
		characteristics[BALLISTIC_SKILL] = rollStat(count = if (homeworld.pos.contains(BALLISTIC_SKILL)) 1 else if (homeworld.neg == BALLISTIC_SKILL) -1 else 0) +
				20
		characteristics[STRENGTH] = rollStat(count = if (homeworld.pos.contains(STRENGTH)) 1 else if (homeworld.neg == STRENGTH) -1 else 0) +
				20
		characteristics[TOUGHNESS] = rollStat(count = if (homeworld.pos.contains(TOUGHNESS)) 1 else if (homeworld.neg == TOUGHNESS) -1 else 0) +
				20
		characteristics[AGILITY] = rollStat(count = if (homeworld.pos.contains(AGILITY)) 1 else if (homeworld.neg == AGILITY) -1 else 0) +
				20
		characteristics[INTELLIGENCE] = rollStat(count = if (homeworld.pos.contains(INTELLIGENCE)) 1 else if (homeworld.neg == INTELLIGENCE) -1 else 0) +
				20
		characteristics[PERCEPTION] = rollStat(count = if (homeworld.pos.contains(PERCEPTION)) 1 else if (homeworld.neg == PERCEPTION) -1 else 0) +
				20
		characteristics[WILLPOWER] = rollStat(count = if (homeworld.pos.contains(WILLPOWER)) 1 else if (homeworld.neg == WILLPOWER) -1 else 0) +
				20
		characteristics[FELLOWSHIP] = rollStat(count = if (homeworld.pos.contains(FELLOWSHIP)) 1 else if (homeworld.neg == FELLOWSHIP) -1 else 0) +
				20
		characteristics[INFLUENCE] = rollStat(count = if (homeworld.pos.contains(INFLUENCE)) 1 else if (homeworld.neg == INFLUENCE) -1 else 0) +
				20
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
		println("\t${WEAPON_SKILL.value} = ${characteristics[WEAPON_SKILL]}")
		println("\t\tAptitudes = ${Arrays.toString(WEAPON_SKILL.aptitudes)}")
		println("\t${BALLISTIC_SKILL.value} = ${characteristics[BALLISTIC_SKILL]}")
		println("\t\tAptitudes = ${Arrays.toString(BALLISTIC_SKILL.aptitudes)}")
		println("\t${STRENGTH.value} = ${characteristics[STRENGTH]}")
		println("\t\tAptitudes = ${Arrays.toString(STRENGTH.aptitudes)}")
		println("\t${TOUGHNESS.value} = ${characteristics[TOUGHNESS]}")
		println("\t\tAptitudes = ${Arrays.toString(TOUGHNESS.aptitudes)}")
		println("\t${AGILITY.value} = ${characteristics[AGILITY]}")
		println("\t\tAptitudes = ${Arrays.toString(AGILITY.aptitudes)}")
		println("\t${INTELLIGENCE.value} = ${characteristics[INTELLIGENCE]}")
		println("\t\tAptitudes = ${Arrays.toString(INTELLIGENCE.aptitudes)}")
		println("\t${PERCEPTION.value} = ${characteristics[PERCEPTION]}")
		println("\t\tAptitudes = ${Arrays.toString(PERCEPTION.aptitudes)}")
		println("\t${WILLPOWER.value} = ${characteristics[WILLPOWER]}")
		println("\t\tAptitudes = ${Arrays.toString(WILLPOWER.aptitudes)}")
		println("\t${FELLOWSHIP.value} = ${characteristics[FELLOWSHIP]}")
		println("\t\tAptitudes = ${Arrays.toString(FELLOWSHIP.aptitudes)}")
		println("\t${INFLUENCE.value} = ${characteristics[INFLUENCE]}")
		println("\tTotal Wounds = $totalWounds")
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

	private fun Int.rollDice() = Random().nextInt(this) + 1

	override fun toString(): String {
		return "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age, skinColour=$skinColour, hairColour=$hairColour, eyeColour=$eyeColour, quirks=$quirks, superstition=$superstition, homeworldMemento=$homeworldMemento, backgroundMemento=$backgroundMemento, nameStatus=$nameStatus, name=$name, totalWounds=$totalWounds, aptitudes=$aptitudes)"
	}
}
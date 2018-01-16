package macro303.character

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
		val skinColour: Colour,
		val hairColour: Colour,
		val eyeColour: Colour,
		val quirks: ArrayList<Quirk>,
		val superstition: Superstition,
		val homeworldMemento: Memento,
		val backgroundMemento: Memento,
		val nameStatus: NameStatus,
		val name: Name,
		val divination: Divination
) {

	var weapon: Int = 20
	var ballistic: Int = 20
	var strength: Int = 20
	var toughness: Int = 20
	var agility: Int = 20
	var intelligence: Int = 20
	var perception: Int = 20
	var willpower: Int = 20
	var fellowship: Int = 20
	var influence: Int = 20
	var totalWounds: Int
	var aptitudes: ArrayList<String> = ArrayList()

	init {
		rollStats()
		totalWounds = 5.rollDice() + homeworld.woundBonus
		divinationUpdateStats()
	}

	private fun rollStats() {
		weapon += rollStat(count = if (homeworld.pos.contains(Characteristic.WEAPON_SKILL)) 1 else if (homeworld.neg == Characteristic.WEAPON_SKILL) -1 else 0)
		ballistic += rollStat(count = if (homeworld.pos.contains(Characteristic.BALLISTIC_SKILL)) 1 else if (homeworld.neg == Characteristic.BALLISTIC_SKILL) -1 else 0)
		strength += rollStat(count = if (homeworld.pos.contains(Characteristic.STRENGTH)) 1 else if (homeworld.neg == Characteristic.STRENGTH) -1 else 0)
		toughness += rollStat(count = if (homeworld.pos.contains(Characteristic.TOUGHNESS)) 1 else if (homeworld.neg == Characteristic.TOUGHNESS) -1 else 0)
		agility += rollStat(count = if (homeworld.pos.contains(Characteristic.AGILITY)) 1 else if (homeworld.neg == Characteristic.AGILITY) -1 else 0)
		intelligence += rollStat(count = if (homeworld.pos.contains(Characteristic.INTELLIGENCE)) 1 else if (homeworld.neg == Characteristic.INTELLIGENCE) -1 else 0)
		perception += rollStat(count = if (homeworld.pos.contains(Characteristic.PERCEPTION)) 1 else if (homeworld.neg == Characteristic.PERCEPTION) -1 else 0)
		willpower += rollStat(count = if (homeworld.pos.contains(Characteristic.WILLPOWER)) 1 else if (homeworld.neg == Characteristic.WILLPOWER) -1 else 0)
		fellowship += rollStat(count = if (homeworld.pos.contains(Characteristic.FELLOWSHIP)) 1 else if (homeworld.neg == Characteristic.FELLOWSHIP) -1 else 0)
		influence += rollStat(count = if (homeworld.pos.contains(Characteristic.INFLUENCE)) 1 else if (homeworld.neg == Characteristic.INFLUENCE) -1 else 0)
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

	private fun divinationUpdateStats() {
		when (divination) {
			Divination.TRUST -> perception += 5
			Divination.PAIN -> agility -= 3
			Divination.WISE -> {
				if (2.rollDice() == 1)
					agility += 3
				else
					intelligence += 3
				if (2.rollDice() == 1)
					weapon -= 3
				else
					ballistic -= 3
			}
			Divination.TRUTH -> perception += 3
			Divination.THOUGHT -> intelligence -= 3
			Divination.HERESY -> {
				if (2.rollDice() == 1)
					fellowship += 3
				else
					strength += 3
				if (2.rollDice() == 1)
					toughness -= 3
				else
					willpower -= 3
			}
			Divination.JOB -> {
				if (2.rollDice() == 1)
					toughness += 3
				else
					willpower += 3
				if (2.rollDice() == 1)
					fellowship -= 3
				else
					strength -= 3
			}
			Divination.VIOLENCE -> {
				if (2.rollDice() == 1)
					weapon += 3
				else
					ballistic += 3
				if (2.rollDice() == 1)
					agility -= 3
				else
					intelligence -= 3
			}
			Divination.IGNORANCE -> perception -= 3
			Divination.INSANE -> willpower += 3
			Divination.SUSPICIOUS -> perception += 2
			Divination.SUFFERING -> toughness -= 3
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
		println("\tSkin = ${skinColour.value}")
		println("\tHair = ${hairColour.value}")
		println("\tEye = ${eyeColour.value}")
		println("Quirks:")
		quirks.forEach { quirk -> println("\t${quirk.value}") }
		println("Superstition = ${superstition.value}")
		println("\tMeaning = ${superstition.description}")
		println("Divination = ${divination.value}")
		println("\tEffect = ${divination.effect}")
		println("Stats:")
		println("\t${Characteristic.WEAPON_SKILL.value} = $weapon")
		println("\t${Characteristic.BALLISTIC_SKILL.value} = $ballistic")
		println("\t${Characteristic.STRENGTH.value} = $strength")
		println("\t${Characteristic.TOUGHNESS.value} = $toughness")
		println("\t${Characteristic.AGILITY.value} = $agility")
		println("\t${Characteristic.INTELLIGENCE.value} = $intelligence")
		println("\t${Characteristic.PERCEPTION.value} = $perception")
		println("\t${Characteristic.WILLPOWER.value} = $willpower")
		println("\t${Characteristic.FELLOWSHIP.value} = $fellowship")
		println("\t${Characteristic.INFLUENCE.value} = $influence")
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
		return "Character(isMale=$isMale, homeworld=$homeworld, background=$background, role=$role, build=$build, ageStatus=$ageStatus, age=$age, skinColour=$skinColour, hairColour=$hairColour, eyeColour=$eyeColour, quirks=$quirks, superstition=$superstition, homeworldMemento=$homeworldMemento, backgroundMemento=$backgroundMemento, nameStatus=$nameStatus, name=$name, weapon=$weapon, ballistic=$ballistic, strength=$strength, toughness=$toughness, agility=$agility, intelligence=$intelligence, perception=$perception, willpower=$willpower, fellowship=$fellowship, influence=$influence, totalWounds=$totalWounds, aptitudes=$aptitudes)"
	}
}
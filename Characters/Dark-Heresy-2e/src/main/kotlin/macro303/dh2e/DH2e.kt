package macro303.dh2e

import java.util.*

object DH2e {
	private fun ClosedRange<Int>.randomInt() = Random().nextInt(endInclusive + 1 - start) + start
	private fun randomBoolean() = Random().nextBoolean()

	@JvmStatic
	fun main(args: Array<String>) {
		Builder.isMale = rollGender()
		Builder.homeworld = rollHomeworld()
		Builder.background = rollBackground(homeworld = Builder.homeworld)
		Builder.role = rollRole(background = Builder.background)
		Builder.build = rollBuild(homeworld = Builder.homeworld)
		Builder.ageStatus = rollAge(homeworld = Builder.homeworld)
		Builder.age = (1..10).randomInt() + (Builder.ageStatus?.multiplier ?: 0)
		val character = Builder.createCharacter()
		println("Character: $character")
	}

	private fun rollGender(): Boolean {
		return randomBoolean()
	}

	private fun rollHomeworld(): Homeworld? {
		when ((1..100).randomInt()) {
			in 1..15 -> return Homeworld.`FERAL WORLD`
			in 16..33 -> return Homeworld.`FORGE WORLD`
			in 34..44 -> return Homeworld.HIGHBORN
			in 45..69 -> return Homeworld.`HIVE WORLD`
			in 70..85 -> return Homeworld.`SHRINE WORLD`
			in 86..100 -> return Homeworld.VOIDBORN
		}
		return null
	}

	private fun rollBackground(homeworld: Homeworld?): Background? {
		when (homeworld) {
			Homeworld.`FERAL WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 11..25 -> return Background.`ADEPTUS ARBITES`
					in 26..40 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 41..50 -> return Background.`ADEPTUS MECHANICUS`
					in 51..60 -> return Background.`ADEPTUS MINISOTRUM`
					in 61..80 -> return Background.`IMPERIAL GUARD`
					in 81..100 -> return Background.OUTCAST
				}
			}
			Homeworld.`FORGE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 21..35 -> return Background.`ADEPTUS ARBITES`
					in 36..45 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 46..65 -> return Background.`ADEPTUS MECHANICUS`
					in 66..75 -> return Background.`ADEPTUS MINISOTRUM`
					in 76..90 -> return Background.`IMPERIAL GUARD`
					in 91..100 -> return Background.OUTCAST
				}
			}
			Homeworld.HIGHBORN -> {
				when ((1..100).randomInt()) {
					in 1..20 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 21..40 -> return Background.`ADEPTUS ARBITES`
					in 41..55 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 56..65 -> return Background.`ADEPTUS MECHANICUS`
					in 66..80 -> return Background.`ADEPTUS MINISOTRUM`
					in 81..90 -> return Background.`IMPERIAL GUARD`
					in 91..100 -> return Background.OUTCAST
				}
			}
			Homeworld.`HIVE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 11..30 -> return Background.`ADEPTUS ARBITES`
					in 31..40 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 41..55 -> return Background.`ADEPTUS MECHANICUS`
					in 56..65 -> return Background.`ADEPTUS MINISOTRUM`
					in 66..80 -> return Background.`IMPERIAL GUARD`
					in 81..100 -> return Background.OUTCAST
				}
			}
			Homeworld.`SHRINE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 16..30 -> return Background.`ADEPTUS ARBITES`
					in 31..40 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 41..50 -> return Background.`ADEPTUS MECHANICUS`
					in 51..70 -> return Background.`ADEPTUS MINISOTRUM`
					in 71..90 -> return Background.`IMPERIAL GUARD`
					in 91..100 -> return Background.OUTCAST
				}
			}
			Homeworld.VOIDBORN -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Background.`ADEPTUS ADMINISTRATUM`
					in 11..20 -> return Background.`ADEPTUS ARBITES`
					in 21..40 -> return Background.`ADEPTUS ASTRA TELEPATHICA`
					in 41..60 -> return Background.`ADEPTUS MECHANICUS`
					in 61..75 -> return Background.`ADEPTUS MINISOTRUM`
					in 76..85 -> return Background.`IMPERIAL GUARD`
					in 86..100 -> return Background.OUTCAST
				}
			}
		}
		return null
	}

	private fun rollRole(background: Background?): Role? {
		when (background) {
			Background.`ADEPTUS ADMINISTRATUM` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Role.ASSASSIN
					in 11..25 -> return Role.CHIRURGEON
					in 26..35 -> return Role.DESPERADO
					in 36..50 -> return Role.HIEROPHANT
					in 51..60 -> return Role.MYSTIC
					in 61..75 -> return Role.SAGE
					in 76..90 -> return Role.SEEKER
					in 91..100 -> return Role.WARRIOR
				}
			}
			Background.`ADEPTUS ARBITES` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> return Role.ASSASSIN
					in 16..25 -> return Role.CHIRURGEON
					in 26..40 -> return Role.DESPERADO
					in 41..50 -> return Role.HIEROPHANT
					in 51..60 -> return Role.MYSTIC
					in 61..70 -> return Role.SAGE
					in 71..85 -> return Role.SEEKER
					in 86..100 -> return Role.WARRIOR
				}
			}
			Background.`ADEPTUS ASTRA TELEPATHICA` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Role.ASSASSIN
					in 11..25 -> return Role.CHIRURGEON
					in 26..35 -> return Role.DESPERADO
					in 36..45 -> return Role.HIEROPHANT
					in 46..60 -> return Role.MYSTIC
					in 61..75 -> return Role.SAGE
					in 76..90 -> return Role.SEEKER
					in 91..100 -> return Role.WARRIOR
				}
			}
			Background.`ADEPTUS MECHANICUS` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Role.ASSASSIN
					in 11..25 -> return Role.CHIRURGEON
					in 26..35 -> return Role.DESPERADO
					in 36..50 -> return Role.HIEROPHANT
					in 51..60 -> return Role.MYSTIC
					in 61..75 -> return Role.SAGE
					in 76..90 -> return Role.SEEKER
					in 91..100 -> return Role.WARRIOR
				}
			}
			Background.`ADEPTUS MINISOTRUM` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> return Role.ASSASSIN
					in 11..25 -> return Role.CHIRURGEON
					in 26..35 -> return Role.DESPERADO
					in 36..50 -> return Role.HIEROPHANT
					in 51..60 -> return Role.MYSTIC
					in 61..70 -> return Role.SAGE
					in 71..85 -> return Role.SEEKER
					in 86..100 -> return Role.WARRIOR
				}
			}
			Background.`IMPERIAL GUARD` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> return Role.ASSASSIN
					in 16..25 -> return Role.CHIRURGEON
					in 26..40 -> return Role.DESPERADO
					in 41..55 -> return Role.HIEROPHANT
					in 56..65 -> return Role.MYSTIC
					in 66..75 -> return Role.SAGE
					in 76..85 -> return Role.SEEKER
					in 86..100 -> return Role.WARRIOR
				}
			}
			Background.OUTCAST -> {
				when ((1..100).randomInt()) {
					in 1..15 -> return Role.ASSASSIN
					in 16..25 -> return Role.CHIRURGEON
					in 26..45 -> return Role.DESPERADO
					in 46..55 -> return Role.HIEROPHANT
					in 56..65 -> return Role.MYSTIC
					in 66..75 -> return Role.SAGE
					in 76..90 -> return Role.SEEKER
					in 91..100 -> return Role.WARRIOR
				}
			}
		}
		return null
	}

	private fun rollBuild(homeworld: Homeworld?): Build? {
		when (homeworld) {
			Homeworld.`FERAL WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.RANGY
					in 21..50 -> return Build.LEAN
					in 51..80 -> return Build.MUSCULAR
					in 81..90 -> return Build.SQUAT
					in 91..100 -> return Build.STRAPPING
				}
			}
			Homeworld.`FORGE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.MINIMAL
					in 21..50 -> return Build.`LOW NOMINAL`
					in 51..80 -> return Build.OPTIMAL
					in 81..90 -> return Build.`HIGH NOMINAL`
					in 91..100 -> return Build.MAXIMAL
				}
			}
			Homeworld.HIGHBORN -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.SLENDER
					in 21..50 -> return Build.SVELTE
					in 51..80 -> return Build.FIT
					in 81..90 -> return Build.`WELL-BUILT`
					in 91..100 -> return Build.POWERFUL
				}
			}
			Homeworld.`HIVE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.RUNT
					in 21..50 -> return Build.SCRAWNY
					in 51..80 -> return Build.WIRY
					in 81..90 -> return Build.LANKY
					in 91..100 -> return Build.BRAWNY
				}
			}
			Homeworld.`SHRINE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.DIMINISHED
					in 21..50 -> return Build.LESSENED
					in 51..80 -> return Build.FAITHFUL
					in 81..90 -> return Build.COMMENDED
					in 91..100 -> return Build.ABUNDANT
				}
			}
			Homeworld.VOIDBORN -> {
				when ((0..100).randomInt()) {
					in 1..20 -> return Build.SKELETAL
					in 21..50 -> return Build.STUNTED
					in 51..80 -> return Build.GAUNT
					in 81..90 -> return Build.GANGLING
					in 91..100 -> return Build.SPINDLY
				}
			}
		}
		return null
	}

	private fun rollAge(homeworld: Homeworld?): AgeStatus? {
		when (homeworld) {
			Homeworld.`FERAL WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..70 -> return AgeStatus.WARRIOR
					in 71..100 -> return AgeStatus.`OLD ONE`
				}
			}
			Homeworld.`FORGE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> return AgeStatus.YOUNG
					in 21..80 -> return AgeStatus.MATURE_F
					in 81..100 -> return AgeStatus.VENERATED
				}
			}
			Homeworld.HIGHBORN -> {
				when ((1..100).randomInt()) {
					in 1..50 -> return AgeStatus.SCION
					in 51..80 -> return AgeStatus.PRIME
					in 81..100 -> return AgeStatus.AUTHORITY
				}
			}
			Homeworld.`HIVE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> return AgeStatus.NIPPER
					in 31..90 -> return AgeStatus.ADULT
					in 91..100 -> return AgeStatus.`OLD TIMER`
				}
			}
			Homeworld.`SHRINE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> return AgeStatus.NOVATE
					in 21..80 -> return AgeStatus.VITAL
					in 81..100 -> return AgeStatus.ELDER
				}
			}
			Homeworld.VOIDBORN -> {
				when ((1..100).randomInt()) {
					in 1..40 -> return AgeStatus.YOUTH
					in 41..70 -> return AgeStatus.MATURE_V
					in 71..100 -> return AgeStatus.METHUSELAH
				}
			}
		}
		return null
	}
}
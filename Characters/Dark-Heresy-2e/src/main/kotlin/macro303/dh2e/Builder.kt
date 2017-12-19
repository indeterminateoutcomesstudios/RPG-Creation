package macro303.dh2e

import macro303.dh2e.Background.*
import macro303.dh2e.Build.*
import macro303.dh2e.Homeworld.*
import macro303.dh2e.Colour.*
import java.util.*

object Builder {
	private var isMale: Boolean? = null
	private var homeworld: Homeworld? = null
	private var background: Background? = null
	private var role: Role? = null
	private var build: Build? = null
	private var ageStatus: AgeStatus? = null
	private var age: Int? = null
	private var skin: Colour? = null

	private fun ClosedRange<Int>.randomInt() = Random().nextInt(endInclusive + 1 - start) + start
	private fun randomBoolean() = Random().nextBoolean()

	fun createCharacter(): Character {
		return Character(isMale = isMale, homeworld = homeworld, background = background, role = role, build = build, ageStatus = ageStatus, age = age, skin = skin)
	}

	fun rollGender() {
		isMale = randomBoolean()
	}

	fun rollHomeworld() {
		homeworld = when ((1..100).randomInt()) {
			in 1..15 -> `FERAL WORLD`
			in 16..33 -> `FORGE WORLD`
			in 34..44 -> HIGHBORN
			in 45..69 -> `HIVE WORLD`
			in 70..85 -> `SHRINE WORLD`
			in 86..100 -> VOIDBORN
			else -> null
		}
	}

	fun rollBackground() {
		background = when (homeworld) {
			`FERAL WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `ADEPTUS ADMINISTRATUM`
					in 11..25 -> `ADEPTUS ARBITES`
					in 26..40 -> `ADEPTUS ASTRA TELEPATHICA`
					in 41..50 -> `ADEPTUS MECHANICUS`
					in 51..60 -> `ADEPTUS MINISOTRUM`
					in 61..80 -> `IMPERIAL GUARD`
					in 81..100 -> OUTCAST
					else -> null
				}
			}
			`FORGE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> `ADEPTUS ADMINISTRATUM`
					in 21..35 -> `ADEPTUS ARBITES`
					in 36..45 -> `ADEPTUS ASTRA TELEPATHICA`
					in 46..65 -> `ADEPTUS MECHANICUS`
					in 66..75 -> `ADEPTUS MINISOTRUM`
					in 76..90 -> `IMPERIAL GUARD`
					in 91..100 -> OUTCAST
					else -> null
				}
			}
			HIGHBORN -> {
				when ((1..100).randomInt()) {
					in 1..20 -> `ADEPTUS ADMINISTRATUM`
					in 21..40 -> `ADEPTUS ARBITES`
					in 41..55 -> `ADEPTUS ASTRA TELEPATHICA`
					in 56..65 -> `ADEPTUS MECHANICUS`
					in 66..80 -> `ADEPTUS MINISOTRUM`
					in 81..90 -> `IMPERIAL GUARD`
					in 91..100 -> OUTCAST
					else -> null
				}
			}
			`HIVE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `ADEPTUS ADMINISTRATUM`
					in 11..30 -> `ADEPTUS ARBITES`
					in 31..40 -> `ADEPTUS ASTRA TELEPATHICA`
					in 41..55 -> `ADEPTUS MECHANICUS`
					in 56..65 -> `ADEPTUS MINISOTRUM`
					in 66..80 -> `IMPERIAL GUARD`
					in 81..100 -> OUTCAST
					else -> null
				}
			}
			`SHRINE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> `ADEPTUS ADMINISTRATUM`
					in 16..30 -> `ADEPTUS ARBITES`
					in 31..40 -> `ADEPTUS ASTRA TELEPATHICA`
					in 41..50 -> `ADEPTUS MECHANICUS`
					in 51..70 -> `ADEPTUS MINISOTRUM`
					in 71..90 -> `IMPERIAL GUARD`
					in 91..100 -> OUTCAST
					else -> null
				}
			}
			VOIDBORN -> {
				when ((1..100).randomInt()) {
					in 1..10 -> `ADEPTUS ADMINISTRATUM`
					in 11..20 -> `ADEPTUS ARBITES`
					in 21..40 -> `ADEPTUS ASTRA TELEPATHICA`
					in 41..60 -> `ADEPTUS MECHANICUS`
					in 61..75 -> `ADEPTUS MINISOTRUM`
					in 76..85 -> `IMPERIAL GUARD`
					in 86..100 -> OUTCAST
					else -> null
				}
			}
			else -> null
		}
	}

	fun rollRole() {
		role = when (background) {
			`ADEPTUS ADMINISTRATUM` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRURGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> null
				}
			}
			`ADEPTUS ARBITES` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRURGEON
					in 26..40 -> Role.DESPERADO
					in 41..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..70 -> Role.SAGE
					in 71..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> null
				}
			}
			`ADEPTUS ASTRA TELEPATHICA` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRURGEON
					in 26..35 -> Role.DESPERADO
					in 36..45 -> Role.HIEROPHANT
					in 46..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> null
				}
			}
			`ADEPTUS MECHANICUS` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRURGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> null
				}
			}
			`ADEPTUS MINISOTRUM` -> {
				when ((1..100).randomInt()) {
					in 1..10 -> Role.ASSASSIN
					in 11..25 -> Role.CHIRURGEON
					in 26..35 -> Role.DESPERADO
					in 36..50 -> Role.HIEROPHANT
					in 51..60 -> Role.MYSTIC
					in 61..70 -> Role.SAGE
					in 71..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> null
				}
			}
			`IMPERIAL GUARD` -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRURGEON
					in 26..40 -> Role.DESPERADO
					in 41..55 -> Role.HIEROPHANT
					in 56..65 -> Role.MYSTIC
					in 66..75 -> Role.SAGE
					in 76..85 -> Role.SEEKER
					in 86..100 -> Role.WARRIOR
					else -> null
				}
			}
			OUTCAST -> {
				when ((1..100).randomInt()) {
					in 1..15 -> Role.ASSASSIN
					in 16..25 -> Role.CHIRURGEON
					in 26..45 -> Role.DESPERADO
					in 46..55 -> Role.HIEROPHANT
					in 56..65 -> Role.MYSTIC
					in 66..75 -> Role.SAGE
					in 76..90 -> Role.SEEKER
					in 91..100 -> Role.WARRIOR
					else -> null
				}
			}
			else -> null
		}
	}

	fun rollBuild() {
		build = when (homeworld) {
			`FERAL WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> RANGY
					in 21..50 -> LEAN
					in 51..80 -> MUSCULAR
					in 81..90 -> SQUAT
					in 91..100 -> STRAPPING
					else -> null
				}
			}
			`FORGE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> MINIMAL
					in 21..50 -> `LOW NOMINAL`
					in 51..80 -> OPTIMAL
					in 81..90 -> `HIGH NOMINAL`
					in 91..100 -> MAXIMAL
					else -> null
				}
			}
			HIGHBORN -> {
				when ((0..100).randomInt()) {
					in 1..20 -> SLENDER
					in 21..50 -> SVELTE
					in 51..80 -> FIT
					in 81..90 -> `WELL-BUILT`
					in 91..100 -> POWERFUL
					else -> null
				}
			}
			`HIVE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> RUNT
					in 21..50 -> SCRAWNY
					in 51..80 -> WIRY
					in 81..90 -> LANKY
					in 91..100 -> BRAWNY
					else -> null
				}
			}
			`SHRINE WORLD` -> {
				when ((0..100).randomInt()) {
					in 1..20 -> DIMINISHED
					in 21..50 -> LESSENED
					in 51..80 -> FAITHFUL
					in 81..90 -> COMMENDED
					in 91..100 -> ABUNDANT
					else -> null
				}
			}
			VOIDBORN -> {
				when ((0..100).randomInt()) {
					in 1..20 -> SKELETAL
					in 21..50 -> STUNTED
					in 51..80 -> GAUNT
					in 81..90 -> GANGLING
					in 91..100 -> SPINDLY
					else -> null
				}
			}
			else -> null
		}
	}

	fun rollAgeStatus() {
		ageStatus = when (homeworld) {
			`FERAL WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..70 -> AgeStatus.WARRIOR
					in 71..100 -> AgeStatus.`OLD ONE`
					else -> null
				}
			}
			`FORGE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> AgeStatus.YOUNG
					in 21..80 -> AgeStatus.MATURE_F
					in 81..100 -> AgeStatus.VENERATED
					else -> null
				}
			}
			HIGHBORN -> {
				when ((1..100).randomInt()) {
					in 1..50 -> AgeStatus.SCION
					in 51..80 -> AgeStatus.PRIME
					in 81..100 -> AgeStatus.AUTHORITY
					else -> null
				}
			}
			`HIVE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..30 -> AgeStatus.NIPPER
					in 31..90 -> AgeStatus.ADULT
					in 91..100 -> AgeStatus.`OLD TIMER`
					else -> null
				}
			}
			`SHRINE WORLD` -> {
				when ((1..100).randomInt()) {
					in 1..20 -> AgeStatus.NOVATE
					in 21..80 -> AgeStatus.VITAL
					in 81..100 -> AgeStatus.ELDER
					else -> null
				}
			}
			VOIDBORN -> {
				when ((1..100).randomInt()) {
					in 1..40 -> AgeStatus.YOUTH
					in 41..70 -> AgeStatus.MATURE_V
					in 71..100 -> AgeStatus.METHUSELAH
					else -> null
				}
			}
			else -> null
		}
	}

	fun rollAge() {
		rollAgeStatus()
		age = (1..10).randomInt() + (ageStatus?.multiplier ?: 0)
	}

	fun rollSkin(){
		skin = when(homeworld){
			`FERAL WORLD` -> {
				when((1..30).randomInt()){
					in 1..30 -> DARK
					in 31..50 -> TAN
					in 51..70 -> FAIR
					in 71..90 -> RUDDY
					in 91..100 -> BRONZE
					else -> null
				}
			}
			`FORGE WORLD` -> TODO()
			HIGHBORN -> TODO()
			`HIVE WORLD` -> TODO()
			`SHRINE WORLD` -> TODO()
			VOIDBORN -> TODO()
			else -> null
		}
	}

	fun reset() {
		isMale = null
		homeworld = null
		background = null
		role = null
		build = null
		ageStatus = null
		age = null
		skin = null
	}
}
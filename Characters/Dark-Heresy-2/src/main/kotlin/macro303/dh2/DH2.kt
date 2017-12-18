package macro303.dh2

import java.util.*

object DH2 {
	val homeworlds = arrayListOf("Feral World", "Forge World", "Highborn", "Hive World", "Shrine World", "Voidborn")
	val backgrounds = arrayListOf("Adeptus Administratum", "Adeptus Arbites", "Adeptus Astra Telepathica", "Adeptus Mechanicus", "Adeptus Ministorum", "Imperial Guard", "Outcast")
	val roles = arrayListOf("Assassin", "Chirurgeon", "Desperado", "Hierophant", "Mystic", "Sage", "Seeker", "Warrior")

	fun ClosedRange<Int>.random() = Random().nextInt(endInclusive + 1 - start) + start

	@JvmStatic
	fun main(args: Array<String>) {
		val homeworld = rollHomeworld()
		val background = rollBackground(homeworld = homeworld)
		val role = rollRole(background = background)
		println("Homeworld: $homeworld")
		println("Background: $background")
		println("Role: $role")
	}

	private fun rollHomeworld(): String {
		when ((1..100).random()) {
			in 1..15 -> return homeworlds[0]
			in 16..33 -> return homeworlds[1]
			in 34..44 -> return homeworlds[2]
			in 45..69 -> return homeworlds[3]
			in 70..85 -> return homeworlds[4]
			in 86..100 -> return homeworlds[5]
		}
		return "ERROR"
	}

	private fun rollBackground(homeworld: String): String {
		val i = (1..100).random()
		when {
			i in 1..10 && homeworld == homeworlds[0] -> return backgrounds[0]
			i in 11..25 && homeworld == homeworlds[0] -> return backgrounds[1]
			i in 26..40 && homeworld == homeworlds[0] -> return backgrounds[2]
			i in 41..50 && homeworld == homeworlds[0] -> return backgrounds[3]
			i in 51..60 && homeworld == homeworlds[0] -> return backgrounds[4]
			i in 61..80 && homeworld == homeworlds[0] -> return backgrounds[5]
			i in 81..100 && homeworld == homeworlds[0] -> return backgrounds[6]
			i in 1..20 && homeworld == homeworlds[1] -> return backgrounds[0]
			i in 21..35 && homeworld == homeworlds[1] -> return backgrounds[1]
			i in 36..45 && homeworld == homeworlds[1] -> return backgrounds[2]
			i in 46..65 && homeworld == homeworlds[1] -> return backgrounds[3]
			i in 66..75 && homeworld == homeworlds[1] -> return backgrounds[4]
			i in 76..90 && homeworld == homeworlds[1] -> return backgrounds[5]
			i in 91..100 && homeworld == homeworlds[1] -> return backgrounds[6]
			i in 1..20 && homeworld == homeworlds[2] -> return backgrounds[0]
			i in 21..40 && homeworld == homeworlds[2] -> return backgrounds[1]
			i in 41..55 && homeworld == homeworlds[2] -> return backgrounds[2]
			i in 56..65 && homeworld == homeworlds[2] -> return backgrounds[3]
			i in 66..80 && homeworld == homeworlds[2] -> return backgrounds[4]
			i in 81..90 && homeworld == homeworlds[2] -> return backgrounds[5]
			i in 91..100 && homeworld == homeworlds[2] -> return backgrounds[6]
			i in 1..10 && homeworld == homeworlds[3] -> return backgrounds[0]
			i in 11..30 && homeworld == homeworlds[3] -> return backgrounds[1]
			i in 31..40 && homeworld == homeworlds[3] -> return backgrounds[2]
			i in 41..55 && homeworld == homeworlds[3] -> return backgrounds[3]
			i in 56..65 && homeworld == homeworlds[3] -> return backgrounds[4]
			i in 66..80 && homeworld == homeworlds[3] -> return backgrounds[5]
			i in 81..100 && homeworld == homeworlds[3] -> return backgrounds[6]
			i in 1..15 && homeworld == homeworlds[4] -> return backgrounds[0]
			i in 16..30 && homeworld == homeworlds[4] -> return backgrounds[1]
			i in 31..40 && homeworld == homeworlds[4] -> return backgrounds[2]
			i in 41..50 && homeworld == homeworlds[4] -> return backgrounds[3]
			i in 51..70 && homeworld == homeworlds[4] -> return backgrounds[4]
			i in 71..90 && homeworld == homeworlds[4] -> return backgrounds[5]
			i in 91..100 && homeworld == homeworlds[4] -> return backgrounds[6]
			i in 1..10 && homeworld == homeworlds[5] -> return backgrounds[0]
			i in 11..20 && homeworld == homeworlds[5] -> return backgrounds[1]
			i in 21..40 && homeworld == homeworlds[5] -> return backgrounds[2]
			i in 41..60 && homeworld == homeworlds[5] -> return backgrounds[3]
			i in 61..75 && homeworld == homeworlds[5] -> return backgrounds[4]
			i in 76..85 && homeworld == homeworlds[5] -> return backgrounds[5]
			i in 85..100 && homeworld == homeworlds[5] -> return backgrounds[6]
		}
		return "ERROR"
	}

	private fun rollRole(background: String): String {
		val i = (1..100).random()
		when {
			i in 1..10 && background == backgrounds[0] -> return roles[0]
			i in 11..25 && background == backgrounds[0] -> return roles[1]
			i in 26..35 && background == backgrounds[0] -> return roles[2]
			i in 36..50 && background == backgrounds[0] -> return roles[3]
			i in 51..60 && background == backgrounds[0] -> return roles[4]
			i in 61..75 && background == backgrounds[0] -> return roles[5]
			i in 76..90 && background == backgrounds[0] -> return roles[6]
			i in 91..100 && background == backgrounds[0] -> return roles[7]
			i in 1..15 && background == backgrounds[1] -> return roles[0]
			i in 16..25 && background == backgrounds[1] -> return roles[1]
			i in 26..40 && background == backgrounds[1] -> return roles[2]
			i in 41..50 && background == backgrounds[1] -> return roles[3]
			i in 51..60 && background == backgrounds[1] -> return roles[4]
			i in 61..70 && background == backgrounds[1] -> return roles[5]
			i in 71..85 && background == backgrounds[1] -> return roles[6]
			i in 86..100 && background == backgrounds[1] -> return roles[7]
			i in 1..10 && background == backgrounds[2] -> return roles[0]
			i in 11..25 && background == backgrounds[2] -> return roles[1]
			i in 26..35 && background == backgrounds[2] -> return roles[2]
			i in 36..45 && background == backgrounds[2] -> return roles[3]
			i in 46..60 && background == backgrounds[2] -> return roles[4]
			i in 61..75 && background == backgrounds[2] -> return roles[5]
			i in 76..90 && background == backgrounds[2] -> return roles[6]
			i in 91..100 && background == backgrounds[2] -> return roles[7]
			i in 1..10 && background == backgrounds[3] -> return roles[0]
			i in 11..25 && background == backgrounds[3] -> return roles[1]
			i in 26..35 && background == backgrounds[3] -> return roles[2]
			i in 36..50 && background == backgrounds[3] -> return roles[3]
			i in 51..60 && background == backgrounds[3] -> return roles[4]
			i in 61..75 && background == backgrounds[3] -> return roles[5]
			i in 76..90 && background == backgrounds[3] -> return roles[6]
			i in 91..100 && background == backgrounds[3] -> return roles[7]
			i in 1..10 && background == backgrounds[4] -> return roles[0]
			i in 11..25 && background == backgrounds[4] -> return roles[1]
			i in 26..35 && background == backgrounds[4] -> return roles[2]
			i in 36..50 && background == backgrounds[4] -> return roles[3]
			i in 51..60 && background == backgrounds[4] -> return roles[4]
			i in 61..70 && background == backgrounds[4] -> return roles[5]
			i in 71..85 && background == backgrounds[4] -> return roles[6]
			i in 86..100 && background == backgrounds[4] -> return roles[7]
			i in 1..15 && background == backgrounds[5] -> return roles[0]
			i in 16..25 && background == backgrounds[5] -> return roles[1]
			i in 26..40 && background == backgrounds[5] -> return roles[2]
			i in 41..55 && background == backgrounds[5] -> return roles[3]
			i in 56..65 && background == backgrounds[5] -> return roles[4]
			i in 66..75 && background == backgrounds[5] -> return roles[5]
			i in 76..85 && background == backgrounds[5] -> return roles[6]
			i in 86..100 && background == backgrounds[5] -> return roles[7]
			i in 1..15 && background == backgrounds[6] -> return roles[0]
			i in 16..25 && background == backgrounds[6] -> return roles[1]
			i in 26..45 && background == backgrounds[6] -> return roles[2]
			i in 46..55 && background == backgrounds[6] -> return roles[3]
			i in 56..65 && background == backgrounds[6] -> return roles[4]
			i in 66..75 && background == backgrounds[6] -> return roles[5]
			i in 76..90 && background == backgrounds[6] -> return roles[6]
			i in 91..100 && background == backgrounds[6] -> return roles[7]
		}
		return "ERROR"
	}
}
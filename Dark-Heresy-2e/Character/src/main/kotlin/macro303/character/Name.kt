package macro303.character

interface Name {
	val value: String

	enum class PrimitiveMaleName(override val value: String) : Name {
		ARZ(value = "Arz"),
		BARIK(value = "Barik"),
		CARM(value = "Carm"),
		FARN(value = "Farn"),
		GARAK(value = "Garak"),
		HORST(value = "Horst"),
		IMK(value = "Imk"),
		JART(value = "Jart"),
		KULEM(value = "Kulem"),
		LARL(value = "Larl"),
		MOK(value = "Mok"),
		NARL(value = "Narl"),
		OORT(value = "Oort"),
		PAK(value = "Pak"),
		RAGAA(value = "Ragaa"),
		SALC(value = "Salc"),
		TARL(value = "Tarl"),
		VOLC(value = "Volc"),
		YARL(value = "Yarl"),
		ZEL(value = "Zel")
	}

	enum class PrimitiveFemaleName(override val value: String) : Name {
		ARDA(value = "Arda"),
		CIL(value = "Cil"),
		DARA(value = "Dara"),
		ELPHET(value = "Elphet"),
		FRAKKA(value = "Frakka"),
		GARMA(value = "Garma"),
		HALLI(value = "Halli"),
		ING(value = "Ing"),
		JULLA(value = "Julla"),
		KELLE(value = "Kelle"),
		MERRA(value = "Merra"),
		NIMM(value = "Nimm"),
		NULLA(value = "Nulla"),
		PAZ(value = "Paz"),
		RUSSA(value = "Russa"),
		SULLE(value = "Sulle"),
		THIMA(value = "Thima"),
		VAS(value = "Vas"),
		YANNE(value = "Yanne"),
		ZANNA(value = "Zanna")
	}

	enum class LowMaleName(override val value: String) : Name {
		AAZ(value = "Aaz"),
		CANTO(value = "Canto"),
		DARRIAL(value = "Darrial"),
		ENOCH(value = "Enoch"),
		FESTUS(value = "Festus"),
		GAIUS(value = "Gaius"),
		HARLON(value = "Harlon"),
		IRLVEN(value = "Irlven"),
		JASPAR(value = "Jaspar"),
		KILLIAN(value = "Killian"),
		LAZARUS(value = "Lazarus"),
		MORDICAI(value = "Mordicai"),
		NICODEMUS(value = "Nicodemus"),
		QUINTEN(value = "Quinten"),
		RHABAN(value = "Rhaban"),
		SILVANTO(value = "Silvanto"),
		TITUS(value = "Titus"),
		URIAH(value = "Uriah"),
		XERXES(value = "Xerxes"),
		ZARIEL(value = "Zariel")
	}

	enum class LowFemaleName(override val value: String) : Name {
		ACADI(value = "Acadi"),
		BALIDA(value = "Balida"),
		CASSA(value = "Cassa"),
		DARIAL(value = "Darial"),
		FRENNINE(value = "Frennine"),
		GALATIA(value = "Galatia"),
		HANNETTE(value = "Hannette"),
		JINZIA(value = "Jinzia"),
		KARROLEEN(value = "Karroleen"),
		LIRI(value = "Liri"),
		MAGDALA(value = "Magdala"),
		NARCIA(value = "Narcia"),
		PENNETTE(value = "Pennette"),
		QUINEEL(value = "Quineel"),
		RHIA(value = "Rhia"),
		SESSELIE(value = "Sesselie"),
		THESSE(value = "Thesse"),
		URI(value = "Uri"),
		XANDRA(value = "Xandra"),
		ZADORI(value = "Zadori")
	}

	enum class HighMaleName(override val value: String) : Name {
		AZARARCH(value = "Azararch"),
		BARANOTH(value = "Baranoth"),
		CASTESS(value = "Castess"),
		DAVRUS(value = "Davrus"),
		ERIOCH(value = "Erioch"),
		GALLIACH(value = "Galliach"),
		HARTHOS(value = "Harthos"),
		ICHARUS(value = "Icharus"),
		KARPATH(value = "Karpath"),
		LOTHOS(value = "Lothos"),
		MARIUS(value = "Marius"),
		NOCTINE(value = "Noctine"),
		OCTAVIUS(value = "Octavius"),
		PARTHEOS(value = "Partheos"),
		QUELLUS(value = "Quellus"),
		RAMALIES(value = "Ramalies"),
		SEVERAN(value = "Severan"),
		TYRUSS(value = "Tyruss"),
		VENTIUM(value = "Ventium"),
		ZARATH(value = "Zarath")
	}

	enum class HighFemaleName(override val value: String) : Name {

	}

	enum class ArchaicMaleName(override val value: String) : Name {
		ALARIC(value = "Alaric"),
		BARBOSA(value = "Barbosa"),
		CARADOC(value = "Caradoc"),
		DRACO(value = "Draco"),
		EIZEN(value = "Eizen"),
		FERRIS(value = "Ferris"),
		GRENDAL(value = "Grendal"),
		HARLOCKE(value = "Harlocke"),
		JENQUIN(value = "Jenquin"),
		KARLOS(value = "Karlos"),
		LEMANT(value = "Lemant"),
		MAGNUS(value = "Magnus"),
		NAVEEN(value = "Naveen"),
		OSCARL(value = "Oscarl"),
		PERRIN(value = "Perrin"),
		ROMULUS(value = "Romulus"),
		SABANTH(value = "Sabanth"),
		URIAL(value = "Urial"),
		WOLFE(value = "Wolfe"),
		ZARKOV(value = "Zarkov")
	}

	enum class ArchaicFemaleName(override val value: String) : Name {

	}

	enum class InformalMaleName(override val value: String) : Name {
		ABLE(value = "Able"),
		BONES(value = "Bones"),
		CUTTER(value = "Cutter"),
		DAKKA(value = "Dakka"),
		DOKK(value = "Dokk"),
		ERGS(value = "Ergs"),
		FANZ(value = "Fanz"),
		FLAIR(value = "Flair"),
		GARRIT(value = "Garrit"),
		HONS(value = "Hons"),
		ILLS(value = "Ills"),
		JAQ(value = "Jaq"),
		LAX(value = "Lax"),
		MENG(value = "Meng"),
		NAST(value = "Nast"),
		REDDIN(value = "Reddin"),
		SCAB(value = "Scab"),
		SHIV(value = "Shiv"),
		TRANQ(value = "Tranq"),
		WURM(value = "Wurm")
	}

	enum class InformalFemaleName(override val value: String) : Name {

	}
}
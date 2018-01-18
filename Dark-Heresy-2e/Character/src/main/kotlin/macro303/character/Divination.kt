package macro303.character

enum class Divination(val value: String, val effect: String) {
	MUTATION(
		value = "Mutation without, corruption within.",
		effect = "Roll once on Table 8–15: Malignancies (see page 290) and apply the result."
	),
	TRUST(
		value = "Trust in your fear.",
		effect = "Increase this character’s Perception by 5, He also gains the Phobia Mental Disorder (see page 288)."
	),
	HUMANS(
		value = "Humans must die so that humanity can endure.",
		effect = "This character gains the Jaded talent. If he already possesses this talent, increase his Willpower characteristic by 2 instead."
	),
	PAIN(
		value = "The pain of the bullet is ecstasy compared to damnation.",
		effect = "Reduce this character's Agility characteristic by 3. The first time this character suffers Critical damage each session, roll 1d10. On a result of 10, he does not suffer any Critical Effects, though the damage still counts as Critical damage."
	),
	BOON(
		value = "Be a boon to your allies and the bane of your enemies.",
		effect = "This character gains the Hatred (choose any one) talent. If he already possessed this talent, increase his Strength characteristic by 2 instead."
	),
	WISE(
		value = "The wise learn from the deaths of others.",
		effect = "Increase this character's Agility or Intelligence Characteristic by 3. Reduce his Weapon Skill or Ballistic Skill characteristic by 3."
	),
	KILL(
		value = "Kill the alien before it can speak its lies.",
		effect = "This character gains the Quick Draw talent. If he already possesses this talent, increase his Agility characteristic by 2 instead."
	),
	TRUTH(
		value = "Truth is subjective.",
		effect = "Increase this character's Perception characteristic by 3. The first time he would gain 1 or more Corruption points each session, he gains that amount plus 1 instead."
	),
	THOUGHT(
		value = "Thought begets Heresy.",
		effect = "Reduce this character's Intelligence characteristic by 3. The first time he would gain 1 or more Corruption points each session, he reduces that amount by 1 (to a minimum of 0) instead."
	),
	HERESY(
		value = "Heresy begets Retribution",
		effect = "Increase this character's Fellowship or Strength characteristic by 3. Reduce his Toughness or Willpower characteristic by 3."
	),
	MIND(
		value = "A mind without purpose wanders in dark places.",
		effect = "When gaining Mental Disorders (see page 287), the character may choose to gain a new Disorder instead of increasing the severity of an existing Disorder."
	),
	JOB(
		value = "If a job is worth doing, it is worth dying for.",
		effect = "Increase this character's Toughness or Willpower characteristic by 3. Reduce his Fellowship or Strength characteristic by 3."
	),
	DARK(
		value = "Dark dreams lie upon the heart.",
		effect = "Whenever this character would roll on Table 8–15: Malignancies (see page 290), he may instead select any one result and gain that Malignancy."
	),
	VIOLENCE(
		value = "Violence solves everything.",
		effect = "Increase this character's Weapon Skill or Ballistic Skill characteristic by 3. Reduce his Agility or Intelligence characteristic by 3."
	),
	IGNORANCE(
		value = "Ignorance is a wisdom of its own",
		effect = "Reduce this character's Perception characteristic by 3. The first time he would gain 1 or more Insanity points each session, he reduces that amount by 1 (to a minimum of 0) instead."
	),
	INSANE(
		value = "Only the insane have strength enough to prosper",
		effect = "Increase this character's Willpower characteristic by 3. The first time he would gain 1 or more Insanity points each session, he gains that amount plus 1 instead."
	),
	SUSPICIOUS(
		value = "A suspicious mind is a healthy mind.",
		effect = "Increase this character’s Perception characteristic by 2. Additionally, he may re-roll Awareness tests to avoid being Surprised."
	),
	SUFFERING(
		value = "Suffering is an unrelenting instructor.",
		effect = "Reduce this character's Toughness characteristic by 3. The first time that this character suffers any damage each session, he gains a +20 bonus to the next test he makes before the end of his next turn."
	),
	TRUE_FEAR(
		value = "The only true fear is dying without your duty done.",
		effect = "This character gains the Resistance (Cold, Heat, or Fear) talent. If he already possesses this talent, increase his Toughness characteristic by 2 instead."
	),
	DEATH(
		value = "Only in death does duty end.",
		effect = "The first time this character would suffer Fatigue each session, he suffers that amount of Fatigue minus 1 (to a minimum of 0) instead."
	),
	INNOCENCE(
		value = "Innocence is an illusion.",
		effect = "This character gains the Keen Intuition talent. If he already possesses this talent, increase his Intelligence characteristic by 2 instead."
	),
	WAR(
		value = "To war is human.",
		effect = "This character gains the Dodge skill as a Known skill (rank 1). If he already possesses this skill, increase his Agility characteristic by 2 instead."
	),
	SUBSTITUTE(
		value = "There is no substitute for zeal.",
		effect = "This character gains the Clues from the Crowds talent. If he already possesses this talent, increase his Fellowship characteristic by 2 instead."
	),
	NOTHING(
		value = "Even one who has nothing can still offer his life.",
		effect = "When this character burns Fate threshold to survive a lethal injury, roll 1d10. On a result of 10, he survives whatever grievous wound would have killed him but does not reduce his Fate threshold."
	),
	SERVE(value = "Do not ask why you serve. Only ask how.", effect = "Increase this character's Fate threshold by 1.")
}
object AvailabeScores {

    fun get(scoreSheet: ScoreSheet,
            upperSection: UpperSection,
            lowerSection: LowerSection): Map<String, Int> {

        val freeUpperSectionFields =
            scoreSheet.upperSection
                .filter { field -> field.value == null }

        val fromUpperSection =
            upperSection.fields
                .filter { field -> field.value != null }
                .filter { field -> freeUpperSectionFields.containsKey(field.key) }
                .mapValues { field -> field.value!! }
                .toList()

        val freeLowerSectionFields =
            scoreSheet.lowerSection
                .filter { field -> field.value == null }

        val fromLowerSection =
            lowerSection.fields
                .filter { field -> field.value != null }
                .filter { field -> freeLowerSectionFields.containsKey(field.key) }
                .mapValues { field -> field.value!! }
                .toList()

        val arrayList = arrayListOf<Pair<String, Int>>()

        arrayList.addAll(fromUpperSection)
        arrayList.addAll(fromLowerSection)

        return arrayList.toMap()

    }

}

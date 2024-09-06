package com.elab.kvizprojekat

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Ko je autor ove slike?",
            R.drawable.jaksic_devojkauplavom,
            "Đura Jakšić",
            "Sava Šumanović",
            "Paja Jovanović",
            "Uroš Predić",
            1)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Ko je autor ove slike?",
            R.drawable.predic_kosovkadevojka,
            "Đura Jakšić",
            "Sava Šumanović",
            "Paja Jovanović",
            "Uroš Predić",
            4)
        questionsList.add(que2)


        return questionsList
    }
}
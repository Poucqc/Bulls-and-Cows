package org.example

class CallStrike : CallSBO() {
    override fun call(correctAnswer: IntArray, guessedNumber: IntArray): String {
        var strikeCount = 0
        for (i in correctAnswer.indices) {
            if (correctAnswer[i] == guessedNumber[i]) {
                strikeCount++
            }
        }
        val strike = strikeCount.toString() + "S"
        return strike
    }
}



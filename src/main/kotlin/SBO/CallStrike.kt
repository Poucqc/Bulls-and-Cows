package org.example.SBO

import org.example.CallSBO

class CallStrike : CallSBO() {
    override fun call(correctAnswer: IntArray, guessedNumber: IntArray): Int {
        var strikeCount = 0
        for (i in correctAnswer.indices) {
            if (correctAnswer[i] == guessedNumber[i]) {
                strikeCount++
            }
        }
        return strikeCount
    }
}



package org.example.SBO

import org.example.CallSBO

class CallBall : CallSBO() {
    override fun call(correctAnswer: IntArray, guessedNumber: IntArray): Int {
        var ballCount = 0
        for (i in guessedNumber.indices) {
            if (guessedNumber[i] == correctAnswer[i]) {
                continue
            }
            if (guessedNumber[i] in correctAnswer) {
                ballCount++
            }
        }
        return ballCount
    }
}
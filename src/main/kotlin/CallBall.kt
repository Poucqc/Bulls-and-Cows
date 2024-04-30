package org.example

class CallBall : CallSBO() {
    override fun call(correctAnswer: IntArray, guessedNumber: IntArray): String {
        var ballCount = 0
        for (i in guessedNumber.indices) {
            if (guessedNumber[i] == correctAnswer[i]) {
                continue
            }
            if (guessedNumber[i] in correctAnswer) {
                ballCount++
            }
        }
        val ball = ballCount.toString() + "B"
        return ball
    }
}
package org.example.SBO

import org.example.CallSB

class CallBall : CallSB() {
    override fun call(answer: IntArray, guess: IntArray): Int {
        var ballCount = 0
        for (i in guess.indices) {
            if (guess[i] == answer[i]) {
                continue
            }
            if (guess[i] in answer) {
                ballCount++
            }
        }
        return ballCount
    }
}
package org.example.SBO

import org.example.CallSB

class CallStrike : CallSB() {
    override fun call(answer: IntArray, guess: IntArray): Int {
        var strikeCount = 0
        for (i in answer.indices) {
            if (answer[i] == guess[i]) {
                strikeCount++
            }
        }
        return strikeCount
    }
}



package org.example.SBO

class SBCall {
    fun call(strike: Int, ball: Int) {
        if (strike != 0|| ball != 0) {
            println("${strike}스트라이크 ${ball}볼 입니다")
        } else {
            println("Nothing")
        }
    }
}
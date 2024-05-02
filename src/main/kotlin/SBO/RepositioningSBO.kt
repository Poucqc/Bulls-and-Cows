package org.example.SBO

class RepositioningSBO {
    fun reposition(strike: Int, ball: Int) {
        if (strike != 0|| ball != 0) {
            println("${strike}S ${ball}B 입니다")
        } else {
            println("Nothing")
        }
    }
}
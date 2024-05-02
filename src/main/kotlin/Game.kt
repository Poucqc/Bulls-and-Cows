package org.example

import org.example.Number.GettingNumber
import org.example.Number.MakingNumber
import org.example.SBO.CallBall
import org.example.SBO.CallStrike
import org.example.SBO.RepositioningSBO



class Game {
    private var record = mutableListOf<Int>()

    fun start() {
        val making = MakingNumber()
        val get = GettingNumber()
        val call = RepositioningSBO()
        val strikeCall = CallStrike()
        val ballCall = CallBall()

        println("게임 시작 : 무작위 정답을 생성합니다")
        val answer = making.makeNumber()
        var count = 1
        var guess : IntArray
        while (true) {
            guess = get.get()
            if (!guess.contentEquals(answer)) {
                val strike = strikeCall.call(answer, guess)
                val ball = ballCall.call(answer, guess)
                count++
                call.reposition(strike, ball)
            } else {
                println("정답입니다 ${count}번 만에 맞추셨습니다")
                record.add(count)
                break
            }
        }
    }

    fun getRecord(): List<Int> {
        return record
    }
}
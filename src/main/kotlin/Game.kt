package org.example

import org.example.Number.GettingNumber
import org.example.Number.MakingNumber
import org.example.SBO.CallBall
import org.example.SBO.CallStrike
import org.example.SBO.SBCall



class Game {
    private var record = mutableListOf<Int>()

    fun start() {
        val making = MakingNumber()
        val get = GettingNumber()
        val call = SBCall()
        val strikeCall = CallStrike()
        val ballCall = CallBall()

        println("게임 시작 : 무작위 정답을 생성합니다")
        println("게임을 중간에 종료하시려면 'quit' 를 입력해 주세요")
        val answer = making.makeNumber()
        var count = 1
        var guess : IntArray
        while (true) {
            guess = get.get()
            if (!guess.contentEquals(answer)) {
                val strike = strikeCall.call(answer, guess)
                val ball = ballCall.call(answer, guess)
                count++
                call.call(strike, ball)
            } else {
                println("정답입니다 ${count}번 만에 맞추셨습니다")
                record.add(count)
                displayRecord()
                break
            }
        }
    }

    fun displayRecord() {
        if (record.isNotEmpty()) {
            println("게임 기록입니다")
            for ((index, value) in record.withIndex()) {
                println("${index + 1}번째 게임: ${value}번째 시도에 성공")
            }
        } else {
            println("기록이 없습니다")
        }
    }

    fun displayMenu() {
        println("원하시는 메뉴를 입력해주세요")
        println("1. 게임 시작")
        println("2. 기록 보기")
        println("3. 게임 종료")
    }
}


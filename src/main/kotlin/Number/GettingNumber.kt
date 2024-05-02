package org.example.Number

import org.example.main

class GettingNumber {
    fun get(): IntArray {
        while (true) {
            println("예상 숫자를 입력해 주세요 : ")
            val input = readln()
            if (input == "quit") {
                println("메인 메뉴로 돌아갑니다")
                main()
            } else {
                val guess = input.toIntOrNull()
                if (guess != null) {
                    val number = guess.toString().map { it.toString().toInt() }.toIntArray()
                    if (number.size == 3 && number[0] != 0 && number[0] != number[1] && number[0] != number[2] && number[1] != number[2]) {
                        return number
                    }
                }
            }
            println("오류 : 올바른 숫자를 입력해 주세요")
        }
    }
}



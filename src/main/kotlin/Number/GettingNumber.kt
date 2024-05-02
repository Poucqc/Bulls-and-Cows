package org.example.Number

class GettingNumber {
    fun get(): IntArray {
        while (true) {
            println("예상 숫자를 입력해 주세요 : ")
            val input = readLine()?.toIntOrNull()
            if (input != null) {
                val number = input.toString().map { it.toString().toInt() }.toIntArray()
                if (number.size == 3 && number[0] != 0 && number[0] != number[1] && number[0] != number[2] && number[1] != number[2]) {
                    return number
                }
            }
            println("오류 : 올바른 숫자를 입력해 주세요")
        }
    }
}



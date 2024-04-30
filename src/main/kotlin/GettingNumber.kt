package org.example

class GettingNumber {
    fun get(): IntArray {

        val checkNumber = CheckingNumber()

        var guessedNumber: IntArray
        do {
            guessedNumber = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        } while (checkNumber.check(guessedNumber))
        return guessedNumber
    }
}
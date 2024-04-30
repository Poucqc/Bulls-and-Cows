package org.example

class GettingNumber {
    fun get(): IntArray {
        val checkDuplication = ChekingDuplication()
        val checkRange = CheckingRange()

        var guessedNumber: IntArray
        do {
            guessedNumber = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        } while (checkRange.check(guessedNumber) || checkDuplication.check(guessedNumber))
        return guessedNumber
    }
}
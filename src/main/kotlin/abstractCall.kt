package org.example

abstract class CallSBO {
    abstract fun call (correctAnswer:IntArray, guessedNumber: IntArray) : Int
}
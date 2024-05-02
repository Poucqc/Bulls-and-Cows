package org.example.Number

import kotlin.random.Random

class MakingNumber {

    fun makeNumber(): IntArray {
        while (true) {
            val randomString = Random.nextInt(100, 1000).toString()
            val random = randomString.map { it.toString().toInt() }.toIntArray()
            if (random.size == 3 && random[0] != 0 && random[0] != random[1] && random[0] != random[2] && random[1] != random[2]) {
                return random
            }
        }
    }
}

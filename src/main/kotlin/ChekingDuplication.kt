package org.example

class ChekingDuplication:Checking() {
    override fun check(a: IntArray): Boolean {
        for (i in a.indices) {
            for (j in i + 1 until a.size) {
                if (a[i] == a[j]) {
                    return false
                }
            }
        }
        return true
    }
}

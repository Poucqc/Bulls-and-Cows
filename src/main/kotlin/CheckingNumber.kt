package org.example

class CheckingNumber : Checking() {
    override fun check(a: IntArray): Boolean {
        if (a[0] == 0 || a[0] != a[1] || a[0] != a[2] || a[1] != a[2]) {
            return false
        } else {
            return true
        }
    }
}
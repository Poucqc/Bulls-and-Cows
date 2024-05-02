package org.example

import kotlin.system.exitProcess


//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val game = Game()
    println("어서오세요! 야구 게임에 오신거 환영합니다.")
    var choice: Int?
    do {
        displayMenu()
        choice = readlnOrNull()?.toIntOrNull()
        try {
            when (choice) {
                1 -> game.start()
                2 -> displayRecord()
                3 -> exitProcess(0)
                else -> throw IllegalArgumentException("메뉴를 정확히 선택해 주세요")
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    } while (choice != 3)
}

fun displayMenu() {
    println("원하시는 메뉴를 입력해주세요")
    println("1. 게임 시작")
    println("2. 기록 보기")
    println("3. 게임 종료")
}

fun displayRecord() {
    val game = Game()
    var records = game.getRecord()
    println("게임 기록입니다")
    for ((index, value) in records.withIndex()) {
        println("${index + 1}: $value")
    }
}
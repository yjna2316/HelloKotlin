package chap3_조건문과_조건식

fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true

    val healthStatus = if (healthPoints == 100) {
        "최상의 상태임!"
    } else if (healthPoints in 90..99) {
        "약간의 찰과상만 있음"
    } else if (healthPoints in 75..89) {
        if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유됨!"
        } else {
            "경미한 상처만 있음."
        }
    } else if (healthPoints in 15..74) {
        "많이 다친 것 같음."
    } else {
        "최악의 상태임!"
    }

    // 플레이어 상태 출력
    println(name + " " + healthStatus)
}
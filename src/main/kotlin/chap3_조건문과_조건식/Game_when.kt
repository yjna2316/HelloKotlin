package chap3_조건문과_조건식

fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true

    // 논리 연산자
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green" else "NONE"

    // 플레이어 상태 출력
    println(auraColor)
    println("(Aura: $auraColor)" +
            "(Blessed: ${if (isBlessed) "Yes" else "NO"})")

    // when 표현식
    val healthStatus = when(healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) "경미한 상처가 있지만 빨리 치유되고 있음" else "경미한 상처만 있음"
        in 15..74 -> "많이 다친듯"
        else -> "최악의 상태!"
    }
    // 플레이어 상태 출력
    println(name + " " + healthStatus)

    // 문자열 템플릿 사용하기
    println("$name $healthStatus")
}
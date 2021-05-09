fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true

    // 논리 연산자
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green" else "NONE"
    println(auraColor)

    // if/else 문
    // 조건 표현식
    // 표현식이 하나만 있을 때 중괄호 생략 가능하나, 가독성 위해 생략하지 않았다.
    val healthStatus = if (healthPoints == 100) {
        "최상의 상태임!"
    } else if (healthPoints >= 90) {
        "약간의 찰과상만 있음."
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유됨!"
        } else {
            "경미한 상처만 있음."
        }
    } else if (healthPoints >= 15) {
        "많이 다친 것 같음."
    } else {
        "최악의 상태임!"
    }

    // 플레이어 상태 출력
    println(name + " " + healthStatus)
}
fun main(args: Array<String>) {
    val playerName = "에스트라곤"
    var experiencePoints = 5
    var hasSteed = false
    var numOfGold = 50
    var barName = "Unicorn's Horn"
    var barHostName = "주인장 이름"
    var menus = setOf<String>("벌꿀주", "포도주", "라크루아")
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(menus)
    println(playerName.reversed())
}

const val MAX_EXPERIENCE = 5000
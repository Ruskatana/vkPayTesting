fun main() {
    var typeCard = "Visa"
    var amountThisMonth = 90000
    var amountNow= 100
    println("________________________________")
    println("вы выбрали карту " + typeCard)
    println("в этом месяце вы уже перевели " + amountThisMonth + " рублей")
    println("сумма для перевода сейчас " + amountNow + " рублей")
    println("________________________________")
    val result = totalComision(typeCard, amountThisMonth, amountNow)

    println(result)

}


fun totalComision(typeCard: String, amountThisMonth: Int, amountNow: Int): Any =
    when {
        typeCard == "Mastercard" && amountNow + amountThisMonth <= 75000 -> 0
        typeCard == "Mastercard" && amountNow + amountThisMonth >= 75000 && amountNow < 150000 && amountNow + amountThisMonth < 600000 -> amountNow * 0.6 / 100 + 20
        typeCard == "Maestro" && amountNow + amountThisMonth <= 75000 -> 0
        typeCard == "Maestro" && amountNow + amountThisMonth >= 75000 && amountNow < 150000 && amountNow + amountThisMonth < 600000 -> amountNow * 0.6 / 100 + 20
        typeCard == "Visa" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 >= 35 -> amountNow * 0.75 / 100
        typeCard == "Visa" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 <= 35 -> 35
        typeCard == "Мир" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 >= 35 -> amountNow * 0.75 / 100
        typeCard == "Мир" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 <= 35 -> 35
        typeCard == "VK PAY" && amountNow < 15000 && amountNow + amountThisMonth < 40000 -> 0
        else -> {
            -1
        }
    }

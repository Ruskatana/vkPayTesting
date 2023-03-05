fun main() {


    var result = totalComision("Visa", 10, 200)

    println(result)

}


fun totalComision(typeCard: String, amountThisMonth: Int, amountNow: Int): Int =
    when {
        typeCard == "Mastercard" && amountNow + amountThisMonth <= 75000 -> 0
        typeCard == "Mastercard" && amountNow + amountThisMonth >= 75000 && amountNow < 150000 && amountNow + amountThisMonth < 600000 -> (amountNow * 0.6 / 100 + 20).toInt()
        typeCard == "Maestro" && amountNow + amountThisMonth <= 75000 -> 0
        typeCard == "Maestro" && amountNow + amountThisMonth >= 75000 && amountNow < 150000 && amountNow + amountThisMonth < 600000 -> (amountNow * 0.6 / 100 + 20).toInt()
        typeCard == "Visa" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 >= 35 -> (amountNow * 0.75 / 100).toInt()
        typeCard == "Visa" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 < 35 -> 35
        typeCard == "Мир" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 >= 35 -> (amountNow * 0.75 / 100).toInt()
        typeCard == "Мир" && amountNow < 150000 && amountNow + amountThisMonth < 600000 && amountNow * 0.75 / 100 < 35 -> 35
        typeCard == "VK PAY" && amountNow < 15000 && amountNow + amountThisMonth < 40000 -> 0
        else -> {
            -1
        }
    }

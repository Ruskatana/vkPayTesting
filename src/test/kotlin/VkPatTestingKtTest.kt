import org.junit.Test

import org.junit.Assert.*

class VkPatTestingKtTest {

    @Test
    fun totalComision() {
        var typeCard = "Visa"
        var amountThisMonth = 10
        var amountNow= 200
        var result = totalComision(typeCard, amountThisMonth, amountNow)

        assertEquals(35, result)
    }
    @Test
    fun totalComision2() {
        var typeCard = "Mastercard"
        var amountThisMonth = 700
        var amountNow= 500
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(35, result)
    }
    @Test
    fun totalComision3() {
        var typeCard = "Мир"
        var amountThisMonth = 50
        var amountNow= 460
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(35, result)
    }
    @Test
    fun totalComision4() {
        var typeCard = "VK PAY"
        var amountThisMonth = 799
        var amountNow= 500
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(35, result)
    }
}
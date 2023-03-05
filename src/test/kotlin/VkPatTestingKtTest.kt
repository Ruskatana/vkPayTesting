import org.junit.Test

import org.junit.Assert.*

class VkPatTestingKtTest {

    @Test
    fun totalComisionVisa1() {
        var typeCard = "Visa"
        var amountThisMonth = 10
        var amountNow= 200
        var result = totalComision(typeCard, amountThisMonth, amountNow)
        assertEquals(35, result)
    }
    @Test
    fun totalComisionVisa2() {
        var typeCard = "Visa"
        var amountThisMonth = 500000
        var amountNow= 30000
        var result = totalComision(typeCard, amountThisMonth, amountNow)
        assertEquals(225, result)
    }


    @Test
    fun totalComisionMastercard1() {
        var typeCard = "Mastercard"
        var amountThisMonth = 700
        var amountNow= 500
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(0, result)
    }
    @Test
    fun totalComisionMastercard2() {
        var typeCard = "Mastercard"
        var amountThisMonth = 50000
        var amountNow= 26000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(176, result)
    }

    @Test
    fun totalComisionMir1() {
        var typeCard = "Мир"
        var amountThisMonth = 50
        var amountNow= 460
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(35, result)
    }
    @Test
    fun totalComisionMir2() {
        var typeCard = "Мир"
        var amountThisMonth = 100000
        var amountNow= 30000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(225, result)
    }
    @Test
    fun totalComisionVkPay1() {
        var typeCard = "VK PAY"
        var amountThisMonth = 799
        var amountNow= 500
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(0, result)
    }
    @Test
    fun totalComisionMaestro1() {
        var typeCard = "Maestro"
        var amountThisMonth = 799
        var amountNow= 500
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(0, result)
    }
    @Test
    fun totalComisionMaestro2() {
        var typeCard = "Maestro"
        var amountThisMonth = 60000
        var amountNow= 100000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(620, result)
    }
    @Test
    fun totalComisionMistake() {
        var typeCard = "-1"
        var amountThisMonth = 60000
        var amountNow= 100000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
    }
}
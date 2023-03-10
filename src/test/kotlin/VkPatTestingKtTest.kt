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
    fun totalComisionVisa3() {
        var typeCard = "Visa"
        var amountThisMonth = 500000
        var amountNow= 151000
        var result = totalComision(typeCard, amountThisMonth, amountNow)
        assertEquals(-1, result)
    }
    @Test
    fun totalComisionVisa4() {
        var typeCard = "Visa"
        var amountThisMonth = 500000
        var amountNow= 200000
        var result = totalComision(typeCard, amountThisMonth, amountNow)
        assertEquals(-1, result)
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
    fun totalComisionMastercard3() {
        var typeCard = "Mastercard"
        var amountThisMonth = 50000
        var amountNow= 260000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
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
    fun totalComisionMir3() {
        var typeCard = "Мир"
        var amountThisMonth = 100000
        var amountNow= 151000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
    }
    @Test
    fun totalComisionVkPay1() {
        var typeCard = "VK PAY"
        var amountThisMonth = 2000
        var amountNow= 10000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(0, result)
    }
    @Test
    fun totalComisionVkPay2() {
        var typeCard = "VK PAY"
        var amountThisMonth = 2000
        var amountNow= 100000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
    }
    @Test
    fun totalComisionVkPay3() {
        var typeCard = "VK PAY"
        var amountThisMonth = 200000
        var amountNow= 10000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
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
    fun totalComisionMaestro3() {
        var typeCard = "Maestro"
        var amountThisMonth = 60000
        var amountNow= 152000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
    }
    @Test
    fun totalComisionMaestro4() {
        var typeCard = "Maestro"
        var amountThisMonth = 600000
        var amountNow= 152000
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(-1, result)
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
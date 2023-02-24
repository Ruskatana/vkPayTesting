import org.junit.Test

import org.junit.Assert.*

class VkPatTestingKtTest {

    @Test
    fun totalComision() {
        var typeCard = "Mastercard"
        var amountThisMonth = 90000
        var amountNow= 100
        val result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(20.6, result)
    }
}
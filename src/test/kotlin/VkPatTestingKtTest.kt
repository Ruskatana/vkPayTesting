import org.junit.Test

import org.junit.Assert.*

class VkPatTestingKtTest {

    @Test
    fun totalComision() {
        var typeCard = "VK PAY"
        var amountThisMonth = 90000
        var amountNow= 100
        var result = totalComision(typeCard, amountThisMonth, amountNow )

        assertEquals(200, result)
    }
}
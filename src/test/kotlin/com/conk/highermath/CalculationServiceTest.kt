package com.conk.highermath

import org.junit.jupiter.api.Test
import com.conk.highermath.CalculationService
import org.assertj.core.api.Assert
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.InjectMocks
import org.mockito.runners.MockitoJUnitRunner
import org.springframework.beans.factory.annotation.Autowired


@RunWith(MockitoJUnitRunner::class)
class CalculationServiceTest {

    @InjectMocks
    lateinit var calculationService: CalculationService

    var queryDate = "1995-12-16"

    @Test
    fun `log returns query year no earlier than 1995`() {
        val resultOfZero = calculationService.logYear(2, 8) // log should be 0.33333
        assertEquals(1995, resultOfZero)

        val nonZeroResult = calculationService.logYear(8, 2) // log should be 3
        assertEquals(1998, nonZeroResult)
    }

    @Test
    fun `log returns query year no later than 2019`() {
        val resultOfTwentyFour = calculationService.logYear(1, 24)
        assertEquals(2019, resultOfTwentyFour)

        val resultMoreThanTwentyFour = calculationService.logYear(33554432, 2)
        assertEquals(1996, resultMoreThanTwentyFour)
    }
}
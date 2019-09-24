package com.conk.highermath

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


class CalculationServiceTest {

    val calculationService = CalculationService()

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
        val resultOfTwentyFour = calculationService.logYear(16777216, 2)
        assertEquals(2019, resultOfTwentyFour)

        val resultMoreThanTwentyFour = calculationService.logYear(33554432, 2)
        assertEquals(1996, resultMoreThanTwentyFour)
    }

    @Test
    fun `mod returns query month no earlier than 1`() {
        val resultOfZero = calculationService.modMonth(1)
        assertEquals(1, resultOfZero)
    }

    @Test
    fun `modMonth returns query month no later than 12`() {
        val resultOfTwelve = calculationService.modMonth(25)
        assertEquals(12, resultOfTwelve)
    }

   @Test
   fun `rootDay returns query day no earlier than 1`() {
       val resultOfZero = calculationService.rootDay(0)
       assertEquals(1, resultOfZero)
   }

    @Test
    fun `rootDay returns query day no later than 31`() {
        val resultOfThirtyTwo = calculationService.rootDay(3969)
        assertEquals(31, resultOfThirtyTwo)
    }

    @Test
    fun `birthday returns date within valid range`() {
        val sampleDate = "1970-12-16"
        val result = calculationService.birthday(sampleDate)

    }
}

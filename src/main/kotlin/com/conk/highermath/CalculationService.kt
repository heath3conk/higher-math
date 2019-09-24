package com.conk.highermath

import org.springframework.stereotype.Service
import java.time.LocalDate
import kotlin.math.log
import kotlin.math.sqrt
import kotlin.random.Random

@Service
class CalculationService {

    val earliestDate = LocalDate.parse("1995-06-16")

    fun logYear(number: Int, base: Int = 10): Int {
        val baseYear = 1995
        val actualResult = log(number.toDouble(), base.toDouble()).toInt()
        if (actualResult in 0..24) {
            return baseYear + actualResult
        }
        return baseYear + actualResult.rem(24)
    }

    fun modMonth(number: Int): Int {
        val modOfNumber = 12.rem(number)
        if (modOfNumber == 0) {
            return 1
        }
        return modOfNumber
    }

    fun rootDay(number: Int): Int {
        val squareRoot = sqrt(number.toDouble()).toInt()
        if (squareRoot == 0) {
            return 1
        }
        if (squareRoot > 31) {
            return 31.rem(squareRoot)
        }
        return squareRoot
    }

    fun birthday(someDate: String): LocalDate {
        val madeDate = LocalDate.parse(someDate)
        if (withinDateRange(madeDate)) {
            return madeDate
        }

        val randomYear = Random.nextInt(1995, 2020)
        return madeDate
    }

    private fun withinDateRange(dateToCheck: LocalDate): Boolean {
        return dateToCheck in earliestDate..LocalDate.now()
    }
}

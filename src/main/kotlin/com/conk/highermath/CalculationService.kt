package com.conk.highermath

import org.springframework.stereotype.Service
import java.time.LocalDate
import kotlin.math.log

@Service
class CalculationService {

    val earliestDate = LocalDate.parse("1995-06-16")

    fun logYear(number: Int, base: Int = 10): Int {
        val baseYear = 1995
        val actualResult = log(number.toDouble(), base.toDouble()).toInt()
        if (0 <= actualResult && actualResult <= 24) {
            return baseYear + actualResult
        }
        return baseYear + actualResult.mod(24)
    }
}
package com.example.githubaction

import androidx.test.filters.SmallTest
import com.google.common.truth.Truth
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

@SmallTest
class CalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun `additional function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.addition(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(6)
    }

    @Test
    fun `API_KEY`() {
        // Given
        val x = BuildConfig.API_KEY
        val y = "123456"

        // Then
        Truth.assertThat(x).isEqualTo(y)
    }

//    @Test
//    fun `API_KEY_TEST`() {
//        // Given
//        val x = Constants.API_KEY
//        val y = "123456"
//
//        // Then
//        Truth.assertThat(x).isEqualTo(y)
//    }

    @Test
    fun `subtraction function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.subtraction(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(2)
    }

    @Test
    fun `multiplication function test`() {
        // Given
        val x = 4
        val y = 2

        // When
        val result = calculator.multiplication(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(8)
    }

    @Test
    fun `division function test`() {
        // Given
        val x = 4
        val y = 0

        // When
        val result = calculator.division(x, y)

        // Then
        Truth.assertThat(result).isEqualTo(null)
    }
}
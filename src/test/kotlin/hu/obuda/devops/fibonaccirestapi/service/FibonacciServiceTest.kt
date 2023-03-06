package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn0WhenCall0() {
        //given

        //when
        val result: Int = underTest.fibonacci(0)

        //then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn55WhenCall10(){
        //given

        //when
        val result: Int = underTest.fibonacci(10)

        //then
        Assertions.assertEquals(55, result)
    }

    @Test
    fun shouldReturnErrorWhenCall48(){
        //given

        //when
        val result: Int = underTest.fibonacci(48)

        //then
        Assertions.assertEquals(400,result)
    }

    @Test
    fun shouldReturnXWhenCall46(){
        //give

        //when
        val result: Int = underTest.fibonacci(46)

        //then
        Assertions.assertEquals(1836311903, result)
    }

    // TODO - Test with greater numbers and test edge cases
}
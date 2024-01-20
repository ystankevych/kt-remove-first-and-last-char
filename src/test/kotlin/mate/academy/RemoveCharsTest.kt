package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveCharsTest {

    @Test
    fun removeChars_RegularString_RemovedFirstAndLast() {
        // given
        val input = "Hello, World!"

        // when
        val result = removeChars(input)

        // then
        assertEquals("ello, World", result)
    }

    @Test
    fun removeChars_SingleWord_RemovedFirstAndLast() {
        // given
        val input = "Kotlin"

        // when
        val result = removeChars(input)

        // then
        assertEquals("otli", result)
    }

    @Test
    fun removeChars_StringWithSpaces_RemovedFirstAndLast() {
        // given
        val input = " Unit Testing "

        // when
        val result = removeChars(input)

        // then
        assertEquals("Unit Testing", result)
    }


    @Test
    fun removeChars_TwoCharacters_ReturnsEmpty() {
        // given
        val input = "Hi"

        // when
        val result = removeChars(input)

        // then
        assertEquals("", result)
    }
}

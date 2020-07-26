import org.junit.Test
import org.junit.jupiter.api.assertThrows

/**
Word wrapper
You write a class called Wrapper, that has a single static function named wrap that takes two arguments,
a string, and a column number. The function returns the string, but with line breaks inserted at just the
right places to make sure that no line is longer than the column number. You try to break lines at word boundaries.

Like a word processor, break the line by replacing the last space in a line with a newline.
 **/

/**
 *   "", any number -> rise error
 *   " ", any number -> rise error
 *   "hello, world!", 10 -> "hello, world!"
 *   "hello, world!", 5 -> "hello,\nworld!"
 *   "Like a word processor, break the line by replacing the last space in a line with a newline.", 25 ->
 *      "Like a word processor, break\nthe line by replacing the\nlast space in a line with\na newline."
 */

class WorkWrapperTest {

    @Test
    fun test0() {
        assertThrows<IllegalArgumentException>() { Wrapper.wrap("", 42) }
    }
}

class Wrapper {
    companion object {
        fun wrap(text: String, column: Int): String {
            if (text.isEmpty()) throw IllegalArgumentException()
            else {
                return ""
            }
        }
    }
}
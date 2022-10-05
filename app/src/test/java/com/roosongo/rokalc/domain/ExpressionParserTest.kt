package com.roosongo.rokalc.domain


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ExpressionParserTest {
    private lateinit var parser: ExpressionParser

    @Test
    fun `Simple expression is properly parse`() {
        // 1.Given
        parser = ExpressionParser("3+5-3x4/3")

        // 2.
        val actual = parser.parse()

        val expected = listOf<ExpressionPart>(
            ExpressionPart.Number(3.0),
            ExpressionPart.Op(Operation.ADD),
            ExpressionPart.Number(5.0),
            ExpressionPart.Op(Operation.SUBTRACT),
            ExpressionPart.Number(3.0),
            ExpressionPart.Op(Operation.MULTIPLY),
            ExpressionPart.Number(4.0),
            ExpressionPart.Op(Operation.DIVIDE),
            ExpressionPart.Number(3.0)
        )

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Expression with parentheses are properly parsed`() {
        parser = ExpressionParser("4-(4x5)")

        val actual = parser.parse()

        val expected = listOf<ExpressionPart>(
            ExpressionPart.Number(4.0),
            ExpressionPart.Op(Operation.SUBTRACT),
            ExpressionPart.Parentheses(ParenthesesType.Opening),
            ExpressionPart.Number(4.0),
            ExpressionPart.Op(Operation.MULTIPLY),
            ExpressionPart.Number(5.0),
            ExpressionPart.Parentheses(ParenthesesType.Closing)
        )

        assertThat(actual).isEqualTo(expected)
    }
}
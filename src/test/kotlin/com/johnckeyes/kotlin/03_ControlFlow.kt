@file:Suppress("ConstantConditionIf")

package com.johnckeyes.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ControlFlow {

    /**
     * Conditional expression (in this case an if) return a value. This means that they
     * can be used to assign variables
     */
    @Test
    fun `conditional assignment`() {
        val itIsTrue = true
        val goesWithMac = if (itIsTrue) "cheese" else "not cheese"

        assertThat(goesWithMac).isEqualTo("cheese")
    }




    /**
     * Conditional assignments can be as complex as traditional if statements
     */
    @Test
    fun `complex conditional assignment`() {
        val itIsTrue = true
        val itIsFalse = false
        val whatsForDinner = if (itIsFalse) {
            "some food"
        } else if (itIsFalse || itIsTrue) {
            "all the food"
        } else {
            "no food"
        }

        assertThat(whatsForDinner).isEqualTo("all the food")
    }




    /**
     * When expressions are similar to switch statements in other languages
     * Similar to ifs, whens can be used in assignments
     */
    @Test
    fun `when assignment`() {
        val num = 5
        val factAboutTacos = when (num) {
            1 -> "they are pointless"
            2 -> "they are inedible"
            else -> {
                val yodaSpeak = "magic they are"
                val words = yodaSpeak.split(" ")
                "${words[1]} ${words[2]} ${words[0]}"
            }
        }

        assertThat(factAboutTacos).isEqualTo("they are magic")
    }
}
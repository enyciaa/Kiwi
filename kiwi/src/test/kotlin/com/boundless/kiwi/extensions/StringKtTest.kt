package com.boundless.kiwi.extensions

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringKtTest {

  @Test
  fun givenInvalidHexidecimal_whenCheck_returnFalse() {
    val invalidHexidecimal = "az"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    assertFalse(isValid)
  }

  @Test
  fun givenValidHexidecimal_whenCheck_returnTrue() {
    val invalidHexidecimal = "af"

    val isValid = invalidHexidecimal.isValidHexidecimal()

    assertTrue(isValid)
  }
}
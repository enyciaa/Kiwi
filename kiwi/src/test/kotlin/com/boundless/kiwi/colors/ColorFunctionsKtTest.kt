package com.boundless.kiwi.colors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ColorFunctionsKtTest {

  @Test
  fun givenInvalidHex_whenCheck_thenReturnFalse() {
    val hex = "#030acz"

    val isValid = isValidHexColor(hex)

    assertTrue(isValid)
  }

  @Test
  fun givenValidHex_whenCheck_thenReturnTrue() {
    val hex = "#ffffff"

    val isValid = isValidHexColor(hex)

    assertTrue(isValid)
  }

  @Test
  fun givenInvalidRgb_whenCheck_thenReturnFalse() {
    val isValid = isValidRgb(0, 256, 200)

    assertFalse(isValid)
  }

  @Test
  fun givenValidRgb_whenCheck_thenReturnTrue() {
    val isValid = isValidRgb(0, 0, 0)

    assertTrue(isValid)
  }

  @Test
  fun givenWhite_whenCalculateBrightness_returnMaxBrightnes() {
    val returnedValue = calculateColorBrightness(255, 255, 255)

    assertEquals(returnedValue, 1.0)
  }

  @Test
  fun givenBlack_whenCalculateBrightness_returnMinBrightnes() {
    val returnedValue = calculateColorBrightness(0, 0, 0)

    assertEquals(returnedValue, 0.0)
  }

  @Test
  fun givenHexValue_whenConvertToRgb_thenReturnCorrectRgb() {
    val hex = HexColor.create("f", "ff", "ff")

    val rgb = convertHexToRgb(hex)

    assertEquals(rgb.red, 255)
    assertEquals(rgb.green, 255)
    assertEquals(rgb.blue, 255)
  }
}

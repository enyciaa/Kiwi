package com.boundless.kiwi.animation

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AnimationHelpersKtTest {

  @Test
  fun givenStartAngleAndDirection_whenCalculateNewCoordinate_thenCalculateCorrectly() {
    val startCoordinate = Coordinate(0.0, 0.0)

    val newCoordinate = calculateNewCoordinate(startCoordinate, 0.2,  10.0)

    assertEquals(newCoordinate, Coordinate(9.800665778412416, 1.9866933079506122))
  }

  @Test
  fun givenDegrees_whenReverseDirection_thenResultCorrect() {
    val newDirection = reverseDirectionWithDegrees(360.0)

    assertEquals(newDirection, 180.0)
  }

  @Test
  fun givenInvalidDegrees_whenReverseDirection_thenException() {
    assertFailsWith(RuntimeException::class) {
      reverseDirectionWithDegrees(580.0)
    }
  }
}


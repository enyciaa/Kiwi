package com.boundless.kiwi.animation

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RectangleTest {

  @Test
  fun givenCenterWidthAndHeight_whenCreated_thenBoundsCorrect() {
    val result = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    assertEquals(result.left, 9.0)
    assertEquals(result.top, 9.0)
    assertEquals(result.right, 11.0)
    assertEquals(result.bottom, 11.0)
  }

  @Test
  fun givenCoordinateInBounds_whenCheck_thenTrue() {
    val rectangle = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    val result = rectangle.isInBounds(Coordinate(10.0, 10.0))

    assertTrue(result)
  }

  @Test
  fun givenCoordinateNotInBounds_whenCheck_thenFalse() {
    val rectangle = Rectangle(2.0, 2.0, Coordinate(10.0, 10.0))

    val result = rectangle.isInBounds(Coordinate(20.0, 10.0))

    assertFalse(result)
  }
}
package com.boundless.kiwi.animation

import kotlin.math.cos
import kotlin.math.sin

fun calculateNewCoordinate(
    startCoordinate: Coordinate,
    angleOfMovementInRadians: Double,
    distance: Double
): Coordinate {
  return Coordinate(
      x = startCoordinate.x + (distance * cos(angleOfMovementInRadians)),
      y = startCoordinate.y + (distance * sin(angleOfMovementInRadians))
  )
}

fun reverseDirectionWithDegrees(degrees: Double): Double {
  if (degrees < 0.0 || degrees > 360.0)
    throw RuntimeException("Degrees invalid. Received $degrees but must be in range 0-360")

  return if (degrees > 180)
    degrees - 180
  else
    degrees + 180
}
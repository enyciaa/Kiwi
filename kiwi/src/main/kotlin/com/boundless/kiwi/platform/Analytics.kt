package com.boundless.kiwi.platform

interface Analytics {

  fun event(tag: String)

  fun event(tag: String, property: String, propertyValue: String)

  fun event(tag: String, property: String, propertyValue: String, propertyTwo: String, propertyTwoValue: String)

  fun purchase(price: Double, currencyShortCode: String, itemName: String)

  fun exception(exception: Exception)

}

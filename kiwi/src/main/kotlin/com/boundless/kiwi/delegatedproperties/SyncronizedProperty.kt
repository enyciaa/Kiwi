package com.boundless.kiwi.delegatedproperties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class SynchronizedProperty<T>(defaultValue: T?): ReadWriteProperty<Any, T?> {
  private var backingField = defaultValue

  override fun getValue(thisRef: Any, property: KProperty<*>): T? {
    return synchronized(this) {
      backingField
    }
  }

  override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
    synchronized(this) {
      backingField = value
    }
  }
}

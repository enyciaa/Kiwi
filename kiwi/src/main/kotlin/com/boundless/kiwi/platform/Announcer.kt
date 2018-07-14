package com.boundless.kiwi.platform

interface Announcer {

  fun announce(text: String)

  fun announceLong(text: String)

  fun cancelAnnouncement()
}
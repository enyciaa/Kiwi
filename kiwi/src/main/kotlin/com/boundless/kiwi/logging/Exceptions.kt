package com.boundless.kiwi.logging

abstract class MotherException(
    override val message: String
) : Exception()

class EmptyListException() : MotherException("List is empty")

class NonFatalException() : MotherException("Non-fatal: exception is for information only")

class NoTrackerInitilisedExeption() : MotherException("No initialised trackers exist")
package com.muniz.android.compose.devpack.extensions

import junit.framework.TestCase.assertEquals
import org.junit.Test

enum class Status {
    ACTIVE, INACTIVE, PENDING
}

class StringExtTest {

    @Test
    fun `should return correct enum value when string matches exactly`() {
        assertEquals(Status.ACTIVE, "ACTIVE".toEnumOrDefault(Status.INACTIVE))
        assertEquals(Status.INACTIVE, "INACTIVE".toEnumOrDefault(Status.ACTIVE))
    }

    @Test
    fun `should return correct enum value when string matches ignoring case`() {
        assertEquals(Status.ACTIVE, "active".toEnumOrDefault(Status.INACTIVE))
        assertEquals(Status.PENDING, "Pending".toEnumOrDefault(Status.ACTIVE))
    }

    @Test
    fun `should return default value when string does not match any enum`() {
        assertEquals(Status.PENDING, "UNKNOWN".toEnumOrDefault(Status.PENDING))
        assertEquals(Status.ACTIVE, "".toEnumOrDefault(Status.ACTIVE))
    }
}
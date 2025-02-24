package com.muniz.android.compose.devpack.extensions

inline fun <reified T : Enum<T>> String.toEnumOrDefault(default: T): T {
    return enumValues<T>().find { it.name.equals(this, ignoreCase = true) } ?: default
}
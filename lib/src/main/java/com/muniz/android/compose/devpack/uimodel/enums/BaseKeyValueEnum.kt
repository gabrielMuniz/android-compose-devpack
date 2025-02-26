package com.muniz.android.compose.devpack.uimodel.enums

import androidx.annotation.StringRes

data class BaseKeyValueEnum<T : Enum<T>>(
    val key: String,
    @StringRes val valueResId: Int
)
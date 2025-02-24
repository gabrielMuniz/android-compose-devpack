package com.muniz.android.compose.devpack.uimodel.enums

import android.support.annotation.StringRes

data class BaseKeyValueEnum<T : Enum<T>>(
    val key: String,
    @StringRes val valueResId: Int
)
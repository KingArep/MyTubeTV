package com.zee.mytubetv.utils

import android.content.Context

fun readRaw(context: Context, resId: Int): String {
    return context.resources.openRawResource(resId)
        .bufferedReader().use { it.readText() }
}
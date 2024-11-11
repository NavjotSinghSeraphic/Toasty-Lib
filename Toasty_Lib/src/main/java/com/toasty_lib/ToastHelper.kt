package com.toasty_lib

import android.content.Context
import android.widget.Toast

object ToastHelper {

    // Method to show a short-duration toast message
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    // Method to show a long-duration toast message
    fun showLongToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}

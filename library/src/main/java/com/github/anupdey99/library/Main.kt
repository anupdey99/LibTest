package com.github.anupdey99.library

import android.content.Context
import android.widget.Toast

class Main {

    fun showToast(context: Context) {
        Toast.makeText(context, "This toast is form library!", Toast.LENGTH_SHORT).show()
    }

}
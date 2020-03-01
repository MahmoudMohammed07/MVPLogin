package com.android.mvplogin.model

import android.text.TextUtils
import android.util.Patterns

class UserImpl(override val email: String, override val password: String) : User {
    override val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(email) &&
                Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                password.length >= 6)
}
package com.android.mvplogin.model

interface User {
    val email : String
    val password : String
    val isDataValid : Boolean
}
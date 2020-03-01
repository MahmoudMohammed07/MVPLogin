package com.android.mvplogin.presenter

import com.android.mvplogin.model.UserImpl
import com.android.mvplogin.view.LoginView

class LoginPresenterImpl(private var loginView: LoginView) : LoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = UserImpl(email, password)
        val isLoginSuccess = user.isDataValid
        if (isLoginSuccess)
            loginView.onLoginResult("Login Succeed")
        else
            loginView.onLoginResult("Login Failed")
    }
}
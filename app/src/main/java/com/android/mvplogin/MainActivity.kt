package com.android.mvplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.mvplogin.presenter.LoginPresenter
import com.android.mvplogin.presenter.LoginPresenterImpl
import com.android.mvplogin.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginView {

    private lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenterImpl(this)

        btn_login.setOnClickListener {
            loginPresenter.onLogin(
                et_email.text.toString().trim(),
                et_password.text.toString().trim()
            )

        }
    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

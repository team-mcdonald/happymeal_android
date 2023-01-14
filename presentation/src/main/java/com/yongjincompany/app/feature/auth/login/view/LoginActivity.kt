package com.yongjincompany.app.feature.auth.login.view

import android.content.Intent
import android.os.Bundle
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityLoginBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.util.BaseActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(
    R.layout.activity_login
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun initView() {
        super.initView()

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
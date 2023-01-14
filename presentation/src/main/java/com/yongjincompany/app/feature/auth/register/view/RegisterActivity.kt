package com.yongjincompany.app.feature.auth.register.view

import android.os.Bundle
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityRegisterBinding
import com.yongjincompany.app.util.BaseActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(
    R.layout.activity_register
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun initView() {
        super.initView()

        binding.ibBack.setOnClickListener {
            finish()
        }

        binding.btnContinue.setOnClickListener {

        }
    }
}
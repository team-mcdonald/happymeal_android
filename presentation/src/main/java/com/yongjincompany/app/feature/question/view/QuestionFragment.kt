package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentQuestionBinding
import com.yongjincompany.app.feature.MainActivity
import com.yongjincompany.app.feature.article.view.FreeArticleFragment
import com.yongjincompany.app.feature.article.view.PremiumArticleFragment
import com.yongjincompany.app.util.BaseFragment

class QuestionFragment : BaseFragment<FragmentQuestionBinding>(
    R.layout.fragment_question
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun initView() {
        super.initView()
        val mainActivity = activity as MainActivity

        mainActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.questionContainer, ETCFragment())
            .commit()

        binding.btnSocialLife.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, SocialLifeFragment())
                .commit()
        }

        binding.btnFinance.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, FinanceFragment())
                .commit()
        }

        binding.btnEtc.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, ETCFragment())
                .commit()
        }

        binding.btnLaw.setOnClickListener {
            mainActivity.supportFragmentManager.beginTransaction()
                .replace(R.id.questionContainer, LawFragment())
                .commit()
        }
    }
}
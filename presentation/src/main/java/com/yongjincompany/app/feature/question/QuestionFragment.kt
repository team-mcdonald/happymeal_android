package com.yongjincompany.app.feature.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentQuestionBinding
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
}
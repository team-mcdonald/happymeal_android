package com.yongjincompany.app.feature.question.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentFinanceBinding
import com.yongjincompany.app.util.BaseFragment

class FinanceFragment : BaseFragment<FragmentFinanceBinding>(
    R.layout.fragment_finance
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
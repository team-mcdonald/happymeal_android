package com.yongjincompany.app.feature.article.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentPremiumArticleBinding
import com.yongjincompany.app.util.BaseFragment

class PremiumArticleFragment : BaseFragment<FragmentPremiumArticleBinding>(
    R.layout.fragment_premium_article
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
package com.yongjincompany.app.feature.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentArticleBinding
import com.yongjincompany.app.util.BaseFragment

class ArticleFragment : BaseFragment<FragmentArticleBinding>(
    R.layout.fragment_article
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
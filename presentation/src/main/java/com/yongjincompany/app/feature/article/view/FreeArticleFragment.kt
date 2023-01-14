package com.yongjincompany.app.feature.article.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.FragmentFreeArticleBinding
import com.yongjincompany.app.util.BaseFragment

class FreeArticleFragment : BaseFragment<FragmentFreeArticleBinding>(
    R.layout.fragment_free_article
) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
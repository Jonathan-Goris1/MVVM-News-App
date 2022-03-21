package com.androiddevs.mvvmnewsapp.ui.models

import com.androiddevs.mvvmnewsapp.ui.models.Article

data class NewsReponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
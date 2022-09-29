package com.example.made2.di

import com.example.made2.core.domain.usecase.AnimeInteractor
import com.example.made2.core.domain.usecase.AnimeUseCase
import com.example.made2.detail.DetailViewModel
import com.example.made2.discover.DiscoverViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<AnimeUseCase> { AnimeInteractor(get()) }
}

val viewModelModule = module {
    viewModel { DiscoverViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}
package com.example.testdragger2.dagger_android.di

import com.example.testdragger2.dagger_android.fragment.FourFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeFourFragment():FourFragment
}
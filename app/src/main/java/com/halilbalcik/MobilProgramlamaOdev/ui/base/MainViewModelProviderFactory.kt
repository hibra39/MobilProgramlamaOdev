package com.halilbalcik.MobilProgramlamaOdev.ui.base

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.halilbalcik.MobilProgramlamaOdev.data.repository.MainRepository
import com.halilbalcik.MobilProgramlamaOdev.ui.vm.MainViewModel

class MainViewModelProviderFactory(val app: Application,
                                   private val mainRepository: MainRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(app, mainRepository) as T
    }
}
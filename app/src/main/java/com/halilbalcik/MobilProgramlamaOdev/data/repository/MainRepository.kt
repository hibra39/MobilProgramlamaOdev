package com.halilbalcik.MobilProgramlamaOdev.data.repository

import com.halilbalcik.MobilProgramlamaOdev.data.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}
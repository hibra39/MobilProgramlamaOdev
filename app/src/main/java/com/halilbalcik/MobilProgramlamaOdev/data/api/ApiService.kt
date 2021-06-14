package com.halilbalcik.MobilProgramlamaOdev.data.api

import com.halilbalcik.MobilProgramlamaOdev.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}
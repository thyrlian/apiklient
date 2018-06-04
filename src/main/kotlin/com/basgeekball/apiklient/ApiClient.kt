package com.basgeekball.apiklient

import com.basgeekball.apiklient.misc.Constants
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

class ApiClient {
    init {
        FuelManager.instance.basePath = Constants.BASE_URL
    }

    fun get() {
        "/get".httpGet().responseString { request, response, result ->
            when (result) {
                is Result.Failure -> {
                    val ex = result.getException()
                }
                is Result.Success -> {
                    val data = result.get()
                }
            }
        }
    }
}
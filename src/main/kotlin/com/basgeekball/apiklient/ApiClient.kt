package com.basgeekball.apiklient

import com.basgeekball.apiklient.misc.Constants
import org.http4k.client.ApacheAsyncClient
import org.http4k.core.Method
import org.http4k.core.Request
import kotlin.concurrent.thread

class ApiClient {
    val asyncClient = ApacheAsyncClient()

    fun get() {
        asyncClient(Request(Method.GET, Constants.BASE_URL + "/get")) {
            println(it.status)
            println(it.bodyString())
        }
    }

    fun getMore() {
        asyncClient(Request(Method.GET, Constants.BASE_URL + "/get").query("keyboard", "HHKB")) {
            println(it.status)
            println(it.bodyString())
        }
    }

    fun close() {
        thread {
            Thread.sleep(1000)
            asyncClient.close()
        }
    }
}
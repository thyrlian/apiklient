package com.basgeekball.apiklient

fun main(args: Array<String>) {
    val apiClient = ApiClient()
    apiClient.get()
    apiClient.getMore()
    apiClient.close()
}
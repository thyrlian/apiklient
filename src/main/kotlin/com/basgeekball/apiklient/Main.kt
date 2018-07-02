package com.basgeekball.apiklient

fun main(args: Array<String>) {
    println("==================================================")
    val apiClient = ApiClient()
    apiClient.get()
    println("==================================================")
    Thread.sleep(1000L)
}
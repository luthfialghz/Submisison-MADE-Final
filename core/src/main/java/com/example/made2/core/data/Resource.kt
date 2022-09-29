package com.example.made2.core.data

sealed class Resource<T>(val data: T?  = null, val message: String? = null) {
    class Success<T>(data: T?): com.example.made2.core.data.Resource<T>(data)
    class Error<T>(message: String?, data: T? = null): com.example.made2.core.data.Resource<T>(data, message)
    class Loading<T>(data: T? = null): com.example.made2.core.data.Resource<T>(data)
}
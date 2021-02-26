package com.demo.testreport

interface IContract {

    fun onLoginSuccess(str: String)
    fun onLoginFailure(error: String)
}

package com.demo.testreport

/**
 * Created by gaurav.sutar on 11/03/20
 */
interface MainContract {

    fun onLoginSuccess(str: String)
    fun onLoginFailure(error: String)
}
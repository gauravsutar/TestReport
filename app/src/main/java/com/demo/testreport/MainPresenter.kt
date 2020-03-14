package com.demo.testreport

/**
 * Created by gaurav.sutar on 11/03/20
 */
class MainPresenter(private val contract: MainContract) {

    fun login(str: String) {
        try {
            Thread.sleep(2000)
        }catch (e: InterruptedException) {
        }

        if(str == "123"){
            contract.onLoginSuccess("Login Success")
        }else{
            contract.onLoginFailure("Error")
        }
    }
}
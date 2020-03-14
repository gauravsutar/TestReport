package com.demo.testreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.URLUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), MainContract {

    lateinit var presenter: MainPresenter
    lateinit var fooPresenter: FooPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        fooPresenter = FooPresenter()
        btn1.setOnClickListener {
            presenter.login(txt1.text.toString())
        }
        val steList = ArrayList<String>()
    }

    override fun onLoginSuccess(str: String) {
        btn1.text = "Success"
        txtError.visibility = View.GONE
    }

    override fun onLoginFailure(error: String) {
        btn1.text = "retry"
        txtError.visibility = View.VISIBLE
    }
}

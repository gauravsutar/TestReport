package com.demo.testreport

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.BDDMockito.any
import org.mockito.BDDMockito.anyString
import org.mockito.BDDMockito.then
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnit

/**
 * Created by gaurav.sutar on 12/03/20
 */
class MainPresenterTest {

    private lateinit var presenter: MainPresenter

    @JvmField
    @Rule
    var mockitoRule = MockitoJUnit.rule()

    @Mock
    private lateinit var mainContract: MainContract

    @Before
    fun setup() {
        presenter = MainPresenter(mainContract)
    }

    @Test
    fun loginSuccessTest() {
        presenter.login("123")
        then(mainContract).should().onLoginSuccess(ArgumentMatchers.anyString())
    }

    @Test
    fun loginFailureTest() {
        presenter.login("1234")
        then(mainContract).should().onLoginFailure(ArgumentMatchers.anyString())
    }
}
package com.demo.testreport

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by gaurav.sutar on 11/03/20
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val mActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup(){

    }

    @Test
    fun viewVisibilityTest(){
        onView(withId(R.id.txt1)).check(matches(isDisplayed()))
        onView(withId(R.id.btn1)).check(matches(isDisplayed()))
    }

}
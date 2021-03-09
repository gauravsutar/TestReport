package com.example.aar_lib_sample_config

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.aar_lib.LibOuterActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LibOuterActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<LibOuterActivity>()

    @Test
    fun test_visibility_textview() {
        onView(withId(R.id.textView)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
    }
}

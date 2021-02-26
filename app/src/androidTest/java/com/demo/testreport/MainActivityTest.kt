package com.demo.testreport

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    private lateinit var uiDevice: UiDevice

    @Before
    fun setup() {
        uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    }

    @Test
    fun test_changeText_sameActivity() {
        onView(withId(R.id.edtInput))
            .perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard())
        onView(withId(R.id.btnChangeText)).perform(click())

        onView(withId(R.id.txtToBeChanged)).check(matches(withText(STRING_TO_BE_TYPED)))
    }

    @Test
    fun test_changeText_newActivity() {
        onView(withId(R.id.edtInput)).perform(typeText(STRING_TO_BE_TYPED),
            closeSoftKeyboard())
        onView(withId(R.id.btnChangeActivity)).perform(click())

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.txtMessage)).check(matches(withText(STRING_TO_BE_TYPED)))
    }

    companion object {
        const val STRING_TO_BE_TYPED = "Test"
    }
}

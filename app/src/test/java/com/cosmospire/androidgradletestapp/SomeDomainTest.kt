package com.cosmospire.androidgradletestapp

import org.junit.Assert
import org.junit.Test

import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = [26])
class SomeDomainTest {

    @Test
    fun test() {
        Assert.assertEquals(
                "test",
                "test"
        )
    }

    @Test
    fun getAppName() {
        Assert.assertEquals(
                "AndroidGradleTestApp",
                SomeDomain().appName
        )
    }

    @Test
    fun isLotsOfNumberTrue() {
        Assert.assertEquals(
                true,
                SomeDomain(100).isLotsOfNumber
        )
    }

    @Test
    fun isLotsOfNumberFalse() {
        Assert.assertEquals(
                false,
                SomeDomain(99).isLotsOfNumber
        )
    }
}
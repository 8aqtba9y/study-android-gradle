package com.cosmospire.androidgradletestapp

class SomeDomain(
        number: Int = 0
) {
    val appName: String = getAppContext().resources.getString(R.string.app_name)
    val isLotsOfNumber: Boolean = number >= getAppContext().resources.getInteger(R.integer.threshold)
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false

    // REQUIRED: Tells the project where to find the Firebase services plugin
    id("com.google.gms.google-services") version "4.4.0" apply false
}
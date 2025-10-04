plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.AdeebTechLab.IUBportals"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.AdeebTechLab.IUBportals"
        minSdk = 23
        targetSdk = 36
        versionCode = 56
        versionName = "5.6"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }


    ndkVersion = "29.0.14033849" // e.g.,  ndkVersion "21.3.6528147"
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("com.google.firebase:firebase-messaging-ktx:24.1.2")
    implementation("com.google.firebase:firebase-auth-ktx:23.2.1")
    implementation("androidx.activity:activity:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
    //noinspection Aligned16KB
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.29")
    implementation("com.onesignal:OneSignal:5.1.37")


    implementation ("com.github.SanojPunchihewa:GlowButton:1.0.1")
    implementation(kotlin("script-runtime"))

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:34.3.0"))

    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")


    //noinspection NewerVersionAvailable,GradleDependency
    implementation("com.onesignal:OneSignal:[5.0.0, 5.99.99]")


}
plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.AdeebTechLab.IUBportals"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.AdeebTechLab.IUBportals"
        minSdk = 23
        targetSdk = 34
        versionCode = 51
        versionName = "5.1"

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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.google.firebase:firebase-messaging-ktx:24.0.3")
    implementation("com.google.firebase:firebase-auth-ktx:23.1.0")
    implementation("androidx.activity:activity:1.9.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.28")
    implementation("com.onesignal:OneSignal:5.1.23")


    implementation ("com.github.SanojPunchihewa:GlowButton:1.0.1")
    implementation(kotlin("script-runtime"))

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.5.1"))

    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")


    //noinspection GradleDependency
    implementation("com.onesignal:OneSignal:[5.0.0, 5.99.99]")


}
kt_android_library(
    packageName = "com.stepango.mylibrary",
    dependencies = dependencies(
        "org.jetbrains.kotlin:kotlin-stdlib:1.4.0",
        "androidx.core:core-ktx:1.3.1",
        "androidx.appcompat:appcompat:1.1.0",
        "com.google.android.material:material:1.1.0"
    ),
    testDependencies = dependencies("junit:junit:4.12")
)

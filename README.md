# android-practice


app-build.gradle

``` gradle

apply plugin: 'com.android.application'

android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "top.hting.ui"
        minSdkVersion 15
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"

        // 
        javaCompileOptions {
            annotationProcessorOptions {
                includeCompileClasspath true
            }
        }
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    // 编译版本
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'androidx.appcompat:appcompat:1.0.0-beta01'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.2'
    implementation 'androidx.recyclerview:recyclerview:1.0.0' // recyclerview依赖
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test:runner:1.1.0-alpha4'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.0-alpha4'

    compileOnly "org.projectlombok:lombok:1.16.10" // lombok依赖
    annotationProcessor "org.projectlombok:lombok:1.16.10"
    implementation "javax.annotation:javax.annotation-api:1.3.2"
}


工程的build.gradle 配置 仓库

maven { url "http://maven.aliyun.com/nexus/content/groups/public/" }

```
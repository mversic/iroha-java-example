plugins {
    kotlin("jvm") version "1.8.22"
    application
}

group = "jp.co.soramitsu"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    val iroha2Ver by System.getProperties()

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.0")

    api("com.github.hyperledger.iroha-java:admin-client:2660278a")
    implementation("com.github.hyperledger.iroha-java:model:2660278a")
    implementation("com.github.hyperledger.iroha-java:block:2660278a")

    implementation("net.i2p.crypto:eddsa:0.3.0")
    implementation("org.bouncycastle:bcprov-jdk15on:1.65")
    implementation("com.github.multiformats:java-multihash:1.3.0")

    testImplementation(kotlin("test"))
}

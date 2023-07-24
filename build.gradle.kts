plugins {
    java
    scala
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
}

application {
    mainClass.set("Run")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}


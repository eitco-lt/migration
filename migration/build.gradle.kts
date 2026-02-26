plugins {
    kotlin("jvm") version "2.3.0"
    application
}

kotlin {
    jvmToolchain(21)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.5.12")
}

application {
    mainClass = "eitco.datamigration.MigrationToolKt"
}
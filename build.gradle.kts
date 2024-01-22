plugins {
    id ("java")
}

group "ru.netology"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("io.rest-assured:rest-assured:5.3.1")
    testImplementation ("io.rest-assured:json-schema-validator:4.3.1")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}
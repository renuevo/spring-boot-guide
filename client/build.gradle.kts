import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true

val springCloudVersion = "2021.0.1"
val openfeignVersion = "3.1.0"
val resilience4jVersion = "1.7.0"

configure<DependencyManagementExtension> {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion")
    }
}

dependencies {
    implementation(project(":common"))

    implementation("io.github.resilience4j:resilience4j-micrometer:$resilience4jVersion")
    implementation("io.github.resilience4j:resilience4j-spring-boot2:$resilience4jVersion")

    api("org.springframework.boot:spring-boot-starter-aop")
    api("org.springframework.cloud:spring-cloud-starter-openfeign:$openfeignVersion")
    api("org.springframework.cloud:spring-cloud-starter-netflix-hystrix:2.2.10.RELEASE")
}

import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

val springCloudVersion = "Hoxton.SR10"
val openfeignVersion = "2.2.7.RELEASE"
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
}

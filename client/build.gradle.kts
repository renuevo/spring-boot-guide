import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

configure<DependencyManagementExtension> {
    imports {
        mavenBom(Dependencies.springCloud)
    }
}

dependencies {

    implementation(Dependencies.resilience4jMicrometer)
    implementation(Dependencies.resilience4jSpringBoot)

    api(Dependencies.springBootAop)
    api(Dependencies.springCloudOpenFeign)
}
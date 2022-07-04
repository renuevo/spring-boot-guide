import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = true
jar.enabled = false

dependencies {
    implementation(project(Projects.domain))
    implementation(project(Projects.client))
    implementation(project(Projects.appCommonApi))
    implementation(project(Projects.postgresInfrastructure))
}

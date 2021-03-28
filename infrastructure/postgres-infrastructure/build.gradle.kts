
val querydslVersion = "4.4.0"
val annotationApiVersion = "1.3.2"


dependencies {
    implementation("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("javax.annotation:javax.annotation-api:$annotationApiVersion")
    annotationProcessor("javax.annotation:javax.annotation-api:$annotationApiVersion")

    implementation("com.querydsl:querydsl-jpa:$querydslVersion")
    annotationProcessor("com.querydsl:querydsl-apt:$querydslVersion:jpa")
    testImplementation("com.querydsl:querydsl-jpa:$querydslVersion")
    testAnnotationProcessor("com.querydsl:querydsl-apt:$querydslVersion:jpa")
}
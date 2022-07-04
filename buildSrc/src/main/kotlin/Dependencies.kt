import java.lang.Runtime.Version

object Dependencies {

  val springBootWeb by lazy { "org.springframework.boot:spring-boot-starter-web" }
  val springBootJpa by lazy { "org.springframework.boot:spring-boot-starter-data-jpa" }

  val kotlinReflect by lazy { "org.jetbrains.kotlin:kotlin-reflect" }
  val kotlinStdlibJdk8 by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk8" }

  val jacksonModule by lazy { "com.fasterxml.jackson.module:jackson-module-kotlin" }

  val h2 by lazy {"com.h2database:h2"}
  val postgres by lazy {"org.postgresql:postgresql"}
  val queryDslJpa by lazy {"com.querydsl:querydsl-jpa:${Versions.querydslVersion}"}
  val queryDslApt by lazy {"com.querydsl:querydsl-apt:${Versions.querydslVersion}:jpa"}

}


object TestDependencies {

  val springBootTest by lazy { "org.springframework.boot:spring-boot-starter-test" }
  val kotestSpring by lazy { "" }
  val mockk by lazy { "" }


}

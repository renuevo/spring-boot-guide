package com.github.renuevo

import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class ProfileTest {

    private val log = LoggerFactory.getLogger(ProfileTest::class.java)

    @Autowired
    private lateinit var environment : Environment

    @Test
    fun activeProfileTest() {
        log.info("spring.profile.active :  ${environment.getProperty("spring.profiles.active")}")
        log.info("spring.profile : ${environment.getProperty("spring.profiles")}")
        log.info("activeProfile method : ${environment.activeProfiles.joinToString()}")
    }


}
package com.meetokra.springboot.controller

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.mock.web.MockServletContext
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mock.web.MockHttpSession


@RunWith(SpringRunner::class)
@WebAppConfiguration
@SpringBootTest(classes = [MockServletContext::class])
class HelloWorldControllerTest {
    @Autowired
    private lateinit var wac: WebApplicationContext
    private lateinit var mockMvc: MockMvc
    private lateinit var session: MockHttpSession

    @Before
    fun setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build()
        session = MockHttpSession()
    }

    @Test
    fun index() {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON).session(session)
        ).andExpect {
            MockMvcResultMatchers.status().isOk
        }.andDo {
            MockMvcResultHandlers.print()
        }.andReturn()
    }
}
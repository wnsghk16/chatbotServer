package com.chatbot.web.passenger;

import org.junit.jupiter.api.Test;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PassengerController.class) @Slf4j
class PassengerControllerTest {

    @Autowired MockMvc mvc;
    @MockBean private PassengerService service;

    @Test
    void findBySurvived()  throws Exception{
        Passenger passenger = Passenger.builder()
                .name("홍길동") .name("갓대희") .build(); //given given(testService.selectOneMember("goddaehee")) .willReturn(testVo); //when final ResultActions actions = mvc.perform(get("/testValue2") .contentType(MediaType.APPLICATION_JSON)) .andDo(print()); //then actions .andExpect(status().isOk()) .andExpect(content().contentType(MediaType.APPLICATION_JSON)) .andExpect(jsonPath("$.name", is("갓대희"))) .andDo(print());
    }

    @Test
    void findById()  throws Exception{
    }
}

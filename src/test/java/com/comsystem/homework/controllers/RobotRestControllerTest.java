package com.comsystem.homework.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RobotRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void excavateStones_whenNumberOfDays_is_0_return_ResponseEntity_RobotPlan() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/excavation")
						.param("numberOfDays", "0"))
				.andExpect(status().isCreated());
	}
	
	@Test
	void excavateStones_whenNumberOfDays_is_5_return_ResponseEntity_RobotPlan() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/excavation")
						.param("numberOfDays", "5"))
				.andExpect(status().isCreated());
	}
	
	@Test
	void excavateStones_whenNumberOfDays_isNegativeNumber_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/excavation")
						.param("numberOfDays", "-1"))
				.andExpect(status().isBadRequest());
	}
	
	@Test
	void excavateStones_whenNumberOfDays_isNotNumber_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/excavation")
						.param("numberOfDays", "xxx"))
				.andExpect(status().isBadRequest());
	}
	
	@Test
	void excavateStones_whenNumberOfDays_isEmpty_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/excavation")
						.param("numberOfDays", ""))
				.andExpect(status().isBadRequest());
	}
	
	@Test
	void approximateDays_whenNumberOfStones_is_0_return_ResponseEntity_RobotPlan() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/approximation")
						.param("numberOfStones", "0"))
				.andExpect(status().isCreated());
	}
	
	@Test
	void approximateDays_whenNumberOfStones_is_5_return_ResponseEntity_RobotPlan() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/approximation")
						.param("numberOfStones", "5"))
				.andExpect(status().isCreated());
	}
	
	@Test
	void approximateDays_whenNumberOfStones_isNegativeNumber_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/approximation")
						.param("numberOfStones", "-1"))
				.andExpect(status().isBadRequest());
	}
	
	@Test
	void approximateDays_whenNumberOfStones_isNotNumber_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/approximation")
						.param("numberOfStones", "xxx"))
				.andExpect(status().isBadRequest());
	}
	
	@Test
	void approximateDays_whenNumberOfStones_isEmpty_return_ResponseEntity_Exception() throws Exception {
		mockMvc.perform(post("/api/v1/robot/operation/approximation")
						.param("numberOfStones", ""))
				.andExpect(status().isBadRequest());
	}
}
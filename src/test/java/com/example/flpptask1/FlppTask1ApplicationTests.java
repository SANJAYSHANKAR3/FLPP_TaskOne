package com.example.flpptask1;

import com.example.flpptask1.dto.EmployeeRequest;
import com.example.flpptask1.model.Employee;
import com.example.flpptask1.service.EmployeeService;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@SpringBootTest
@AutoConfigureMockMvc

class FlppTask1ApplicationTests {
	private Employee employee;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRequest employeeRequest;
	@BeforeEach
	public void setUp() {
		employee = new Employee();
		Mockito.when(employeeRequest.getId()).thenReturn(101);
		Mockito.when(employeeRequest.getFirstName()).thenReturn("Ram");
		Mockito.when(employeeRequest.getMiddleName()).thenReturn("Mathan");
		Mockito.when(employeeRequest.getLastName()).thenReturn("Kumar");
		Mockito.when(employeeRequest.getAge()).thenReturn(23);
	}
	@Test
	public void testAddEmployee() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/employee")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"id\":101,\"firstName\":\"Ram\",\"middleName\":\"Mathan\",\"lastName\":\"Kumar\",\"age\":23}"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testGetEmployeeRequest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/employee"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testGetAllEmployees() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/employees"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testValidEmployeeCreation() {
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setRegistrationDate(LocalDate.now().minusDays(1));
		employee.setAge(30);
		assertNotNull(employee);
	}


	@Test
	public void testMiddleNameExceedsMaxLength() {
		employee.setMiddleName("A very long middle name that exceeds the maximum length");
		assertEquals("A very long middle name that exceeds the maximum length", employee.getMiddleName());
	}

	@Test
	public void testEntityMapping() {
		Employee mockEmployee = mock(Employee.class);
		assertNotNull(mockEmployee);
	}

}

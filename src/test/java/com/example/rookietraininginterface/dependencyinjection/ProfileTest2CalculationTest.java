package com.example.rookietraininginterface.dependencyinjection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("TEST2")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileTest2CalculationTest {

	@Autowired
	private CalculationService calculationService;
	
	@Test
    public void calculationServiceFromProfileTest1() {
		calculationService.calculate(2, 3);
    }
}

package com.example.rookietraininginterface.dependencyinjection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("TEST2")
@Component
public class CalculationImpl2 implements CalculationService {

	@Override
	public void calculate(int n1, int n2) {
		System.out.println("Impl2 multiply: " + (n1 * n2));
	}

}

package com.example.rookietraininginterface.dependencyinjection;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("TEST1")
@Component
public class CalculationImpl1 implements CalculationService {

	@Override
	public void calculate(int n1, int n2) {
		System.out.println("Impl1 sum: " + (n1 + n2));
	}

}

package sh.hahn.spring.demo.payroll;

import java.io.Serial;

public class EmployeeNotFoundException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 8275610360948711968L;

	public EmployeeNotFoundException(Long id) {
		super(String.format("Could not find employee %d", id));
	}
}

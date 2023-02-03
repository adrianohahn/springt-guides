package sh.hahn.spring.demo.payroll;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super(String.format("Could not find order %d", id));
    }
}

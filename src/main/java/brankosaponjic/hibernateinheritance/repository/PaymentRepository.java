package brankosaponjic.hibernateinheritance.repository;

import brankosaponjic.hibernateinheritance.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}

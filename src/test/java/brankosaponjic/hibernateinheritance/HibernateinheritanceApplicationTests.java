package brankosaponjic.hibernateinheritance;

import brankosaponjic.hibernateinheritance.entity.Check;
import brankosaponjic.hibernateinheritance.entity.CreditCard;
import brankosaponjic.hibernateinheritance.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateinheritanceApplicationTests {

    @Autowired
    PaymentRepository paymentRepository;

    @Test
    void createPayment() {
        CreditCard cc = new CreditCard();
        cc.setId(123);
        cc.setAmount(1000d);
        cc.setCardNumber("555222666");
        paymentRepository.save(cc);
    }

    @Test
    void createCheckPayment() {
        Check ch = new Check();
        ch.setId(124);
        ch.setAmount(1000d);
        ch.setCheckNumber("555222666");
        paymentRepository.save(ch);
    }

}

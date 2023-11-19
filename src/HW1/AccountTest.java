package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {
    @Test
    void testPut() {
        Account testObject = new Account(0);
        testObject.put(10);
        Assertions.assertEquals(10,testObject.getAmount());
    }

    @Test
    void testTake() {
        Account testObject = new Account(50);
        testObject.take(20);
        Assertions.assertEquals(30,testObject.getAmount());
    }
    @Test
    void testCreditAccount() {
        CreditAccount testObject = new CreditAccount(100);
        testObject.take(50);
        Assertions.assertEquals(49.5,testObject.getAmount());
    }
}
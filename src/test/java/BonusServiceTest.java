import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @Test
    //@org.junit.jupiter.api.Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @Test
    //@org.junit.jupiter.api.Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long expected = 20;
        long actual = service.calculate(2000, false);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimitTwq() {
        BonusService service = new BonusService();
        long amount = 2000;
        boolean registered = false;
        long expected = 20;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
}



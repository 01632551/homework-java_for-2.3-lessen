import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
         long amount = 1000_60;
         boolean registered = true;
         long expected = 30;

         // вызываемцелевойметод:
         long actual = service.calculate(amount, registered);

         // производимпроверку (сравниваеможидаемыйифактический):
         assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываемцелевойметод:
        long actual = service.calculate(amount, registered);

        // производимпроверку (сравниваеможидаемыйифактический):
        assertEquals(expected, actual);
    }
}
package some_other_package;

import org.junit.jupiter.api.Test;
import some_package.TheImplementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheTest {
    @Test void shouldRun() {
        TheImplementation impl = new TheImplementation();

        int result = impl.calculate();

        assertEquals(9, result);
    }
}

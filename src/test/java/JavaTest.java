import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    @Test
    void addition() {
        assertEquals(2, Run.sum(1,1));
    }

}
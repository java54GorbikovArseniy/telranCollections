package telran.util.test;

import org.junit.jupiter.api.BeforeEach;
import telran.util.LinkedHashSet;

public class LinkedHashSetTest extends SetTest {
    @Override
    @BeforeEach
    void setUp() {
        collection = new LinkedHashSet<>(); //for testing Hash Table re-creation
        super.setUp();
    }
}

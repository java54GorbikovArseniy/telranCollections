package telran.util.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.util.Collection;
import telran.util.Map;
import telran.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class AbstractMapTest {
    protected Map<Integer, Integer> map;

    @BeforeEach
    void setUp() {
        map.put(1, 10);
        map.put(3, 35);
        map.put(5, 59);
        map.put(20, 28);
    }

    @Test
    void putTest() {
        Integer actual = map.put(9, 10);
        assertEquals(10, actual);
    }

    @Test
    void getTest() {
        Integer actual = map.get(1);
        Integer actual1 = map.get(3);
        Integer actual2 = map.get(5);
        assertEquals(10, actual);
        assertEquals(35, actual1);
        assertEquals(59, actual2);
    }

    @Test
    void removeTest(){
        int sizeAfterRemove = map.entrySet().size() - 1;
        map.remove(20);
        assertEquals(map.entrySet().size(), sizeAfterRemove);
    }

    @Test
    void keySetTest(){
        Set<Integer> keySet = map.keySet();
        assertEquals(1, keySet.get(1));
        assertEquals(3, keySet.get(3));
        assertEquals(5, keySet.get(5));
        assertEquals(20, keySet.get(20));
    }

    @Test
    void entrySetTest(){
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        assertEquals(map.entrySet().size(), set.size());
    }

    @Test
    void valuesTest(){
        Collection<Integer> values = map.values();
        assertEquals(map.entrySet().size(), values.size());
    }

    @Test
    void getOrDefaultTest(){
        Integer actual = map.getOrDefault(100, 400);
        assertEquals(400, actual);
    }
}

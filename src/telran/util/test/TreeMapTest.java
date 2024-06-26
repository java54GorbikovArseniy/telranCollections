package telran.util.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class TreeMapTest extends AbstractMapTest {

    @BeforeEach
    @Override
    void setUp(){
        map = new TreeMap<>();
        super.setUp();
    }

    @Test
    void firstKeyTest(){
        assertEquals(1, ((TreeMap<Integer, Integer>)map).firstKey());
    }

    @Test
    void lastKeyTest(){
        assertEquals(20, ((TreeMap<Integer, Integer>)map).lastKey());
    }

    @Test
    void floorKeyTest(){
        assertEquals(5, ((TreeMap<Integer, Integer>)map).floorKey(6));
    }

    @Test
    void ceilingKeyTest(){assertEquals(20, ((TreeMap<Integer, Integer>)map).ceilingKey(6));}
}

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListGenTest {
    @Test
    void genTestAddAndGet() {
        LinkedListGen<String> list = new LinkedListGen<>();
        list.add("my");
        list.add("cat");
        list.add("is");
        list.add("Pelmesha");
        assertEquals("my", list.get(0));
        assertEquals("cat", list.get(1));
        assertEquals("is", list.get(2));
        assertEquals("Pelmesha", list.get(3));
    }

    @Test
    void genTestSize() {
        LinkedListGen<String> list = new LinkedListGen<>();
        assertEquals(0, list.size());
        list.add("c");
        assertEquals(1, list.size());
    }

    @Test
    void genTestGetOutOfBounds() {
        LinkedListGen<String> list = new LinkedListGen<>();
        assertNull(list.get(0));
        assertNull(list.get(-1));
        list.add("Pelmesha");
        assertNull(list.get(1));
    }
}

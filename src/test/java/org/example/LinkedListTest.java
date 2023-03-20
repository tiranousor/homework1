package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAddAndGet() {
        LinkedList list = new LinkedList();
        list.add("my");
        list.add("cat");
        list.add("is");
        list.add("Pusha");
        assertEquals("my", list.get(0));
        assertEquals("cat", list.get(1));
        assertEquals("is", list.get(2));
        assertEquals("Pusha", list.get(3));
    }

    @Test
    void testGetInvalidIndex() {
        LinkedList list = new LinkedList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        list.add("my");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void testSize() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());
        list.add("cats");
        assertEquals(1, list.size());
        list.add("is");
        assertEquals(2, list.size());
        list.add("are Pusha");
        assertEquals(3, list.size());
        list.add("and");
        assertEquals(4, list.size());
        list.add("Pelmesha");
        assertEquals(5, list.size());
        list.add("cats");
        assertEquals(6, list.size());
    }

}

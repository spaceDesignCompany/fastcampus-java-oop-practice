package com.fastcampus.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void javaSortTest() {

        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // When
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 1, 5));

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

}
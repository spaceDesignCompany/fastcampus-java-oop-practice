package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("bubbleSort")
    @Test
    void given_list_whenExecuting_ThenReturnSortedList(){

        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 1, 5));

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);

    }

}
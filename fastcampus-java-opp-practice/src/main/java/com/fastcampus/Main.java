package com.fastcampus;

import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();

        System.out.println("[resutl] " + sort.sort(Arrays.asList(args)));
    }
}
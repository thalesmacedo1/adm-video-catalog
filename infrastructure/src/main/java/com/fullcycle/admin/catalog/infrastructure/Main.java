package com.fullcycle.admin.catalog.infrastructure;

import com.fullcycle.admin.catalog.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}
package com.max.tasks.task12_to_16.entity.comparator;

import com.max.tasks.task12_to_16.entity.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPrice() - book2.getPrice();
    }
}

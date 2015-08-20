package com.example;

import io.dropwizard.views.View;

public class BookListView extends View {
    private final String book = "Goldilocks";

    protected BookListView() {
        super("/com/example/views/books.mustache");
    }

    public String getBook() {
        return this.book;
    }
}

package com.example;

import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class ClareReadResource {

    @GET
    public View bookListView() {
        return new BookListView();
    }
}

package com.crud_posts.view;

import com.crud_posts.view.option.ViewFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandlingUserInput {
    public static View getViewFromInput() {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        View view = null;
        do {
            System.out.println("Print the entity type");
            try {
                String entityType = buffReader.readLine();
                view = ViewFactory.create(entityType);
            } catch (IOException e) {

            }
        } while (view == null);
        System.out.println("Type is: " + view.getClass().getName());
        return view;
    }
}

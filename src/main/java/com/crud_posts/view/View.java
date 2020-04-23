package com.crud_posts.view;

import com.crud_posts.view.command.Command;
import com.crud_posts.view.option.CommandFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface View {
    default Command userInputForActionHandling() {
        Command action = null;
        try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Print the action type:");
                System.out.println("c for create");
                System.out.println("r for read");
                System.out.println("u for update");
                System.out.println("d for delete");
                String actionType = buffReader.readLine();
                action = CommandFactory.create(actionType);
            } while (action == null);
        } catch (IOException e) {

        }
        System.out.println("Type is: " + action.getClass().getSimpleName());
        return action;
    }
}

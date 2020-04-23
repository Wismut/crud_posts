package com.crud_posts;

import com.crud_posts.view.HandlingUserInput;
import com.crud_posts.view.View;
import com.crud_posts.view.command.Command;

public class Runner {
    public static void main(String[] args) {
        View view = HandlingUserInput.getViewFromInput();
        Command command = view.userInputForActionHandling();
        command.execute();
    }
}

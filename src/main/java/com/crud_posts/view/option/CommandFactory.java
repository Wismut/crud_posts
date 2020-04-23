package com.crud_posts.view.option;

import com.crud_posts.view.command.*;

public class CommandFactory {
    public static Command create(String command) {
        switch (command.trim().toLowerCase()) {
            case "c":
                return new CreateCommand();
            case "r":
                return new ReadCommand();
            case "u":
                return new UpdateCommand();
            case "d":
                return new DeleteCommand();
            default:
                return null;
        }
    }
}

package com.crud_posts.view.command;

import com.crud_posts.controller.Controller;

public class ReadCommand implements Command {
    Controller controller;

    public ReadCommand(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {

    }
}

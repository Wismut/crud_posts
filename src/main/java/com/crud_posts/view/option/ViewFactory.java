package com.crud_posts.view.option;

import com.crud_posts.view.PostView;
import com.crud_posts.view.RegionView;
import com.crud_posts.view.UserView;
import com.crud_posts.view.View;

public class ViewFactory {
    public static View create(String type) {
        switch (type.trim().toLowerCase()) {
            case "u":
                return new UserView();
            case "p":
                return new PostView();
            case "r":
                return new RegionView();
            default:
                return null;
        }
    }
}

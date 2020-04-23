package com.crud_posts.view.option;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidationOption {
    private HashMap<String, List<String>> optionsByFlag;

    {
        optionsByFlag = new HashMap<>();
        optionsByFlag.put("t", Arrays.asList("u", "p", "r"));
        optionsByFlag.put("a", Arrays.asList("c", "r", "u", "d"));
    }
}

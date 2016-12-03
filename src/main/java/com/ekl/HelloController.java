package com.ekl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abahmed on 3/12/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "gradle: Hello Spring Boot";
    }
}

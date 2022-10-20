package ru.shmvsky.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

}

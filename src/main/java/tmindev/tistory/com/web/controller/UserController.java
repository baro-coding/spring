package tmindev.tistory.com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String index() {
        return "First Spring boot";
    }
}
ㅂ
package com.bilgeadam.JavaSpringController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greetUser(@RequestParam String name) {
        return ResponseEntity.ok("Hello, " + name);
    }

    @GetMapping("/greeting/{name}")
    public ResponseEntity<String> greetings(@PathVariable(name= "name") String userName) {
        return ResponseEntity.ok("Greetings, " + userName);
    }
}

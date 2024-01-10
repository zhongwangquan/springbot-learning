package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping( "/hello")
    public String index() {
        return "Hello World!";
    }
    @RequestMapping( "/good")
    public String good(@RequestParam(value="name", defaultValue = "World") String name) {
        return "good12234: " + name + "!";
    }

    @PostMapping("/postDemo")
    public MyData handlePostRequest(@RequestBody MyData myData) {
        return myData;
        // ... 在这里处理请求数据 ...
    }
}

package com.mcelep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World " + readEnvironmentVariable() + " !";
    }

    private String readEnvironmentVariable(){
        String result = System.getenv("HELLO_WORLD_MSG");
        return result==null?"":result;
    }
}

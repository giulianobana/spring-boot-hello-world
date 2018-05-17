package com.mcelep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XTL on 8/14/2014.
 */
@RestController
public class HelloRestController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World!!!";
    }
}

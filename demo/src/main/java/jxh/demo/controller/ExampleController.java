package jxh.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxh
 */
@RestController
public class ExampleController {
    @RequestMapping("/example")
    public String index() {
        return "Hello World";
    }
}

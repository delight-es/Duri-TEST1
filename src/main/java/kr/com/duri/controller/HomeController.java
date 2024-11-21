package kr.com.duri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @ResponseBody
    @GetMapping("/duri")
    public String duri() {
        String duri = "duri";
        return duri;
    }
}

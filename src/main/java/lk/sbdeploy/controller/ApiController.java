package lk.sbdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/aaw")
public class ApiController {
    @GetMapping
    public String getData(){
        return "get Called";
    }
}

package lk.sbdeploy.controller;

import lk.sbdeploy.dto.CutomerDto;
import lk.sbdeploy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/aaw")
@CrossOrigin
public class ApiController {

    @GetMapping
    public String getData(){
        return "get Called";
    }

}

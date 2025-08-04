package lk.sbdeploy.controller;

import jakarta.validation.Valid;
import lk.sbdeploy.dto.CutomerDto;
import lk.sbdeploy.entity.Customer;
import lk.sbdeploy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PutMapping("saveCustomer")
    public String SaveCustomer(@Valid @RequestBody CutomerDto cutomerDto) {
        return customerService.saveCustomer(cutomerDto);
    }

    @PutMapping("getCustomers")
    public List<Customer> GetCustomers() {
        return customerService.getCutomers();
    }
}

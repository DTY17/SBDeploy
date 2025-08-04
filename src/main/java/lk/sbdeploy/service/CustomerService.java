package lk.sbdeploy.service;

import lk.sbdeploy.dto.CutomerDto;
import lk.sbdeploy.entity.Customer;

import java.util.List;

public interface CustomerService {
    String saveCustomer(CutomerDto cutomerDto);

    List<Customer> getCutomers();
}

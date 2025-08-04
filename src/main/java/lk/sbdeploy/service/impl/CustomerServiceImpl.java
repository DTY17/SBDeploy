package lk.sbdeploy.service.impl;

import lk.sbdeploy.dto.CutomerDto;
import lk.sbdeploy.entity.Customer;
import lk.sbdeploy.repoitory.CustomerRepository;
import lk.sbdeploy.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveCustomer(CutomerDto cutomerDto) {
        if (cutomerDto==null){
            throw new IllegalArgumentException("JobDTO cannot be null");
        }
        customerRepository.save(new Customer(cutomerDto.getId(),cutomerDto.getName(),cutomerDto.getAge(),cutomerDto.getPhoneNumber()));
        return "Save Successfully";
    }

    @Override
    public List<Customer> getCutomers() {
        List<Customer> data = customerRepository.findAll();
        return data;
    }
}

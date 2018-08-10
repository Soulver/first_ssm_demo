package soulver.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import soulver.test.domain.Customer;
import soulver.test.mapper.CustomerMapper;
import soulver.test.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void save(Customer customer){
        customerMapper.save(customer);
    }
}

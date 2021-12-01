package com.fy.service.impl;

import com.fy.mapper.CustomerMapper;
import com.fy.pojo.Customer;
import com.fy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
        int i = 1 / 0;// 模拟系统出现异常情况
    }
}

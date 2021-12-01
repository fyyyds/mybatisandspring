package com.fy.mapper;

import com.fy.pojo.Customer;

public interface CustomerMapper {
    // 通过id查询
    public Customer selectCustomerById(Integer id);
    // 添加客户123
    void addCustomer(Customer customer);
}

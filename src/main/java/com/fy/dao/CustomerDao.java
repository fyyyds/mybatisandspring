package com.fy.dao;

import com.fy.pojo.Customer;

public interface CustomerDao {
    // 通过id查询
    Customer selectCustomerById(Integer id);
}

package com.fy.dao.impl;

import com.fy.dao.CustomerDao;
import com.fy.pojo.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    @Override
    public Customer selectCustomerById(Integer id) {
        String sql = "com.fy.mapper.CustomerMapper.selectCustomerById";
        Customer customer = getSqlSession().selectOne(sql,id);
        return customer;
    }
}
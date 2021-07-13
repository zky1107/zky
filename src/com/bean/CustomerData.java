package com.bean;

import java.util.ArrayList;
import java.util.List;
//单例模式，把 客户 初始化了
public class CustomerData {
    private static CustomerData ourInstance = new CustomerData();
    private List<Customer> customerList;
    public static CustomerData getInstance() {
        return ourInstance;
    }

    private CustomerData() {
        //在构造中书写初始化数据
        customerList = new ArrayList<>();   //创建集合
        for (int i = 0; i < 10; i++) {
            //每循环一次诞生一个 customer 对象，放入到集合中
            Customer customer = new Customer();
                customer.setAccount("1314520"+i);
                customer.setPassword("123");
                customer.setCname("葫芦娃"+i+"号");
                customer.setMoney(10000);
                customer.setPhoneNum("1563952920"+i);
            customerList.add(customer);
        }
    }

    public List<Customer> getCustomerList() {

        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {

        this.customerList = customerList;
    }
}

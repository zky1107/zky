package com.contorller;

import com.service.CustomerService;
import com.util.TextUtil;

import java.util.Scanner;
/*
* ATM 取款机入口
* */
public class AtmMain {

    private static String cardid;
    private static String cardPwd;
    private static CustomerService customerService;

    public static void main(String[] args) {
        customerService = new CustomerService();
        //测试 客户类 的数据
        //CustomerData customerData = CustomerData.getInstance();
        //List<Customer> customerList = customerData.getCustomerList();
        /*for (Customer customer : customerList) {
            System.out.println("customer = "+ customer);
        }*/
        TextUtil.welcome();
        int i = 0;
        while (i<6){
            //输入用户密码 阶段 ------ 如果超过5次就 终止程序(跳出循环)
            doWritePassword();
            doCheckPassword(cardid,cardPwd);
            i++;
        }
    }
    //判断角色 和 判断密码
    private static void doCheckPassword(String cardid ,String cardPwd) {
        //1.先校验角色，判断 cardid 的长度
        if (cardid.length()==8) { //客户
            //校验密码
            customerService.checkPwd(cardid,cardPwd);
        }
    }
    //输入账户密码
    private static void doWritePassword() {
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }
}
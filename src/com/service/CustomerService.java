package com.service;

import com.bean.Customer;
import com.bean.CustomerData;
import com.util.TextUtil;

import java.util.List;
import java.util.Scanner;

//service 类是完成 客户的所有业务(增删改查)
public class CustomerService {
    //成员变量
    private List<Customer> customerList;
    private Customer currentCustomer;
    private Scanner scanner;
    //1.登录(查)
    public void checkPwd(String cardid ,String cardPwd){
        //对数据初始化
        CustomerData customerData = CustomerData.getInstance();
        customerList = customerData.getCustomerList();
        //拿到 cardid中的账户名 和cardPwd 对 list中的数据做对比
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                //拿出这个用户
                currentCustomer = customer;
                //账户密码确认
                System.out.println("欢迎"+customer.getCname()+"顾客登录！请注意您的安全");
                TextUtil.oneLeveOption(); //界面
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);
            }
        }
    }
    //选择选项
    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");
                //查询余额
                doSelectMoney();
                //当输入1时 返回到一级选择界面
                goDneHome();
            break;
            case "2":
                goGetMoneyHome();
                goDneHome();
                /*System.out.println("取款");
                AtmMain.withdrawalOpt(); //取款页面
                System.out.println("\t");
                doWithdrawal(); //取款*/
                break;
            case "3":
                System.out.println("转账");
                doTruanMoney();
                goDneHome();
                break;
            case "4":
                System.out.println("存款");
                cunkuan();  //存款
                goDneHome();
                break;
            case "5":
                System.out.println("退卡");
                goDneHome();
                doQuitCard();
                default:
                    System.out.println("抱歉，您的选择功能有误！");
                break;
        }
    }

    //退卡
    private void doQuitCard() {
        System.out.println("您是否继续操作yes/no[Y/N]");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("y")) {
            TextUtil.welcome(); //结束
        }
        if (s.equalsIgnoreCase("n")){

        }
    }

    //存款
    private void cunkuan() {
        /*//1.提示界面
        System.out.println("请输入存款金额:");
        //2.scanner 接收 钱数
        scanner = new Scanner(System.in);
        double moneyIn = scanner.nextDouble();
        Double moneyInInt = Double.valueOf(moneyIn);
        double newMoney = currentCustomer.getMoney() + moneyInInt;
        //3.更新 当前用户的余额
        currentCustomer.setMoney(newMoney);
        System.out.println("存款成功！您的余额为"+ newMoney);*/
        //让顾客选择输入
        TextUtil.getmoneyCK(); //调用TextUtil里面的getmoneyCK
        Scanner scanner = new Scanner(System.in);
        String numln = scanner.nextLine();
        if (numln.equals("1")){
            //存100 顾客+100
            double money = currentCustomer.getMoney();
            money = money+100;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("2")){
            //存200 顾客+200
            double money = currentCustomer.getMoney();
            money = money+200;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("3")){
            //存300 顾客+300
            double money = currentCustomer.getMoney();
            money = money+300;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("4")){
            //存500 顾客+500
            double money = currentCustomer.getMoney();
            money = money+500;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("5")){
            //存800 顾客+800
            double money = currentCustomer.getMoney();
            money = money+800;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("6")){
            //存1000 顾客+1000
            double money = currentCustomer.getMoney();
            money = money+1000;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("7")){
            //存2000 顾客+2000
            double money = currentCustomer.getMoney();
            money = money+2000;
            System.out.println("存款成功！您的存后金额为"+money);
            //存后 更新原有存款
            currentCustomer.setMoney(money);
        }else if (numln.equals("8")){
            //取款取整
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入您要存得金额:");
            int money = scanner1.nextInt();
            if(money>0 && money<=currentCustomer.getMoney()){
                currentCustomer.setMoney(currentCustomer.getMoney()+money);
                System.out.println("存款成功！您的当前金额为:"+currentCustomer.getMoney());
            }else {
                System.out.println("输入错误");
            }
        }
    }

    /*//取款
    private void doWithdrawal() {
        scanner = new Scanner(System.in);
        String goMoney = scanner.nextLine();

        switch (goMoney){
            case "1":
                double a = 100;
                System.out.println("请拿好您的 100元");
                if (a < currentCustomer.getMoney()){
                    System.out.println("*********************************");
                    System.out.println("您的余额为" + (currentCustomer.getMoney() - a) + "元");
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "2":
                double b = 200;
                System.out.println("请及时拿走现金 200元");
                if (b < currentCustomer.getMoney()){
                    System.out.println("*********************************");
                    System.out.println("您的余额为" + (currentCustomer.getMoney() - b) + "元");
                }else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "3":
                double c = 300;
                System.out.println("请及时拿走现金 300元");
                if (c < currentCustomer.getMoney()) {
                    System.out.println("*********************************");
                    System.out.println("您的余额为 " + (currentCustomer.getMoney() - c) + "元");
                } else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "4":
                double d = 500;
                System.out.println("请及时拿走现金 500元");
                if (d < currentCustomer.getMoney()) {
                    System.out.println("*********************************");
                    System.out.println("您的余额为 " + (currentCustomer.getMoney() - d) + "元");
                } else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "5":
                double e = 800;
                System.out.println("请及时拿走现金 800元");
                if (e < currentCustomer.getMoney()) {
                    System.out.println("*********************************");
                    System.out.println("您的余额为 " + (currentCustomer.getMoney() - e) + "元");
                } else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "6":
                double f = 1000;
                System.out.println("请及时拿走现金 1000元");
                if (f < currentCustomer.getMoney()) {
                    System.out.println("*********************************");
                    System.out.println("您的余额为 " + (currentCustomer.getMoney() - f) + "元");
                } else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "7":
                double g = 2000;
                System.out.println("请及时拿走现金 2000元");
                if (g < currentCustomer.getMoney()) {
                    System.out.println("*********************************");
                    System.out.println("您的余额为 " + (currentCustomer.getMoney() - g) + "元");

                } else {
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            case "8":
                System.out.println("其他");
                Scanner other = new Scanner(System.in);
                double v = other.nextDouble();
                if (v < currentCustomer.getMoney()) {

                    System.out.println("请及时拿走现金" + (currentCustomer.getMoney() - v) + "元");

                    System.out.println("您的余额为" + (currentCustomer.getMoney() - v));
                }else{
                    System.out.println("余额不足，请选择其他业务");
                }
                break;
            default:
                System.out.println("请输入正确的序号");
                break;
        }
    }
*/
    //查询余额
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println("余额是"+money+"元");
    }

    private void goDneHome(){
        TextUtil.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);  //递归算法
    }
    //取款目录
    private void goGetMoneyHome(){
        TextUtil.getmoneyUI(); //调用 getmoneyUI
        //让顾客输入
        Scanner scanner = new Scanner(System.in);
        String numIn = scanner.nextLine();
        if (numIn.equals("1")){
            //取款 100 让顾客-100
            double money = currentCustomer.getMoney();
            money=money-100;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("2")){
            //取款 200 让顾客-200
            double money = currentCustomer.getMoney();
            money=money-200;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("3")){
            //取款 300 让顾客-300
            double money = currentCustomer.getMoney();
            money=money-300;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("4")){
            //取款 500 让顾客-500
            double money = currentCustomer.getMoney();
            money=money-500;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("5")){
            //取款 800 让顾客-800
            double money = currentCustomer.getMoney();
            money=money-800;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("6")){
            //取款 1000 让顾客-1000
            double money = currentCustomer.getMoney();
            money=money-1000;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("7")){
            //取款 2000 让顾客-2000
            double money = currentCustomer.getMoney();
            money=money-2000;
            System.out.println("您的余额是:" + money);
            //取完款之后，更新原有存款
            currentCustomer.setMoney(money);
        }else if (numIn.equals("8")){
            //取款取整
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入您要取得金额:");
            int money = scanner1.nextInt();
            if(money>0 && money<=currentCustomer.getMoney()){
                currentCustomer.setMoney(currentCustomer.getMoney()-money);
                System.out.println("取款成功！您的当前金额为:"+currentCustomer.getMoney());
            }else {
                System.out.println("输入错误");
            }
        }
    }
    //转账
    private void doTruanMoney(){
        System.out.println("请输入对方的账户号码");
        Scanner scanner = new Scanner(System.in);
        String otherAccount = scanner.nextLine();
        System.out.println("请输入您需要转账金额:");
        String oterMoney = scanner.nextLine();

        //计算 自己 - oterMoney ， 别人 + oterMoney
        Double otherMoneyInt = Double.parseDouble(oterMoney);   //类型转换
        double currentMoney = currentCustomer.getMoney()-otherMoneyInt; //转账 自己-钱 别人+钱
        //根据 otherAccount 本人账户查出 别人的余额，查出别人的余额后，修改别人的余额
        //因为 所有人都在 customerList 都在这个集合中，那么就便利这个集合
        Customer other = null;
        for (Customer customer : customerList) {
            //如果 customer.getAccount 等于 otherAccount，那么这个用户就被选出来了!
            if (customer.getAccount().equals(otherAccount)) {
                other=customer;
            }
        }
        double otherOneMoney = other.getMoney() + otherMoneyInt; //别人的钱

        //自己和别人 都更新一下 钱数
        currentCustomer.setMoney(currentMoney);
        other.setMoney(otherOneMoney);
        System.out.println("转账成功！您的金额为:"+currentCustomer.getMoney());
    }
}
package bank;

import java.util.Date;

public class Account {
    String name;
    double balance;
    double rate;
    Date creat;

    public Account(String name, double balance, double rate, Date creat) {
        this.name = name;
        this.balance = balance;
        this.rate = rate;
        this.creat = creat;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void WithDraw(double money) {
        if(this.balance>money)
        {
            setBalance(this.balance-money);
            System.out.printf("取现成功，本次取现%.2f元，账户余额：%.2f元",money,this.balance);
        }
        else
            System.out.println("余额不足，无法取现");
    }

    public void Deposit(double money) {
        setBalance(this.balance + money);
        System.out.printf("存款成功，本次存款%.2f元，账户余额：%.2f元",money,this.balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getCreat() {
        return creat;
    }

    public void setCreat(Date creat) {
        this.creat = creat;
    }

    @Override
    public String toString() {
        return "Account{" +
                "姓名为：'" + name + '\'' +
                ", 余额=" + balance +
                ", 年利率=" + rate +
                ", 账户创建日期=" + creat +
                '}';
    }
}

package bank;

import java.util.Date;

public class CheckingAccount extends Account {//支票帐户
    public CheckingAccount(String name, double balance, double rate, Date creat,double overdraw) {
        super(name, balance, rate, creat);
        this.overdraw=overdraw;
    }
    //支票帐户有一个透支限定额
    double overdraw;

    public void setOverdraw(double overdraw) {
        this.overdraw = overdraw;
    }

    @Override
    public void WithDraw(double money) {
        if(this.balance+this.overdraw>money)
        {
            setBalance(this.balance-money);
            System.out.printf("取现成功，本次取现%.2f元，账户余额：%.2f元",money,this.balance);
        }
        else
        {
            System.out.printf("取现失败，可透支余额不足");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "姓名为：'" + name + '\'' +
                ", 可透支额=" + overdraw +
                ", 余额=" + balance +
                ", 年利率=" + rate +
                ", 账户创建日期=" + creat +
                '}';
    }
}

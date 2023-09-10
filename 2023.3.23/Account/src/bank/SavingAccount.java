package bank;

import java.util.Date;

public class SavingAccount extends Account{
    public SavingAccount(String name, double balance, double rate, Date creat) {
        super(name, balance, rate, creat);
    }
    double PeriodicBalance;
    public void TimeDeposit(int day,double money){
        if(money>this.balance){
            System.out.println("账户余额无法提供您所存入的金额");
        }
        else {
            this.PeriodicBalance=money;
            this.balance-=money;
            double temp;
            temp=this.PeriodicBalance*(rate)*(day/365.0);
            System.out.printf("存%d天之后可获得：%.2f元",day,temp);
        }
    }
    @Override
    public String toString() {
        return "SavingAccount{" +
                "姓名为：" + name + '\'' +
                ", 余额=" +(balance+PeriodicBalance)+
                ",年利率=" + rate +
                ", 账户创建日期=" + creat +
                '}';
    }
}

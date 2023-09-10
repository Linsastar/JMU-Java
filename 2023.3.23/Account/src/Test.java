import bank.*;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Date date=new Date(2010,2,1);
        Account a = new Account("唐锴烨",20,0.03,date);
        CheckingAccount b=new CheckingAccount("范乔智",2000,0.03,date,500);//懒得再创建一个开户日期了
        SavingAccount c=new SavingAccount("李旺",100000000,0.05,date);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //我也不知道该测试什么那就测试个存取款吧
        c.Deposit(20000);
        System.out.println();
        c.WithDraw(1000000);
        System.out.println();
        b.WithDraw(2200);
        System.out.println();
        b.WithDraw(2800);
        System.out.println();
        c.TimeDeposit(1000,10000);
    }
}

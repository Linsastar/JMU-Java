public class NarcissisticNumber {
    public boolean isNarcissisticNumber(int num){
        if (num < 100 || num > 999) {
            System.out.println(num + "数据非法");
            return false;
        }
        else {
            int a = num / 100;//取百位数
            int b = num / 10 % 10;//取十位数
            int c = num % 10;//取个位数
            if (a * a * a + b * b * b + c * c * c == num) {
                System.out.println(num + "是水仙花数");
                return true;
            } else {
                System.out.println(num + "不是水仙花数");
                return false;
            }
        }
    }
}

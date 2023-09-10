class Test {
    public static void main(String[] args) {
        Country china = Country.China;
        System.out.println("国家：" + china.getDescription() + "，货币单位：" + china.getCurrency().getDescription());
        Country usa = Country.USA;
        System.out.println("国家：" + usa.getDescription() + "，货币单位：" + usa.getCurrency().getDescription());
    }
}


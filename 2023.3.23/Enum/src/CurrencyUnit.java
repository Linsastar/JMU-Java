public enum CurrencyUnit {
    USD("美元"),
    GBP("英镑"),
    EUR("欧元"),
    CNY("人民币"),
    JPY("日元");

    private String description;

    private CurrencyUnit(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}

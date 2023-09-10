/**
 * @author gong
 */

public enum Country {
    USA("美国", CurrencyUnit.USD),
    UK("英国", CurrencyUnit.GBP),
    China("中国", CurrencyUnit.CNY),
    France("法国", CurrencyUnit.EUR),
    Japan("日本", CurrencyUnit.JPY);


    private String description;
    private CurrencyUnit currency;

    private Country(String desc, CurrencyUnit cu) {
        this.description = desc;
        this.currency = cu;
    }

    public String getDescription() {
        return description;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }
}

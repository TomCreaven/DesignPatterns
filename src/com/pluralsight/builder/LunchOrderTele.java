package com.pluralsight.builder;

// In this class, instead of having exposed setters for each variable, we have 'telescopic constructors' for each constructor option. In this
// case we have 'telescoped up' We could have telescoped 'down' by calling the higher constructors but adding null for each argument.
// The issues here is that if for example we just want bread and meat on our sandwich. We'd end up needing a constructor for every single variation.
//The bean would give us that flexibility, but it's then not immutable. This example is immutable, but it isn't flexible. Both have drawbacks
public class LunchOrderTele {


    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    public LunchOrderTele(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }
    public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}

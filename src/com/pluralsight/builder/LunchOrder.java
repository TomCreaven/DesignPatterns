package com.pluralsight.builder;

public class LunchOrder {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //This is our initial no args constructor, here if we wanted we could 'force' every sandwich to take at least a bread and a meat for example.
        public Builder(){

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        // Below, were going to create some methods that look like constructors, but they're not, and this is the key to the builder pattern.
        // we could also use typesafe enums for these methods.
        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder condiments (String condiments) {
            this.bread = condiments;
            return this;
        }
        public Builder dressing (String dressing) {
            this.bread = dressing;
            return this;
        }
        public Builder meat (String meat) {
            this.bread = meat;
            return this;
        }


    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    // This constuctor takes a builder, that copies over our sandwich contents from the builder. And we can enforce the contract inside out builder.
    // Below we only have getters, and so we have the contract nature of our telescopic constructors, but the flexibility of the java bean.
    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
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

package ie.atu.productv4;

import java.text.NumberFormat;

public class Animal implements Productable{
    private String type;
    private String Age;
    private double price;
    private String breed;

    protected static int count = 0;

    public Animal() {
    }

    public void seType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAge() {
        return Age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", Age='" + Age + '\'' +
                ", price=" + price +
                ", breed='" + breed + '\'' +
                '}';
    }


    public static int getCount() {
        return count;
    }

}

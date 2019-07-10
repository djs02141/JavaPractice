package org.dimigo.oop.Snack;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : ").append(name).append("\n")
                .append("제조사 : ").append(company).append("\n")
                .append("가격 : ").append(String.format("%,d원", price)).append("\n").
                append("개수 : ").append(number);
        return sb.toString();
    }
    public int carprice(){
        return (price*number);

    }
}

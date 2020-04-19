package ru.job4j.lambda;

public class Holder {
    public String key;
    public String value;

    public Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

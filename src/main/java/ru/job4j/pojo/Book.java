package ru.job4j.pojo;

public class Book {
    private String name;
    private int pagenum;

    public Book(String name, int pagenum) {
        this.name = name;
        this.pagenum = pagenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
}

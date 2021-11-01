package com.pb.lobachev.hw5;

public class Book {
    private String name;
    private String author;
    private String yearpublishing;



    public Book(String name, String author, String yearpublishing ) {
        this.name = name;
        this.author = author;
        this.yearpublishing = yearpublishing;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }


    public String getYearPublishing() {

        return yearpublishing;
    }

    public void setYearPublishing(String yearpublishing) {

        this.yearpublishing = yearpublishing;
    }

    public String getInfo() {
        String result;
        result = "Название: "+name + "   Автор: "+ author+"Год издания "+yearpublishing;
        return result;
    }
}

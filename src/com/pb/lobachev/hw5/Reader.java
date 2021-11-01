package com.pb.lobachev.hw5;

public class Reader {
    private String fio;
    private String librarycard;
    private String faculty;
    private String datebirth;
    private String phonenumber;


    public Reader(String fio, String librarycard, String faculty, String datebirth, String  phonenumber) {
        this.fio = fio;
        this.librarycard = librarycard;
        this.faculty = faculty;
        this.datebirth = datebirth;
        this.phonenumber = phonenumber;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio ;
    }

    public String getLibraryCard() {
        return librarycard;
    }


    public void setLibraryCard(String LibraryCard) {
        this.librarycard = librarycard;
    }

    public String getFaculty() {

        return faculty;
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }

    public String getDateBirth() {

        return datebirth;
    }

    public void setDateBirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getPhoneNumber() {

        return phonenumber;
    }

    public void setPhoneNumber(String phonenumber) {

        this.phonenumber = phonenumber;
    }

    public void takeBook(String librarycard) {

        System.out.println(this.fio + " взял " + librarycard + " книги");
    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял книги: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " Взял  книги:");
        for (Book book : books) {
            System.out.println(book.getName() + "  Автор: " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(String librarycard) {
        System.out.println(this.fio + " вернул " + librarycard + " книги:");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " Вернул  книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул  книги");
        for (Book book : books) {
            System.out.println(book.getName() + " Автор: " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        String result;
        result = "ФИО: " + fio+"  номер читательского билета: "+librarycard+"  Факультет: "+faculty+"  Дата рождения: "+datebirth+"  Телефон: "+phonenumber;

        return result;
    }

}

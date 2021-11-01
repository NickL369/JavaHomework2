package com.pb.lobachev.hw5;

public class Library {
        public static void main(String[] args) {
        Reader reader1 = new Reader("Фред Дерст", "1", "LimpBizkit", "20.08.1970", "101");
        Reader reader2 = new Reader("Джекоби Шэддикс", "2", "PapaRoach", "28.07.1976", "102");
        Reader reader3 = new Reader("Тревор МакНивен", "3", "ThousandFootKrutch", "17.07.1978", "103");

        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Spring в действии", "Крейг Уоллс","2008");
        Book book2 = new Book("Паттерны проектирования", "Кэти Сьерра и Элизабет Фримен","2004");
        Book book3 = new Book("Рефакторинг: улучшение существующего", " Мартин Фаулер","2003");

        Book[] books = {book1, book2, book3};



        printReaders(readers);
        printBooks(books);


        reader1.takeBook("2");
        reader2.takeBook("Паттерны проектирования");
        reader2.takeBook("Паттерны проектирования", "Spring в действии","Рефакторинг: улучшение существующего");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook("1");
        reader2.returnBook("Паттерны проектирования");
        reader2.returnBook("Рефакторинг: улучшение существующего","Паттерны проектирования","Spring в действии" );
        reader3.returnBook(book3);
        reader3.returnBook(book1,book2,book3);







        }


        private static void printBooks(Book[] books) {
        System.out.println("Книги:");

        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

        private static void printReaders(Reader[] readers) {
        System.out.println("Читатели:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

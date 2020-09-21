package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Nikolay Sever", "Severny@mail.ru", 'M');
        Author author1 = new Author("Slava Marlow", "swpps@mail.ru", 'M');
        author1.setEmail("SlavMarlow@gmail.com");
        System.out.println(author);
        System.out.println(author1);
    }
}

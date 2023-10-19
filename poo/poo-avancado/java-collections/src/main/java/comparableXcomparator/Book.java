package main.java.comparableXcomparator;

import java.util.Comparator;

//A 'book' java class that implements Comparable
public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int year;

//    Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

//    Use to order book by year
    public int compareTo(Book l) {
        return title.compareTo(l.title);
    }

//  Getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
//    Class to compare Book by author
    class CompareAuthor implements Comparator<Book> {
        @Override
        public int compare(Book l1, Book l2) {
            return l1.getAuthor().compareTo(l2.getAuthor());
        }
    }
//    Class to compare book by year
    class CompareYear implements Comparator<Book> {
        @Override
    public int compare(Book l1, Book l2) {
            return Integer.compare(l1.getYear(), l2.getYear());
            /*if (l1.getYear() < l2.getYear())
                return -1;
            if (l1.getYear() > l2.getYear())
                return 1;
            else
                return 0;
             */
        }
    }
    class CompareYearAuthorTitle implements Comparator<Book> {
        @Override
        public int compare(Book l1, Book l2) {
            int year = Integer.compare(l1.getYear(), l2.getYear());
            if (year != 0)
                return year;
            int author = l1.getAuthor().compareTo(l2.getAuthor());
            if (author != 0)
                return author;
            return l1.getTitle().compareTo(l2.getTitle());
        }
    }
}

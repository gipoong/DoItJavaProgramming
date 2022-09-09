package chpater6;

public class Book {

    private String book;
    private String writer;

    public Book(String book, String writer){
        this.book = book;
        this.writer = writer;
    }

    public void print(){
        System.out.println("책 : " + this.book + " 작가 : " + this.writer);
    }
}

package chpater6;

import java.util.ArrayList;

public class CompanyTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));

        for(Book book : library){
            book.print();
        }
    }
}

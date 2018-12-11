import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        // neues buch erstellt und ausgegeben
        Book first = new Book(200, new Date(), "My Book", "1234-1234-1234");
        System.out.println("Das Buch hat " + first.getPages() + " Seiten, wurde am " + first.getReleased() + " veröffentlicht und hat den Titel " + first.getTitle());
        // Liste erstellt und 5 Bücher eingefügt.
        List<Book> Liste = new ArrayList<>();
        Liste.add(new Book(10000, new Date(), "Harri Schotter", "0815-0815-0815"));
        Liste.add(new Book(10001, new Date(), "Harris Schotter ist aus", "0815-0815-0816"));
        Liste.add(new Book(10002, new Date(), "Harris Schotter ist wieder da", "0815-0815-0817"));
        Liste.add(new Book(10003, new Date(), "Harri Schotter ohne Schotter", "0815-0815-0818"));
        Liste.add(new Book(10004, new Date(), "Harri Schotter und der tod durch Schotter", "0815-0815-0819"));
        // for each schleife mit ausgabe
        for(Book a:Liste)
        {
            System.out.println(a.getTitle() + " hat " + a.getPages() + " Seiten und folgende ISBN: " + a.getIsbn());
        }
        // neue Liste Paperbooks mit 5 paperbooks erstellt und benannt
        List<Paperbook> Paperbooks = new ArrayList<>();
        Paperbooks.add(new Paperbook("Series 1", "January", 200, new Date(), "My litlle Paperbook 1", "0000-0000-0000"));
        Paperbooks.add(new Paperbook("Series 1", "February", 300, new Date(), "My litlle Paperbook 2", "0000-0000-0000"));
        Paperbooks.add(new Paperbook("Series 2", "March", 400, new Date(), "My litlle Paperbook 3", "0000-0000-0000"));
        Paperbooks.add(new Paperbook("Series 3", "April", 500, new Date(), "My litlle Paperbook 4", "0000-0000-0000"));
        Paperbooks.add(new Paperbook("Series 4", "May", 600, new Date(), "My litlle Paperbook 5", "0000-0000-0000"));
        // for each schleife mit ausgabe
        for(Paperbook a:Paperbooks)
        {
            System.out.println(a.getTitle() + " hat " + a.getPages() + " Seiten und folgende ISBN:" + a.getIsbn() + " zusätzlich ist es im Monat " + a.getMonth() + " erschienen" );
        }
    }
}


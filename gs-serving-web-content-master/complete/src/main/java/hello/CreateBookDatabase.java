package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateBookDatabase {

    public static void main(String[] args) {
        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        try {
            //create a student object
            System.out.println("Creating new book objects..");
            Book tempBook1 = new Book("Zabek i Ropuch. Razem", "Lobel Arnold", "Dla dzieci",
                    "Wydawnictwo Literackie", 5,18.50, "zabek-i-ropuch-razem");
            Book tempBook2 = new Book("Kicia Kocia. To moje!", " Glowinska Anita ", "Dla dzieci",
                    "Media Rodzina", 5,5.45,"kicia-kocia-to-moje" );
            Book tempBook3 = new Book("Reksio. Dobranocka wszech czasów", " Opracowanie zbiorowe ", "Dla dzieci",
                    " Papilon ", 10, 30.99,"reksio-dobranocka-wszech-czasow" );
            Book tempBook4= new Book("Thinking in Java", "Eckel Bruce", "Programowanie",
                    "Helion", 3, 99.99, "thinking-in-java");
            Book tempBook5 = new Book("Java. Podstawy", "Horstmann Cay S.", "Programowanie",
                    "Helion",4,89.99,"java-podstawy");
            Book tempBook6= new Book ("Java. Techniki zaawansowane", "Horstmann Cay S.", "Programowanie",
                    "Helion",4,99.99,"java-techniki-zaawansowane");
            Book tempBook7 = new Book ("Cien wiatru", " Zafon Carlos Ruiz", "Literatura Piekna",
                    "MUZA S.A.",10, 30.55, "cien-wiatru");
            Book tempBook8 = new Book ("Listy i pamietnik", "Hlasko Marek", "Literatura piekna",
                    "Iskry", 5, 20.67, "listy-i-pamietnik");
            Book tempBook9 = new Book (" Wiedzmin. Tom 1. Ostatnie zyczenie", "Sapkowski Andrzej", "Literatura piekna",
                    " SUPERNOWA-Niezalezna Oficyna Wydawnicza NOWA ", 4, 20.66,"wiedzmin-tom-1-ostatnie-zyczenie");


            //start a transaction
            session.beginTransaction();

            //save the Book  object
            System.out.println("Saving the book...");
            session.save(tempBook1);
            session.save(tempBook2);
            session.save(tempBook3);
            session.save(tempBook4);
            session.save(tempBook5);
            session.save(tempBook6);
            session.save(tempBook7);
            session.save(tempBook8);
            session.save(tempBook9);

            //commit transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }

}

package hello;

import com.google.gson.Gson;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class RetrievingBooks {

    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Book.class)
            .buildSessionFactory();

    private Session session;

    private String getRows(String sql) {
        String json="";
        try {
            // retrieving data from the table
            session = factory.getCurrentSession();
            session.beginTransaction();
            TypedQuery<Book> query = session.createQuery(sql, Book.class);
            List<Book> theBooks = query.getResultList();
            session.getTransaction().commit();

            json = new Gson().toJson(theBooks);
            //System.out.println(json);
        } finally {
           // factory.close(); ???????????????????
            System.out.println("Udalo sie!");
        }
        return json;
    }

    public String getAllRows() {
        String sql = "FROM Book";
        return getRows(sql);
    }

    public String getAllRowsSortedByTitleAsc() {
        String sql = "FROM Book ORDER BY title ASC";
        return getRows(sql);
    }

    public String getAllRowsSortedByTitleDesc() {
        String sql = "FROM Book ORDER BY title DESC";
        return getRows(sql);
    }

    public String getAllRowsSortedByAuthorAsc() {
        String sql = "FROM Book ORDER BY author ASC";
        return getRows(sql);
    }

    public String getAllRowsSortedByAuthorDesc() {
        String sql = "FROM Book ORDER BY author DESC";
        return getRows(sql);
    }

    public String getRowsSelectByAuthor(String str) {
        String sql = "FROM Book WHERE LOWER(author) LIKE LOWER('%" + str + "%')";
        return getRows(sql);
    }

    public String getRowsSelectByTitle(String str) {
        String sql = "FROM Book WHERE LOWER(title) LIKE LOWER('%" + str + "%')";
        return getRows(sql);
    }


}

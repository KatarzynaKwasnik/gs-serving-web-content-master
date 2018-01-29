package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "cathegory")
    private String cathegory;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "in_stock")
    private int inStock;

    @Column(name = "price")
    private double price;

    @Column(name = "picture")
    private String picture;

    public Book() {

    }

    public Book(String title, String author, String cathegory, String publisher, int inStock, double price, String picture) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
        this.publisher = publisher;
        this.inStock = inStock;
        this.price = price;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", cathegory=" + cathegory
                + ", publisher=" + publisher + ", inStock=" + inStock + ", price=" + price + "]";
    }

}

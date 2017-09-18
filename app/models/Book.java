package models;


import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shohei on 2017/09/17.
 */
@Entity
public class Book extends Model {
    @Id
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public static Finder<Integer, Book> find = new Finder<Integer,Book>(Book.class);

}

package Beans;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String firstName;
    private int id;
    private String LastName;
    private String email;
    private List<Book> books;

}

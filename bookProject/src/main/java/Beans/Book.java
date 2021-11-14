package Beans;

import Enums.Category;
import Enums.SaleOption;
import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;
    private String author;
    private Category category;
    private String description;
    private double price;
    private SaleOption saleOption;
    private double rating;
}

package Beans;

import Enums.Category;
import Enums.SaleOption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false,unique = true,length = 60)
    private String title;
    @Column(nullable = false,length = 60)
    private String author;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(length = 120)
    private String description;
    @Column(length =30 )
    private double price;
    @Enumerated(EnumType.STRING)
    private SaleOption saleOption;
    @Column
    private double rating;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<User> users;
}

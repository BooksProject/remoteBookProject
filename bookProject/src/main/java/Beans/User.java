package Beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 60)
    private String firstName;
    @Column(nullable = false,length = 60)
    private String LastName;
    @Column(nullable = false,unique = true,length = 60)
    private String email;
    @Column(nullable = false,length = 60)
    private String password;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Book> books;

}

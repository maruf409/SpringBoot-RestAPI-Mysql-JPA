package source.code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId", referencedColumnName = "countryId")
    private List<city> cities;
}

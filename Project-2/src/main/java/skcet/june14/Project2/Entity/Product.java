package skcet.june14.Project2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    String productName ;
    int price ;
    double rating ;
    int discount ;
    String availability ;
}

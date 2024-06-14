package skcet.june14.avgCalc.Entity;

import java.util.HashSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Numbers {
    
    private HashSet<Integer> set = new HashSet<>() ;
    private int n = 10 ;

}

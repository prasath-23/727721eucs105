package skcet.june14.avgCalc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import skcet.june14.avgCalc.Entity.Numbers;;

public interface EvenRepo extends JpaRepository< Numbers , Integer >{
    
}
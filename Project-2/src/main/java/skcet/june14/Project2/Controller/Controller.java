package skcet.june14.Project2.Controller;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import skcet.june14.Project2.Entity.Product;

@RestController
public class Controller {
    
    @Autowired
    private RestTemplate restTemplate;

     @GetMapping("/{com}/categories/{cat}/products?top={top}minPrice={min}&maxPrice={max}/")
        public Product[] topProducts(@PathVariable String cat ,@PathVariable String com ,@PathVariable int top ,@PathVariable int min ,@PathVariable int max) {
           
            String bearerToken = " eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJNYXBDbGFpbXMiOnsiZXhwIjoxNzE4MzUxMjIyLCJpYXQiOjE3MTgzNTA5MjIsImlzcyI6IkFmZm9yZG1lZCIsImp0aSI6Ijg0NzQ3YzgzLTI3OWQtNDBlYy1iNGVlLWQ1ZDIxMDQxZmY3YiIsInN1YiI6IjcyNzcyMWV1Y3MxMDVAc2tjZXQuYWMuaW4ifSwiY29tcGFueU5hbWUiOiJTS0NFVCIsImNsaWVudElEIjoiODQ3NDdjODMtMjc5ZC00MGVjLWI0ZWUtZDVkMjEwNDFmZjdiIiwiY2xpZW50U2VjcmV0IjoiUm1EUkdFaGVYcUdNSVFWVyIsIm93bmVyTmFtZSI6IlByYXNhdGgiLCJvd25lckVtYWlsIjoiNzI3NzIxZXVjczEwNUBza2NldC5hYy5pbiIsInJvbGxObyI6IjcyNzcyMWV1Y3MxMDUifQ.rbVIQUmyAA3Ue7novAVtfW6ePkGUzOUKmLsbPGYZZSk" ;
            // HttpHeaders headers = new HttpHeaders();
            // headers.set("Authorization", bearerToken);

            // ResponseEntity<Product[]> response = restTemplate.getForEntity(
            //         "http://20.244.56.144/products/companies/"+ com +"/categories/" + cat + "/products?top="  + top + "minPrice=" + min + "&maxPrice=" + max +"/" ,
            //         Product[].class
            // );
            // return response.getBody() ;

            String url = "http://20.244.56.144/products/companies/" + com + "/categories/" + cat +
                     "/products?top=" + top + "&minPrice=" + min + "&maxPrice=" + max;
            
            HttpHeaders headers = new HttpHeaders(null);
            headers.set("Authorization", bearerToken);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<Product[]> response = restTemplate.exchange(
                    url, HttpMethod.GET, entity, Product[].class);

            return response.getBody();
    
        }

}

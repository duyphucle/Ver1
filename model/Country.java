package model;
import java.time.LocalDate;
public class Country{
       private  int country_id;
       private  String country;
      public Country(int country_id , String country ){
          this.country_id = country_id;
          this.country = country;
        }
      public Country() {
    	  
      }
       public Country(String country ){
          this.country = country;
        }
     public void setCountry_id(int country_id) {
           this.country_id = country_id;
     }
     public int getCountry_id(){       
          return country_id;
     }
     public void setCountry(String country) {
           this.country = country;
     }
     public String getCountry(){       
          return country;
     }
}
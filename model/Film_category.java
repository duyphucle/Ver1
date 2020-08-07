package model;
import java.time.LocalDate;
public class Film_category{
       private  int film_id;
       private  int category_id;
       public Film_category() {}
      public Film_category(int film_id , int category_id ){
          this.film_id = film_id;
          this.category_id = category_id;
        }
       public Film_category(int category_id ){
          this.category_id = category_id;
        }
     public void setFilm_id(int film_id) {
           this.film_id = film_id;
     }
     public int getFilm_id(){       
          return film_id;
     }
     public void setCategory_id(int category_id) {
           this.category_id = category_id;
     }
     public int getCategory_id(){       
          return category_id;
     }
}
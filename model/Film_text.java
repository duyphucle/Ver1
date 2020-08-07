package model;
import java.time.LocalDate;
public class Film_text{
       private  int film_id;
       private  String title;
       private  String description;
       public Film_text() {}
      public Film_text(int film_id , String title , String description ){
          this.film_id = film_id;
          this.title = title;
          this.description = description;
        }
       public Film_text(String title , String description ){
          this.title = title;
          this.description = description;
        }
     public void setFilm_id(int film_id) {
           this.film_id = film_id;
     }
     public int getFilm_id(){       
          return film_id;
     }
     public void setTitle(String title) {
           this.title = title;
     }
     public String getTitle(){       
          return title;
     }
     public void setDescription(String description) {
           this.description = description;
     }
     public String getDescription(){       
          return description;
     }
}
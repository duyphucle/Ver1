package model;
import java.time.LocalDate;
public class Film_actor{
       private  int actor_id;
       private  int film_id;
       public Film_actor() {}
      public Film_actor(int actor_id , int film_id ){
          this.actor_id = actor_id;
          this.film_id = film_id;
        }
       public Film_actor(int film_id ){
          this.film_id = film_id;
        }
     public void setActor_id(int actor_id) {
           this.actor_id = actor_id;
     }
     public int getActor_id(){       
          return actor_id;
     }
     public void setFilm_id(int film_id) {
           this.film_id = film_id;
     }
     public int getFilm_id(){       
          return film_id;
     }
}
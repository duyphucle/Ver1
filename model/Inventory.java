package model;
import java.time.LocalDate;
public class Inventory{
       private  int inventory_id;
       private  int film_id;
       private  int store_id;
       public Inventory() {}
      public Inventory(int inventory_id , int film_id , int store_id ){
          this.inventory_id = inventory_id;
          this.film_id = film_id;
          this.store_id = store_id;
        }
       public Inventory(int film_id , int store_id ){
          this.film_id = film_id;
          this.store_id = store_id;
        }
     public void setInventory_id(int inventory_id) {
           this.inventory_id = inventory_id;
     }
     public int getInventory_id(){       
          return inventory_id;
     }
     public void setFilm_id(int film_id) {
           this.film_id = film_id;
     }
     public int getFilm_id(){       
          return film_id;
     }
     public void setStore_id(int store_id) {
           this.store_id = store_id;
     }
     public int getStore_id(){       
          return store_id;
     }
}
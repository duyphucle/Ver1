package model;
import java.time.LocalDate;
public class Category{
       private  int category_id;
       private  String name;
      public Category(int category_id , String name ){
          this.category_id = category_id;
          this.name = name;
        }
      public Category() {
    	  
      }
       public Category(String name ){
          this.name = name;
        }
     public void setCategory_id(int category_id) {
           this.category_id = category_id;
     }
     public int getCategory_id(){       
          return category_id;
     }
     public void setName(String name) {
           this.name = name;
     }
     public String getName(){       
          return name;
     }
}
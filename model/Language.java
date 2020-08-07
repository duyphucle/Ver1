package model;
import java.time.LocalDate;
public class Language{
       private  int language_id;
       private  String name;
       public Language() {}
      public Language(int language_id , String name ){
          this.language_id = language_id;
          this.name = name;
        }
       public Language(String name ){
          this.name = name;
        }
     public void setLanguage_id(int language_id) {
           this.language_id = language_id;
     }
     public int getLanguage_id(){       
          return language_id;
     }
     public void setName(String name) {
           this.name = name;
     }
     public String getName(){       
          return name;
     }
}
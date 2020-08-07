package model;
import java.time.LocalDate;
public class Staff{
       private  int staff_id;
       private  String first_name;
       private  String last_name;
       private  int address_id;
       private  String email;
       private  int store_id;
       private  int active;
       private  String username;
       private  String password;
       public Staff() {}
      public Staff(int staff_id , String first_name , String last_name , int address_id , String email , int store_id , int active , String username , String password ){
          this.staff_id = staff_id;
          this.first_name = first_name;
          this.last_name = last_name;
          this.address_id = address_id;
          this.email = email;
          this.store_id = store_id;
          this.active = active;
          this.username = username;
          this.password = password;
        }
       public Staff(String first_name , String last_name , int address_id , String email , int store_id , int active , String username , String password ){
          this.first_name = first_name;
          this.last_name = last_name;
          this.address_id = address_id;
          this.email = email;
          this.store_id = store_id;
          this.active = active;
          this.username = username;
          this.password = password;
        }
     public void setStaff_id(int staff_id) {
           this.staff_id = staff_id;
     }
     public int getStaff_id(){       
          return staff_id;
     }
     public void setFirst_name(String first_name) {
           this.first_name = first_name;
     }
     public String getFirst_name(){       
          return first_name;
     }
     public void setLast_name(String last_name) {
           this.last_name = last_name;
     }
     public String getLast_name(){       
          return last_name;
     }
     public void setAddress_id(int address_id) {
           this.address_id = address_id;
     }
     public int getAddress_id(){       
          return address_id;
     }
     public void setEmail(String email) {
           this.email = email;
     }
     public String getEmail(){       
          return email;
     }
     public void setStore_id(int store_id) {
           this.store_id = store_id;
     }
     public int getStore_id(){       
          return store_id;
     }
     public void setActive(int active) {
           this.active = active;
     }
     public int getActive(){       
          return active;
     }
     public void setUsername(String username) {
           this.username = username;
     }
     public String getUsername(){       
          return username;
     }
     public void setPassword(String password) {
           this.password = password;
     }
     public String getPassword(){       
          return password;
     }
}
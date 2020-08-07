package model;
import java.time.LocalDate;
public class Customer{
       private  int customer_id;
       private  int store_id;
       private  String first_name;
       private  String last_name;
       private  String email;
       private  int address_id;
       private  int active;
      public Customer(int customer_id , int store_id , String first_name , String last_name , String email , int address_id , int active ){
          this.customer_id = customer_id;
          this.store_id = store_id;
          this.first_name = first_name;
          this.last_name = last_name;
          this.email = email;
          this.address_id = address_id;
          this.active = active;
        }
      public Customer() {
    	  
      }
       public Customer(int store_id , String first_name , String last_name , String email , int address_id , int active ){
          this.store_id = store_id;
          this.first_name = first_name;
          this.last_name = last_name;
          this.email = email;
          this.address_id = address_id;
          this.active = active;
        }
     public void setCustomer_id(int customer_id) {
           this.customer_id = customer_id;
     }
     public int getCustomer_id(){       
          return customer_id;
     }
     public void setStore_id(int store_id) {
           this.store_id = store_id;
     }
     public int getStore_id(){       
          return store_id;
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
     public void setEmail(String email) {
           this.email = email;
     }
     public String getEmail(){       
          return email;
     }
     public void setAddress_id(int address_id) {
           this.address_id = address_id;
     }
     public int getAddress_id(){       
          return address_id;
     }
     public void setActive(int active) {
           this.active = active;
     }
     public int getActive(){       
          return active;
     }
}
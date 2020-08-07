package model;
import java.time.LocalDate;
public class Address{
       private  int address_id;
       private  String address;
       private  String address2;
       private  String district;
       private  int city_id;
       private  String postal_code;
       private  String phone;
       public Address() {
    	   
       }
      public Address(int address_id , String address , String address2 , String district , int city_id , String postal_code , String phone ){
          this.address_id = address_id;
          this.address = address;
          this.address2 = address2;
          this.district = district;
          this.city_id = city_id;
          this.postal_code = postal_code;
          this.phone = phone;
        }
       public Address(String address , String address2 , String district , int city_id , String postal_code , String phone ){
          this.address = address;
          this.address2 = address2;
          this.district = district;
          this.city_id = city_id;
          this.postal_code = postal_code;
          this.phone = phone;
        }
     public void setAddress_id(int address_id) {
           this.address_id = address_id;
     }
     public int getAddress_id(){       
          return address_id;
     }
     public void setAddress(String address) {
           this.address = address;
     }
     public String getAddress(){       
          return address;
     }
     public void setAddress2(String address2) {
           this.address2 = address2;
     }
     public String getAddress2(){       
          return address2;
     }
     public void setDistrict(String district) {
           this.district = district;
     }
     public String getDistrict(){       
          return district;
     }
     public void setCity_id(int city_id) {
           this.city_id = city_id;
     }
     public int getCity_id(){       
          return city_id;
     }
     public void setPostal_code(String postal_code) {
           this.postal_code = postal_code;
     }
     public String getPostal_code(){       
          return postal_code;
     }
     public void setPhone(String phone) {
           this.phone = phone;
     }
     public String getPhone(){       
          return phone;
     }
}
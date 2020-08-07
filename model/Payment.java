package model;
import java.time.LocalDate;
public class Payment{
       private  int payment_id;
       private  int customer_id;
       private  int staff_id;
       private  int rental_id;
       private  double amount;
       public Payment() {}
      public Payment(int payment_id , int customer_id , int staff_id , int rental_id , double amount ){
          this.payment_id = payment_id;
          this.customer_id = customer_id;
          this.staff_id = staff_id;
          this.rental_id = rental_id;
          this.amount = amount;
        }
       public Payment(int customer_id , int staff_id , int rental_id , double amount ){
          this.customer_id = customer_id;
          this.staff_id = staff_id;
          this.rental_id = rental_id;
          this.amount = amount;
        }
     public void setPayment_id(int payment_id) {
           this.payment_id = payment_id;
     }
     public int getPayment_id(){       
          return payment_id;
     }
     public void setCustomer_id(int customer_id) {
           this.customer_id = customer_id;
     }
     public int getCustomer_id(){       
          return customer_id;
     }
     public void setStaff_id(int staff_id) {
           this.staff_id = staff_id;
     }
     public int getStaff_id(){       
          return staff_id;
     }
     public void setRental_id(int rental_id) {
           this.rental_id = rental_id;
     }
     public int getRental_id(){       
          return rental_id;
     }
     public void setAmount(double amount) {
           this.amount = amount;
     }
     public double getAmount(){       
          return amount;
     }
}
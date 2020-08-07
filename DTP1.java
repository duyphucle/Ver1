import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Actor;
import model.Address;
import model.Category;
import model.City;
import model.Country;
import model.Customer;
import model.Film;
import model.Film_actor;
import model.Film_category;
import model.Film_text;
import model.Inventory;
import model.Language;
import model.Payment;
import model.Rental;
import model.Staff;
import model.Store;
import model.Tmt220_func;
public class DTP1 {


    public DTP1() throws SQLException, ClassNotFoundException {
    }

    Connection connection = AMySQLConnUtils.getSqlConnection(); private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
 public  ArrayList<Actor> getActor() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From actor ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Actor> actor = new ArrayList<>();
        while (rs.next()) {
        	Actor temp = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"));
actor.add(temp);
        }
        return actor;
    }
 public  ArrayList<Address> getAddress() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From address ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Address> address = new ArrayList<>();
        while (rs.next()) {
        	Address temp = new Address(rs.getInt("address_id"), rs.getString("address"), rs.getString("address2"), rs.getString("district"), rs.getInt("city_id"), rs.getString("postal_code"), rs.getString("phone"));
address.add(temp);
        }
        return address;
    }
 public  ArrayList<Category> getCategory() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From category ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Category> category = new ArrayList<>();
        while (rs.next()) {
        	Category temp = new Category(rs.getInt("category_id"), rs.getString("name"));
category.add(temp);
        }
        return category;
    }
 public  ArrayList<City> getCity() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From city ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<City> city = new ArrayList<>();
        while (rs.next()) {
        	City temp = new City(rs.getInt("city_id"), rs.getString("city"), rs.getInt("country_id"));
city.add(temp);
        }
        return city;
    }
 public  ArrayList<Country> getCountry() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From country ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Country> country = new ArrayList<>();
        while (rs.next()) {
        	Country temp = new Country(rs.getInt("country_id"), rs.getString("country"));
country.add(temp);
        }
        return country;
    }
 public  ArrayList<Customer> getCustomer() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From customer ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Customer> customer = new ArrayList<>();
        while (rs.next()) {
        	Customer temp = new Customer(rs.getInt("customer_id"), rs.getInt("store_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), rs.getInt("address_id"), rs.getInt("active"));
customer.add(temp);
        }
        return customer;
    }
 public  ArrayList<Film> getFilm() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From film ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Film> film = new ArrayList<>();
        while (rs.next()) {
        	Film temp = new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"), rs.getInt("release_year"), rs.getInt("language_id"), rs.getInt("original_language_id"), rs.getInt("rental_duration"), rs.getDouble("rental_rate"), rs.getInt("length"), rs.getDouble("replacement_cost"));
film.add(temp);
        }
        return film;
    }
 public  ArrayList<Film_actor> getFilm_actor() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From film_actor ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Film_actor> film_actor = new ArrayList<>();
        while (rs.next()) {
        	Film_actor temp = new Film_actor(rs.getInt("actor_id"), rs.getInt("film_id"));
film_actor.add(temp);
        }
        return film_actor;
    }
 public  ArrayList<Film_category> getFilm_category() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From film_category ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Film_category> film_category = new ArrayList<>();
        while (rs.next()) {
        	Film_category temp = new Film_category(rs.getInt("film_id"), rs.getInt("category_id"));
film_category.add(temp);
        }
        return film_category;
    }
 public  ArrayList<Film_text> getFilm_text() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From film_text ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Film_text> film_text = new ArrayList<>();
        while (rs.next()) {
        	Film_text temp = new Film_text(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"));
film_text.add(temp);
        }
        return film_text;
    }
 public  ArrayList<Inventory> getInventory() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From inventory ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Inventory> inventory = new ArrayList<>();
        while (rs.next()) {
        	Inventory temp = new Inventory(rs.getInt("inventory_id"), rs.getInt("film_id"), rs.getInt("store_id"));
inventory.add(temp);
        }
        return inventory;
    }
 public  ArrayList<Language> getLanguage() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From language ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Language> language = new ArrayList<>();
        while (rs.next()) {
        	Language temp = new Language(rs.getInt("language_id"), rs.getString("name"));
language.add(temp);
        }
        return language;
    }
 public  ArrayList<Payment> getPayment() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From payment ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Payment> payment = new ArrayList<>();
        while (rs.next()) {
        	Payment temp = new Payment(rs.getInt("payment_id"), rs.getInt("customer_id"), rs.getInt("staff_id"), rs.getInt("rental_id"), rs.getDouble("amount"));
payment.add(temp);
        }
        return payment;
    }
 public  ArrayList<Rental> getRental() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From rental ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Rental> rental = new ArrayList<>();
        while (rs.next()) {
        	Rental temp = new Rental(rs.getInt("rental_id"), rs.getInt("inventory_id"), rs.getInt("customer_id"), rs.getInt("staff_id"));
rental.add(temp);
        }
        return rental;
    }
 public  ArrayList<Staff> getStaff() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From staff ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Staff> staff = new ArrayList<>();
        while (rs.next()) {
        	Staff temp = new Staff(rs.getInt("staff_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("address_id"), rs.getString("email"), rs.getInt("store_id"), rs.getInt("active"), rs.getString("username"), rs.getString("password"));
staff.add(temp);
        }
        return staff;
    }
 public  ArrayList<Store> getStore() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From store ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Store> store = new ArrayList<>();
        while (rs.next()) {
        	Store temp = new Store(rs.getInt("store_id"), rs.getInt("manager_staff_id"), rs.getInt("address_id"));
store.add(temp);
        }
        return store;
    }
 public  ArrayList<Tmt220_func> getTmt220_func() throws ClassNotFoundException, SQLException {
    	Statement statement = connection.createStatement();
        String sql = "Select * From tmt220_func ";
        ResultSet rs = statement.executeQuery(sql);
        ArrayList<Tmt220_func> tmt220_func = new ArrayList<>();
        while (rs.next()) {
        	Tmt220_func temp = new Tmt220_func(rs.getString("FUNCID"), rs.getString("LANG"), rs.getString("FUNCNM"), rs.getString("FUNCRNM"), rs.getString("JOBKBN"), rs.getString("PCHHTKBN"), rs.getString("SCRNID"), rs.getString("MENUSHWFLG"), rs.getString("AUTHFLG"), rs.getString("FUNCREMARK"), rs.getString("HHTMENUNO"), rs.getString("STRRSRV1"), rs.getString("STRRSRV2"), rs.getString("STRRSRV3"), rs.getString("STRRSRV4"), rs.getString("STRRSRV5"), rs.getString("DELFLG"), rs.getString("ENTUSRCD"), rs.getString("ENTPRG"), rs.getString("UPDUSRCD"), rs.getString("UPDPRG"));
tmt220_func.add(temp);
        }
        return tmt220_func;
    }
}
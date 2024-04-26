package clup_owners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class admin extends basic {

    private int PIN;

    String k = String.valueOf(getPIN());
    public ArrayList<admin> list_PIN = new ArrayList<>();

    public Connection con;

    public admin() {
    }

    public admin(String user_name, String password) {
        super(user_name, password);
        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<admin>>");
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public admin(int PIN) {
        this.PIN = PIN;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
    //insert to Database but this mithod showe once

    public void insert_user(String user, String pass, int pin, String gender) {

        try {
            PreparedStatement p = con.prepareStatement("insert into admin(user_name,pass,pin,gender) values (?,?,?,?)");
            p.setString(1, user);
            p.setString(2, pass);
            p.setString(3, pin + "");
            p.setString(4, gender);
            p.execute();
            PIN = pin;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    //insert to Database but this mithod use in signUp

    public void insert_user(String user, String pass, String gender) {

        try {
            PreparedStatement p = con.prepareStatement("insert into admin(user_name,pass,gender) values (?,?,?)");
            p.setString(1, user);
            p.setString(2, pass);

            p.setString(3, gender);

            p.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
     //It is stored in arrayList so that we can read the entire table
    @Override
    public ArrayList<basic> getuser() {
        try {

            PreparedStatement p = con.prepareStatement("select * from admin order by id asc");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new admin(r.getString("user_name"), r.getString("pass")));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;

    }
    //check data in table (use in signIn)

    @Override
    public int check_user(String user, String pass) {
        ArrayList<basic> arr = getuser();
        int s = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getUser_name().equalsIgnoreCase(user)) {
                if (arr.get(i).getPassword().equalsIgnoreCase(pass)) {

                    s = 1;
                    break;

                } else {
                    s = 2;
                    break;
                }
            } else {
                s = 3;
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "\nUser Name: " + super.getUser_name()+"\nPassword: "+super.getPassword()+"\nPIN: "+PIN;
 
    }
    public String toString2() {
        return "\nUser Name: " + super.getUser_name()+"\nPassword: "+super.getPassword();
 
    }

    @Override
    public void insert_user(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

package clup_owners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class trainer extends person2 {

    private String CNumber;
    private String day;
    private String time;
    private String experience;
    public Connection con;
    public ArrayList<trainer> list2 = new ArrayList<>();

    public trainer() {
        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<trainer>>");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

 

    public trainer(String user_name, String password) {
        super(user_name, password);
          try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<trainer>>");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public trainer(String CNumber, String day, String time, String experience, Connection con, String PhoneNumber, String ID, String gmail, String sport, String name) {
        super(PhoneNumber, ID, gmail, sport, name);
        this.CNumber = CNumber;
        this.day = day;
        this.time = time;
        this.experience = experience;
        this.con = con;
    }
    
    
    

 

    public String getCNumber() {
        return CNumber;
    }

    public void setCNumber(String CNumber) {
        this.CNumber = CNumber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public ArrayList<trainer> getList2() {
        return list2;
    }

    public void setList2(ArrayList<trainer> list2) {
        this.list2 = list2;
    }

    public void showTrainees() {

    }
   
    public void insert_user(String user, String pass,String name, String phone, String gmail, String sport, String day,String time,String exp,String cash) {
        try {
            PreparedStatement p = con.prepareStatement("insert into trainer(name,phone_number,gmail,sport,day,time,experience,cPhone,user_name,password) values (?,?,?,?,?,?,?,?,?,?)");
          
            p.setString(1,name );
            p.setString(2,phone);
            p.setString(3,gmail);
            p.setString(4,sport);
            p.setString(5, day);
            p.setString(6, time);
            p.setString(7, exp);
            p.setString(8, cash);
            p.setString(9, user);
            p.setString(10, pass);
            p.execute();
            
               
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    @Override
    public ArrayList<person2> getData() {
         try {

            PreparedStatement p = con.prepareStatement("select * from trainer");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new trainer(r.getString("user_name"), r.getString("password")));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
     
    }
    public ArrayList<trainer> gettrainer_acc(){
         try {

            PreparedStatement p = con.prepareStatement("select * from trainer_accepted");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list2.add(new trainer(r.getString("user_name"), r.getString("password")));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list2;
    }
    

 

 

    @Override
    public int check_user(String user, String pass) {
        ArrayList<person2> arr = getData();
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
    public int check_traineracc(String user, String pass) {
        ArrayList<trainer> arr = gettrainer_acc();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<basic> getuser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert_user(String PhoneNumber, String ID, String gmail, String sport, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert_user(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

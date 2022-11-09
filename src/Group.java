import java.sql.*;
import javax.swing.*;

public class Group{
    public static String GName;
    public static float penalty;
    public static float shares;
    public static String Fname;
    public static String Lname;
    public static String UserName;
    public static Connection c = null;
    public static Statement stmt = null;
    public static float repays;
    public static float loan;
    public static int time;
    public static float interest;
    public static float allshares = 0;
    public static float allinterests = 0;
    public static float allpenalties = 0;

    public static void GroupAdd(int id, String name, int day, int month, int year, int regfees){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group registration");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPREGISTRATION (ID,GROUPNAME, DAY, MONTH, YEAR, REGFEES)"+
                    "VALUES ("+id+",'"+name+"',"+day+","+month+","+year+","+regfees+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void AddGroupShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group shares");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPSHARE(GROUPID, SHARE)"+
                    "VALUES ("+id+","+share+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group shares");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPSHARE set SHARE = "+share+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void AddGroupIndividualShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual shares");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINDIVIDUALSHARE(GROUPID, SHARE)"+
                    "VALUES ("+id+","+share+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupIndividualShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPINDIVIDUALSHARE set SHARE = "+share+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float GetGroupShares(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPSHARE WHERE GROUPID = "+id+";");
            shares = rs.getFloat("share");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return shares;
    }
    public static float GetGroupIndividualShares(int id){

        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual shares");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALSHARE WHERE GROUPID = "+id+";");
            shares = rs.getFloat("share");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully quered the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return shares;
    }
    public static void GroupMemberAdd(int memberid, int groupid, String username, String firstname, String lastname, String email, String phone){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group member registration");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPMEMBERREGISTRATION (MEMBERID, GROUPID, USERNAME, FIRSTNAME, LASTNAME, EMAIL, PHONENUMBER)"+
                    "VALUES ("+memberid+","+groupid+",'"+username+"','"+firstname+"','"+lastname+"','"+email+"',"+phone+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void GroupMakeContribution(int groupid, int memberid, float contrib, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group contribution");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPCONTRIBUTION (GROUPID, MEMBERID, CONTRIBUTION, DAY, MONTH, YEAR)"+
                    "VALUES ("+groupid+","+memberid+","+contrib+","+day+","+month+","+year+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static int getContributionMonth(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPCONTRIBUTION WHERE MEMBERID = "+id+";");
            while(rs.next()) {
                time = rs.getInt("month");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully querid the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static int getContributionYear(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPCONTRIBUTION WHERE MEMBERID = "+id+";");
            while(rs.next()) {
                time = rs.getInt("year");
            }
            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully querid the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static String GetGName(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPREGISTRATION WHERE ID = "+id+";");
            GName = rs.getString("groupname");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully querid the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return GName;
    }
    public static String GetFname(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPMEMBERREGISTRATION WHERE MEMBERID = "+id+";");
            Fname = rs.getString("firstname");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Fname;
    }
    public static String GetUserName(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPMEMBERREGISTRATION WHERE MEMBERID = "+id+";");
            UserName = rs.getString("username");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return UserName;
    }
    public static String GetLname(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPMEMBERREGISTRATION WHERE MEMBERID = "+id+";");
            Lname = rs.getString("lastname");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Lname;
    }
    public static void GroupLoan(int id, float loan, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group loan");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPLOAN (GROUPID, LOAN, DAY, MONTH, YEAR)"+
                    "VALUES ("+id+","+loan+","+day+","+month+","+year+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void GroupIndividualLoan(int id, float loan, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group individual loan");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINDIVIDUALLOAN (GROUPID, LOAN, DAY, MONTH, YEAR)"+
                    "VALUES ("+id+","+loan+","+day+","+month+","+year+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void GroupPay(int id, float pay, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group pay");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPPAY (GROUPID, PAY, DAY, MONTH, YEAR)"+
                    "VALUES ("+id+","+pay+","+day+","+month+","+year+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void GroupIndividualPay(int id, float pay, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable group individual pay");

            stmt = c.createStatement();
            String sql = "INSERT INTO  GROUPINDIVIDUALPAY(GROUPID, PAY, DAY, MONTH, YEAR)"+
                    "VALUES ("+id+","+pay+","+day+","+month+","+year+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void AddGroupRepayment(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group shares");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPREPAYMENT(GROUPID, REPAY)"+
                    "VALUES ("+id+","+repay+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupRepayment(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group shares");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPREPAYMENT set REPAY = "+repay+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void AddGroupIndividualRepayment(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual shares");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINDIVIDUALREPAYMENT(GROUPID, REPAY)"+
                    "VALUES ("+id+","+repay+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully created the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupIndividualRepayMent(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPINDIVIDUALREPAYMENT set REPAY = "+repay+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float GetGroupRepayMent(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPREPAYMENT WHERE GROUPID = "+id+";");
            repays = rs.getFloat("repay");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return repays;
    }
    public static float GetGroupIndividualRepayMent(int id){

        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group individual shares");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALREPAYMENT WHERE GROUPID = "+id+";");
            repays = rs.getFloat("repay");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully quered the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return repays;
    }
    public static float getGroupLoan(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPLOAN WHERE GROUPID = "+id+";");
            loan = rs.getFloat("loan");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return loan;
    }
    public static float getGroupIndividualLoan(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable group share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALLOAN WHERE GROUPID = "+id+";");
            loan = rs.getFloat("loan");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return loan;
    }
    public static void AddGroupInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINTEREST(GROUPID, INTEREST)"+
                    "VALUES ("+id+","+interest+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPINTEREST set INTEREST = "+interest+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float getGroupInterest(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINTEREST WHERE GROUPID = "+id+";");
            while(rs.next()){
                interest = rs.getFloat("interest");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return interest;
    }
    public static int getGrouploanmonth(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPLOAN WHERE GROUPID = "+id+";");
            while(rs.next()){
                time = rs.getInt("month");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static int getGrouploanyear(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPLOAN WHERE GROUPID = "+id+";");
            while(rs.next()){
                time = rs.getInt("year");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static void AddGroupIndividualInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINDIVIDUALINTEREST(GROUPID, INTEREST)"+
                    "VALUES ("+id+","+interest+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupIndividualInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPINDIVIDUALINTEREST set INTEREST = "+interest+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float getGroupIndividualInterest(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALINTEREST WHERE GROUPID = "+id+";");
            while(rs.next()){
                interest = rs.getFloat("interest");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return interest;
    }
    public static int getGroupIndividualloanmonth(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALLOAN WHERE GROUPID = "+id+";");
            while(rs.next()){
                time = rs.getInt("month");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static int getGroupIndividualloanyear(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALLOAN WHERE GROUPID = "+id+";");
            while(rs.next()){
                time = rs.getInt("year");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return time;
    }
    public static void addGroupPenalty(int id, float penalty, float penalyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPPENALTY(GROUPID, PENALTY, PENALTYTOTAL)"+
                    "VALUES ("+id+","+penalty+","+penalyupdate+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupPenalty(int id, float penalty, float penaltyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPPENALTY set PENALTY = "+penalty+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);
            sql = "UPDATE GROUPPENALTY set PENALTYTOTAL = "+penaltyupdate+" WHERE GROUPID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float GetGroupPenalty(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPPENALTY WHERE GROUPID = "+id+";");
            penalty = rs.getFloat("penalty");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return penalty;
    }
    public static float GetGroupPenaltyTotal(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPPENALTY WHERE GROUPID = "+id+";");
            penalty = rs.getFloat("penaltytotal");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return penalty;
    }
    public static void addGroupIndividualPenalty(int id, float penalty, float penaltyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO GROUPINDIVIDUALPENALTY(GROUPID, PENALTY,PENALTYTOTAL)"+
                    "VALUES ("+id+","+penalty+","+penaltyupdate+")";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void UpdateGroupIndividualPenalty(int id, float penalty, float penaltyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE GROUPINDIVIDUALPENALTY set PENALTY = "+penalty+" WHERE MEMBERID = "+id+";";
            stmt.executeUpdate(sql);
            sql = "UPDATE GROUPINDIVIDUALPENALTY set PENALTYTOTAL = "+penaltyupdate+" WHERE MEMBERID = "+id+";";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully updated the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static float GetGroupIndividualPenaltyTotal(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALPENALTY WHERE GROUPID = "+id+";");
            penalty = rs.getFloat("penaltytotal");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return penalty;
    }
    public static float GetGroupIndividualPenalty(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALPENALTY WHERE MEMBERID = "+id+";");
            penalty = rs.getFloat("penalty");

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return penalty;
    }
    public static float getGroupAllShares(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPSHARE;");
            while(rs.next()) {
                allshares = allshares + rs.getFloat("share");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allshares;
    }
    public static float getGroupAllPenalties(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPPENALTY;");
            while(rs.next()) {
                allpenalties = allpenalties + rs.getFloat("penaltytotal");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allpenalties;
    }
    public static float getGroupAllInterests(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINTEREST;");
            while(rs.next()) {
                allinterests = allinterests + rs.getFloat("interest");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allinterests;
    }
    public static float getGroupIndividualAllShares(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALSHARE;");
            while(rs.next()) {
                allshares = allshares + rs.getFloat("share");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allshares;
    }
    public static float getGroupIndividualAllPenalties(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALPENALTY;");
            while(rs.next()) {
                allpenalties = allpenalties + rs.getFloat("penalty");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allpenalties;
    }
    public static float getGroupIndividualAllInterests(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM GROUPINDIVIDUALINTEREST;");
            while(rs.next()) {
                allinterests = allinterests + rs.getFloat("interest");
            }

            stmt.close();
            c.commit();
            c.close();
            System.out.println("successfully queried the records");
        }catch(Exception e){
            System.err.println(e.getClass().getName()+" : "+e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return allinterests;
    }
}
import java.sql.*;
import javax.swing.*;

public class Member{
    public static float shares;
    public static String Fname;
    public static String Lname;
    public static String UserName;
    public static Connection c = null;
    public static Statement stmt = null;
    public static float repays;
    public static int time;
    public static float loan;
    public static float interest;
    public static  float penalty;
    public static float allshares = 0;
    public static float allinterests = 0;
    public static float allpenalties = 0;
    public static void MemberAdd(int id, String username, String firstname, String lastname, int day, int month, int year,int age, int regfees, String email, String phone){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable member registration");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERREGISTRATION (ID,USERNAME,FIRSTNAME,LASTNAME, EMAIL, PHONENUMBER, DAY, MONTH, YEAR, AGE,REGFEES)"+
                    "VALUES ("+id+",'"+username+"','"+firstname+"','"+lastname+"','"+email+"',"+phone+","+day+","+month+","+year+","+age+","+regfees+")";
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
    public static void MakeContribution(int id, int day, int month, int year, float contribution){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable member contribution");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERCONTRIBUTION (MEMBERID, CONTRIBUTION, DAY, MONTH, YEAR)"+
                    "VALUES ("+id+","+contribution+","+day+","+month+","+year+")";
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
    public static void BorrowLoan(int mid, float loan, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable member loan");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERLOAN (MEMBERID, LOAN, DAY, MONTH, YEAR)"+
                    "VALUES ("+mid+","+loan+","+day+","+month+","+year+")";
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
    public static void AddShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERSHARE(MEMBERID, SHARE)"+
                    "VALUES ("+id+","+share+")";
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
    public static void UpdateShares(int id, float share){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE MEMBERSHARE set SHARE = "+share+" WHERE MEMBERID = "+id+";";
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
    public static float GetShares(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERSHARE WHERE MEMBERID = "+id+";");
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
    public static String GetFname(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERREGISTRATION WHERE ID = "+id+";");
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

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERREGISTRATION WHERE ID = "+id+";");
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

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERREGISTRATION WHERE ID = "+id+";");
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
    public static void MakePay(int id, float pay, int day, int month, int year){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("Opened database successfully\ttable member pay");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERPAY (MEMBERID, PAY, DAY, MONTH, YEAR)"+
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
    public static void AddRepayMent(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERREPAYMENT(MEMBERID, REPAY)"+
                    "VALUES ("+id+","+repay+")";
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
    public static void UpdateRepayMent(int id, float repay){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE MEMBERREPAYMENT set REPAY = "+repay+" WHERE MEMBERID = "+id+";";
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
    public static void AddInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERINTEREST(MEMBERID, INTEREST)"+
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
    public static void UpdateInterest(int id, float interest){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE MEMBERINTEREST set INTEREST = "+interest+" WHERE MEMBERID = "+id+";";
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
    public static float getinterest(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERINTEREST WHERE ID = "+id+";");
            while(rs.next()){
                interest = rs.getInt("interest");
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
    public static float getRepayMent(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERREPAYMENT WHERE MEMBERID = "+id+";");
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
    public static int getloanmonth(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERLOAN WHERE MEMBERID = "+id+";");
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
    public static int getloanyear(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERLOAN WHERE MEMBERID = "+id+";");
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
    public static float getLoan(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERLOAN WHERE MEMBERID = "+id+";");
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
    public static int getContributionMonth(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERCONTRIBUTION WHERE MEMBERID = "+id+";");
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
    public static int getContributionYear(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member registration");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERCONTRIBUTION WHERE MEMBERID = "+id+";");
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
    public static void addPenalty(int id, float penalty, float penaltyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "INSERT INTO MEMBERPENALTY(MEMBERID, PENALTY, PENALTYTOTAL)"+
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
    public static void UpdatePenalty(int id, float penalty, float penaltyupdate){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            String sql = "UPDATE MEMBERPENALTY set PENALTY = "+penalty+" WHERE MEMBERID = "+id+";";
            stmt.executeUpdate(sql);
            sql = "UPDATE MEMBERPENALTY set PENALTYTOTAL = "+penaltyupdate+" WHERE MEMBERID = "+id+";";
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
    public static float GetPenalty(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERPENALTY WHERE MEMBERID = "+id+";");
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
    public static float GetTotalPenalty(int id){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERPENALTY WHERE MEMBERID = "+id+";");
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
    public static float getAllShares(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERSHARE;");
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
    public static float getAllPenalties(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERPENALTY;");
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
    public static float getAllInterests(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:project.db");
            c.setAutoCommit(false);

            System.out.println("opened database successfully\ttable member share");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBERINTEREST;");
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
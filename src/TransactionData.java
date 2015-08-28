/**
 * Created by Jay on 8/26/2015.
 */
import java.sql.*;
import java.io.*;

public class TransactionData {

    public int count = 0;
    public String name = "jay";
    public String date = "20150102";
    public double amount = EntryPanel.transAmt;
    public String purchase = EntryPanel.purchase;

    public TransactionData() {

        Connection connection = null;
        Statement stmt = null;
        String sqlData = "";
        count += 1;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:transactions.db");
            //createTable(connection, stmt);
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            System.out.println(amount);
            System.out.println(purchase);

            stmt = connection.createStatement();
            String sql = "INSERT INTO TRANSACTIONS (NUMBER, NAME, DATE, AMOUNT, PURCHASE) " +
                    "VALUES (" + count + ", '" + name + "', " + date + ", " + amount + ", '" + purchase + "' );";
            stmt.executeUpdate(sql);

            stmt.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Records created successfully");
    }

/*    public void createTable(Connection connection, Statement stmt) throws SQLException {
        stmt = connection.createStatement();
        String sql = "CREATE TABLE TRANSACTIONS" +
                "(NUMBER INT    NOT NULL," +
                "NAME    STRING   NOT NULL," +
                "DATE    INT    NOT NULL," +
                "AMOUNT  DOUBLE NOT NULL," +
                "PURCHASE STRING NOT NULL)";
        stmt.executeUpdate(sql);
        stmt.close();
        connection.close();
    }*/

}

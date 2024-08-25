import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

import java.sql.*;

public class DisplayPerson {

public static void main(String args[]) {

try {

Class.forName("org.postgresql.Driver");

Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres"); // Connect to the database

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("SELECT * FROM Person");

System.out.println("PID\tName\tGender\t");

while (rs.next()) {

int pid = rs.getInt("pid");

String name = rs.getString("name");

String gender = rs.getString("gender");

int birth_date = rs.getInt("birth_date");

System.out.println(pid + "\t" + name + "\t" + gender + "\t" );

}

con.close();

} catch (Exception e) {

e.printStackTrace();

}

}

}
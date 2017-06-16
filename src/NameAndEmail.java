import java.sql.*;
import java.util.ArrayList;

public class NameAndEmail {

	private String name;
	private String email;
	public ArrayList<String> message = new ArrayList<String>();

	public void setNameAndEmail(String inputName, String inputEmail) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			
			PreparedStatement prepst;

			String query = ("INSERT INTO NameAndEmail (name, email) Values (?,?)");
			prepst = con.prepareStatement(query);
			name = inputName;
			email = inputEmail;
			prepst.setString(1, name);
			prepst.setString(2, email);
			prepst.executeUpdate();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public ArrayList<String> getNameAndEmail() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");

			String query = ("SELECT * FROM NameAndEmail");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				message.add(rs.getString(2));
				message.add(rs.getString(3));
			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
		return message;
	}

}

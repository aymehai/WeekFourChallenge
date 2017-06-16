import java.sql.*;
import java.util.ArrayList;

public class Education {

	private String education_name = null;
	public ArrayList<String> message = new ArrayList<String>();
	private int i = 1;

	public void setEducation(String inputEducation) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root",
					"password");
			PreparedStatement prepst;
			String query = ("INSERT INTO Education (education_name) Values (?)");
			prepst = con.prepareStatement(query);
			if (i < 10) {
				education_name = inputEducation;
				prepst.setString(1, education_name);
				i++;
				prepst.executeUpdate();

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public ArrayList<String> getEducation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root",
					"password");

			String query = ("SELECT * FROM Education");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				message.add(rs.getString(2));

			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}

		return message;
	}

}

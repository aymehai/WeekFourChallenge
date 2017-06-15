import java.sql.*;

public class Skills {

	private String skills_name = "";
	public String message = "";
	private int i = 1;

	public void setSkills(String inputSkills) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root", "password");
			PreparedStatement prepst;
			String query = ("INSERT INTO Skills (skills_name) Values (?)");
			prepst = con.prepareStatement(query);
			if (i < 10) {
				skills_name = inputSkills;
				prepst.setString(1, skills_name);
				i++;
				prepst.executeUpdate();

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public String getSkills() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root","password");

			String query = ("SELECT * FROM Skills");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				message = message + "\n" + rs.getString(2);

			}
			con.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}

		return message;
	}
}

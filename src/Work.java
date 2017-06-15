import java.sql.*;

public class Work {

	private String work_name = "";
	public String message = "";
	private int i = 1;

	public void setWork(String inputWork) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root",
					"password");
			PreparedStatement prepst;
			String query = ("INSERT INTO Work (work_name) Values (?)");
			prepst = con.prepareStatement(query);
			if (i < 10) {
				work_name = inputWork;
				prepst.setString(1, work_name);
				i++;
				prepst.executeUpdate();

			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public String getWork() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resume?useSSL=false", "root",
					"password");

			String query = ("SELECT * FROM Work");
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

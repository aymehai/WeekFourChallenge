
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RoboResumeServlet")
public class RoboResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RoboResumeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoboResume resume = new RoboResume();

		// Get Education Parameter From HTML
		String educationResponse1 = request.getParameter("education1");
		String educationResponse2 = request.getParameter("education2");
		String educationResponse3 = request.getParameter("education3");
		String educationResponse4 = request.getParameter("education4");
		String educationResponse5 = request.getParameter("education5");
		String educationResponse6 = request.getParameter("education6");
		String educationResponse7 = request.getParameter("education7");
		String educationResponse8 = request.getParameter("education8");
		String educationResponse9 = request.getParameter("education9");
		String educationResponse10 = request.getParameter("education10");

		// Sets Education Using Method From RoboResume Object
		resume.setRoboResumeEducation(educationResponse1);
		resume.setRoboResumeEducation(educationResponse2);
		resume.setRoboResumeEducation(educationResponse3);
		resume.setRoboResumeEducation(educationResponse4);
		resume.setRoboResumeEducation(educationResponse5);
		resume.setRoboResumeEducation(educationResponse6);
		resume.setRoboResumeEducation(educationResponse7);
		resume.setRoboResumeEducation(educationResponse8);
		resume.setRoboResumeEducation(educationResponse9);
		resume.setRoboResumeEducation(educationResponse10);

		// Gets Education Using Method From RoboResume Object
		String education = resume.getRoboResumeEducation();
		request.setAttribute("myEducation", education);

		// Get work Parameter From HTML
		String workResponse1 = request.getParameter("work1");
		String workResponse2 = request.getParameter("work2");
		String workResponse3 = request.getParameter("work3");
		String workResponse4 = request.getParameter("work4");
		String workResponse5 = request.getParameter("work5");
		String workResponse6 = request.getParameter("work6");
		String workResponse7 = request.getParameter("work7");
		String workResponse8 = request.getParameter("work8");
		String workResponse9 = request.getParameter("work9");
		String workResponse10 = request.getParameter("work10");
		String workResponse11 = request.getParameter("work11");

		// Sets work Using Method From RoboResume Object
		resume.setRoboResumeWork(workResponse1);
		resume.setRoboResumeWork(workResponse2);
		resume.setRoboResumeWork(workResponse3);
		resume.setRoboResumeWork(workResponse4);
		resume.setRoboResumeWork(workResponse5);
		resume.setRoboResumeWork(workResponse6);
		resume.setRoboResumeWork(workResponse7);
		resume.setRoboResumeWork(workResponse8);
		resume.setRoboResumeWork(workResponse9);
		resume.setRoboResumeWork(workResponse10);
		resume.setRoboResumeWork(workResponse11);

		// Gets work Using Method From RoboResume Object
		String work = resume.getRoboResumeWork();
		request.setAttribute("myWork", work);
		
		// Get Skills Parameter From HTML
		String skillsResponse1 = request.getParameter("skills1");
		String skillsResponse2 = request.getParameter("skills2");
		String skillsResponse3 = request.getParameter("skills3");
		String skillsResponse4 = request.getParameter("skills4");
		String skillsResponse5 = request.getParameter("skills5");
		String skillsResponse6 = request.getParameter("skills6");
		String skillsResponse7 = request.getParameter("skills7");
		String skillsResponse8 = request.getParameter("skills8");
		String skillsResponse9 = request.getParameter("skills9");
		String skillsResponse10 = request.getParameter("skills10");
		String skillsResponse11 = request.getParameter("skills11");
		String skillsResponse12 = request.getParameter("skills12");
		String skillsResponse13 = request.getParameter("skills13");
		String skillsResponse14 = request.getParameter("skills14");
		String skillsResponse15 = request.getParameter("skills15");
		String skillsResponse16 = request.getParameter("skills16");
		String skillsResponse17 = request.getParameter("skills17");
		String skillsResponse18 = request.getParameter("skills18");
		String skillsResponse19 = request.getParameter("skills19");
		String skillsResponse20 = request.getParameter("skills20");

		// Sets Skills Using Method From RoboResume Object
		resume.setRoboResumeSkills(skillsResponse1);
		resume.setRoboResumeSkills(skillsResponse2);
		resume.setRoboResumeSkills(skillsResponse3);
		resume.setRoboResumeSkills(skillsResponse4);
		resume.setRoboResumeSkills(skillsResponse5);
		resume.setRoboResumeSkills(skillsResponse6);
		resume.setRoboResumeSkills(skillsResponse7);
		resume.setRoboResumeSkills(skillsResponse8);
		resume.setRoboResumeSkills(skillsResponse9);
		resume.setRoboResumeSkills(skillsResponse10);
		resume.setRoboResumeSkills(skillsResponse11);
		resume.setRoboResumeSkills(skillsResponse12);
		resume.setRoboResumeSkills(skillsResponse13);
		resume.setRoboResumeSkills(skillsResponse14);
		resume.setRoboResumeSkills(skillsResponse15);
		resume.setRoboResumeSkills(skillsResponse16);
		resume.setRoboResumeSkills(skillsResponse17);
		resume.setRoboResumeSkills(skillsResponse18);
		resume.setRoboResumeSkills(skillsResponse19);
		resume.setRoboResumeSkills(skillsResponse20);
		

		// Gets Skills Using Method From RoboResume Object
		String skills = resume.getRoboResumeSkills();
		request.setAttribute("mySkills", skills);

		getServletContext().getRequestDispatcher("/RoboResumeJSP.jsp").forward(request, response);
	}

}

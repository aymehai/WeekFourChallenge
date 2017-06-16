
import java.io.IOException;
import java.util.ArrayList;

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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoboResume resume = new RoboResume();
		
		// Get Name & Email Parameter From HTML & Sets Name & Email Using Method From RoboResume Object
		resume.setRoboResumeNameNEmail(request.getParameter("name"), request.getParameter("email"));

		// Gets NameNEmail Using Method From RoboResume Object
		ArrayList<String> nameAndEmail = resume.getRoboResumeNameNEmail();
		String nameAndEmailString = "";
		for(int i = 0; i < nameAndEmail.size(); i++){
			if(!nameAndEmail.get(i).equals("")){
				nameAndEmailString = nameAndEmailString + "<br />" + nameAndEmail.get(i) ;
			}
			else{
				break;
			}
				
		}
		
		request.setAttribute("myNameAndEmail", nameAndEmailString);
		
		// Get Education Parameter From HTML & Sets Education Using Method From RoboResume Object
		resume.setRoboResumeEducation(request.getParameter("education1"));
		resume.setRoboResumeEducation(request.getParameter("education2"));
		resume.setRoboResumeEducation(request.getParameter("education3"));
		resume.setRoboResumeEducation(request.getParameter("education4"));
		resume.setRoboResumeEducation(request.getParameter("education5"));
		resume.setRoboResumeEducation(request.getParameter("education6"));
		resume.setRoboResumeEducation(request.getParameter("education7"));
		resume.setRoboResumeEducation(request.getParameter("education8"));
		resume.setRoboResumeEducation(request.getParameter("education9"));
		resume.setRoboResumeEducation(request.getParameter("education10"));

		// Gets Education Using Method From RoboResume Object
		ArrayList<String> education = resume.getRoboResumeEducation();
		String educationString = "";
		for(int i = 0; i < education.size(); i++){
			if(!education.get(i).equals("")){
			educationString = educationString + "<br />" + education.get(i) ;
			}
			else{
				break;
			}
				
		}
		
		request.setAttribute("myEducation", educationString);

		// Get Work Parameter From HTML & Sets work Using Method From RoboResume Object
		resume.setRoboResumeWork(request.getParameter("work1"));
		resume.setRoboResumeWork(request.getParameter("work2"));
		resume.setRoboResumeWork(request.getParameter("work3"));
		resume.setRoboResumeWork(request.getParameter("work4"));
		resume.setRoboResumeWork(request.getParameter("work5"));
		resume.setRoboResumeWork(request.getParameter("work6"));
		resume.setRoboResumeWork(request.getParameter("work7"));
		resume.setRoboResumeWork(request.getParameter("work8"));
		resume.setRoboResumeWork(request.getParameter("work9"));
		resume.setRoboResumeWork(request.getParameter("work10"));
		resume.setRoboResumeWork(request.getParameter("work11"));

		// Gets work Using Method From RoboResume Object
		ArrayList<String> work = resume.getRoboResumeWork();
		String workString = "";
		for(int i = 0; i < work.size(); i++){
			if(!work.get(i).equals("")){
			workString = workString + "<br />" + work.get(i) ;
			}
			else{
				break;
			}
		}
		
		request.setAttribute("myWork", workString);

		// Get Skills Parameter From HTML & Sets Skills Using Method From RoboResume Object
		resume.setRoboResumeSkills(request.getParameter("skills1"));
		resume.setRoboResumeSkills(request.getParameter("skills2"));
		resume.setRoboResumeSkills(request.getParameter("skills3"));
		resume.setRoboResumeSkills(request.getParameter("skills4"));
		resume.setRoboResumeSkills(request.getParameter("skills5"));
		resume.setRoboResumeSkills(request.getParameter("skills6"));
		resume.setRoboResumeSkills(request.getParameter("skills7"));
		resume.setRoboResumeSkills(request.getParameter("skills8"));
		resume.setRoboResumeSkills(request.getParameter("skills9"));
		resume.setRoboResumeSkills(request.getParameter("skills10"));
		resume.setRoboResumeSkills(request.getParameter("skills11"));
		resume.setRoboResumeSkills(request.getParameter("skills12"));
		resume.setRoboResumeSkills(request.getParameter("skills13"));
		resume.setRoboResumeSkills(request.getParameter("skills14"));
		resume.setRoboResumeSkills(request.getParameter("skills15"));
		resume.setRoboResumeSkills(request.getParameter("skills16"));
		resume.setRoboResumeSkills(request.getParameter("skills17"));
		resume.setRoboResumeSkills(request.getParameter("skills18"));
		resume.setRoboResumeSkills(request.getParameter("skills19"));
		resume.setRoboResumeSkills(request.getParameter("skills20"));
		

		// Gets Skills Using Method From RoboResume Object
		ArrayList<String> skills = resume.getRoboResumeSkills();
		String skillsString = "";
		for(int i = 0; i < skills.size(); i++){
			if(!skills.get(i).equals("")){
			skillsString = skillsString + "<br />" + skills.get(i);
			}
			else{
				break;
			}
		}
		request.setAttribute("mySkills", skillsString);

		getServletContext().getRequestDispatcher("/RoboResumeJSP.jsp").forward(request, response);
	}

}

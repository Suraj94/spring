package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.object.Student;

@Controller
public class StudentController
{
	@RequestMapping("/signup")
	public String studentInformation()
	{
		return "student-sign-up";
	}

	@RequestMapping("/processForm")
	public String processStudentPage(HttpServletRequest request, Model model)
	{
		System.out.println(">> In Process Form");
		Student student = new Student();
		student.setFirstName(request.getParameter("studentName"));
		student.setLastName(request.getParameter("studentLastName"));
		student.setMiddleName(request.getParameter("studentMiddleName"));
		String fullName = student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName();
		student.setFullName(fullName.toUpperCase());
		String result=student.getFullName();
		model.addAttribute("student-info", result);
		return "student-display";
	}
}

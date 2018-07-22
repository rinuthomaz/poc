/**
 * 
 */
package com.rinu.poc.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rinu.poc.SMParser;



/**
 * @fileName BaleRouteLoginController.java 
 * @author rthoma24
 * @Project BaleRoute
 * @Date Nov 29, 2016 
 * @Sprint
 * @UserStory
 * @Theme BaleRouteLoginController
 * 
 */
@Controller
public class RinuPocLoginController {

//	private static final String MESSAGE = "EXPIRING COOKIE at ";
//
//	@Value("${cookie.path}")
//	private String cookiePath;
//
//	@Value("${cookie.domain}")
//	private String cookieDomain;

	// on login
//	@RequestMapping("/")
//	public String getIndexPage(ModelMap model, HttpServletRequest request) {
//		String appId = "de";
//
//		SMParser smp = new SMParser(request, appId);
//		String smUser = smp.getUserName();
//		String[] roles = smp.getRoles();
//		String[] groups = smp.getGroups();
//		String firstName = request.getHeader("sm_fname").replace('\n', ' ').trim();
//		String emailId = request.getHeader("sm_email").replace('\n',' ').trim();
////		String smUser = "deisup1";
////		String[] roles = {"RODESUPERUSER"};
////		String[] groups = {"K00139", "K00175", "K00136"};
////		String firstName = "Krutika";
////		String emailId = "kmahagao@wm.com";
//		
//		System.out.println("user name(sm_user)" + smUser+"\nFirstName: "+firstName);
//		System.out.println("sm_email" + emailId);
//		
//		for (int i = 0; i < groups.length; i++) {
//			roles = smp.getRoles(groups[i]);
//			if (roles.length == 0) {
//				System.out.println("Group[" + i + "]='" + groups[i] + "'\n");
//				continue;
//			}
//			for (int j = 0; j < roles.length; j++) {
//				System.out.println("Group[" + i + "]='" + groups[i]
//						+ "' - Role[" + j + "]=" + roles[j]);
//			}
//		}
//		
//		Gson gson = new Gson();
//
//		model.addAttribute("firstName", firstName);
//		model.addAttribute("userId", smUser);
//		model.addAttribute("roles", gson.toJson(roles));
//		model.addAttribute("marketAreas", gson.toJson(groups));
//		model.addAttribute("emailId", emailId);
//		if(roles.length == 1 && roles[0].equals("RODEOPERATOR")){
//			return "authError";
//		}else {
//			return "landing";
//		}
//	}
	
	@RequestMapping("/")
	public String getIndexPage() {
		return "landing";
	}

	// on click of logout
//	@RequestMapping("/logout")
//	public void logout(HttpServletRequest request, HttpServletResponse response)
//			throws IOException {
//		System.out.println("logout");
//		HttpSession session = request.getSession();
//		Cookie[] cookies = request.getCookies();
//		System.out.println("****************** " + cookies);
//		if (cookies != null)
//			for (int i = 0; i < cookies.length; i++) {
//				System.out.println("In DEILogout,Before Deleting cookies"
//						+ cookies[i].getName() + "::" + cookies[i].getValue());
//				if ("SMSESSION".equals(cookies[i].getName())) {
//					cookies[i].setValue("null");
//					cookies[i].setPath("/");
//					cookies[i].setMaxAge(0);
//					cookies[i].setDomain(".wm.com");
//					cookies[i].setComment(MESSAGE + System.currentTimeMillis());
//					response.addCookie(cookies[i]);
//
//				} else if ("JSESSIONID".equals(cookies[i].getName())) {
//					System.out.println("Jsession cookie path: "
//							+ cookies[i].getPath() + " domain: "
//							+ cookies[i].getDomain());
//					cookies[i].setValue("null");
//					cookies[i].setPath(cookiePath);
//					cookies[i].setMaxAge(0);
//					cookies[i].setDomain(cookieDomain);
//					cookies[i].setComment(MESSAGE + System.currentTimeMillis());
//					response.addCookie(cookies[i]);
//				} else {
//					cookies[i].setValue("");
//					cookies[i].setPath("/");
//					cookies[i].setMaxAge(0);
//					cookies[i].setComment(MESSAGE + System.currentTimeMillis());
//					response.addCookie(cookies[i]);
//				}
//				System.out.println("In DEILogout,After Deleting cookies"
//						+ cookies[i].getName() + "::" + cookies[i].getValue());
//			}
//		session.invalidate();
//		String siteuri = "/";
//		response.sendRedirect(siteuri);
//	}
}

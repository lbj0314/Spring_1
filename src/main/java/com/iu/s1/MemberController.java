package com.iu.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.s1.member.MemberDTO;

@Controller
@RequestMapping("/member/**")
public class MemberController {


	//memberJoin POST
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO, HttpServletRequest request ) {

		return "redirect:../home.jsp";
	}

	//memberJoin GET
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public Model memberJoin(Model model) {
		String id = "momo";
		String pw = "momo";
		String name = "momo";
		String phone = "010-1234-5678";
		String email = "momo@momo.momo";
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		model.addAttribute("name", name);
		model.addAttribute("phone", phone);
		model.addAttribute("email", email);

		return model;
	}

	//memberLogin POST
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpServletRequest request) {

		return "redirect:../home.jsp";
	} 

	//memberLogin GET
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public Model memberLogin(Model model) {
		String id = "momo";
		String pw = "momo";
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return model;
	}

}

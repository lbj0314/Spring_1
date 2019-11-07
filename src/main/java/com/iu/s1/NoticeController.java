package com.iu.s1;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.notice.NoticeDTO;
import com.iu.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	private NoticeService noticeService;
	
	public NoticeController() {
		noticeService = new NoticeService();
	}
	
	
	//noticeWrite POST
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public String noticeWrite(NoticeDTO noticeDTO, HttpServletRequest request) {
		
		return "redirect:./";
	}

	//noticeWrite GET
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public ModelAndView noticeWrite(NoticeDTO noticeDTO) throws Exception{	
		int result = noticeService.noticeWrite(noticeDTO);
		ModelAndView mv = new ModelAndView();
		mv.addObject("write", result);
		mv.setViewName("notice/noticeWrite");
		return mv;
	}

	//noticeSelect One
	@RequestMapping(value = "noticeSelect", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView noticeSelect(HttpServletRequest request,int num) throws Exception {
		NoticeDTO noticeDTO = noticeService.noticeSelect(request);
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		return mv;
	}

	//noticeList
	@RequestMapping("noticeList")
	public ModelAndView noticeList() throws Exception {
		List<NoticeDTO> ar = noticeService.noticeList();
			// URL notice/noticeList
			// return notice/noticeList
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		
		return mv;
	}


}

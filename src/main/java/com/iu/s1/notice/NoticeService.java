package com.iu.s1.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class NoticeService {
	
	private NoticeDAO noticeDAO;
//	private NoticeDTO noticeDTO;
	
	public NoticeService() {
		noticeDAO = new NoticeDAO();
//		noticeDTO = new NoticeDTO();
	}
	
	
	//list
	public List<NoticeDTO> noticeList() throws Exception {
		List<NoticeDTO> ar = noticeDAO.noticeList();
		
		return ar;
	}
	
	//select One
	public NoticeDTO noticeSelect(HttpServletRequest request) throws Exception{
		int num = Integer.parseInt(request.getParameter("num"));
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		
		return noticeDTO;
	}
	
	//write
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception{
		int result = noticeDAO.noticeWrite(noticeDTO);
		
		return result;
	}
	
	
}

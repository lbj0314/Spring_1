package com.iu.notice;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Inject
	private NoticeDAO noticeDAO;
//	private NoticeDTO noticeDTO;
	
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

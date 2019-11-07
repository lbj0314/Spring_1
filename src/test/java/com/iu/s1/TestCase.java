package com.iu.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import com.iu.notice.NoticeDAO;


public class TestCase extends TestAbstractCase{
	
	@Inject
	private NoticeDAO noticeDAO;
	
	@Test
	public void test() {
		assertNotNull(noticeDAO);
	}

}

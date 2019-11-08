package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {

	@Inject
	private DataSource dataSource;
	
	//list
	public List<NoticeDTO> noticeList() throws Exception{
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		Connection con = dataSource.getConnection();
		String sql = "SELECT * FROM notice ORDER BY num DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));

			ar.add(noticeDTO);	
		}
		rs.close();
		st.close();
		con.close();

		return ar;
	}
	//select One
	public NoticeDTO noticeSelect(int num) throws Exception{
		NoticeDTO noticeDTO = null;
		Connection con = dataSource.getConnection();
		String sql = "SELECT * FROM notice WHERE num = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			noticeDTO = new NoticeDTO();

			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));

		}
		rs.close();
		st.close();
		con.close();

		return noticeDTO;
	}
	//write
	public int noticeWrite(NoticeDTO noticeDTO) throws Exception {
		int result = 0;
		
		Connection con = dataSource.getConnection();
		String sql = "INSERT INTO notice "
				+ "VALUES(board_seq.nextval, ?, ?, ?, SYSDATE, 0)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getWriter());
		st.setString(3, noticeDTO.getContents());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	//update

	//delete




}

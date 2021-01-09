package com.srivish.shanti.testAngularJS2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.srivish.shanti.testAngularJS2.dto.Group;

public class AJSDao {
	
   JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
   public List<Group> getGroups(){
	   String sql ="select AD_DYNAMIC_GROUP_CRITERIA_PK,AD_GROUP_DN,nvl(DESCRIPTION,' '),SQL_FILTER,nvl(OWNER,' '),LAST_MODIFIED_DATE,LAST_MODIFIED_BY from AD_DYNAMIC_GROUP_CRITERIA where ACTIVE_IND='Y'";
	   return template.query(sql,new RowMapper<Group>(){    
	        public Group mapRow(ResultSet rs, int row) throws SQLException {    
	            Group c=new Group();    
	            c.setAdDynamicGroupCriteriaPk(rs.getInt(1));    
	            c.setAdGroupDN(rs.getString(2));    
	            c.setDescription(rs.getString(3));    
	            c.setSqlFilter(rs.getString(4));    
	            c.setOwner(rs.getString(5));    
	            c.setLastModifiedDate(rs.getDate(6));    
	            c.setLastModifiedBy(rs.getString(7));    
	            return c;    
	        }    
	    });    
   }
}

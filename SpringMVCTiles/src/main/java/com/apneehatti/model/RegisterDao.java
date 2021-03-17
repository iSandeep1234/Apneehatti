package com.apneehatti.model;


import org.springframework.jdbc.core.JdbcTemplate;


import com.apneehatti.pojo.Contact;


public class RegisterDao {
	private JdbcTemplate template;  
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
     
	
	public int save(Contact p){ 
		
		System.out.println("value inserting");
	    String sql="insert into userregister(name,emailId,mobileNo,password) values('"+p.getName()+"','"+p.getEmailId()+"','"+p.getMobileNo()+"','"+p.getPassword()+"')";    
	    return template.update(sql);    
	}
	
	

}

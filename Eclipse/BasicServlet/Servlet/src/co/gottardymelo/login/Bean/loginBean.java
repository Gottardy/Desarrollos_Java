package co.gottardymelo.login.Bean;

import java.io.Serializable;

public class loginBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	
	public loginBean() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean autentication() {
		//operardor ternario de java
		return (password.equals("devops"))?true:false;
	}

}

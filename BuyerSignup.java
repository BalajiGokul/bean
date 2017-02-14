package com.project.bean;

import java.util.Date;

public class BuyerSignup 
{
			String username,password,email;
			int phonenumber;
			Date birthday;
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public int getPhonenumber() {
				return phonenumber;
			}
			public void setPhonenumber(int phonenumber) {
				this.phonenumber = phonenumber;
			}
			public Date getBirthday() {
				return birthday;
			}
			public void setBirthday(Date birthday) {
				this.birthday = birthday;
			}

}

package vn.iotstar.models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable {
	private static final long serialVersionUID = -2878163533928811390L;

	// Khai bao cac truong trong DB
	private int id;
	private String username;
	private String email;
	private String password;
	private String fullname;
	private String images;
	private int roleid;
	private String phone;
	private Date createdate;
	
	

	public UserModel(String username, String email, String password, String fullname, String images, int roleid,
			String phone, Date createdate) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.images = images;
		this.roleid = roleid;
		this.phone = phone;
		this.createdate = createdate;
	}
	
	

	public UserModel(String username, String email, String password, String fullname, String phone) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.phone = phone;
	}



	// Tao Constructor
	public UserModel() {
		super();
	}

	// Tao getters va setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	// override
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", fullname=" + fullname + ", images=" + images + ", roleid=" + roleid + ", phone=" + phone
				+ ", createdate=" + createdate + "]";
	}




}

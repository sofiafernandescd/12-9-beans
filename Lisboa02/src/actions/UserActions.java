package actions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import bean.User;

@ManagedBean(name = "userActions")
@RequestScoped
public class UserActions {
	
	@ManagedProperty(value = "#{user}")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void sayHello() {
		this.user.setMessage("Hello " + user.getFirstName() + " " + user.getLastName());
	}
}
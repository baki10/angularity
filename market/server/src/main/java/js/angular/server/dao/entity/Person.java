package js.angular.server.dao.entity;

import javax.persistence.Entity;

/**
 * Created by ilmir on 02.06.16.
 */
@Entity
public class Person extends BaseEntity {

	private String firstName;
	private String lastName;

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

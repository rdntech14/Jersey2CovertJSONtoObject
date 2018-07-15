package package1;

import java.util.Arrays;

public class POJOObject {

	public String name;
	public int id;
	public String[] roles;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String[] getRoles() {
		return roles;
	}

	@Override
	public String toString() {
		return "POJOObject [name=" + name + ", id=" + id + ", roles=" + Arrays.toString(roles) + "]";
	}

}

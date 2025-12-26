package learn.sping.spr1;

public class User {
	
	Profile profile;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Profile profile) {
		super();
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [profile=" + profile + "]";
	}
}

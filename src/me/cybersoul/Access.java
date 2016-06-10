package me.cybersoul;

public class Access {
	
	private final Accessable access;
	private boolean hasAccess = false;
	
	public Access(Accessable access) {
		this.access = access;
	}
	
	public Accessable getAccessable() {
		return access;
	}
	
	public void giveAccess() {
		hasAccess = true;
	}
	
	public void revokeAccess() {
		hasAccess = false;
	}
	
	public boolean hasAccess() {
		return hasAccess;
	}
	
}

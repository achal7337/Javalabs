package labTest;

public class LockedStorage{
	private String password, content;
	private boolean lock;
	
	public LockedStorage(String password) {
		this.password = password;
		content = "";
	}
	
	
	public  LockedStorage(String password, String content) {
		
			this.password= password;
			this.content = content;
		
	}
	
	public boolean setContent(String content) throws Exception {
		if(!lock) {
			this.content=content;
			return true;
		}
		else throw new LockedStorageException();
	}
	
	public String getContent() throws Exception{
		if(!lock) {
			return this.content;
		} else throw new LockedStorageException();
	}
	
	
	public void setPassword(String password) throws Exception {
		if(!lock) {
			this.password = password;
		} else throw new LockedStorageException();

	}
	
	public void lock() {
		lock = true;
	}
	
	public boolean unlock(String password) {
		if(password.equals(this.password)) {
			lock = false;
			return true;
		}
		else 
			return false;
	}
	public boolean isLocked() {
		return this.lock;
	}


	@Override
	public String toString() {
		
		if(!lock) {
			return "Content:\n" + this.content;
		}else return "LOCKED";
	}
	
	
	
	
}
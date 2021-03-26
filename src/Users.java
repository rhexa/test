public class Users {
	static int id = 0 ;
	
	public Users () {
		id++;
	}

	public static int getId() {
		return id;
	}
	
}
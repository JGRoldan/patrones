package prototype;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNombre("Juan");
		user1.setApellido("Perez");
		user1.setEdad(20);
		
		User user2 = user1.clone();
		user2.setApellido("Rodriguez");
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		
	}

}

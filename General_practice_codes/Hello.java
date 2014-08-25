//@creatorvision_shivanggupta

class Hello{
	
	public static void main(String[] args) {
		
		boolean bool;
		bool= (true|| false)|true;
		if(bool)
		{
			display();
		}
		else
		{
			System.exit(0);
		}

	}

	public static void display()
		{
			System.out.print("Hello"+" ");
			System.out.println("World !");
		} 
}
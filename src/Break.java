
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		back:{
		for(int i=0;i<5;i++){
			if(i==2){
				break back;
			}
			System.out.println(i);
		}
	}
			

	}

}

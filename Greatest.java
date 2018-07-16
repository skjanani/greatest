package janani;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2;
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		n1=ja.nextInt();
		n2=ja.nextInt();
		if(n1>n2||n1>n2){
			System.out.println(n1);
		}
		else if(n1>n||n1>n2){
			System.out.println(n2);
		}
		else{
			System.out.println(n);
		}

	}

}

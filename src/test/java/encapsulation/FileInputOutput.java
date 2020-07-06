

package encapsulation;

import java.io.IOException;
import java.io.PrintWriter;

public class FileInputOutput {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       PrintWriter out = new PrintWriter("Oceans.txt");
       out.println("Atlantic");
       out.println("Indian");
	   out.close();
	   
	}

}

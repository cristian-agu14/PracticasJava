package metoditos;

import java.time.Instant;
import java.util.Random;

public class Cositas {

	public static void main(String[] args) {
		Long a = Instant.now().getEpochSecond();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long b = Instant.now().getEpochSecond();
		System.out.println(a);
		System.out.println(b);
				
	}

}

package core;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CLA_Division {

	public static void main(String[] args) {
		if(args.length<2){
			System.err.println("Minimum 2 parameters...");
			System.exit(2);
		}
		Double result = Double.valueOf(args[0]);
		for (int i=1;i<args.length;i++){
			result/=Double.valueOf(args [i]);
		}
		System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));

	}

}

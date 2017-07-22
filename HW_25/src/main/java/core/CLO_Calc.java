package core;



import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = "=")

public class CLO_Calc {
	@Parameter (names = { "-o", "--operator"}, description = "Operator")
	static String operator = null;
	
	@Parameter (names = {"-1", "--operands"}, variableArity = true, description = "List of operands")
	static List<Double> operands = new ArrayList<Double>();

	public static void main(String[] args) {
		for(String a: args){
			if(a.matches("[@&]")){
				System.err.println("Invalid characters");
				System.exit(2);
			}
		}
		JCommander.newBuilder().addObject(new CLO_Calc()).build().parse(args);
		
		if(operator == null || !operator.matches("[+-/*/]")){
			System.err.println("Please specify the operator = - * /");
		}
		else if(operands.size()==0){
			System.err.println("List of operands is empty");
		}
		
		else{
			//ArrayList<Double> operands = null;
			Double result = operands.get(0);
			for(int i=1;i<operands.size();i++){
				switch (operator){
				case "+": result+=operands.get(i); break;
				case "-": result-=operands.get(i); break;
				case "*": result*=operands.get(i); break;
				case "/": result/=operands.get(i); break;
				}
			}
			System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
		}
		

	}

}

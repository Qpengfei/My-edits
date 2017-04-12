
public class int_formula {

	private int a;
	private int b;
	private char op;
    int result;
    float result1;
    Fraction result2=new Fraction();
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void setFormula(){
		this.a = (int)(Math.random()*100);
		this.b = (int)(Math.random()*100);
		switch((int)(Math.random()*4)){
		case 0 :op = '+';result=a+b;break;
		case 1 :op = '-';result=a-b;break;
		case 2 :op = '*';result=a*b;break;
		case 3 :op = '/';
		        while(this.b == 0){
		        	this.b = (int)(Math.random()*100);
		        	}
		        if(a%b==0)
		        	result=a/b;
		        result1=(float)a/b;
		        result2.setter(a, b);
		        result2 = result2.reduce_deno(result2);
		    	break;
		        }
		output();
		}
	
	public void output(){
		if(op=='/'){
			System.out.printf("%d ¡Â %d = ",a,b);
		}
		else
			System.out.printf("%d %c %d = ",a,op,b);
		
	}
}

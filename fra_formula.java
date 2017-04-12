
public class fra_formula {
	private Fraction f1;
	private Fraction f2;
	private char op;
	int result;
	float result1;
	Fraction result2;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Fraction getF1() {
		return f1;
	}
	public void setF1(Fraction f1) {
		this.f1 = f1;
	}
	public Fraction getF2() {
		return f2;
	}
	public void setF2(Fraction f2) {
		this.f2 = f2;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
	
	public void setFormula(){
		this.f1 = new Fraction();
		f1 = f1.Random();
		this.f2 = new Fraction();
		f2 = f2.Random();			
		result2 = new Fraction();
		switch((int)(Math.random()*4)){
		case 0 :op = '+';result2=result2.plusResult(f1, f2);break;
		case 1 :op = '-';result2=result2.minusResult(f1, f2);break;
		case 2 :op = '*';result2=result2.multiply(f1, f2);break;
		case 3 :op = '/';
		        while(f2.getNume()==0){
		        	f2=f2.Random();
		        }
		        result2=result2.divide(f1, f2);break;
		        }
		if(result2.getNume()%result2.getDeno()==0) {
			result=result2.getNume()/result2.getDeno();
		
		}
		result1 = (float)(int)((float)result2.getNume()/result2.getDeno()*100)/100;
		output();
		}
	
	public void output(){
		if(f1.getNume()%f1.getDeno()==0||f2.getNume()%f2.getDeno()==0){
			if(f1.getNume()%f1.getDeno()==0&&f2.getNume()%f2.getDeno()==0){
				if(op=='/'){
					System.out.printf("%d ¡Â %d = ",f1.getNume()/f1.getDeno(),f2.getNume()/f2.getDeno());
					}
				else
					System.out.printf("%d %c %d = ",f1.getNume()/f1.getDeno(),op,f2.getNume()/f2.getDeno());
			}
			else if(f1.getNume()%f1.getDeno()==0&&f2.getNume()%f2.getDeno()!=0){
				if(op=='/'){
					System.out.printf("%d ¡Â %d/%d = ",f1.getNume()/f1.getDeno(),f2.getNume(),f2.getDeno());
					}
				else
					System.out.printf("%d %c %d/%d = ",f1.getNume()/f1.getDeno(),op,f2.getNume(),f2.getDeno());

			}
			else{
				if(op=='/'){
					System.out.printf("%d/%d ¡Â %d = ",f1.getNume(),f1.getDeno(),f2.getNume()/f2.getDeno());
					}
				else
					System.out.printf("%d/%d %c %d = ",f1.getNume(),f1.getDeno(),op,f2.getNume()/f2.getDeno());

			}

		}
		else{
			if(op=='/'){
				System.out.printf("%d/%d ¡Â %d/%d = ",f1.getNume(),f1.getDeno(),f2.getNume(),f2.getDeno());
			}
			else
				System.out.printf("%d/%d %c %d/%d = ",f1.getNume(),f1.getDeno(),op,f2.getNume(),f2.getDeno());
			
		}
	}
	
}

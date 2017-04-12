import java.text.DecimalFormat;
import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;
	public int getNume() {
		return numerator;
	}
	public int getDeno() {
		return denominator;
	}
	void Fraction(int a,int b){
		this.numerator=a/GCD(a, b);
		this.denominator=b/GCD(a, b);

	}
	void setter(int a, int b){
		this.numerator = a;
		this.denominator = b;
	}
	Fraction reduce_deno(Fraction f){
		int deno = GCD(f.numerator, f.denominator);
		f.numerator=f.numerator/deno;
		f.denominator=f.denominator/deno;
		return f;	
	}
	Fraction reduce_deno(int a,int b){
		a = a/GCD(a, b);
		b = b/GCD(a, b);
		Fraction f = new Fraction();
		f.numerator = a;
		f.denominator = b;
		return f;
	}
	Fraction[] same_deno(Fraction f1,Fraction f2){
		Fraction [] f = new Fraction[2];
		f[0]=new Fraction();
		f[1]=new Fraction();
		f[0].denominator =LCM(f1.denominator, f2.denominator);
		f[1].denominator = LCM(f1.denominator, f2.denominator);
		f[0].numerator = f1.numerator*(LCM(f1.denominator, f2.denominator)/f1.denominator);
		f[1].numerator = f2.numerator*(LCM(f1.denominator, f2.denominator)/f2.denominator);
		return f;
		
	}
	
	int GCD(int a,int b){
		int c;
		while(a%b!=0){
			c=a%b;
			a=b;
			b=c;
		}
		return b;
	}
	
	int LCM(int a, int b){
		return a*b/GCD(a,b);
	}
	
	Fraction plusResult(Fraction f1,Fraction f2){
		Fraction result = new Fraction();
		Fraction [] f = new Fraction[2];
		f=same_deno(f1, f2);
		result.numerator=f[0].numerator+f[1].numerator;
		result.denominator = f[0].denominator;
		result = reduce_deno(result);
		return result;
	}
	
	Fraction minusResult(Fraction f1,Fraction f2){
		Fraction result = new Fraction();
		Fraction [] f = new Fraction[2];
		f=same_deno(f1, f2);
		result.numerator=f[0].numerator-f[1].numerator;
		result.denominator = f[0].denominator;
		result = reduce_deno(result);
		return result;
	}
	
	Fraction multiply(Fraction f1,Fraction f2){
		Fraction result = new Fraction();
		result.numerator = f1.numerator*f2.numerator;
		result.denominator = f1.denominator*f2.denominator;
		result = reduce_deno(result);
		return result;
	}
	
	Fraction divide(Fraction f1, Fraction f2){
		Fraction result = new Fraction();
		result.numerator = f1.numerator*f2.denominator;
		result.denominator = f1.denominator*f2.numerator;
		result = reduce_deno(result);
		return result;
	}
	Fraction parseFraction(String s){
		Fraction f = new Fraction();
		String num = new String();
		String deno = new String();
		if(s.indexOf('/')!=-1){
			String[] result = s.split("/");
	     	num = result[0];
			deno = result[1];
			f.numerator = Integer.parseInt(num);
			f.denominator = Integer.parseInt(deno);
		}
		else{
			f=f.parseFraction(Integer.parseInt(s));
		}
			
		
		return f;	
	}
	
	Fraction parseFraction(int a){
		Fraction f = new Fraction();
		f.numerator = a;
		f.denominator = 1;
		return f;	
	}
	public boolean equals(Fraction fr){
		if(this.numerator == fr.numerator&&this.denominator == fr.denominator)
			return true;
		else
			return false;
	}
	
	public boolean isInteger(){
		if(this.numerator%this.denominator==0){
			return true;
		}
		else 
			return false;
	}
	
	public boolean isLeagal(){
		if(this.denominator == 0) 
			return false;
		else 
			return true;
	}
	public void output(){
		System.out.printf("%d/%d",this.numerator,this.denominator);
	}
	public Fraction Random(){
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		while(b==0){
			 b = (int)(Math.random()*10);
			 
		}
		Fraction f = new Fraction();
		f.Fraction(a,b);
		return f;
		
	}
}  

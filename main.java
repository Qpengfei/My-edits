import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*[] result = "-17/1".split("/");
		System.out.println(Integer.parseInt(result[0]));
		System.out.println(Integer.parseInt(result[1]));
*/
	int flag = 1;
	int int_num = 0;
	int fra_num = 0;
	int correct_num = 0;
	float accuracy;
	System.out.println("输入题目数量：");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int_num = (int)(num/2);
	fra_num = num-int_num;
	int answer = 0;
	float answer1 = 0;
	Fraction answer2 = new Fraction();
	while(flag == 1){
		int_formula[] intf =new int_formula[num];
		for(int i = 0;i<int_num;i++){
			int_formula ex = new int_formula();
			System.out.printf("%d. ",i+1);
			ex.setFormula();
			intf[i]=ex;
			Scanner ss = new Scanner(System.in);
			String getinput=ss.nextLine();
			while(getinput.indexOf('/')== 1){
				answer2 = answer2.parseFraction(getinput);
				if(!answer2.isLeagal()){
					System.out.println("分母不能为0！");		
					}
				getinput=ss.nextLine();
				}
			
			if(ex.getOp()=='/'){
				if(ex.result2.isInteger()){
					answer = Integer.parseInt(getinput);
					answer1 = (float)answer;
					answer2 = answer2.parseFraction(answer);
				}
				else{
					answer1 = (float)answer;
					answer2 = answer2.parseFraction(getinput);
				}
					
			}
			else{
				answer = Integer.parseInt(getinput);
			}
			
			if(ex.getOp()!='/'){
				if(ex.result==answer){
					correct_num++;
					System.out.println("correct");
				}
					
				else 
					System.out.println("error");
			}
			else{
				if((ex.result==answer&&ex.result2.isInteger())||ex.result1==answer1||ex.result2.equals(answer2)){
					correct_num++;
					System.out.println("correct");
				}
				else 
					System.out.println("error");
				
				}
		
	}

		
		
		fra_formula[] fraf = new fra_formula[num];
		for(int i = 0;i<fra_num;i++){
			fra_formula ex = new fra_formula();
			System.out.printf("%d. ",int_num+i+1);
			ex.setFormula();
			fraf[i]=ex;
			Scanner ss = new Scanner(System.in);
			String getinput=ss.nextLine();
				if(getinput.indexOf('/')==-1){
					if(getinput.indexOf('.')==-1){
						answer = Integer.parseInt(getinput);
					}
					answer1=(float) Double.parseDouble(getinput);
				}else{
					
					answer2 = answer2.parseFraction(getinput);
				}
				

				
				if(ex.result2.isInteger()){
					if(answer1==ex.result1||answer==ex.result){
						correct_num++;
						System.out.println("correct");
					}else
						System.out.println("error");
				}
				else{
					if(answer2.equals(ex.result2)||answer1==ex.result1){
						correct_num++;
						System.out.println("correct");
					}else
						System.out.println("error ");
					}
				}
			
		
		accuracy = (float)correct_num/num;
		
		System.out.printf("共%d题,做对%d题,正确率：%.2f",num,correct_num,accuracy*100);
		System.out.println('%');
		System.out.println("继续做题输入做题数，结束做题输入-1");
		num=scan.nextInt();
		if(num==-1) flag =0;
		}
	}
}
	
	
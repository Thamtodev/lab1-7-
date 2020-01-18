package lab4;

public class Calculator {
    public int x,y,z;
    //method No get input No set output
    public void Multiply(){
        y=2;
        for(x=1;x<=12;x++){
            z=x*y;
            System.out.println(y+"*"+x+"="+z);
        }
    }
    //get input
    public void Add(int a, int b ){
        z= a+b;
        System.out.println(a+"+"+b+"="+z);
    }
    // set output
    public int oddEven(){
        x=11;
        if(x%2 ==0){
            return x;
        }else{
            return 1;
        }
    }
    public int Grade(int score1,int score2,int midterm,int finalterm){
        return score1+score2+midterm+finalterm;
        
    }
}
  

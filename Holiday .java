/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Holiday {
    private String name;
    private int day;
    private String month;
    
Holiday(String n,int d,String m){
    name=n;
    day=d;
    month=m;
}

String getMonth(){
    return this.month;
}
int getDay(){
    return this.day;
}

    boolean inSameMonth(Holiday hol2){
        return (month==hol2.month)?true:false;
    }
    public static double avgDay(Holiday hol[]){
        int sum=0;
        for(int i=0;i<hol.length;i++){
            sum+=hol[i].getDay();
        }
        return sum/hol.length;
    }

}

public class Main{
	public static void main(String[] args) {
		Holiday hol1=new Holiday("Sunday",3,"September");
		Holiday hol2=new Holiday("Monday",17,"September");
		Holiday hol3=new Holiday("Saturday",7,"November");
		Holiday hol[]=new Holiday[3];
		hol[0]=hol1;
		hol[1]=hol2;
		hol[2]=hol3;
		System.out.println(hol1.inSameMonth(hol2));
		System.out.println(Holiday.avgDay(hol));
	}
}




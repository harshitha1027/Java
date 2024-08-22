package pack;

public class methodOverLoading {
	public int Sum(int x,int y) {
		return (x+y);
		
	}
	public int Sum(int x,int y,int z) {
		return (x+y+z);
	}
	public double Sum(double x,double y) {
		return (x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoading s=new methodOverLoading();
		System.out.println(s.Sum(5, 6));
		System.out.println(s.Sum(5, 6,7));
		System.out.println(s.Sum(5.5, 6.6));
	}

}

package Stack;

public class TesterDoubleStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStack ds=new DoubleStack(10);
		DoubleStack ds1=new DoubleStack(8);
		ds.push1(10);
		ds.push1(95);
		ds1.push2(78);
		ds1.push2(63);
		//System.out.println(ds.push1(66));
		System.out.println(ds.pop1());
		System.out.println(ds1.pop2());

	}

}

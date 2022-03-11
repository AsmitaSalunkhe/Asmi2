package account;

public class AmountException
{

	public class amountexception {
		int w=100;
		 static double balance=0.0;
		public static void withdraw(double w)  {
			double difference;
			if(w>balance)
			{
				difference=w-balance;
				throw new ArithmeticException("insuffient balance");
			}
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			withdraw(100);
			System.out.println("end of the code");
			

		}

	}

}

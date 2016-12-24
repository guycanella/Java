
public class Fib{

		private int count;

		public Fib(){
			this.count = 0;
		}

		public int calculateFib(int N){

			
				if(N == 0){
					this.count++;
					return 0;
				}else if(N == 1){
					this.count++;
					return 1;
				}else{
					this.count++;
					return calculateFib(N -1) + calculateFib(N -2);
				}
		}

		public int getCount(){
			return this.count-1;
		}

		public void zerateCount(){
			this.count = 0;
		}
}

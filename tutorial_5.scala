object tutorial_5{

	def main(args: Array[String]): Unit = {

		print("Enter a number: ")
		val n = scala.io.StdIn.readInt()
	
	//Question 1
		println("\n\nQuestion 1")
		println("It's Prime! "+prime(n))

	//Question 2
		println("\n\nQuestion 2")
		primeSeq(n);

	//Question 3
		println("\n\nQuestion 3")
		println("Sum: " + sum(n))

	//Question 4
		println("\n\nQuestion 4")
		println(evenOrOdd(n))

	//Question 5
		println("\n\nQuestion 5")
		println("Sum of even numbers: " + evenSum(n))

	//Question 6
		println("\n\nQuestion 6")
		println("Sequence of fibonacci:")
		// println(fibonacciSeq(n))
		fibonacciSeq(n)
	}


	//functions for q1

	def prime(n:Int,i:Int = 2 ):Boolean = n match{
		case x if x<=1 => false
		case x if x==i => true
		case x if x%i== 0 => false
		case _ => prime(n,i+1)
	}


	//functions for q2

	def primeSeq(num: Int, i: Int=2): Unit = {
		if (i==num)
			println();
		else {
			if (prime(i)){
				print(s"$i  ")
			}
			primeSeq(num, i+1)
		}
	}

	//functions for q3

	def sum(num: Int): Int = {
		if (num==0)
			0
		else
			num + sum(num-1);
		}


	//functions for q4

	def evenOrOdd(n:Int): String = {
		if (n==0){
			"Even"
		}else if (n==1){
			"Odd"
		}else if (n<0){
			evenOrOdd(-n)
		}else {
			evenOrOdd(n-2)
		}
	} 

	//functions for q5

	def evenSum(n: Int): Int = {
		if (n==0) 
			0
		else{
			if(n%2==1)
				(n-1) + evenSum(n-3)
			else
				n + evenSum(n-2)
		}
	}


	//functions for q6
	def fibonacci(n: Int): Int = n match {
		case 0 => 0
		case x if x==1 => 1
		case _ => fibonacci(n-1) + fibonacci(n-2)
		}
	
	def fibonacciSeq(n:Int):Unit= {
		if (n > 0) fibonacciSeq(n-1)
		println(fibonacci(n))
		}
	
}


	


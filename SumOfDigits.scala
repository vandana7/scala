//Question 4
object SumOfDigits 
{
  //function for caculation of fatorial
 private def fact(number:Int):Int= {
    var mul=1
   val number=5
   
  for(index<- 1 to number) 
   mul=mul*index 
   mul
  }// function ends

  // function to calculate sum of digits of number
 private def sumnumber(input:Int):Int= {
    var sum=0
    var rem=0
    var number=input;
   while(number>0)
   {
     rem=number%10  // calculate remainder
     sum=sum+rem     // calculate sum for each digit get by remainder
     number=number / 10 // split each digit by diving number with 10
   }
   sum
  }// function ends

def main(args: Array[String]) = {
  val factoutput=fact(5)  //get factorial
  println(s"Factorial is : $factoutput") 
  val sumoutput=sumnumber(factoutput)  //get sum of digits
  println(s"Sum of Digits : $sumoutput")

}	
}



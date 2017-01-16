//Question 3
object fibNum extends App   //defined an object
{
  val input=8  // input values
  var sum=0
  var next=1
  var pre=0
 
  for(index <- 0 to input-2)
 {
   sum=pre+next  // calculate sum
   pre=next      // change previous number in fibnocci series
   next=sum      // changes next 
 }
 println(s"Value at $input is : $sum")
	

}



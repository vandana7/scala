//Question 1

object ListTraverse extends App
{
  val numbers=List(1,2,3)   //declare a list

  
  for(index <- 0 to numbers.length-1)	
 {
   val temp=numbers(index);  //fetch value at index
   println(s"$index = $temp")
 }
}



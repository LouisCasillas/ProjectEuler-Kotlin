/*
Project Euler #1 - https://projecteuler.net/problem=001
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
fun get_multiples_sum(multiples: Array<Int>, max_number: Int): Int
{
  var sum = 0

  for (num in 1..max_number)
  {
     for (multiple in multiples)
     {
       if ((num % multiple) == 0)
       {
         sum += num
         break
       }
     }
  }

  return sum
}

fun main()
{
  println(get_multiples_sum(arrayOf(3, 5), 999))
}

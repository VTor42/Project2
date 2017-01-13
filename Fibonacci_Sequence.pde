int a=0;//how much the very first number number in the sequence will count up until
int b=1;/*this will set the starting point for the first number, and will preceed to
count itself up by becoming the same as 'r' from the previous iteration*/
int r;//setting a variable

for (int d=0; d<=10; d++) {/*creating a for loop that will start at zero, end at the
number you want (but adds 1) and counts up by one starting at the last number in 
the iteration*/
  println(b);/*printing variable b, which is the starting point, but also all the 
   numbers after the starting point*/
  r=a+b;//will start off as being 1, basically being the numbers in your fibonacci sequence
  a=b;//resetting itself to 'b' in the previous iteration
  b=r;//resetting itself to be the same as 'r' in the previous iteration
}
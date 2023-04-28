class Stats<T extends Number>
{
T [] nums;
Stats([] o)
{
nums = 0;
}
double average()
{
double sum = 0.0;
for(int i=0; i<nums.length; i++)
sum+= nums[i].doubleValue();
return sum/nums.length;
}
boolean sameAvg(Stats<?>ob)
{
if(average()==ob.average())
return true;
else
return false;
}
}
class BoundDemo
{
public static void main(String[]args)
{
Integer inums[]={1,2,3,4,5};
Stats<Integer> iob=new Stats<Integer>(Inums);
Stats<Integer> iob = new Stats<Integer>(inums);
System.out.println("average of Integers:" +iob.average());

Double dnums[] =1{1.1, 2.2, 3.3,4.4,5.5};
Stats<Double> dob= new Stats<Double>(dnums);
System.out.priontln("average of Double:"+dob.average());

System.out.println("Same Average: "+iob.sameAvg(dob));
}
}
//  Task1
    arr=Array(1,2,3,4,5);
    max=0;

    for(i=0;i<=arr.length;i++)
    {
    if(arr[i]>max)
        {
            max=arr[i];
        }   
    }
    console.log("Maximum number is " + max);
    min=10;

    for(i=0;i<=arr.length;i++)
        {
        if(arr[i]<min)
            {
                min=arr[i];
            }   
        }
        console.log("Minmun number is " + min);
addition=0;
        for(i=0;i<arr.length;i++)
            {
                 addition+=arr[i];               
                }
            console.log("Addition of array elements is = " +addition);

// Task 2
num=10;
if(num>0)
{
    console.log("Nmber is Positive");
}
else if(num<0)
    {
        console.log("Nmber is Negative");
    }
    else
        {
            console.log("Nmber is Zero");
        }
        if(num % 2==0)
        {
            console.log("Number is even");
        }
        else
        {
            console.log("Number is odd");            
        }

        // Task3
        function addi(a,b)
        {
            add=a+b;
            console.log(add)
        }
        function upstr(sent)
        {
            return sent.toUpperCase();
    }
        addi(5,10);
        console.log(upstr("abc"));
const fruit=new Array("Apple","Mango","Banana","Pomogrenate","Kiwi");

fruit.push("Lichi");
fruit.shift("Apple");

for(i=0;i<fruit.length;i++)
 
    {
        console.log(fruit[i]);
    }



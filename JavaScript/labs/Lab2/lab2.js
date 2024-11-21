// Task 1
//1
var num=1;
if(num>0)
{
    console.log("Number is Positive");
}
else if(num<0)
{
    console.log("Number is negative");
}
else
{
    console.log("Number is Zero");
}
//2
var Grade="A";
switch (Grade)
{
    case "A":
        console.log("A grade");
        break;
        case "B":
            console.log("B grade");
            break;
            case "C":
                console.log("C grade");
                break;
                case "D":
                    console.log("D grade");
                    break;
                    case "E":
                        console.log("E grade");
                        break;
                        case "F":
                            console.log("F grade");
                            break;
}

// Task 2
//1
var no=1;
while(no<=10)
{
    console.log(no);
    no++;
}
//2
var table=3;
var mul=1;
do
{
    console.log("3 x "+mul+ " = " + table * mul);

    mul++;
}while(mul<=5);
//3
var colors=["red","green","yellow","blue"];
for(var i=0;i<=colors.length;i++)
{
    console.log(colors[i]);
}
// Task 3
//1
var person={Name:"Krishna",Age:"21",Num:"N01687444"};
for (const x in person) {
    if (Object.prototype.hasOwnProperty.call(person, x)) {
        console.log(x +" => " + person[x]);
    }
}
//2
const grades=["a+","b+","c+"];
for (let x of grades) {
 console.log(x);    
}
// Task 4
//1
for(var i=1;i<=10;i++)
{
    console.log(i);
    if(i==5)
    {
        break;
    }
}
//2
var arr=["2","3","4","5","6","8","11"];
for(var i=0;i<=arr.length;i++)
{
    if(arr[i]%2==0)
    {
        console.log(arr[i]);
    }
}
// console.log(1=='1');
// console.log(1==='1');
// alert("result of 1=='1'"+(1=="1"));
// alert("result of 1==='1'"+(1==="1"));
var y;
do{
let a,b;

do
{
    a=parseInt(prompt("enter miles per hour"));
    b=parseInt(prompt("enter galloons"));        
}while(isNaN(b) || b<=0 || isNaN(a) || a<=0);

    document.write("miles per hour =" + b/a);

    y=prompt("do you want to calculate again","Y");

}while(y == "Y");

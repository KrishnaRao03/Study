// Task 1.1
const colors=new Array("red","green","blue");
// Task 1.2
var size=["M","L","XL"];
// Task 1.3
var numbers= Array.of(11,2,30,40,100,5,1,21,3);
// Task 2.1
colors.push("Yellow");
// Task 2.2
size.pop();
// Task 2.3
for(var i=0;i<=size.length;i++)
{
    console.log(size[i]);
}
// Task 3.1
let filteredNumbers= new Array();
filteredNumbers=numbers.filter(num => num>10);    
console.log(filteredNumbers);
// Task 3.2
let squareNumbers=numbers.map(num => num * num);
console.log(squareNumbers);
// Task 3.3
colors.forEach(element => {
    console.log(colors);
});
// Task 4.1
for (const num of numbers) {
    console.log(num);
}
// Task 4.2
for(var i=0;i>=size.length;i++)
{
    console.log(size);
}
// Task 4.3
const iterator = colors.entries();

for (const [index, color] of iterator) {
  console.log(` ${index}, ${color}`);
}
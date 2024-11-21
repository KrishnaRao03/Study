// Task1
function sum (a,b)
{
    return console.log("Addition = " +(a+b));
}
sum(13,12);
// Task2
let mul = function(a,b)
{
    return console.log("Multiplication = " + (a*b)); 
}
mul(13,12);
// Task3
let subtract = (a, b) => a - b;
console.log("Difference = " + subtract(10,5));
// Task4
function num(...numbers)
{
    return numbers.reduce((total , num) => total + num,0);
}
console.log(num(1,2,3,4,5));
function greet(name = "Anonymous") {
    return `Hello, ${name}!`;
}
console.log(greet("Krishna"));
function add() {
    let total = 0;
    for (let i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}
console.log(add(1,21,23,41,5));
function person(name, age) {
    return {
        name: name,
        age: age
    };
}
console.log(person("Krishna", 21));
function num(a){
    return (a%2==0);
} 
console.log(num(2));
console.log(num(5));
function func()
{

}
console.log(func());
function none(msg) {
    return function() {
        console.log(msg);
    };
}
console.log(none());
function createCounter() {
    let count = 0;
    return {
        increment: function() {
            count++;
            return count;
        },
        decrement: function() {
            count--;
            return count;
        },
        getCount: function() {
            return count;
        }
    };
}
const counter = createCounter();

console.log(counter.getCount());
console.log(counter.increment());
console.log(counter.increment()); 
console.log(counter.decrement()); 
console.log(counter.getCount());
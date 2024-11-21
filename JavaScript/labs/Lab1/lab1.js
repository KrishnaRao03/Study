// Task 1
var userName="Krishna";
let userAge = 21;
const userId='N01687444';
let message=`My name is ${userName},my Id is ${userId} and my age is ${userAge} `;
console.log(message);

// Task 2
userName="Rao";
userAge=22;
// userId='N00000000'; As it is constant variable value cant be changed
message=`My name is ${userName},my Id is ${userId} and my age is ${userAge} `;
console.log(message);

// Task 3
let score=95.5;
let courseName = "JavaScript Basics";
let isEnrolled = true;
let grades = [90, 95, 88, 92];
let student = {name: "Krishna", age:"21", course: "CPAN"};

// Task 4
console.log(userAge + score);
console.log(score - userAge);
console.log(userAge * 2);
console.log(score / userAge);

// TAsk 5
let userAge1="21";
let score1="99";
console.log(userAge == userAge1);
console.log(userAge === userAge1);
console.log(score < score1);
console.log(score >= score1);
console.log(isEnrolled);

// Task 6
if(userAge > 18)
{
    console.log("User is above 18");
}
else
{
    console.log("User is below 18");
}

switch (courseName)
{
 case "Python":
    console.log("Python");
    break;
case "PHP":
    console.log("PHP");
    break; 
case "Flutter":
    console.log("Flutter");
    break;
case "JavaScript Basics":
    console.log("JavaScript Basics");
    break;
default:
    console.log("Android"); 
}


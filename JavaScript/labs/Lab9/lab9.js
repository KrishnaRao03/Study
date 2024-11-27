// TASK 1
const student = {
    name: "Krishna Rao",
    age: 21,
    grade: "A+",
    school: "Humber",
    
    greet: function() {
      console.log(`Hello, my name is ${this.name}`);
    }
  };
  
  console.log("Student Name:", student.name);
  console.log("Student Age:", student.age);
  console.log("Student Grade:", student.grade);
  console.log("Student School:", student.school);
  
  student.greet();
  
  student.age = 19;
  console.log("Updated Age:", student.age);
  
  
  // TASK 2: 
  const bookJSON = '{"title": "The Great Gatsby", "author": "F. Scott Fitzgerald", "year": 1925, "genre": "Novel"}';
  
  const book = JSON.parse(bookJSON);
  console.log("Parsed Book Object:", book);
  
  const bookStringified = JSON.stringify(book);
  console.log("Stringified Book Object:", bookStringified);
  
  
  const array1 = [1, 2, 3];
  const array2 = [4, 5, 6];
  
  const combinedArray = [...array1, ...array2];
  console.log("Combined Array:", combinedArray);
  
  const person1 = {
    firstName: "Krishna",
    lastName: "Rao",
    age: 30
  };
  
  const person2 = {
    ...person1,
    age: 21
  };
  
  console.log("Person 1:", person1);
  console.log("Person 2:", person2);
  
  
  // TASK 4: 
  const calculator = {
    add: function(a, b) {
      return a + b;
    },
    subtract: function(a, b) {
      return a - b;
    },
    multiply: function(a, b) {
      return a * b;
    },
    divide: function(a, b) {
      if (b !== 0) {
        return a / b;
      } else {
        return "Cannot divide by zero";
      }
    }
  };
  
  console.log("Addition of 5 and 3:", calculator.add(5, 3));
  console.log("Subtraction of 5 from 10:", calculator.subtract(10, 5));
  console.log("Multiplication of 4 and 7:", calculator.multiply(4, 7));
  console.log("Division of 10 by 2:", calculator.divide(10, 2));
  console.log("Division of 5 by 0:", calculator.divide(5, 0));
  
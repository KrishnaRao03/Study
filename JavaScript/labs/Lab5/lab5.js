// TASK 1: MODULE PATTERN
var myModule = (function() {
    // Private variable
    var privateVariable = "I am private";

    // Public method
    return {
        getPrivateVariable: function() {
            return privateVariable;
        }
    };
})();

function demonstrateEncapsulation() {
    try {
        console.log(privateVariable); // This will throw an error
    } catch (error) {
        console.log("Error accessing privateVariable directly:", error.message);
    }

    console.log("Accessing through public method:", myModule.getPrivateVariable()); // Output: "I am private"
}

demonstrateEncapsulation();

// TASK 2: DECLARING DEPENDENCIES
const _ = require('lodash');

function lodashExample() {
    const array = [1, 2, 2, 3, 4, 4, 5];
    const uniqueElements = _.uniq(array);
    console.log("Unique elements using lodash:", uniqueElements); // Output: [1, 2, 3, 4, 5]
}

lodashExample();

const { sayHello } = (() => {
    return {
        sayHello: () => "Hello from ES Module!"
    };
})();

console.log(sayHello());

// TASK 3: TYPES OF MODULES
function greet(name) {
    return `Hello, ${name}!`;
}

const fs = require('fs');

// Third-party module (express)
const express = require('express');
const app = express();
const port = 3000;

fs.writeFileSync('example.txt', 'Hello, world!', 'utf8');

console.log(greet('User')); // Output: "Hello, User!"

app.get('/', (req, res) => {
    res.send('Hello from Express!');
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});

// TASK 4: LOADING MODULES
const condition = true; 
if (condition) {
    const moduleB = (() => {
        return {
            sayGoodbye: () => "Goodbye from dynamic module!"
        };
    })();

    console.log(moduleB.sayGoodbye()); 
}

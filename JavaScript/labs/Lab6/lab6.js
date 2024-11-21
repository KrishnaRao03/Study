// TASK 1
function resolveAfter2Seconds() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Success: Resolved after 2 seconds!");
        }, 2000);
    });
}

function rejectAfter2Seconds() {
    return new Promise((_, reject) => {
        setTimeout(() => {
            reject("Error: Rejected after 2 seconds!");
        }, 2000);
    });
}

resolveAfter2Seconds().then(console.log).catch(console.error);
rejectAfter2Seconds().then(console.log).catch(console.error);

// TASK 2
Promise.resolve(1)
    .then((value) => {
        console.log(`Initial value: ${value}`);
        return value * 2; 
    })
    .then((value) => {
        console.log(`After multiplying by 2: ${value}`);
        return value + 3; 
      })
    .then((value) => {
        console.log(`After adding 3: ${value}`);
        return value / 2; 
    })
    .then((finalValue) => {
        console.log(`Final result: ${finalValue}`);
    });

// TASK 3
function randomOperation() {
    return new Promise((resolve, reject) => {
        const success = Math.random() > 0.5;
        setTimeout(() => {
            if (success) {
                resolve("Success: Operation completed successfully!");
            } else {
                reject("Error: Operation failed!");
            }
        }, 2000);
    });
}

randomOperation()
    .then(console.log)
    .catch(console.error);

// TASK 4
async function asyncFunction() {
    const result = await resolveAfter2Seconds();
    console.log(result);
}

asyncFunction();

async function asyncFunctionWithErrorHandling() {
    try {
        const result = await rejectAfter2Seconds();
        console.log(result);
    } catch (error) {
        console.error(error);
    }
}

asyncFunctionWithErrorHandling();

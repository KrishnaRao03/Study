const appName = "Habit Tracker"; 
let habits = [];

// Habit Object Constructor
function Habit(name, frequency) {
    this.name = name; 
    this.frequency = frequency; 
    this.completedDays = 0; 
}

function addHabit(name, frequency) {
    const newHabit = new Habit(name, frequency);
    habits.push(newHabit);
}

function checkHabits() {
    if (habits.length === 0) {
        console.log("No habits found. Start adding some!");
    } else {
        console.log(`You have ${habits.length} habits to track.`);
    }
}

function displayHabits() {
    for (let i = 0; i < habits.length; i++) {
        console.log(`${i + 1}: ${habits[i].name} - Frequency: ${habits[i].frequency}, Completed Days: ${habits[i].completedDays}`);
    }
}

addHabit("Exercise", "daily");
addHabit("Read", "daily");
addHabit("Meditate", "weekly");

habits.pop(); 
habits.push(new Habit("Drink Water", "daily")); 

habits.forEach(habit => {
    console.log(`Habit: ${habit.name}, Frequency: ${habit.frequency}`);
});

const dailyHabits = habits.filter(habit => habit.frequency === "daily");
console.log("Daily Habits:");
dailyHabits.forEach(habit => console.log(habit.name));

const completeHabit = (index) => {
    if (index >= 0 && index < habits.length) {
        habits[index].completedDays++;
        console.log(`Habit "${habits[index].name}" marked as completed for today.`);
    } else {
        console.log("Invalid habit index.");
    }
};

function editHabit(index, newName, newFrequency) {
    if (index >= 0 && index < habits.length) {
        habits[index].name = newName;
        habits[index].frequency = newFrequency;
        console.log(`Habit updated to: ${newName} - ${newFrequency}`);
    } else {
        console.log("Invalid habit index.");
    }
}
export const HabitTracker = (() => {
    const habits = [];

    const addHabit = (name, frequency) => {
        habits.push(new Habit(name, frequency));
    };

    const getHabits = () => habits;

    const completeHabit = (index) => {
        if (habits[index]) {
            habits[index].completedDays++;
        }
    };

    return {
        addHabit,
        getHabits,
        completeHabit
    };
})();
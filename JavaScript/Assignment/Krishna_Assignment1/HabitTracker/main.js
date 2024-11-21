import { HabitTracker } from './habitModule.js';

HabitTracker.addHabit("Exercise", "daily");
HabitTracker.addHabit("Read", "daily");

console.log(HabitTracker.getHabits());
HabitTracker.completeHabit(0);
console.log(HabitTracker.getHabits());

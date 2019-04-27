// console.log(`Hello World`);
// console.error(`This is an error`);
// console.warn(`This is a warning`)

//let, const
// let age = 30;
// age = 31;
// console.log(age);

// const age2 = 30;
// age2 = 31;
// console.log(age2);

//String, Numbers, Boolean, null, undefined, Symbol
const name = `John`;
const age = 30;
// const rating = 4.5;
// const isCool = true;
// const x=null;
// const y = undefined;
// let z;
// console.log(typeof z);

// Concatenation
console.log(`My name is ` + name + ` and I am ` + age);
//Template String
const hello = `My name is ${name} and I am ${age}`;
console.log(hello);

const s=`Hello World!`;
console.log(s.length);
console.log(s.toUpperCase());
console.log(s.substring(0, 5).toUpperCase());
console.log(s.split(``));

const f=`technology, computers, it, code`;
console.log(f.split`, `);
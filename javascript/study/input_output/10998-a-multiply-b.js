/*
- AxB

[입력]
3 4

[출력]
12
*/

const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().split(' ');
// const input = fs.readFileSync("input.txt").toString().split(' ');

const A = parseInt(input[0]);
const B = parseInt(input[1]);

console.log(A * B);
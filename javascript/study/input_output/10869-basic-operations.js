/*
- 사칙연산

첫째 줄에 A+B, 
둘째 줄에 A-B, 
셋째 줄에 A*B, 
넷째 줄에 A/B, 
다섯째 줄에 A%B를 출력한다.

[입력]
7 3

[출력]
10
4
21
2
1
*/

const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().split(' ');
// const input = fs.readFileSync("input.txt").toString().split(' ');

const A = parseInt(input[0]);
const B = parseInt(input[1]);

console.log(A + B);
console.log(A - B);
console.log(A * B);
console.log(parseInt(A / B))
console.log(A % B);
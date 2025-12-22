/*
- ??!

첫째 줄에 준하의 놀람을 출력한다. 
놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.

[입력]
joonas

[출력]
joonas??!
*/

const fs = require('fs');
const input = fs.readFileSync("input.txt").toString().trim();

console.log(input + "??!");
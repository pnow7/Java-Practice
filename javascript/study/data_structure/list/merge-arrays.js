/*
- 배열 합치기

정렬되어있는 두 배열 A와 B가 주어진다.
두 배열을 합친 다음 정렬해서 출력

첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어짐
둘째 줄에는 배열 A의 내용,
셋째 줄에는 배열 B의 내용이 주어짐.

[입력]
2 2
3 5
2 9

2 1
4 7
1

[출력]
2 3 5 9

1 4 7
*/

const fs = require('fs')
const input = fs.readFileSync("../input.txt").toString().trim().split('\n');

let idx = 0;

let [N, M] = input[idx++].split(' ').map(Number);
let A = input[idx++].split(' ').map(Number);
let B = input[idx++].split(' ').map(Number);

let merged = [...A, ...B];
merged.sort((a, b) => a - b);

console.log(merged.join(' '));

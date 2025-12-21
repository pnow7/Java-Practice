/*
- 토마토 3차원

토마토에 인접한 곳은 위, 아래, 왼쪽, 오른쪽, 앞, 뒤 여섯 방향

첫 줄에는 상자의 크기를 나타내는 두 정수 M, N과
쌓아올려지는 상자의 수를 나타내는 H가 주어짐
M은 상자의 가로 칸의 수 (2 <= M <= 100),
N은 상자의 세로 칸의 수 (2 <= N <= 100),
H는 상자의 수 (1 <= H <= 100)

토마토가 모두 익을 때까지 최소 며칠이 걸리는지 계산
저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력
토마토가 모두 익지 못하는 상황이면 -1 출력

[입력]
5 3 1
0 -1 0 0 0
-1 -1 0 1 1
0 0 0 1 1

5 3 2
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0

[출력]
-1

4

*/

const fs = require('fs');
let input;

try {
    input = fs.readFileSync('/dev/stdin', 'utf8').trim().split('\n');
} catch (err) {
    input = fs.readFileSync(0, 'utf8').trim().split('\n');
}

let line = 0;

const [M, N, H] = input[line++].split(' ').map(Number);

// box[z][y][x] 형태로 3차원 배열 생성
const box = Array.from({ length: H }, () =>
    Array.from({ length: N }, () => Array(M).fill(0))
);

// 입력 읽기
for (let z = 0; z < H; z++) {
    for (let y = 0; y < N; y++) {
        const row = input[line++].split(' ').map(Number);
        for (let x = 0; x < M; x++) {
            box[z][y][x] = row[x];
        }
    }
}

// 나머지 코드는 동일 (6방향, 클래스, BFS 등)
const DX = [0, 0, 0, 0, -1, 1];
const DY = [0, 0, -1, 1, 0, 0];
const DZ = [-1, 1, 0, 0, 0, 0];

class Tomato {
    constructor(x, y, z, day) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.day = day;
    }
}

const queue = [];
let maxDay = 0;

// 처음에 익은 토마토들을 큐에 넣음
for (let z = 0; z < H; z++) {
    for (let y = 0; y < N; y++) {
        for (let x = 0; x < M; x++) {
            if (box[z][y][x] === 1) {
                queue.push(new Tomato(x, y, z, 0));
            }
        }
    }
}

// BFS
function bfs() {
    let front = 0;

    while (front < queue.length) {
        const curr = queue[front++];
        const { x, y, z, day } = curr;

        for (let d = 0; d < 6; d++) {
            const nx = x + DX[d];
            const ny = y + DY[d];
            const nz = z + DZ[d];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H) {
                if (box[nz][ny][nx] === 0) {
                    box[nz][ny][nx] = 1;
                    queue.push(new Tomato(nx, ny, nz, day + 1));
                    maxDay = Math.max(maxDay, day + 1);
                }
            }
        }
    }
}

bfs();

// 모든 토마토가 익었는지 확인
let allRipe = true;
for (let z = 0; z < H; z++) {
    for (let y = 0; y < N; y++) {
        for (let x = 0; x < M; x++) {
            if (box[z][y][x] === 0) {
                allRipe = false;
                break;
            }
        }
        if (!allRipe) break;
    }
    if (!allRipe) break;
}

console.log(allRipe ? maxDay : -1);
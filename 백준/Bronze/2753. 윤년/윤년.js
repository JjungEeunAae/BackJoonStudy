//출력
const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();

//입력받은 값 숫자로 바꾸기
const inputNumber = Number(input);

//윤년은 4의 배수이면서 100의 배수가 아니다 또한 400 배수이다.
if((inputNumber % 4 === 0 && inputNumber % 100 !== 0) || inputNumber % 400 === 0){
   console.log("1");
   } else {
       console.log("0");
   }
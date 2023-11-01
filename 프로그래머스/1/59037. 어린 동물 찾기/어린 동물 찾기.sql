-- 코드를 입력하세요
SELECT ANIMAL_ID
     , NAME
  FROM ANIMAL_INS
--  <> , !=, ^= 모두 같은 뜻
--  셋 중 <>을 쓰는 것이 좋다. 어느 DB에서나 사용되기 때문이다.
 WHERE INTAKE_CONDITION <> 'Aged'
 ORDER BY ANIMAL_ID;
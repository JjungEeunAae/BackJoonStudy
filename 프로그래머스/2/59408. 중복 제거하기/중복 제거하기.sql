-- 코드를 입력하세요
SELECT COUNT(*)
FROM (
       SELECT DISTINCT NAME   -- DISTINCT로 중복 제거
       FROM ANIMAL_INS
       WHERE NAME IS NOT NULL -- NAME이 NULL인건 제외
     );

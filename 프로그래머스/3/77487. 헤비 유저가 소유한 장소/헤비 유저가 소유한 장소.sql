-- 헤비 유저가 등록한 공간의 정보 추출
-- 아이디 순으로 조회
SELECT P.*
FROM (
        SELECT COUNT(*) AS ID
             , HOST_ID
          FROM PLACES
         GROUP BY HOST_ID
        HAVING COUNT(*) >= 2
    ) A JOIN PLACES P
ON P.HOST_ID = A.HOST_ID
ORDER BY P.ID
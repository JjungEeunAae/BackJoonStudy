-- 헤비 유저가 등록한 공간의 정보 추출
-- 아이디 순으로 조회
SELECT *
  FROM PLACES P1
  WHERE (
        SELECT COUNT(*)
          FROM PLACES
         WHERE P1.HOST_ID = HOST_ID
        ) >= 2
  ORDER BY P1.ID
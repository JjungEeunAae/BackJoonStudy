-- 조   건 : 음식종류별로 즐겨찾기수가 가장 많은 식당 추출
-- 조회컬럼 : 추출 후 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회
-- 정렬기준 : 음식 종류를 기준으로 내림차순 정렬


SELECT R.FOOD_TYPE
     , R.REST_ID
     , R.REST_NAME
     , R.FAVORITES
  FROM REST_INFO R 
  WHERE R.FAVORITES IN (SELECT MAX(R2.FAVORITES)
                          FROM REST_INFO R2
                         WHERE R.FOOD_TYPE = R2.FOOD_TYPE
                         GROUP BY R2.FOOD_TYPE
                        )
ORDER BY R.FOOD_TYPE DESC
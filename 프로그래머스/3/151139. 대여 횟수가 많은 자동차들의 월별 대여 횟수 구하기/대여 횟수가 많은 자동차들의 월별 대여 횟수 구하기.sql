SELECT TO_CHAR(START_DATE, 'MM') * 1 AS MONTH
     , CAR_ID
     , COUNT(*)                      AS RECORDS
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
 WHERE 1=1
   -- 총 대여 횟수가 5회 이상
   AND TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210'
   -- 위 조건이 맞는 자동차 찾기
   AND CAR_ID IN (
                    SELECT CAR_ID
                      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
                     WHERE TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210'
                     GROUP BY CAR_ID
                    HAVING COUNT(*) > 4
                  )
 GROUP BY TO_CHAR(START_DATE, 'MM'), CAR_ID
HAVING COUNT(*) <> 0
 ORDER BY 1 ASC, 2 DESC
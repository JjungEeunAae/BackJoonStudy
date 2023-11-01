-- 코드를 입력하세요
SELECT TITLE
     , UGB.BOARD_ID
     , REPLY_ID
     , UGR.WRITER_ID
     , UGR.CONTENTS
     , TO_CHAR(UGR.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
  FROM USED_GOODS_BOARD UGB
  JOIN USED_GOODS_REPLY UGR
    ON UGB.BOARD_ID = UGR.BOARD_ID
 WHERE TO_CHAR(UGB.CREATED_DATE,'YYYY-MM') = '2022-10'
 ORDER BY UGR.CREATED_DATE ASC, TITLE ASC;
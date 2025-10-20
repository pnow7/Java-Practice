package cs;

public class Q2 {
    /*
     * SQL: USERS 테이블과 ORDERS 테이블
     * 각 사용자의 이름과 총 주문 횟수를 출력하는 SQL 쿼리
     * 
     * SELECT U.USER_NAME, COUNT(O.ORDER_ID) AS ORDER_COUNT
     * FROM 
     *      USERS U
     * LEFT JOIN
     *      ORDERS O ON U.USER_ID = O.ORDER_ID
     * GROUP BY U.USER_ID, U.USER_NAME
     * ORDER BY U.USER_NAME;
     */
}

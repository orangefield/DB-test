# 데이터 아키텍쳐 설계 - 시험

### 순서
- 스프링부트 프로젝트 세팅
- 테이블 생성 boardTbl(id, title, content, createDate)
- 더미데이터 10건 만들기 
- mustache 메인 페이지 (Bootstrap 테이블, 검색바)
- JPA가 제공하지 않기 때문에 네이티브 쿼리 생성
```sql
SELECT * FROM boardTbl WHERE title Like '%:keyword%';
```
- mustahce에서 1. form 태그로 요청, 2. fetch 요청

### 팁
- Get요청은 a태그, form 태그로
- 근데 Get요청을 fetch로 하는 경우도 있다
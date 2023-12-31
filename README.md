# JWT 로그인 구현 연습

- 사용 스택 : SpringBoot, Vue.js, MySql, MyBatis
- 구현 사항
    - JWT 토큰을 이용한 로그인 처리
        - 로그인 완료 후 사용자 정보를 서비스 페이지로 전달할 때에도 토큰 정보 활용
    - 로그인 시에 비밀번호 암호화 적용

<br>

## 구현 화면
- 메인 화면 <br>
![1](https://github.com/zeomzzz/jwt_login_practice/assets/107301060/3c6d26fd-1307-45b1-906d-3b4fd4163a0e)
- 로그인 <br>
![2](https://github.com/zeomzzz/jwt_login_practice/assets/107301060/decf4f1e-1aab-40bf-97f3-ecd17246b76d)
- 로그인 후 서비스 화면 진입 <br>
![3](https://github.com/zeomzzz/jwt_login_practice/assets/107301060/4b263b74-baa5-415d-90d4-daa696ef3092)

<br>

## TODO

- 회원가입 구현

<br>

## 이슈 정리

<details>
  <summary>6/16</summary>
  
- [X] git에 node modules ignore 안됨 
- [X] front에서 input 받아서 ServiceImpl까지 잘 들고감. 그런데 mapper에서 조회가 안됨(swagger도) 있는 id인데 자꾸 nullPointer Error
      <br>- mapper에서 DTO 속성과 컬럼명 안 맞는 것 ALIAS로 처리
      <br>- front에서 user 넘길 때, id, pw를 js 객체로 하나씩 매핑해서 넘겨줌
  
</details>

<details>
  <summary>6/17</summary>
  
- [X] JWT 로그인 구현 완료
- [X] 프론트 수정 필요
  
</details>

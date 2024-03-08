package com.smhrd.model;

public class MemberVo {

   // >> 필드명도 테이블의 column 명과 일치시키자.
   // 1. 필드
   private String email;
   private String pw;
   private String tel;
   private String address;
   
   // 2. 메소드
   // 모든 필드값을 초기화 시킬수 있는 생성자
   public MemberVo(String email, String pw, String tel, String address) {
      super();
      this.email = email;
      this.pw = pw;
      this.tel = tel;
      this.address = address;
   }
   
   // 기본 생성자
   public MemberVo() {
   }
   
   // getter, setter 메소드
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }

   public String getTel() {
      return tel;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }   
}
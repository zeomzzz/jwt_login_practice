<template>
  <div class="container">
    <div class="loginBox">
      <h2>Login</h2>
      <div class="loginInputBox">
        <b-form-input id="loginInput" v-model="id" placeholder="ID"></b-form-input>
        <b-form-input id="loginInput" v-model="pw" type="password" placeholder="PW"></b-form-input>
      </div>
      <div class="ButtonBox">
        <b-button id="loginButton" variant="info" @click="login">Login</b-button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      id: '',
      pw: '',
    }
  },
  methods: {
    login(){
      if (this.id == "") {
        alert("아이디를 입력해주세요.")
        this.$refs.id.focus();
        return;
      }
      if (this.pw == "") {
        alert("비밀번호를 입력해주세요.")
        this.$refs.id.focus();
        return;
      }

      let user = {
        userId: this.id,
        userPw: this.pw,
      };

      this.$store.dispatch("doLogin", user);

    }
  }
}
</script>

<style>
.container {
  margin: 15px 0px;
}

.loginBox {
  display: flex;
  flex-direction: column;
  /* justify-content: center; */
  align-items: center;
}

.loginInputBox {
  margin: 5px 0px;
  width: 30rem;
}

#loginInput {
  margin: 10px 0px;
}

.ButtonBox {
  display: flex;
  justify-content: center;
  align-items: center;
}

#loginButton {
  width: 30rem;
}

</style>
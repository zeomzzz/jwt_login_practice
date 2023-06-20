<template>
  <div>
    <h2>Home.vue</h2>
    <h2>{{ loginId }}님 안녕하세요!</h2>
  </div>
</template>

<script>
export default {
  data(){
    return {
      loginId: '',
    }
  },
  created() {
    let token = sessionStorage.getItem("access-token");
    let loginId = JSON.parse(atob(token.split('.')[1]))["id"];
    console.log(loginId);
    this.loginId = loginId;
  }
}
</script>

<style>

</style>
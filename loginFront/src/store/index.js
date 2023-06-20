import axios from "axios";
import Vue from "vue";
import Vuex from "vuex";
import router from "../router";

Vue.use(Vuex);

const USER_REST_API = "http://localhost:9999/api-user";

export default new Vuex.Store({
  state: {

  },
  getters: {

  },
  mutations: {

  },

  actions: {
    doLogin({ commit }, user){
      console.log(user);
      const API_URL = `${USER_REST_API}/login`;
      axios({
        url: API_URL,
        method: "POST",
        params: {
          userId: user.userId,
          userPw: user.userPw,
        },
      })
      .then((res) => {
        sessionStorage.setItem("access-token", res.data["access-token"]);
        commit;

        router.push({ name: "Home" });
      })
      .catch((err) => {
        console.log(err);
      })
    }

  },
  modules: {},
});

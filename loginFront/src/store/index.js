import axios from "axios";
import Vue from "vue";
import Vuex from "vuex";
// import axios from "axios";
// import router from "../router";

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
      const API_URL = `${USER_REST_API}/login`;
      axios({
        url: API_URL,
        method: "POST",
        params: user,
      })
      .then((res) => {
        sessionStorage.setItem("access-token", res.data["access-token"]);
        commit;
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      })
    }

  },
  modules: {},
});

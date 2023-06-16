import Vue from "vue";
import VueRouter from "vue-router";
import Main from "@/views/Main.vue";
import LoginForm from "@/components/Main/LoginForm.vue";
import Home from "@/components/Service/Home.vue";

Vue.use(VueRouter);

const routes = [
  {
    component: Main,
    path: "/",
    children: [
      {
        name: "LoginForm",
        component: LoginForm,
        path: "/"
      },
      {
        name: "Home",
        component: Home,
        path: "/home"
      }
    ]
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;

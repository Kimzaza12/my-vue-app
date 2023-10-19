import { createRouter, createWebHistory } from 'vue-router';
import LoginPage from '@/views/Login.vue';
import Allcourse from '@/views/allcourse.vue';
import Mycourse from '@/views/mycourse.vue';
const routes = [
  {
    path: '/login',
    name: 'Login',
    component: LoginPage,
  },
  {
    path: '/allcourse',
    name: 'Allcourse',
    component: Allcourse,
  },
  {
    path: '/mycourse',
    name: 'Mycourse',
    component: Mycourse,
  },
  // เส้นทางอื่น ๆ
];

const router = createRouter({
  history: createWebHistory(),
  routes: routes,
});

export default router;

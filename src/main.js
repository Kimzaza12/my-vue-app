import { createApp } from 'vue';
import App from './App.vue';
import { createRouter, createWebHistory } from 'vue-router';

import router from './router'; // นำเข้าคอนฟิกูเรชััน Vue Router


import Login from '../views/Login.vue'; // นำเข้าคอมโพนเนนต์ "Login.vue"

const router = createRouter({
    history: createWebHistory(),
    routes: [
      {
        path: '/login',
        name: 'Login',
        component: () => import('./views/Login.vue'), // แก้ไขตำแหน่งไฟล์ตามโครงสร้างโปรเจกต์ของคุณ
      },
      // เพิ่มเส้นทางอื่น ๆ ที่คุณต้องการที่นี่
    ],
  });

const app = createApp(App);

app.use(router);

app.mount('#app');

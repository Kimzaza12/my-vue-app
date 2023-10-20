import { createApp } from 'vue';
import App from './App.vue';
import router from './router'; // ตัวอย่างการนำเข้า router
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.css'


const app = createApp(App);
app.use(router);

app.config.productionTip = false;
app.config.globalProperties.$http = axios;

app.mount('#app');



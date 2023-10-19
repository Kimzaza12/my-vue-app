<template>
    <div>
      <h2>Login Page</h2>
      <form @submit.prevent="login">
        <label for="username">Username:</label>
        <input type="text" id="username" v-model="username">
        <label for="password">Password:</label>
        <input type="password" id="password" v-model="password">
        <button type="submit">Login</button>
      </form>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        username: "",
        password: "",
      };
    },
    methods: {
      login() {
        // สร้างโค้ดการเข้าสู่ระบบของคุณที่นี่
      },
    },
  };
  </script>
  
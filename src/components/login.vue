<template>
  <div>
    <h2>Login</h2>
    <form>
      <label for="username">Username:</label>
      <input type="text" id="username" v-model="username">
      <label for="password">Password:</label>
      <input type="password" id="password" v-model="password">
      <button @click="login">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: '',
    };
  },
  methods: {
    login() {
      // Add your login logic here
    }
  }
}
</script>

<style scoped>
/* Add your login page styles here */
</style>

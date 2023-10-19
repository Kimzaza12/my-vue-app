<template>
    <div class="body">
        <div class="content">
            <div class="left-side">
                <div class="textp">
                    <p>Course booking</p>
                </div>
                <div class="links">
                    <div class="bottom-link">
                        <a href="/Allcourse" class="link">All course</a>
                    </div>
                    <div class="bottom-link">
                        <a href="/mycourse" class="link">My course</a>
                    </div>
                </div>
                <div class="bottom-link">
                    <a href="/login" class="login-link">Login</a>
                </div>
            </div>

            <div class="right-side">
               
               
            </div>
        </div>
    </div>
</template>

<script>
// Importing bootstrap 5 Modules
import "bootstrap/dist/css/bootstrap.min.css";
export default {
    name: 'allV',
    methods: {

    }
}
</script>

<style>
.v-main__wrap {
  background-color: #dedede;
}

.body {
  display: flex;
  justify-content: space-between;
  width: auto;
  height: auto;
}

.right-side {
    display: flex;
    justify-content: center; 
    align-items: center; 
    height: 100vh;
    background-color: rgba(177, 177, 177, 0.473);
} 

.content {
  display: flex;
  width: 100%;
  align-items: flex-start; /* Align both sides at the top */
}

.left-side {
  width: 260px;
  background-color: #ffffff;
  padding: 20px;
  height: 99vh;
  display: flex;
  flex-direction: column; /* Display children elements in a column */
  justify-content: space-between; /* Space between children elements */
}

.right-side {
  flex: 1;
  background-color: #e0e0e0;
  padding-top: 40px;
  padding-bottom: 20px;
}

.textp p {
  font-size: 29px;
  font-weight: bold;
  margin-bottom: 30px;
}

.link {
  text-decoration: none;
  color: #000;
  display: block;
  padding: 10px 0;
  transition: background-color 0.2s;
}

.link:hover {
  background-color: #f0f0f0;
}

.login-link {
  text-decoration: none;
  color: #000;
  display: block;
  padding: 10px 0;
  transition: background-color 0.2s;
}
.login-link:hover {
  background-color: #f0f0f0;
}

.abox {
  width: 220px;
  display: flex;
  justify-items: center;
}

.bottom-link {
  margin-top: auto; /* ให้ลิ้ง "Login" อยู่ล่างสุด */
}
</style>

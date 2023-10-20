<template>
    <div class="doxon">
        <div class="left-side1">
            <div class="doxon">
                <img src="../picture/html.png" class="imgcourse" />
                <div class="im">
                    <img src="../picture/ty.png" class="imgcourse" />
                    <img src="../picture/javascript.png" class="imgcourse" />
                </div>
                
            </div>
        </div>

        <div class="right-side1">
            <div class="boxin">
                <div class="container1">
                    <div class="row align-items-center">
                        <div class="col-lg-6 px-lg-4" v-if="userlogin">
                            <div class="card">

                                <div class="card-body p-lg-5">
                                    <div class="texth3">
                                        <h3 class="mb-4">Login</h3>
                                    </div>
                                    <form id="loginForm" action="index.html">
                                        <div class="form-floating mb-3">
                                            <input class="form-control" id="floatingInput" type="email"
                                                placeholder="name@example.com" required>
                                            <label for="floatingInput">Email address</label>
                                        </div>
                                        <div class="form-floating mb-3">
                                            <input class="form-control" id="floatingPassword" type="password"
                                                placeholder="Password" required>
                                            <label for="floatingPassword">Password</label>
                                        </div>
                                        <div class="btnn">

                                            <a href="/Allcourse" class="btn btn-primary" type="button">Submit</a>
                                        </div>
                                    </form>
                                </div>
                                <div class="card-footer px-lg-5 py-lg-4">
                                    <div class="text-sm text-muted">Don't have an account? <a
                                            @click="user_register()">Register</a>.
                                    </div>
                                </div>
                            </div>
                        </div>


                        <!-- register -->
                        <div class="col-lg-6 px-lg-4" v-if="userregister">
                            <div class="card">

                                <div class="card-body p-lg-5">
                                    <div class="texth3">
                                        <h3 class="mb-4">Register</h3>
                                    </div>
                                    <form action="index.html">

                                        <div class="form-floating mb-3">
                                            <input class="form-control" id="username" type="email"
                                                placeholder="name@example.com" required>
                                            <label for="username">Username</label>
                                        </div>

                                        
                                        <div class="form-floating mb-3">
                                            <input class="form-control" id="floatingPassword" type="password"
                                            placeholder="Password" required>
                                            <label for="floatingPassword">Password</label>
                                        </div>
                                        
                                        <div class="form-floating mb-3">
                                            <input class="form-control"
                                                placeholder="name@example.com" >
                                            <label >Email address</label>
                                        </div>
                                        <div class="form-group">
                                            <div class="btnn">
                                                <btn @click="registerUser" href="/login" class="btn btn-primary" id="regidter" type="button"
                                                    name="registerSubmit">Register</btn>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                                <div class="card-footer px-lg-5 py-lg-4">
                                    <div class="text-sm text-muted">Already have an account? <a
                                            @click="user_login()">Login</a>.
                                    </div>
                                </div>
                            </div>
                        </div>




                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
//importing bootstrap 5 Modules
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
export default {
    name: 'LoginV',
    methods: {
        async registerUser() {
      const username = document.getElementById('username').value; // Collect the username input
      const password = document.getElementById('floatingPassword').value; // Collect the password input

      try {
        // Send a POST request to your registration API
        const response = await axios.post('http://localhost:9000/member', {
          username,
          password,
        });

        // Handle the response as needed (e.g., show a success message or redirect to login)
        console.log('Registration success:', response.data);
        alert('register successful!')
        this.userlogin = true,
        this.userregister = false
      } catch (error) {
        // Handle registration errors (e.g., display an error message)
        console.error('Registration error:', error);
        alert('register unsuccessful!')
      }
    },
        //user login button click event
        user_login() {
            this.userlogin = true,
                this.userregister = false
        },
        //user register button click event
        user_register() {
            this.userlogin = false,
                this.userregister = true
        },
    },
    
    data: function () {
        return {
            userlogin: true,
            userregister: false
        }
    },
    
}
</script>

<style>
.texth3 {
    display: flex;
    justify-content: center;
}

.btnn {
    display: flex;
    justify-content: center;
}

.container1 {
    height: 100%;
    display: flex;


}

.doxon {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100vh;
}

div.col-lg-6.px-lg-4 {
    width: 500px;
}

.left-side1,
.right-side1 {
    flex: 1;
}

.left-side1 {
    background: linear-gradient(180deg, #7E2CE7 0%, #D743FC 69.06%);
}

.right-side1 {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: rgba(255, 255, 255, 0.856);

}

.boxon {
    display: flex;
    background: linear-gradient(180deg, #20bc73 0%, #30f0e7 69.06%)
}
</style>


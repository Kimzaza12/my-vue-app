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
                
                <div class="d"><p>All Course </p></div>
                <div class="row row-cols-3 row-cols-sm-3 row-cols-md-3 g-3">
                    <div class="col">
                        <div class="card shadow-sm">


                            <div class="card-body text-center">
                                <img src="../picture/Ruby.png" class="imgcourse"/>
                                <p class="card-text text-start">Course : Ruby Language </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Add course</button>

                                    </div>
                                    <small class="text-muted">free</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <div class="card-body text-center">
                                <img src="../picture/javascript.png" class="imgcourse" style="width: 230px;"/>
                                <p class="card-text text-start">Course : JavaScript Language </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Add course</button>

                                    </div>
                                    <small class="text-muted">free</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">
                            <div class="card-body text-center">
                                <img src="../picture/html.png" class="imgcourse"/>
                                <p class="card-text text-start">Course : HTML Language</p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Add course</button>

                                    </div>
                                    <small class="text-muted">free</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card shadow-sm">

                            
                            <div class="card-body text-center">
                                <img src="../picture/ty.png" class="imgcourse"/>
                                <p class="card-text text-start">Course : Typescript language </p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Add course</button>

                                    </div>
                                    <small class="text-muted">free</small>
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


.imgcourse{
    max-height: 230px; 
    border:0px;
}
.right-side {
    display: flex;
    flex-direction: column; 
    background-color: #e0e0e0;
}

.d {
    font-size: 32px;
    font-weight: bold;
    text-align: start;
    width: 1100px;
    margin-bottom: 30px;
    
}

.card-text {

    height: 50px;
}

div.col {
    width: 280px;
    padding-bottom: 20px;
}

.body {
    display: flex;
    justify-content: space-between;
    width: auto;
    height: auto;
    
}

.right-side {
    display: flex;
    justify-content: start;
    align-items: center;
    height: 100vh;
    background-color: rgba(177, 177, 177, 0.473);
    padding-left: 60px;
    padding-right: 60px;
    padding-bottom: 20px;
    padding-top: 30px;
}


.content {
    display: flex;
    width: 100%;
    align-items: flex-start;

}

.left-side {
    width: 260px;
    background-color: #ffffff;
    padding: 20px;
    height: 99vh;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
}

.right-side {
    flex: 1;
    background-color: #e0e0e0;
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
    margin-top: auto;
    /* ให้ลิ้ง "Login" อยู่ล่างสุด */
}
</style>

<template>
    <el-container class="lr-container">
        <el-header height="20%" class="title">{{ title }}</el-header>
        <el-main>
            <el-row>
                <el-col :xs=main_width :sm=main_width :md=main_width :lg=main_width :xl=main_width :push=getPushWidth>
                    <div class="lr-form">
                        <Login v-if="currentFromType == 'Login'"></Login>
                        <Register v-else-if="currentFromType == 'Register'"></Register>
                        <ForgetPassword v-else-if="currentFromType == 'FogetPassword'"></ForgetPassword>
                        <div v-if="currentFromType == 'Login'" class="a-list">
                            <a @click="forgetPassword" class="a-list-a">忘记密码</a>
                            <a @click="register" class="a-list-a">免费注册</a>
                        </div>
                    </div>
                </el-col>
            </el-row>
        </el-main>
        <el-footer height="5%">{{ version }} {{ title }}</el-footer>
    </el-container>
</template>

<script>
    import Login from './Login'
    import global_ from '@/global/global'
    import Register from "./Register"
    import ForgetPassword from './ForgetPassword'
    export default {
        name: "LRindex",
        components: {
            Register,
            Login,
            ForgetPassword,
        },
        data() {
            return{
                currentFromType: 'Login',
                seen: true,

                title: global_.demoTitle,
                version: global_.demoVersion,

                main_width: 6,

            }
        },
        computed:{
            getPushWidth: function () {
                return 12 - this.main_width / 2
            }
        },
        methods: {
            forgetPassword: function () {
                this.currentFromType = 'ForgetPassword'
            },

            register : function () {
                this.currentFromType = 'Register'
            }
        }
    }
</script>

<style scoped>
    .lr-container {
        height: 100%;
        position: absolute;
        top: 0px;
        left: 0px;
        width: 100%;
        background-color: #24c0ff;
    }

    .title {
        line-height: 150px;
        font-size: 50px;
        color: white;
    }

    .a-list {
        text-align: right;
    }

    .a-list-a{
        display: inline-block;
        margin: 5px;
        cursor: pointer;
    }

    .lr-form {
        border-radius: 5%;
        background-clip: padding-box;
        margin: auto;
        width: 70%;
        padding: 5% 5% 5% 5%;
        background: #fff;
        border: 1px solid #eaeaea;
        box-shadow: 0 0 25px #cac6c6;
    }
</style>
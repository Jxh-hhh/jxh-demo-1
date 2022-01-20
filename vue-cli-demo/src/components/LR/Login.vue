<template>
    <div>
        <el-form :rules="rules" label-position="left"
                 label-width="0px" v-loading="loginForm.loading">
            <h3>系统登录</h3>
            <el-form-item>
                <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="账号"></el-input>
            </el-form-item>
            <el-form-item>
                <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="密码" show-password></el-input>
            </el-form-item>
        </el-form>
        <el-button type="primary" @click.native.prevent="login" style="width: 100%">登录</el-button>
    </div>
</template>

<script>
    export default {
        name: 'Login',
        data () {
            return {
                loginForm: {
                    username: '',
                    password: '',
                    loading: false,
                },

                rules: {} // TODO: 账号密码验证规则
            }
        },
        methods: {
            login () {
                this.$axios.get('/api/login', {
                    params: {
                        username: this.loginForm.username,
                        password: this.loginForm.password
                    }
                }).then(res => {
                    if (res.data.code === 200) {
                        console.log(res)
                        // this.$router.replace({path: '/home'})
                    } else {
                        console.info('no')
                    }
                })
            }
        }
    }
</script>

<style scoped>

</style>
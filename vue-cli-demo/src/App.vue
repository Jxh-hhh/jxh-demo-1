<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <!--<div>-->
      <!--<el-button>el-button</el-button>-->
    <!--</div>-->
    <!--<router-link to="/login">Go to login</router-link>-->
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'app',
  components: {
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

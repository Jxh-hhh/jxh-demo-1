import Vue from 'vue'
import App from './App.vue'
import router from '@/router'
import './plugins/element.js'

var axios = require('axios')
Vue.prototype.$axios = axios
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

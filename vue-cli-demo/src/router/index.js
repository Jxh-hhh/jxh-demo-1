import VueRouter from 'vue-router'
import Vue from 'vue'
import LR from '@/components/LR/LRindex'
import Home from '@/components/Home'

// 使用VueRouter
Vue.use(VueRouter);
// 定义路由
const routes = [
    {
        path: '/',
        name: 'Login and Register',
        component: LR,
    },
    {
        path: '/home',
        name: 'Main Page',
        component: Home
    }

];
// 创建 router 实例，然后传 `routes` 配置
const router = new VueRouter({
    mode: 'history',
    routes
});
// 暴露接口
export default router;
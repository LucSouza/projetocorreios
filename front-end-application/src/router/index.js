import Vue from 'vue'
import Router from 'vue-router'


Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            name: 'Login',
            component: () => import('../pages/login/')
        },
        {
            path: '/sign-up',
            name: 'SignUp',
            component: () => import('../pages/signUp/')
            
        },
        {
            path: '/reg-code',
            name: 'RegCode',
            component: () => import('../pages/regCode/')
            
        },
        {
            path: '/dashboard',
            name: 'Dashboard',
            component: () => import('../pages/dashboard/')
            
        },
        {
            path: '/menu',
            name: 'Menu',
            component: () => import('../pages/menu/')
        }


    ]
})

export default router;

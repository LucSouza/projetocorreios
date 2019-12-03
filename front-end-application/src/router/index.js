import Vue from 'vue'
import Router from 'vue-router'
//import AuthGuard from './auth-guard'


Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            name: 'Login',
            component: () => import('../pages/login/')
            //beforeEnter: AuthGuard
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
            path: '/info',
            name: 'Info',
            component: () => import('../pages/info/')

        },

    ],
    mode: 'history'
})

export default router;

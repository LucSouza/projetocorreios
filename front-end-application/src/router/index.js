import Vue from 'vue'
import Router from 'vue-router'
import Login from '../pages/login/'
import SignUp from '../pages/sign-up/'
import RegCode from '../pages/regCode/'
import Dashboard from '../pages/dashboard/'


Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            name: 'Login',
            component: Login
        },
        {
            path: '/sign-up',
            name: 'SignUp',
            component: SignUp
        },
        {
            path: '/reg-code',
            name: 'RegCode',
            component: RegCode
        },
        {
            path: '/dashboard',
            name: 'Dashboard',
            component: Dashboard
        }


    ]
})

export default router;


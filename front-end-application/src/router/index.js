import Vue from 'vue'
import Router from 'vue-router'
import Login from '../pages/login/'
import SignUp from '../pages/sign-up/'


Vue.use(Router)

const router = new Router ({
    routes : [
        {
            path: '/',
            name: 'Login',
            component: Login
        },
        {
            path: '/sign-up',
            name: 'Signup',
            component: SignUp
        }
           
        
    ]
})

export default router;


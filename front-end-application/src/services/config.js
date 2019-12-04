import axios from 'axios';
export const axiLocal = axios.create({

    baseURL: 'http://localhost:8080/api'

})

export const apiCorreios = axios.create({
    baseURL: 'http://rastreamento.ns2online.com.br/search'

})


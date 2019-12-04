import {axiLocal} from './config';

export default {


    listar:() =>{

        return axiLocal.get('trackings')
        
    }

}
<template>
    <v-container>
        <v-layout text-center wrap>
            <v-flex xs12>

                <h1 class="titleHead">Cadastro de usuario</h1>
            </v-flex>
            <v-flex mb-4>
                <v-form ref="form">
                    <label class="formlabel">CPF*</label>
                    <v-text-field v-model="form.cpf" solo required></v-text-field>
                    <label class="formlabel">Senha*</label>
                    <v-text-field type="password" v-model="form.senha" solo required></v-text-field>
                    <label class="formlabel">E-mail**</label>
                    <v-text-field v-model="form.email" solo required></v-text-field>
                    <v-flex row justify="start">
                        <small>*Campo requerido</small>
                    </v-flex>
                    <v-flex row justify="start">
                        <small>**Recuperação de senha</small>
                    </v-flex>
                    <br/>
                    <br/>
                    <v-flex row>
                        <v-flex>
                            <div class="text-center">
                                <v-btn rounded color="primary" class="botoes" dark to="dashboard" @click=createUser()>Cadastrar</v-btn>
                            </div>
                        </v-flex>

                        <v-flex>
                            <div class="text-center">
                                <v-btn rounded color="secundary" class="botoes" dark to="/">Cancelar</v-btn>
                            </div>
                        </v-flex>
                    </v-flex>
                </v-form>
                <br/>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>


    export default {

        data: () => ({
            form: {
                cpf: '',
                senha: '',
                email: ''
            },

        }),

        methods: {

            createUser(){
                this.form.post('/api/usuario')
            }
        

        }
    };
</script>


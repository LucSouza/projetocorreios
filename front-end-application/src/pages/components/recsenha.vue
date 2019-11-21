<template>
    <v-dialog v-model="dialog" persistent max-width="600px">
        <v-spacer></v-spacer>
        <template v-slot:activator="{ on }">
            <v-btn color="primary" dark v-on="on">Esqueci minha senha?</v-btn>
        </template>
        <v-card>
            <v-card-title>
                <span class="headline">Recuperar senha</span>
            </v-card-title>
            <v-card-text>
                <v-container>
                    <v-row>
                        <v-col cols="12" sm="6" md="4">
                            <v-text-field label="E-mail*" v-model="form.email" solo required></v-text-field>

                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                            <v-text-field label="CPF*" v-model="form.cpf" solo required></v-text-field>
                        </v-col>
                    </v-row>
                </v-container>
                <small>*Campo obrigatorio</small>
            </v-card-text>
            <v-card-actions>
                <v-spacer></v-spacer>
                <v-btn color="error" text @click="dialog = false">Voltar</v-btn>
                <v-btn color="success" text @click="dialog = false">Recuperar</v-btn>
            </v-card-actions>
        </v-card>
    </v-dialog>
</template>

<script>
    export default {
        name: "recsenha",

        data: () => ({
            form: {},
            dialog: false
        })
    };
</script>
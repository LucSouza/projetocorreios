<v-dialog v-model="dialog" max-width="500px">
    <template>
        <v-btn color="primary" dark class="mb-2" v-on="on">Adicionar código</v-btn>
    </template>
    <v-card>
        <v-card-title>
            <span class="headline">{{ formTitle }}</span>
        </v-card-title>

        <v-card-text>
            <v-container>
                <v-row>
                    <v-col cols="12" sm="6" md="4">
                        <v-text-field v-model="form.tcode"
                                      label="Tracking code"></v-text-field>
                    </v-col>
                    <v-col cols="12" sm="6" md="4">
                        <v-text-field v-model="form.descript"
                                      label="Descrição"></v-text-field>
                    </v-col>
                </v-row>
            </v-container>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn color="blue darken-1" text @click="fechar">Cancelar</v-btn>
            <v-btn color="blue darken-1" text @click="adicionar">Adicionar</v-btn>
        </v-card-actions>
    </v-card>
</v-dialog>

<script>
    export default {
        name: "novo",
        data: () => ({
            search: "",
            dialog: false}),

        computed: {
            formTitle() {
                return this.editedIndex === -1 ? 'Novo código de rastreio' : 'Editar código de rastreio'
            }
        },
        watch: {
            dialog(val) {
                val || this.fechar()
            }
        }

    };
</script>
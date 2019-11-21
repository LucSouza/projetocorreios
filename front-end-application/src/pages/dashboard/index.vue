<template>
    <v-container>
        <v-data-table

                :headers="headers"
                :items="trackings"
                :search="search"


                class="elevation-1"
        >

            <template v-slot:top>
                <v-toolbar flat color="dark">
                    <v-toolbar-title>Códigos de rastreio</v-toolbar-title>
                    <v-divider
                            class="mx-4"
                            inset
                            vertical
                    ></v-divider>
                    <v-text-field
                            v-model="search"
                            append-icon=mdi-magnify
                            label="Procurar por tracking code..."
                            single-line
                            hide-details
                    ></v-text-field>

                    <v-spacer></v-spacer>

                    <v-dialog v-model="dialog" max-width="500px">
                        <template v-slot:activator="{ on }">
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
                </v-toolbar>
            </template>
            <template v-slot:item.action="{ item }">
                <v-icon
                        small
                        class="mr-2"
                        @click="editar(item)"
                >
                    mdi-pencil
                </v-icon>
                <v-icon
                        small
                        @click="deletar(item)"
                >
                    mdi-delete
                </v-icon>
            </template>


        </v-data-table>

    </v-container>
</template>

<script>
    export default {
        data: () => ({
                search: "",
                dialog: false,
                headers: [
                    {text: 'Tracking code', align: 'left', value: 'tcode'},
                    {text: 'Descrição', value: 'descript'},
                    {text: 'Localização', value: 'localization'},
                    {text: 'Estado de envio', value: 'status'},
                    {text: 'Actions', value: 'action', sortable: false},
                ],
                trackings: [],
                editedIndex: -1,
                form: {
                    tcode: '',
                    descript: '',
                },
                defaultItem: {
                    tcode: '',
                    descript: '',
                },
            }
        ),
        computed: {
            formTitle() {
                return this.editedIndex === -1 ? 'Novo código de rastreio' : 'Editar código de rastreio'
            }
            ,
        }
        ,
        watch: {
            dialog(val) {
                val || this.fechar()
            }
            ,
        }
        ,
        created() {
            this.initialize()
        }
        ,
        methods: {
            editar(item) {
                this.editedIndex = this.trackings.indexOf(item)
                this.form = Object.assign({}, item)
                this.dialog = true
            }
            ,
            deletar(item) {
                const index = this.trackings.indexOf(item)
                confirm('Tem certeza que quer deletar o código?') && this.trackings.splice(index, 1)
            }
            ,
            fechar() {
                this.dialog = false
                setTimeout(() => {
                    this.form = Object.assign({}, this.defaultItem)
                    this.editedIndex = -1
                }, 300)
            }
            ,
            adicionar() {
                if (this.editedIndex > -1) {
                    Object.assign(this.trackings[this.editedIndex], this.form)
                } else {
                    this.trackings.push(this.form)
                }
                this.fechar()
            }
            ,
        }
        ,
    }
</script>
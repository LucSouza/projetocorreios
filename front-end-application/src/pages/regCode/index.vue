<template>
    <v-container>

        <v-layout text-center wrap>
            <v-flex mb-4>
                <v-form ref="form" v-model="valid" lazy-validation>
                    <label class="formlabel">Tracking code*</label>
                    <v-text-field v-model="form.tcode" solo required></v-text-field>
                    <label class="formlabel">Descrição*</label>
                    <v-text-field v-model="form.description" solo required></v-text-field>
                    <v-row justify="start">
                        <small>*campos obrigatorios</small>
                    </v-row>
                    <br/>
                    <br/>
                    <v-flex row>
                        <v-flex>
                            <div class="text-center">
                                <v-btn outlined color="primary" class="botoes" dark to="dashboard">Cadastrar código
                                </v-btn>
                            </div>
                        </v-flex>

                        <v-flex>
                            <div class="text-center">
                                <v-btn outlined color="secundary" class="botoes" dark to="dashboard">Cancelar</v-btn>
                            </div>
                        </v-flex>
                    </v-flex>
                </v-form>
                <br/>
            </v-flex>

        </v-layout>
        <layout />

    </v-container>

</template>

<script>
    import layout from "../components/menu"
    export default {
        data: () => ({
            form: {}
        }),
        components: {layout}
    };
</script>
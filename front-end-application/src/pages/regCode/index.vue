<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs12>
        <img class="logo" src="../../assets/logo.png" />
        <h1 class="titleHead">Cadastro de Tracking code</h1>
      </v-flex>
      <v-flex mb-4>
        <v-form ref="form" v-model="valid" lazy-validation>
          <label class="formlabel">Numero de código*</label>
          <v-text-field v-model="usuario" solo required></v-text-field>
          <label class="formlabel">Descrição de código</label>
          <v-text-field v-model="email" solo required></v-text-field>
          <label class="formlabel">Data prevista de entrega</label>
          <v-text-field v-model="endereco" solo required></v-text-field>
          <v-row justify="start">
          <small>*indicates required field</small> </v-row>
          <br />
          <br />
          <v-row>
       
            <v-col>
              <v-btn
                :disabled="!valid"
                color="success"
                class="buttomFull"
                @click="redirectURL('dashboard')"
              >Confirmar</v-btn>
            </v-col>

            <br />
            <br />
            <v-col>
              <v-btn color="error" class="buttomFull mr-4" @click="redirectURL('dashboard')">Cancelar</v-btn>
            </v-col>
          
          </v-row>
        </v-form>
        <br />
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
import mixins from "../../plugins/mixins";

export default {
  mixins: [mixins],
  data: () => ({
    valid: true,
    usuario: "",
    senha: "",
    email: "",
    endereco: ""
  }),

  methods: {
    validate() {
      if (this.$refs.form.validate()) {
        this.snackbar = true;
      }
    },
    reset() {
      this.$refs.form.reset();
    },
    resetValidation() {
      this.$refs.form.resetValidation();
    }
  }
};
</script>


<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs12>
        
        <h1 class="titleHead">Cadastro de usuario</h1>
      </v-flex>
      <v-flex mb-4>
        <v-form ref="form" v-model="valid" lazy-validation>
          <label class="formlabel">CPF*</label>
          <v-text-field v-model="cpf" solo required></v-text-field>
          <label class="formlabel">E-mail*</label>
          <v-text-field v-model="email" solo required></v-text-field>
          <label class="formlabel">Senha*</label>
          <v-text-field type="password" v-model="senha" solo required></v-text-field>
          <v-row justify="start">
            <small>*indicates required field</small>
          </v-row>
          <br />
          <br />
           <v-flex row>
            <v-flex>
              <div class="text-center">
                <v-btn rounded color="primary" class="botoes" dark to="dashboard">Cadastrar</v-btn>
              </div>
            </v-flex>

            <v-flex>
              <div class="text-center">
                <v-btn rounded color="secundary" class="botoes" dark to="/">Cancelar</v-btn>
              </div>
            </v-flex>
          </v-flex>
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


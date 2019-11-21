<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs12>
        <img class="logo" src="@/assets/logo.png" />
      </v-flex>
      <v-flex mb-4>
        <v-form ref="form">
          <label class="formlabel">CPF</label>
          <v-text-field v-model="form.cpf" solo required></v-text-field>

          <label class="formlabel">Senha</label>
          <v-text-field type="password" v-model="form.senha" solo required></v-text-field>

          <v-row justify="end">
            <recsenha />
          </v-row>
          <br />
          <br />
          <v-flex row>
            <v-flex>
              <div class="text-center">
                <v-btn outlined color="primary" class="botoes" dark to="dashboard">Login</v-btn>
              </div>
            </v-flex>

            <v-flex>
              <div class="text-center">
                <v-btn outlined color="secundary" class="botoes" dark to="sign-up">Cadastrar</v-btn>
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
import recsenha from "../components/recsenha";

export default {
  components: {
    recsenha
  },

  data: () => ({
    form: {
    }

  }),

};
</script>


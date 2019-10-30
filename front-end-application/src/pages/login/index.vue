<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs12>
        <img class="logo" src="../../assets/logo.png" />
      </v-flex>
      <v-flex mb-4>
        <v-form ref="form" v-model="valid" lazy-validation>
          <label class="formlabel">Usuário</label>
          <v-text-field v-model="usuario" solo required></v-text-field>

          <label class="formlabel">Senha</label>
          <v-text-field type="password" v-model="senha" solo required></v-text-field>
          
          <v-row justify="end">
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
                        <v-text-field label="Usuario*" required></v-text-field>
                      </v-col>
                      <v-col cols="12" sm="6" md="4">
                        <v-text-field label="Email*" required></v-text-field>
                      </v-col>
                    </v-row>
                  </v-container>
                  <small>*indicates required field</small>
                </v-card-text>
                <v-card-actions>
                  <v-spacer></v-spacer>
                  <v-btn color="error" text @click="dialog = false">Voltar</v-btn>
                  <v-btn color="success" text @click="dialog = false">Recuperar</v-btn>
                </v-card-actions>
              </v-card>
            </v-dialog>
          </v-row>
          <br />
          <br />
          <v-row>
            <v-col>
              <v-btn
                :disabled="!valid"
                color="success"
                class="buttomFull"
                @click="redirectURL('dashboard')"
              >Login</v-btn>
            </v-col>
            <br />
            <br />
            <v-col>
              <v-btn color="error" class="buttomFull mr-4" @click="redirectURL('sign-up')">Cadastro</v-btn>
            </v-col>
          </v-row>
        </v-form>
        <br />
      </v-flex>
      <v-footer absolute class="font-weight-medium">
        <v-card flat tile width="100%" class="blue lighten-1 text-center">
          <v-card-text class="white--text">© https://github.com/LucSouza</v-card-text>
          <v-divider></v-divider>
          <v-card-text class="white--text">
            {{ new Date().getFullYear() }} —
            <strong>
              GNU RULES |
              <a href="https://www.gnu.org/philosophy/free-sw.pt-br.html">Términos de uso</a>
            </strong>
          </v-card-text>
        </v-card>
      </v-footer>
    </v-layout>
  </v-container>
</template>

<script>
import mixins from "../../plugins/mixins";
import axios from "axios";
export default {
  mixins: [mixins],
  
  data: () => ({
    valid: true,
    usuario: "Teste",
    senha: "1234"
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


<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs12>
        <img class="logo" src="../../assets/logo.png" />
      </v-flex>
      <v-flex mb-4>
        <v-form ref="form" v-model="valid" lazy-validation>
          <label class="formlabel">Usuario</label>
          <v-text-field v-model="usuario" solo required></v-text-field>

          <label class="formlabel">Senha</label>
          <v-text-field type="password" v-model="senha" solo required></v-text-field>
          <a href="javascript:;" class="forgot">Esqueci minha senha</a>
          <br />
          <br />
          <v-row>
            <v-col></v-col>
            <v-col>
              <v-btn
                :disabled="!valid"
                color="success"
                class="buttomFull"
                @click="redirectURL('dashboard')"
              >Entrar</v-btn>
            </v-col>
            <br />
            <br />
            <v-col>
              <v-btn color="error" class="buttomFull mr-4" @click="redirectURL('sign-up')">Cadastrar</v-btn>
            </v-col>
            <v-col></v-col>
          </v-row>
        </v-form>

        <br />
    
    <v-footer
      absolute
      class="font-weight-medium"
    >
      <v-card
        flat
        tile
        width="100%"
        class="blue lighten-1 text-center"
      >
        <v-card-text class="white--text">
          © https://github.com/LucSouza
        </v-card-text>

        <v-divider></v-divider>

        <v-card-text class="white--text">
          {{ new Date().getFullYear() }} — <strong>GNU RULES |
                <a
                  href="https://www.gnu.org/philosophy/free-sw.pt-br.html"
                >Términos de uso</a></strong>
        </v-card-text>
      </v-card>
    </v-footer>

   
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


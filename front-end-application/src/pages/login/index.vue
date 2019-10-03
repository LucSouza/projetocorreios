<template>
  <v-container>
    <v-layout text-center wrap class='low'>
    <v-text-field
            v-model="usuario"
            :type="show1 ? 'text' : 'usuario'"
            name="input-10-1"
            label="Usuario"
          ></v-text-field>
          <v-text-field
            v-model="password"
            :append-icon="show1 ? 'Ocultar' : 'visibility_off'"
            :type="show1 ? 'text' : 'password'"
            name="input-10-1"
            label="Password"
            hint="At least 8 characters"
            counter
            @click:append="show1 = !show1"
          ></v-text-field>

  <v-container class="grey lighten-5">
    <v-row no-gutters>
      <template v-for="n in 2">
        <v-col :key="n">
          <v-card
          
          </v-card>
        
        </v-col>
        <v-responsive
          v-if="n === 2"
          :key="`width-${n}`"
          width="100%"
        ></v-responsive>
      </template>
    </v-row>
  </v-container>

<v-row no-gutters>
      <v-col
        v-for="n in 1"
        :key="n"
        :cols="n === 1 ? 6 : 6"
      >
        <v-card
          class="pa-2"
          tile
          outlined
        >
          
            <div class="text-center">
               <v-btn>Login</v-btn>
            </div>
        </v-card>
      </v-col>
      <v-col
        v-for="n in 1"
        :key="n"
        :cols="n === 1 ? 6 : 6"
      >
        <v-card
          class="pa-2"
          tile
          outlined
        >
          
            <div class="text-center">
               <v-btn>Criar Usuario</v-btn>
            </div>
        </v-card>
      </v-col>
    </v-row>
           

        </v-layout>
  </v-container>
</template>

<script>

  export default {
    name: 'Login',
    data(){
      return {
        usuario: '',
        password: '',
        show1: true
      }
    }
  }

</script>

<style>
.low {
  display: flex;
  justify-content: center;
  flex-direction: column;
  text-align: center; 
}
</style>
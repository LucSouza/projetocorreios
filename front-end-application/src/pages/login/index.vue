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
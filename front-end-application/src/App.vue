<template>
  <v-app>
    <v-content>
      <router-view/>
    </v-content>
  </v-app>
</template>

<script>
window.$ = require('jquery')
window.JQuery = require('jquery')
export default {
  name: 'App',
   components: {
  },
   data: () => ({
    //
  }),
};
</script>
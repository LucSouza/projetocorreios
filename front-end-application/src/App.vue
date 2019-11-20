<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" app clipped>
      <v-list dense>
        <v-list-item link to="dashboard">
          <v-list-item-action>
            <v-icon>mdi-view-dashboard</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Dashboard</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link to="reg-code">
          <v-list-item-action>
            <v-icon>mdi-plus-box</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Registrar código</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
          <v-list-item link to="/">
          <v-list-item-action>
            <v-icon>mdi-exit-to-app</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Logout</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar app clipped-left>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer" />
      <v-toolbar-title>CentracKode</v-toolbar-title>
    </v-app-bar>

    <v-content>
      <v-container class="fill-height" fluid>
       
          <router-view />
       
      </v-container>
    </v-content>

    <v-footer app >
      <span style="margin:auto">&copy; https://github.com/LucSouza</span>
        <v-card-text class="white--text text-center">
            {{ new Date().getFullYear() }} —
            <strong>
              GNU RULES |
              <a href="https://www.gnu.org/philosophy/free-sw.pt-br.html">Términos de uso</a>
            </strong>
          </v-card-text>
    </v-footer>
  </v-app>
</template>

<script>

export default {
  props: {
    source: String
  },
  data: () => ({
    drawer: null
  }),
  created() {
    this.$vuetify.theme.dark = true;
  },
    icons: {
    iconfont: 'mdiExitToApp', // default - only for display purposes
  },
};
</script>
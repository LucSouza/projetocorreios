<template>
    <v-app id="inspire">
        <v-navigation-drawer v-model="drawer" app clipped>
            <v-list>
                <v-list-item v-for="item in menuItems"
                             :key="item.title"
                             :to="item.link">
                    <v-list-item-action>
                        <v-icon> {{item.icon}}</v-icon>
                    </v-list-item-action>
                    <v-list-tile-content>{{item.title}}</v-list-tile-content>
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
        name: "layout",
        props: {
            source: String
        },
        data: () => ({
            drawer: null,
            menuItems: [
                {icon: 'mdi-view-dashboard', title: 'Dashboard', link: '/dashboard'},
                {icon: 'mdi-plus-box', title: 'Registrar código', link: '/reg-code'},
                {icon: 'mdi-exit-to-app', title: 'Sair', link: '/'}
            ]
        }),
        created() {
            this.$vuetify.theme.dark = true;
        },
        icons: {
            iconfont: 'mdiExitToApp', // default - only for display purposes
        },
    };
</script>
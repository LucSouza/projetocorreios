<template>
    <v-app id="inspire">

        <v-content>
            <v-container class="fill-height" fluid>

                <router-view/>

            </v-container>
        </v-content>

    </v-app>
</template>

<script>

    export default {

        props: {
            source: String
        },
        data: () => ({


        }),
        created() {
            this.$vuetify.theme.dark = true;
        },
        icons: {
            iconfont: 'mdiExitToApp', // default - only for display purposes
        },

    };
</script>
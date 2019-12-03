<template>
    <v-container>


    <v-flex>
        <h1>
            Como rastrear um objeto
        </h1>
        <p>
        Para consultar o rastreamento de um objeto, basta cadastrrar seu código de registro na página dashboard.

        Este código, presente no ticket comprovante de postagem, é composto por 13 dígitos alfanuméricos, organizados da seguinte forma:

    <v-row align="center" justify="center">
            <v-img max-width="600"
                   max-height="100" src='@/assets/ri.jpg'> </v-img>
    </v-row>
        </p>
        <p>
                Uma vez cadastrado o código ele aparecerá no dashboard com a descrição que você inseriu(é recomendado adicionar uma para identificar seu produto) o restante das informaçôes serão
                obtidas da página do correio. Essas informaçoes serão o local atual do produto e o status do mesmo.
                Exemplo: seu endereço, e o status como entregue.

                Lista de objetos

        </p>
    </v-flex>
        <layout />
    </v-container>
</template>

<script>
    import Layout from "../components/menu";
    export default {
        components: {Layout},
        name: "info"

    }

</script>

<style scoped>

</style>
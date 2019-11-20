<template>
  <v-container>
    <v-card>
      <v-text-field
        v-model="search"
        append-icon
        label="Procurar por tracking code..."
        single-line
        hide-details
      ></v-text-field>
   
    <v-data-table
      color="fundo"
      v-model="selected"
      :headers="headers"
      :items="trackings"
      :search="search"
      item-key="LocalState"
      show-select
      class="elevation-1"
    >
      <template v-slot:top></template>
    </v-data-table>
     </v-card>
    <v-flex row>
      <v-flex>
        <div>
          <v-btn outlined color="primary" class="botoes" dark to="reg-code">Cadastrar</v-btn>
        </div>
      </v-flex>

      <v-flex justify-content>
        <div>
          <v-btn outlined color="secundary" class="botoes" dark>Eliminar</v-btn>
        </div>
      </v-flex>
    </v-flex>
  </v-container>
</template>


<script>
export default {
  name: "dashboard",

  data() {
    return {
      search: "",
      singleSelect: true,
      selected: [],
      headers: [
        { text: "Localização", align: "left", value: "LocalState" },
        { text: "Tracking code", value: "tcode" },
        { text: "Data de postagem", value: "date" },
        { text: "Descrição", sortable: false, value: "descricao" },
        { text: "Status", sortable: false, value: "description" }
      ],
      trackings: [
        {
          LocalState: "SAO JOSE / SC",
          tcode: "OH305776077BR",
          dateOfPost: "13 / 08 / 2019",
          descricao: "Teste 1",
          description: "Objeto entregue ao destinatário"
        },
        {
          LocalState: "CAJAMAR / SP",
          tcode: "PX149041811BR",
          dateOfPost: "18 / 10 / 2019",
          descricao: "Teste 2",
          description: "Objeto entregue ao destinatário"
        },
        {
          LocalState: '"FLORIANOPOLIS / SC"',
          tcode: "LX008580575US",
          dateOfPost: "11 / 10 / 2019",
          descricao: "Teste 3",
          description: "Objeto entregue ao destinatário"
        }
      ]
    };
  }
};
</script>

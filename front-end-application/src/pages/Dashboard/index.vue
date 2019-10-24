<template>
  <v-container class="grey lighten-5">
    <v-layout text-center wrap>
      <v-flex xs12>
        <h1 class="titleHead">Dashboard</h1>
      </v-flex>
    </v-layout>
    <v-btn color="error" class="buttomFull mr-4" @click="redirectURL('/')">Logout</v-btn>
    <v-card>
      <v-text-field
        v-model="search"
        append-icon
        path="{mdi-magnify}"
        label="Procurar por tracking code..."
        single-line
        hide-details
      ></v-text-field>
    </v-card>
    <v-data-table
      v-model="selected"
      :headers="headers"
      :items="trackings"
      :search="search"
      item-key="LocalState"
      show-select
      class="elevation-1"
    >
      <template v-slot:top>
        
      </template>
    </v-data-table>
    <v-row>
      <v-col></v-col>
      <v-col>
        <v-btn color="success" class="buttomFull" @click="redirectURL('reg-Code')">Cadastrar código</v-btn>
      </v-col>

      <br />
      <br />
      <v-col>
        <v-btn color="error" class="buttomFull mr-4">Eliminar</v-btn>
      </v-col>
      <v-col></v-col>
    </v-row>
  </v-container>
</template>


<script>
import mixins from "../../plugins/mixins";
import React, { Component } from "react";
import Icon from "@mdi/react";
import { mdiMagnify } from "@mdi/js";

export default {
  mixins: [mixins],
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
          descricao: "BONECA INFLAVEL",
          description: "Objeto entregue ao destinatário"
        },
        {
          LocalState: "CAJAMAR / SP",
          tcode: "PX149041811BR",
          dateOfPost: "18 / 10 / 2019",
          descricao: "Celular alta gama",
          description: "Objeto entregue ao destinatário"
        },
        {
          LocalState: '"FLORIANOPOLIS / SC"',
          tcode: "LX008580575US",
          dateOfPost: "11 / 10 / 2019",
          descricao: "Vitamina b12",
          description: "Objeto entregue ao destinatário"
        }
      ]
    };
  }
};
</script>

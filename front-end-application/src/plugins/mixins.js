 import moment from 'moment'
// import JQuery from 'jquery'
// let $ = JQuery



export default {
  data(){
    return{
      dialog: false,
    }
  },
  methods: {

    redirectURL(path) {
      this.$router.push(path)
      return false
  },
    formatDate: function(data, formato) {
      if(data)
        if (formato == 'pt-br') {
          return (data.substr(0, 10).split('-').reverse().join('/'));
        } else {
          return (data.substr(0, 10).split('/').reverse().join('-'));
        }
    },
    string_to_slug(str) {
          str = str.replace(/^\s+|\s+$/g, ''); // trim
          str = str.toLowerCase();

          // remove accents, swap ñ for n, etc
          var from = "àáäâèéëêìíïîòóöôùúüûñç·/_,:;";
          var to   = "aaaaeeeeiiiioooouuuunc------";
          for (var i=0, l=from.length ; i<l ; i++) {
              str = str.replace(new RegExp(from.charAt(i), 'g'), to.charAt(i));
          }

          str = str.replace(/[^a-z0-9 -]/g, '') // remove invalid chars
              .replace(/\s+/g, '-') // collapse whitespace and replace by -
              .replace(/-+/g, '-'); // collapse dashes

          return str;
        }
  },
  filters: {
    formatDate: function(value) {
      if (value) {
        return moment(String(value)).format('DD/MM/YYYY')
      }
    },
    formatDateTime: function(value) {
      if (value) {
        let date = moment(String(value)).format('DD/MM/YYYY')
        let time = moment(String(value)).format('hh:mm')
        return date + " às " + time
      }
    },
    sumNumber: function(value, num) {
      if (value) {
        return parseInt(value) + num
      }
    },
    truncate(value, limit){
      if (value.length > limit) {
          value = value.substring(0, (limit - 3)) + '...';
      }

      return value
    },
  
  }
}

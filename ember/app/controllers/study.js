import Ember from 'ember';
import $ from 'jquery';

export default Ember.Controller.extend({
  queryParams: {
    language: 'language',
    degree: 'degree',
    studyField: 'studyField',
  },

  language: '',
  degree: '',
  studyField: '',

  actions: {
    setDegree() {
      let selectBox = document.getElementById('select-degree');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('degree', option);
    },

    setLanguage() {
      let selectBox = document.getElementById('select-language');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('language', option);
    },

    setField() {
      let selectBox = document.getElementById('select-field');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('studyField', option);
    },

    removeLanguage() {
      this.set('language', '');
    },

    removeDegree() {
      this.set('degree', 0);
    },

    removeStudyField() {
      this.set('studyField', 0);
    },
  },
});

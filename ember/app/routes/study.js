import Ember from 'ember';

export default Ember.Route.extend({
  ajax: Ember.inject.service(),
  queryParams: {
    language: {
      refreshModel: true,
    },
    degree: {
      refreshModel: true,
    },
    studyField: {
      refreshModel: true,
    },
  },
  model(params) {
    return Ember.RSVP.hash({
      response: this.get('ajax').request('/api/v1/findStudyPrograms?language=' + params.language + '&degree=' + params.degree + '&studyField=' + params.studyField),
      locations: this.get('ajax').request('/api/v1/getAllCities'),
      universities: this.get('ajax').request('/api/v1/getAllUniversities'),
      popularlocations:  this.get('ajax').request('/api/v1/getPopularLocations'),
      fields: this.get('ajax').request('/api/v1/getAllStudyFields'),
    });
  },
});

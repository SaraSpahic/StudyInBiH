import Ember from 'ember';

export default Ember.Route.extend({
  ajax: Ember.inject.service(),
  model() {
    return Ember.RSVP.hash({
      locations: this.get('ajax').request('/api/v1/getAllCities'),
      universities: this.get('ajax').request('/api/v1/getAllUniversities'),
      popularlocations:  this.get('ajax').request('/api/v1/getPopularLocations'),
    });
  },
});

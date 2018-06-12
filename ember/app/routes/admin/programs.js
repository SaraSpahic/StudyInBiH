import Ember from 'ember';

export default Ember.Route.extend({
  ajax: Ember.inject.service(),
  model() {
    return Ember.RSVP.hash({
      programs: this.get('ajax').request('/api/v1/getAllStudyPrograms'),
    });
  },
});

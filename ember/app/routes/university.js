import Ember from 'ember';

const {
  inject: {
    service,
  },
} = Ember;

export default Ember.Route.extend({
  ajax: service('ajax'),

  model(params) {
    return Ember.RSVP.hash({
      university: this.get('ajax').request('/api/v1/getUniversity/' + params.university_id),
      programs: this.get('ajax').request('/api/v1/getStudyPrograms/' + params.university_id),
      review:{},
      universityReviews: this.get('ajax').request('/api/v1/getReviews/' + params.university_id),
      currentPhoto:{},
    });
  },
  actions: {
    sessionChanged: function() {
      this.refresh();
    }
  },
});

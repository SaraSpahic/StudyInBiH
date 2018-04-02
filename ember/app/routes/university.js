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
    });
  },
});

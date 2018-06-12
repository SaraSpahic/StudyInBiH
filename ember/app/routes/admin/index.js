import Ember from 'ember';

const {
  inject: {
    service,
  },
} = Ember;

export default Ember.Route.extend({
  ajax: service('ajax'),

  model() {
    return Ember.RSVP.hash({
      user: this.get('ajax').request('/api/v1/getCurrentUser', {
        xhrFields: {
          withCredentials: true,
        },
      }),
    });
  },

  afterModel(model) {

    if (model.user != null && model.user.object != null && model.user.object.isAdmin) {
      this.transitionTo('admin.index');
    }
    else  {
      this.transitionTo('index');
    }
  },
});

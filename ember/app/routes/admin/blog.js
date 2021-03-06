import Ember from 'ember';

export default Ember.Route.extend({
  ajax: Ember.inject.service(),
  model() {
    return Ember.RSVP.hash({
      posts: this.get('ajax').request('/api/v1/getBlogPostByType/ARTICLE'),
      post: {},
    });
  },
  actions: {
    sessionChanged: function() {
      this.refresh();
    }
  },
});

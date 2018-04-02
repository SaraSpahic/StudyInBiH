import Ember from 'ember';

const {
  inject: {
    service,
  },
} = Ember;

export default Ember.Controller.extend({
  ajax: service('ajax'),
  actions: {
    authenticate() {
      this.get('ajax').post('/api/v1/login', {
        xhrFields: {
          withCredentials: true,
        },
        data: {
          username: this.get('username'),
          password: this.get('password'),
        },
      })
      .then(
        (user) =>  this.transitionToRoute(user.isAdmin ? 'admin' : 'index'),
        (error) => {
          this.set('hasError', true);
        }
      );
    },
  },
});

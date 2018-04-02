import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('university');
  this.route('locations');
  this.route('study');
  this.route('blog');
  this.route('login');
  this.route('admin', function() {
    this.route('cities');
    this.route('universities');
    this.route('programs');
    this.route('fields');
    this.route('blog');
  });
});

export default Router;

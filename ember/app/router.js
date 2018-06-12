import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('university',{ path: 'university/:university_id' });
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
    this.route('city-edit',  { path: 'city-edit/:city_id' });
    this.route('city-add');
    this.route('university-edit', { path: 'university-edit/:university_id' });
    this.route('university-add');
    this.route('program-add',  { path: 'program-add/:university_id' });
    this.route('fields-add');
    this.route('program-edit', { path: 'program-edit/:program_id/:university_id' });
    this.route('blog-add');
    this.route('admission');
    this.route('blog-edit',{ path: 'blog-edit/:blog_id' });
    this.route('logout');
  });
  this.route('city',{ path: 'city/:city_id' });
  this.route('program', { path: 'program/:program_id' });
  this.route('universities');
  this.route('admission');
  this.route('search-results');
});

export default Router;

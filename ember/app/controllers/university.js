import Ember from 'ember';

const {
  inject: {
    service,
  },
} = Ember;

export default Ember.Controller.extend({
  ajax: service('ajax'),
  actions:{
    addReview() {
      this.set('model.review.universityId', this.get('model.university.id'));
      let jsonData = JSON.stringify(this.get('model.review'));
      let method = 'post';
      let request = '/api/v1/postReview';

      if (this.get('model.review.reviewScore') == null) {
        this.set('model.review.reviewScore',5);
      }

      this.get('ajax')[method](request, {
        xhrFields: {
          withCredentials: true,
        },
        contentType: 'application/json',
        data: jsonData,
      })
      .then(() => this.send("sessionChanged"));
    },
    selectProgram() {
      let selectBox = document.getElementById('select-program');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('model.review.studyProgram', option);
    },
    selectRating() {
      let selectBox = document.getElementById('select-rating');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('model.review.reviewScore', option);
    },
    selectRecommend() {
      let selectBox = document.getElementById('select-recommend');
      let option = selectBox.options[selectBox.selectedIndex].value;
      this.set('model.review.recommends', option);
    },
    showPhotoModal(path) {
      let modal = document.getElementById('galleryModal');
      this.set('model.currentPhoto',path)
      console.log(path)
      console.log("photo modal function is triggered");
    },
  }

});

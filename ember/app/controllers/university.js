import Controller from '@ember/controller';

export default Controller.extend({

  isShowingBody:false,

  title: "Show Universities",

  actions:{
    toggleBody:function(){
      this.toggleProperty('isShowingBody');
    }
  }

});

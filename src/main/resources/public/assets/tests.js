'use strict';

define('studyinbih/tests/app.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | app');

  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });

  QUnit.test('components/admin/add-field-modal.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/admin/add-field-modal.js should pass ESLint\n\n1:16 - \'Ember\' is not defined. (no-undef)');
  });

  QUnit.test('components/admin/admin-navigation.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/admin/admin-navigation.js should pass ESLint\n\n');
  });

  QUnit.test('components/box-link.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/box-link.js should pass ESLint\n\n');
  });

  QUnit.test('components/file-upload.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/file-upload.js should pass ESLint\n\n25:11 - Unexpected console statement. (no-console)\n26:11 - Unexpected console statement. (no-console)\n27:11 - Unexpected console statement. (no-console)');
  });

  QUnit.test('components/location-view.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/location-view.js should pass ESLint\n\n');
  });

  QUnit.test('components/navigation-wrapper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/navigation-wrapper.js should pass ESLint\n\n');
  });

  QUnit.test('components/program-card.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/program-card.js should pass ESLint\n\n');
  });

  QUnit.test('components/star-score.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/star-score.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/admin/admission.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/admission.js should pass ESLint\n\n28:48 - \'timestamp\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/admin/blog-add.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/blog-add.js should pass ESLint\n\n29:48 - \'timestamp\' is defined but never used. (no-unused-vars)\n30:5 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/admin/blog-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/blog-edit.js should pass ESLint\n\n28:48 - \'timestamp\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/admin/blog.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/blog.js should pass ESLint\n\n2:8 - \'hbs\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/admin/city-add.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/city-add.js should pass ESLint\n\n40:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/admin/city-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/city-edit.js should pass ESLint\n\n55:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/admin/fields-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/admin/fields-add.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/admin/fields.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/fields.js should pass ESLint\n\n2:8 - \'hbs\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/admin/logout.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/logout.js should pass ESLint\n\n24:10 - \'error\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/admin/program-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/admin/program-add.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/admin/program-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/program-edit.js should pass ESLint\n\n33:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/admin/university-add.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/university-add.js should pass ESLint\n\n35:7 - Unexpected console statement. (no-console)\n47:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/admin/university-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/admin/university-edit.js should pass ESLint\n\n75:7 - Unexpected console statement. (no-console)\n87:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/locations.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/locations.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/login.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/login.js should pass ESLint\n\n24:10 - \'error\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/study.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/study.js should pass ESLint\n\n2:8 - \'$\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/university.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/university.js should pass ESLint\n\n51:11 - \'modal\' is assigned a value but never used. (no-unused-vars)\n53:7 - Unexpected console statement. (no-console)\n54:7 - Unexpected console statement. (no-console)');
  });

  QUnit.test('helpers/millis-to-date.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/millis-to-date.js should pass ESLint\n\n');
  });

  QUnit.test('resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'resolver.js should pass ESLint\n\n');
  });

  QUnit.test('router.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'router.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/admission.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/admission.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/blog-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/blog-add.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/blog-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/blog-edit.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/blog.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/blog.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/cities.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/cities.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/city-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/city-add.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/city-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/city-edit.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/fields-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/fields-add.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/fields.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/fields.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/index.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/index.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/logout.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/logout.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/program-add.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/admin/program-add.js should pass ESLint\n\n13:5 - Unexpected console statement. (no-console)\n13:5 - Unreachable code. (no-unreachable)');
  });

  QUnit.test('routes/admin/program-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/admin/program-edit.js should pass ESLint\n\n6:5 - Unexpected console statement. (no-console)');
  });

  QUnit.test('routes/admin/programs.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/programs.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/universities.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/universities.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/university-add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/university-add.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admin/university-edit.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admin/university-edit.js should pass ESLint\n\n');
  });

  QUnit.test('routes/admission.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/admission.js should pass ESLint\n\n');
  });

  QUnit.test('routes/blog.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/blog.js should pass ESLint\n\n12:9 - \'params\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('routes/city.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/city.js should pass ESLint\n\n');
  });

  QUnit.test('routes/index.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/index.js should pass ESLint\n\n');
  });

  QUnit.test('routes/locations.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/locations.js should pass ESLint\n\n');
  });

  QUnit.test('routes/login.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/login.js should pass ESLint\n\n');
  });

  QUnit.test('routes/program.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/program.js should pass ESLint\n\n');
  });

  QUnit.test('routes/search-results.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/search-results.js should pass ESLint\n\n');
  });

  QUnit.test('routes/study.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/study.js should pass ESLint\n\n');
  });

  QUnit.test('routes/universities.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/universities.js should pass ESLint\n\n');
  });

  QUnit.test('routes/university.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/university.js should pass ESLint\n\n');
  });

  QUnit.test('services/ajax.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'services/ajax.js should pass ESLint\n\n');
  });
});
define('studyinbih/tests/helpers/destroy-app', ['exports'], function (exports) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.default = destroyApp;
  function destroyApp(application) {
    Ember.run(application, 'destroy');
  }
});
define('studyinbih/tests/helpers/ember-power-select', ['exports', 'ember-power-select/test-support/helpers'], function (exports, _helpers) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.selectChoose = exports.touchTrigger = exports.nativeTouch = exports.clickTrigger = exports.typeInSearch = exports.triggerKeydown = exports.nativeMouseUp = exports.nativeMouseDown = exports.findContains = undefined;
  exports.default = deprecatedRegisterHelpers;


  function deprecateHelper(fn, name) {
    return function () {
      (true && !(false) && Ember.deprecate('DEPRECATED `import { ' + name + ' } from \'../../tests/helpers/ember-power-select\';` is deprecated. Please, replace it with `import { ' + name + ' } from \'ember-power-select/test-support/helpers\';`', false, { until: '1.11.0', id: 'ember-power-select-test-support-' + name }));

      return fn.apply(undefined, arguments);
    };
  }

  var findContains = deprecateHelper(_helpers.findContains, 'findContains');
  var nativeMouseDown = deprecateHelper(_helpers.nativeMouseDown, 'nativeMouseDown');
  var nativeMouseUp = deprecateHelper(_helpers.nativeMouseUp, 'nativeMouseUp');
  var triggerKeydown = deprecateHelper(_helpers.triggerKeydown, 'triggerKeydown');
  var typeInSearch = deprecateHelper(_helpers.typeInSearch, 'typeInSearch');
  var clickTrigger = deprecateHelper(_helpers.clickTrigger, 'clickTrigger');
  var nativeTouch = deprecateHelper(_helpers.nativeTouch, 'nativeTouch');
  var touchTrigger = deprecateHelper(_helpers.touchTrigger, 'touchTrigger');
  var selectChoose = deprecateHelper(_helpers.selectChoose, 'selectChoose');

  function deprecatedRegisterHelpers() {
    (true && !(false) && Ember.deprecate("DEPRECATED `import registerPowerSelectHelpers from '../../tests/helpers/ember-power-select';` is deprecated. Please, replace it with `import registerPowerSelectHelpers from 'ember-power-select/test-support/helpers';`", false, { until: '1.11.0', id: 'ember-power-select-test-support-register-helpers' }));

    return (0, _helpers.default)();
  }

  exports.findContains = findContains;
  exports.nativeMouseDown = nativeMouseDown;
  exports.nativeMouseUp = nativeMouseUp;
  exports.triggerKeydown = triggerKeydown;
  exports.typeInSearch = typeInSearch;
  exports.clickTrigger = clickTrigger;
  exports.nativeTouch = nativeTouch;
  exports.touchTrigger = touchTrigger;
  exports.selectChoose = selectChoose;
});
define('studyinbih/tests/helpers/module-for-acceptance', ['exports', 'qunit', 'studyinbih/tests/helpers/start-app', 'studyinbih/tests/helpers/destroy-app'], function (exports, _qunit, _startApp, _destroyApp) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });

  exports.default = function (name) {
    var options = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : {};

    (0, _qunit.module)(name, {
      beforeEach: function beforeEach() {
        this.application = (0, _startApp.default)();

        if (options.beforeEach) {
          return options.beforeEach.apply(this, arguments);
        }
      },
      afterEach: function afterEach() {
        var _this = this;

        var afterEach = options.afterEach && options.afterEach.apply(this, arguments);
        return Ember.RSVP.resolve(afterEach).then(function () {
          return (0, _destroyApp.default)(_this.application);
        });
      }
    });
  };
});
define('studyinbih/tests/helpers/resolver', ['exports', 'studyinbih/resolver', 'studyinbih/config/environment'], function (exports, _resolver, _environment) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });


  var resolver = _resolver.default.create();

  resolver.namespace = {
    modulePrefix: _environment.default.modulePrefix,
    podModulePrefix: _environment.default.podModulePrefix
  };

  exports.default = resolver;
});
define('studyinbih/tests/helpers/start-app', ['exports', 'studyinbih/app', 'studyinbih/config/environment'], function (exports, _app, _environment) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.default = startApp;
  function startApp(attrs) {
    var attributes = Ember.merge({}, _environment.default.APP);
    attributes = Ember.merge(attributes, attrs); // use defaults, but you can override;

    return Ember.run(function () {
      var application = _app.default.create(attributes);
      application.setupForTesting();
      application.injectTestHelpers();
      return application;
    });
  }
});
define('studyinbih/tests/integration/components/admin/add-field-modal-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('admin/add-field-modal', 'Integration | Component | admin/add field modal', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "1uBHbtzE",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"admin/add-field-modal\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "O5JgtEsW",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"admin/add-field-modal\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/admin/admin-navigation-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('admin/admin-navigation', 'Integration | Component | admin/admin navigation', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "RMMjjT65",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"admin/admin-navigation\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "dubCqUGv",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"admin/admin-navigation\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/box-link-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('box-link', 'Integration | Component | box link', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "YNwhURRL",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"box-link\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "p6d5wVei",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"box-link\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/file-upload-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('file-upload', 'Integration | Component | file upload', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "aj90Kxhq",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"file-upload\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "0uPGwFxq",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"file-upload\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/location-view-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('location-view', 'Integration | Component | location view', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "WAftvjqF",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"location-view\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "lJ5ECOTR",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"location-view\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/navigation-wrapper-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('navigation-wrapper', 'Integration | Component | navigation wrapper', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "v7BhySyA",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"navigation-wrapper\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "5ejaN3M4",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"navigation-wrapper\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/program-card-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('program-card', 'Integration | Component | program card', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "NdkEjAd0",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"program-card\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "ZyA81cPg",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"program-card\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/components/star-score-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('star-score', 'Integration | Component | star score', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "E6gxtN7N",
      "block": "{\"symbols\":[],\"statements\":[[1,[18,\"star-score\"],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "ijLU9Vrk",
      "block": "{\"symbols\":[],\"statements\":[[0,\"\\n\"],[4,\"star-score\",null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"parameters\":[]},null],[0,\"  \"]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('studyinbih/tests/integration/helpers/millis-to-date-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('millis-to-date', 'helper:millis-to-date', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "F4u/7SlH",
      "block": "{\"symbols\":[],\"statements\":[[1,[25,\"millis-to-date\",[[20,[\"inputValue\"]]],null],false]],\"hasEval\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('studyinbih/tests/test-helper', ['studyinbih/tests/helpers/resolver', 'ember-qunit', 'ember-cli-qunit'], function (_resolver, _emberQunit, _emberCliQunit) {
  'use strict';

  (0, _emberQunit.setResolver)(_resolver.default);
  (0, _emberCliQunit.start)();
});
define('studyinbih/tests/tests.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | tests');

  QUnit.test('helpers/destroy-app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/destroy-app.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/module-for-acceptance.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/module-for-acceptance.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/resolver.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/start-app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/start-app.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/admin/add-field-modal-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/admin/add-field-modal-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/admin/admin-navigation-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/admin/admin-navigation-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/box-link-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/box-link-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/file-upload-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/file-upload-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/location-view-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/location-view-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/navigation-wrapper-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/navigation-wrapper-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/program-card-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/program-card-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/star-score-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/star-score-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/millis-to-date-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/millis-to-date-test.js should pass ESLint\n\n');
  });

  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/admission-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/admission-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/blog-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/blog-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/blog-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/blog-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/blog-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/blog-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/city-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/city-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/city-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/city-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/fields-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/fields-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/fields-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/fields-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/logout-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/logout-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/program-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/program-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/program-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/program-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/university-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/university-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/admin/university-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/admin/university-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/locations-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/locations-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/study-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/study-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/university-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/university-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/admission-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/admission-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/blog-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/blog-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/blog-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/blog-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/blog-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/blog-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/cities-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/cities-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/city-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/city-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/city-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/city-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/fields-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/fields-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/fields-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/fields-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/index-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/index-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/logout-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/logout-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/program-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/program-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/program-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/program-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/programs-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/programs-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/universities-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/universities-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/university-add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/university-add-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admin/university-edit-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admin/university-edit-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/admission-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/admission-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/blog-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/blog-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/city-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/city-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/index-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/index-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/locations-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/locations-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/program-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/program-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/search-results-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/search-results-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/study-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/study-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/universities-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/universities-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/university-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/university-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/ajax-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/ajax-test.js should pass ESLint\n\n');
  });
});
define('studyinbih/tests/unit/controllers/admin/admission-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/admission', 'Unit | Controller | admin/admission', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/blog-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/blog-add', 'Unit | Controller | admin/blog add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/blog-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/blog-edit', 'Unit | Controller | admin/blog edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/blog-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/blog', 'Unit | Controller | admin/blog', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/city-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/city-add', 'Unit | Controller | admin/city add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/city-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/city-edit', 'Unit | Controller | admin/city edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/fields-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/fields-add', 'Unit | Controller | admin/fields add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/fields-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/fields', 'Unit | Controller | admin/fields', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/logout-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/logout', 'Unit | Controller | admin/logout', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/program-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/program-add', 'Unit | Controller | admin/program add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/program-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/program-edit', 'Unit | Controller | admin/program edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/university-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/university-add', 'Unit | Controller | admin/university add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/admin/university-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/university-edit', 'Unit | Controller | admin/university edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/locations-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:locations', 'Unit | Controller | locations', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:admin/login', 'Unit | Controller | admin/login', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/study-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:study', 'Unit | Controller | study', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/controllers/university-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:university', 'Unit | Controller | university', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('studyinbih/tests/unit/routes/admin-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin', 'Unit | Route | admin', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/admission-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/admission', 'Unit | Route | admin/admission', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/blog-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/blog-add', 'Unit | Route | admin/blog add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/blog-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/blog-edit', 'Unit | Route | admin/blog edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/blog-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/blog', 'Unit | Route | admin/blog', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/cities-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/cities', 'Unit | Route | admin/cities', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/city-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/city-add', 'Unit | Route | admin/city add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/city-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/city-edit', 'Unit | Route | admin/city edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/fields-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/fields-add', 'Unit | Route | admin/fields add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/fields-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/fields', 'Unit | Route | admin/fields', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/index-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/index', 'Unit | Route | admin/index', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/logout-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/logout', 'Unit | Route | admin/logout', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/program-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/program-add', 'Unit | Route | admin/program add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/program-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/program-edit', 'Unit | Route | admin/program edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/programs-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/programs', 'Unit | Route | admin/programs', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/universities-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/universities', 'Unit | Route | admin/universities', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/university-add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/university-add', 'Unit | Route | admin/university add', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admin/university-edit-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admin/university-edit', 'Unit | Route | admin/university edit', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/admission-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:admission', 'Unit | Route | admission', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/blog-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:blog', 'Unit | Route | blog', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/city-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:city', 'Unit | Route | city', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/index-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:index', 'Unit | Route | index', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/locations-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:locations', 'Unit | Route | locations', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:login', 'Unit | Route | login', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/program-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:program', 'Unit | Route | program', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/search-results-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:search-results', 'Unit | Route | search results', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/study-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:study', 'Unit | Route | study', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/universities-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:universities', 'Unit | Route | universities', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/routes/university-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:university', 'Unit | Route | university', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('studyinbih/tests/unit/services/ajax-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:ajax', 'Unit | Service | ajax', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
require('studyinbih/tests/test-helper');
EmberENV.TESTS_FILE_LOADED = true;
//# sourceMappingURL=tests.map

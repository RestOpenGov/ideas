// NOT USED!

var controllers = {};

routes.forEach(function(item) {

  var controller;
  var controllerName = item.action.split('.')[0] + 'Controller';
  var actionName = item.action.split('.')[1];

  if(controllers[controllerName] === undefined) {
    var Controller = require('./controllers/' + controllerName)[controllerName];
    controllers[controllerName] = new Controller();
    controller = controllers[controllerName];
  }

  server[item.method.toLowerCase()](item.uri, function(req, res, next) {
    new Controller()[actionName](req, res);
    console.log(controller);
    return next();
  });

});

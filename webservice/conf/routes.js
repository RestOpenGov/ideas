
module.exports = function(restify, server, controllers, mock) {

  server.get('/ping',           controllers.ping.ping);

  server.get('/users',          controllers.users.list);
  server.get('/users/:id',      controllers.users.show);

  server.get('/types',          controllers.ideasTypes.list);
  server.get('/types/:id',      controllers.ideasTypes.show);

  server.get('/mock/users',     mock.users.list);
  server.get('/mock/users/:id', mock.users.show);

  server.get(/\/?.*/, restify.serveStatic({
    'directory': './public',
    'default'   : 'index.html'
  }));

};

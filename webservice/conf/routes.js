
module.exports = function(restify, server, controllers, mock) {

  server.get('/ping',           controllers.ping.ping);

  server.get('/users',          controllers.users.list);
  server.get('/users/count',    controllers.users.count);
  server.get('/users/:id',      controllers.users.show);

  server.get('/types',          controllers.ideaTypes.list);
  server.get('/types/count',    controllers.ideaTypes.count);
  server.get('/types/:id',      controllers.ideaTypes.show);

  server.get('/mock/users',     mock.users.list);
  server.get('/mock/users/:id', mock.users.show);

  server.get(/\/?.*/, restify.serveStatic({
    'directory': './public',
    'default'   : 'index.html'
  }));

};

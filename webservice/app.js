
var restify = require('restify');

var server = restify.createServer({
  name: 'Ideas',
  version: '0.2.0'
});

var controllers = require('./controllers');

server.use(restify.acceptParser(server.acceptable));
server.use(restify.queryParser());
server.use(restify.bodyParser({ mapParams: false }));

server.get('/ping', controllers.ping.ping);

server.get('/users', controllers.users.list);
server.get('/users/:id', controllers.users.show);

server.get('/types', controllers.ideasTypes.list);
server.get('/types/:id', controllers.ideasTypes.show);

var mock = require('./controllers/mock');

server.get('/mock/users', mock.users.list);
server.get('/mock/users/:id', mock.users.show);

// server.get(/\/docs\/public\/?.*/, restify.serveStatic({
//   directory: './public'
// }));

server.listen(1337, function() {
  console.log('%s listening at %s', server.name, server.url);
});

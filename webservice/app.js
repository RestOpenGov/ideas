
var restify = require('restify'),
    usersController = require('./controllers/users.js'),
    ideasTypesController = require('./controllers/ideasTypes.js');

var server = restify.createServer({
  name: 'Ideas',
  version: '0.2.0'
});

server.use(restify.acceptParser(server.acceptable));
server.use(restify.queryParser());
server.use(restify.bodyParser({ mapParams: false }));

server.get('/users/list', usersController.list);
server.get('/users/show/:id', usersController.show);

server.get('/types/list', ideasTypesController.list);
server.get('/types/show/:id', ideasTypesController.show);

server.listen(1337, function() {
  console.log('%s listening at %s', server.name, server.url);
});

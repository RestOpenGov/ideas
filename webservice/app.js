
var restify     = require('restify'),
    controllers = require('./controllers'),
    mock        = require('./controllers/mock'),
    models      = require('./db.js').models;

// Create Restify Server
var server = restify.createServer({
  name: 'Ideas',
  version: '0.2.0'
});

// Inject models to each controller
for(var key in controllers) {
  controllers[key].models = models;
}

// Setup Restify server
require('./conf/restify.js')(restify, server);

// Setup routes
require('./conf/routes.js')(restify, server, controllers, mock);

// Start Restify server
server.listen(1337, function() {
  console.log('%s listening at %s', server.name, server.url);
});

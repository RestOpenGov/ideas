
module.exports = function(restify, server) {

  server.use(restify.acceptParser(server.acceptable));
  server.use(restify.queryParser());
  server.use(restify.bodyParser({ mapParams: false }));

};

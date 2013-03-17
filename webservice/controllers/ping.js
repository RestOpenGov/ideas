exports.ping = function(req, res, next) {

  res.send({
    message: "Hi, I'm alive",
    date: new Date()
  });

};

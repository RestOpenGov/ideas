
var User = require('../db.js').models.User;

module.exports = {

  list: function(req, res, next) {

    User.findAll().success(function(users) {
      res.send(users);
    });

  },

  count: function(req, res, next) {

    User.count().success(function(count) {
      res.send(count.toString());
    });

  },

  show: function(req, res, next) {

    User.find(parseInt(req.params.id, 10)).success(function(user) {
      res.send(user);
    });

  }

};

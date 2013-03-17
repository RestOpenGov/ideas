var User = require('../db.js').models.User;

module.exports = {

  list: function(req, res, next) {
    User.findAll().success(function(users) {
      res.send(users);
    });
  },

  show: function(req, res, next) {
    User.find(parseInt(req.params.id, 10)).success(function(user) {
      res.send(user);
    });
  }

};

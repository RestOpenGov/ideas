

var UsersController = {

  list: function(req, res, next) {

    var User = UsersController.models.User;

    User.findAll().success(function(users) {
      res.send(users);
    });
  },

  count: function(req, res, next) {

    var User = UsersController.models.User;

    User.count().success(function(count) {
      res.send(count.toString());
    });
  },

  show: function(req, res, next) {

    var User = UsersController.models.User;

    User.find(parseInt(req.params.id, 10)).success(function(user) {
      res.send(user);
    });
  }

};

module.exports = UsersController;


var IdeaType = require('../db.js').models.IdeaType;

module.exports = {

  list: function(req, res, next) {

    IdeaType.findAll().success(function(ideaTypes) {
      res.send(ideaTypes);
    });

  },

  count: function(req, res, next) {

    IdeaType.count().success(function(count) {
      res.send(count.toString());
    });

  },

  show: function(req, res, next) {

    IdeaType.find(parseInt(req.params.id, 10)).success(function(ideaType) {
      res.send(ideaType);
    });

  }

};

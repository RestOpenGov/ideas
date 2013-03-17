var IdeaType = require('../db.js').models.IdeaType;

module.exports = {

  list: function(req, res, next) {
    IdeaType.findAll().success(function(ideaTypes) {
      res.send(ideaTypes);
    });
  },

  show: function(req, res, next) {
    console.log(req.params);
    IdeaType.find(parseInt(req.params.id, 10)).success(function(ideaType) {
      res.send(ideaType);
    });
  }

};

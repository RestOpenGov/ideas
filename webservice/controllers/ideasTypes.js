var IdeaType = require('../models/db.js').models.IdeaType;

exports.list = function(req, res, next) {
  IdeaType.findAll().success(function(ideaTypes) {
    res.send(ideaTypes);
  });
};

exports.show = function(req, res, next) {
  console.log(req.params);
  IdeaType.find(parseInt(req.params.id, 10)).success(function(ideaType) {
    res.send(ideaType);
  });
};


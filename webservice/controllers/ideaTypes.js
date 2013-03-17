
var IdeaTypesController = {

  list: function(req, res, next) {

    var IdeaType = IdeaTypesController.models.IdeaType;

    IdeaType.findAll().success(function(ideaTypes) {
      res.send(ideaTypes);
    });

  },

  count: function(req, res, next) {

    var IdeaType = IdeaTypesController.models.IdeaType;

    IdeaType.count().success(function(count) {
      res.send(count.toString());
    });
  },

  show: function(req, res, next) {

    var IdeaType = IdeaTypesController.models.IdeaType;

    IdeaType.find(parseInt(req.params.id, 10)).success(function(ideaType) {
      res.send(ideaType);
    });

  }

};

module.exports = IdeaTypesController;

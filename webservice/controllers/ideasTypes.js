
var IdeasTypesController = {

  list: function(req, res, next) {

    var IdeaType = IdeasTypesController.models.IdeaType;

    IdeaType.findAll().success(function(ideaTypes) {
      res.send(ideaTypes);
    });

  },

  show: function(req, res, next) {

    var IdeaType = IdeasTypesController.models.IdeaType;

    IdeaType.find(parseInt(req.params.id, 10)).success(function(ideaType) {
      res.send(ideaType);
    });

  }

};

module.exports = IdeasTypesController;

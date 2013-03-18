
Model = require('../db.js').models.IdeaType

module.exports =

  list: (req, res, next) ->
    Model.findAll().success (models) ->
      res.send models

  count: (req, res, next) ->
    Model.count().success (count) ->
      res.send count.toString()

  show: (req, res, next) ->
    id = parseInt(req.params.id, 10)
    Model.find(id).success (model) ->
      res.send model

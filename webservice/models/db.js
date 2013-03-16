var config = require('../config.json');
var Sequelize = require('sequelize');

var db = new Sequelize(
  config.database,
  config.username,
  config.password,
  {
    define: {
      freezeTableName: true,
      timestamps: false
    }
  }
);
db.addModel = function(name) {

  this.import(__dirname + '/' + name);
}
db.models = {};
db.models.User = db.addModel('user');
db.models.IdeaType = db.addModel('ideaType');

module.exports = db;

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
  var modelName = name.charAt(0).toUpperCase() + name.slice(1);
  this.models = this.models || {};
  this.models[modelName] = this.import(__dirname + '/' + name);
};

db.addModel('user');
db.addModel('ideaType');

module.exports = db;


var Sequelize    = require('sequelize'),
    config       = require('./conf/database.json'),
    importModels = require('./utils/import-models.js');

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

db.models = importModels(db, __dirname + '/models/');

module.exports = db;

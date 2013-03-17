
module.exports = function(sequelize, DataTypes) {
  return sequelize.define('user', {
    nickname : DataTypes.STRING,
    name     : DataTypes.STRING
  });
};

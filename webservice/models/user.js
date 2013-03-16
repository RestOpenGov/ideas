
module.exports = function(sequelize, DataTypes) {
  return sequelize.define('User', {
    title: DataTypes.STRING,
    description: DataTypes.TEXT
  });
};

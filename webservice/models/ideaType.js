
module.exports = function(sequelize, DataTypes) {
  return sequelize.define('idea_type', {
    name        : DataTypes.STRING //,
    // description : DataTypes.STRING
  });
};

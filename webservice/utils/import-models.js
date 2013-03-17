var fs   = require('fs'),
    path = require('path');

module.exports = function(db, folder) {
  var imported = {};

  fs.readdirSync(folder).forEach(function(file) {
    var modelName = path.basename(file, '.js'), // get rid of the .js extension
        fullPath  = path.join(folder, file);

    imported[modelName] = db.import(fullPath);
    console.log('Loaded', modelName, 'model from', fullPath);
  });

  return imported;
};

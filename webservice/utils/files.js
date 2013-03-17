// NOT USED!

var fs  = require('fs'),
    _   = require('underscore');

module.exports = {
  forEach: function(fileSpec, iterator) {
    fs.readdir(fileSpec, function(err, files) {
      _.each(files, iterator);
    });
  },

  requireAll: function(path, callback) {
    var required = {};
    fs.readdirSync(path).forEach(function(file) {
      required[file] = require(path + '/' + file);
      console.log(path + '/' + file);
    });
    callback(required);
  }

};

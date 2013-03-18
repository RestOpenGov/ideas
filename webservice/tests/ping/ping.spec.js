
// it("should respond with hello world", function(done) {
//   request("http://localhost:3000/hello", function(error, response, body){
//     expect(body).toEqual("hello world");
//     done();
//   });
// });

var request = require('http'),
    url     = 'http://localhost:1337/';

describe('webservice', function() {

  it('should respond to /ping', function(done) {
    console.log('x');
    request.get(url + 'ping', function(res) {
      // console.log(res.statusCode);
      console.log(res);
      expect(res.statusCode).toBe(200);
      done();
    });

  });

});


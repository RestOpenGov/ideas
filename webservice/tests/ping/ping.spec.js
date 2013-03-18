
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
    // expect('failed').toBe('will fail');
    request.get(url + 'ping', function(res) {
      expect(res.statusCode).toBe(200);
      res.on('data', function(body) {
        var json = JSON.parse(body);
        expect(json.message).toBe("Hi, I'm alive");
        expect(json.date).toBeDefined();
        done();
      });
    });

  });

});


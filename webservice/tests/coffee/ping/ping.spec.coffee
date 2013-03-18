
request = require('http')
url     = 'http://localhost:1337/'

describe 'basic coffee test', ->
  it 'should pass', ->
    expect(1+2).toBe(3)

describe 'web service', ->


  it 'should respond to /ping', (done) ->
    request.get url + 'ping', (res) ->
      expect(res.statusCode).toBe 200
      res.on 'data', (body) ->
        json = JSON.parse(body)
        expect(json.message).toBe "Hi, I'm alive"
        expect(json.date).toBeDefined()
        done()

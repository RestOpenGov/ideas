
exports.ping = (req, res, next) ->

  console.log 'got pinged! at', (new Date()).toString()

  res.send
    message: "Hi, I'm alive",
    date: new Date()

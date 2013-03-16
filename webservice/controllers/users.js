
exports.list = function(req, res, next) {

  res.send([{
    name: "Mister Nardoz",
    avatar: "http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg",
    email: "nardoz@hotmail.com",
    url: "/api/users/1",
    id: 1,
    created: "2012-09-23T10:45:00Z",
    nickname: "nardoz"
  }]);

  return next();
};

exports.show = function(req, res, next) {

  res.send({
    name: "Mister Nardoz",
    avatar: "http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg",
    email: "nardoz@hotmail.com",
    url: "/api/users/1",
    id: 1,
    created: "2012-09-23T10:45:00Z",
    nickname: "nardoz"
  });

  return next();
};


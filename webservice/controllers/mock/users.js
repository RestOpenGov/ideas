
module.exports = {

  list: function(req, res, next) {

    res.send([
      {
        id: 1,
        nickname: "nardoz",
        name: "Mister Nardoz",
        email: "nardoz@hotmail.com",
        avatar: "http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg",
        application_token: "",
        token_expiration: "1970-01-01T03:00:00.000Z",
        created: "2012-09-23T14:45:00.000Z"
      },
      {
        id: 2,
        nickname: "opensas",
        name: "Sebastian Scarano",
        email: "scarano@hotmail.com",
        avatar: "http://a0.twimg.com/profile_images/1557699557/penguin_armed_normal.jpg",
        application_token: "opensas",
        token_expiration: "2014-01-01T03:00:00.000Z",
        created: "2012-09-22T13:40:00.000Z"
      }
    ]);

  },

  show: function(req, res, next) {

    res.send({
      name: "Mister Nardoz",
      avatar: "http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg",
      email: "nardoz@hotmail.com",
      url: "/api/users/1",
      id: 1,
      created: "2012-09-23T10:45:00Z",
      nickname: "nardoz"
    });

  }

}

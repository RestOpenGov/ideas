This is the backend web service for ideas v2.0 reloaded with Node.js
====================================================================

# Getting started

To get started playing around with the ideas backend in your local workstation
follow these steps:

Prerequisites:

- node v0.10.0 or higher
- mysql 5.5 or higher

# Clone the repository:

    git clone git@github.com:RestOpenGov/ideas.git

    cd ideas

# Database setup

Restore the database backup from docs/data/ideas-bootstrap.mysql

The sql script will create a database called 'ideas'. Edit the script if you'd
like to use a different name.

Create a mysql user and assign select, update, insert y delete permissions on
the 'ideas' database.

Create a webservice/conf/database.json file to coonfigure the correct database,
username and password. You can use webservice/conf/database.json.template file
to get started. (Note that for security reasons the databse.json file won't be
commited to git.)

# Start the server

    cd ideas/webservice

Resolve all the dependencies

    npm install

Start the server

    $ node app.js
    Loaded IdeaType model from /home/sas/tmp/ideas/webservice/models/IdeaType.js
    Loaded User model from /home/sas/tmp/ideas/webservice/models/User.js
    Ideas listening at http://0.0.0.0:1337

and then browse to:

    http://localhost:1337

Congrats! You have (this VERY PRELIMINAR version of) ideas working!

Now go ahead and have a look at the code.

# Testing

Install jasmine-node

    npm install jasmine-node -g


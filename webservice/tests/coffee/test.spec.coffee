
# $ jasmine-node --verbose --coffee tests/coffee/

describe 'jasmine-node', ->

  it 'should fail', ->
    console.log 'failed test from coffee'
    expect(1+2).toEqual 4

  it 'should pass', ->
    console.log 'passed test from coffee'
    expect(1+2).toEqual 3

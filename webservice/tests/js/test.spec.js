describe('jasmine-node', function() {

  it('should fail', function() {
    console.log('failed test from js');
    expect(1+2).toEqual(4);
  });

  it('should pass', function() {
    console.log('passed test from js');
    expect(1+2).toEqual(3);
  });

});

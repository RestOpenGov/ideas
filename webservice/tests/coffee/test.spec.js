// Generated by CoffeeScript 1.6.2
describe('jasmine-node', function() {
  it('should fail', function() {
    console.log('failed test from coffee');
    return expect(1 + 2).toEqual(4);
  });
  return it('should pass', function() {
    console.log('passed test from coffee');
    return expect(1 + 2).toEqual(3);
  });
});

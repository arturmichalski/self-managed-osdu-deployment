/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.22
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SelfManagedOsdu);
  }
}(this, function(expect, SelfManagedOsdu) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('FileLocationRequest', function() {
      beforeEach(function() {
        instance = new SelfManagedOsdu.FileLocationRequest();
      });

      it('should create an instance of FileLocationRequest', function() {
        // TODO: update the code to test FileLocationRequest
        expect(instance).to.be.a(SelfManagedOsdu.FileLocationRequest);
      });

      it('should have the property fileID (base name: "FileID")', function() {
        // TODO: update the code to test the property fileID
        expect(instance).to.have.property('fileID');
        // expect(instance.fileID).to.be(expectedValueLiteral);
      });

    });
  });

}));
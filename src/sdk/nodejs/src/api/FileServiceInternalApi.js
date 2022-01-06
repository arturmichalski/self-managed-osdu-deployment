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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FileApplicationError', 'model/FileListRequest', 'model/FileListResponse', 'model/FileLocationRequest', 'model/FileLocationResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FileApplicationError'), require('../model/FileListRequest'), require('../model/FileListResponse'), require('../model/FileLocationRequest'), require('../model/FileLocationResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.SelfManagedOsdu) {
      root.SelfManagedOsdu = {};
    }
    root.SelfManagedOsdu.FileServiceInternalApi = factory(root.SelfManagedOsdu.ApiClient, root.SelfManagedOsdu.FileApplicationError, root.SelfManagedOsdu.FileListRequest, root.SelfManagedOsdu.FileListResponse, root.SelfManagedOsdu.FileLocationRequest, root.SelfManagedOsdu.FileLocationResponse);
  }
}(this, function(ApiClient, FileApplicationError, FileListRequest, FileListResponse, FileLocationRequest, FileLocationResponse) {
  'use strict';

  /**
   * FileServiceInternal service.
   * @module api/FileServiceInternalApi
   * @version 0.11.0
   */

  /**
   * Constructs a new FileServiceInternalApi. 
   * @alias module:api/FileServiceInternalApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the allowsTheApplicationToAuditTheAttemptedFileUploadsTheMethodIsInternalAndIsNotAvailableForThirdPartyApplications_ operation.
     * @callback module:api/FileServiceInternalApi~allowsTheApplicationToAuditTheAttemptedFileUploadsTheMethodIsInternalAndIsNotAvailableForThirdPartyApplications_Callback
     * @param {String} error Error message, if any.
     * @param {module:model/FileListResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Allows the application to audit the attempted file uploads. The method is internal and is not available for third-party applications.
     * @param {String} dataPartitionId Specifies the data partition to use. This should either be the partition name or crm account ID associated with the partition.
     * @param {Object} opts Optional parameters
     * @param {module:model/FileListRequest} opts.body 
     * @param {module:api/FileServiceInternalApi~allowsTheApplicationToAuditTheAttemptedFileUploadsTheMethodIsInternalAndIsNotAvailableForThirdPartyApplications_Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FileListResponse}
     */
    this.allowsTheApplicationToAuditTheAttemptedFileUploadsTheMethodIsInternalAndIsNotAvailableForThirdPartyApplications_ = function(dataPartitionId, opts, callback) {
      opts = opts || {};
      var postBody = opts['body'];

      // verify the required parameter 'dataPartitionId' is set
      if (dataPartitionId === undefined || dataPartitionId === null) {
        throw new Error("Missing the required parameter 'dataPartitionId' when calling allowsTheApplicationToAuditTheAttemptedFileUploadsTheMethodIsInternalAndIsNotAvailableForThirdPartyApplications_");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
        'data-partition-id': dataPartitionId
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = FileListResponse;

      return this.apiClient.callApi(
        '/api/file/v2/getFileList', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the returnsFileLocationAndDriver_ operation.
     * @callback module:api/FileServiceInternalApi~returnsFileLocationAndDriver_Callback
     * @param {String} error Error message, if any.
     * @param {module:model/FileLocationResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Returns file `Location` and `Driver`.
     * @param {String} dataPartitionId Specifies the data partition to use. This should either be the partition name or crm account ID associated with the partition.
     * @param {Object} opts Optional parameters
     * @param {module:model/FileLocationRequest} opts.body 
     * @param {module:api/FileServiceInternalApi~returnsFileLocationAndDriver_Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FileLocationResponse}
     */
    this.returnsFileLocationAndDriver_ = function(dataPartitionId, opts, callback) {
      opts = opts || {};
      var postBody = opts['body'];

      // verify the required parameter 'dataPartitionId' is set
      if (dataPartitionId === undefined || dataPartitionId === null) {
        throw new Error("Missing the required parameter 'dataPartitionId' when calling returnsFileLocationAndDriver_");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
        'data-partition-id': dataPartitionId
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = FileLocationResponse;

      return this.apiClient.callApi(
        '/api/file/v2/getFileLocation', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[9],{

/***/ 2421:
/***/ (function(module, exports, __webpack_require__) {

"use strict";
var _interopRequireDefault=__webpack_require__(0);var _typeof=__webpack_require__(10);Object.defineProperty(exports,"__esModule",{value:true});exports["default"]=void 0;var _extends2=_interopRequireDefault(__webpack_require__(5));var _react=_interopRequireWildcard(__webpack_require__(1));var _reactRouterDom=__webpack_require__(29);var _strapiHelperPlugin=__webpack_require__(7);var _permissions=_interopRequireDefault(__webpack_require__(278));function _getRequireWildcardCache(nodeInterop){if(typeof WeakMap!=="function")return null;var cacheBabelInterop=new WeakMap();var cacheNodeInterop=new WeakMap();return(_getRequireWildcardCache=function _getRequireWildcardCache(nodeInterop){return nodeInterop?cacheNodeInterop:cacheBabelInterop;})(nodeInterop);}function _interopRequireWildcard(obj,nodeInterop){if(!nodeInterop&&obj&&obj.__esModule){return obj;}if(obj===null||_typeof(obj)!=="object"&&typeof obj!=="function"){return{"default":obj};}var cache=_getRequireWildcardCache(nodeInterop);if(cache&&cache.has(obj)){return cache.get(obj);}var newObj={};var hasPropertyDescriptor=Object.defineProperty&&Object.getOwnPropertyDescriptor;for(var key in obj){if(key!=="default"&&Object.prototype.hasOwnProperty.call(obj,key)){var desc=hasPropertyDescriptor?Object.getOwnPropertyDescriptor(obj,key):null;if(desc&&(desc.get||desc.set)){Object.defineProperty(newObj,key,desc);}else{newObj[key]=obj[key];}}}newObj["default"]=obj;if(cache){cache.set(obj,newObj);}return newObj;}var EditView=/*#__PURE__*/(0,_react.lazy)(function(){return Promise.all(/* import() */[__webpack_require__.e(1), __webpack_require__.e(2)]).then(__webpack_require__.t.bind(null, 2499, 7));});var EditSettingsView=/*#__PURE__*/(0,_react.lazy)(function(){return __webpack_require__.e(/* import() */ 0).then(__webpack_require__.t.bind(null, 2419, 7));});var SingleTypeRecursivePath=function SingleTypeRecursivePath(props){var _useRouteMatch=(0,_reactRouterDom.useRouteMatch)(),url=_useRouteMatch.url;var _useParams=(0,_reactRouterDom.useParams)(),slug=_useParams.slug;return/*#__PURE__*/_react["default"].createElement(_react.Suspense,{fallback:/*#__PURE__*/_react["default"].createElement(_strapiHelperPlugin.LoadingIndicatorPage,null)},/*#__PURE__*/_react["default"].createElement(_reactRouterDom.Switch,null,/*#__PURE__*/_react["default"].createElement(_reactRouterDom.Route,{path:"".concat(url,"/ctm-configurations/edit-settings/:type"),render:function render(routeProps){return/*#__PURE__*/_react["default"].createElement(_strapiHelperPlugin.CheckPagePermissions,{permissions:_permissions["default"].singleTypesConfigurations},/*#__PURE__*/_react["default"].createElement(EditSettingsView,(0,_extends2["default"])({},props,routeProps,{slug:slug})));}}),/*#__PURE__*/_react["default"].createElement(_reactRouterDom.Route,{path:"".concat(url),render:function render(routeProps){return/*#__PURE__*/_react["default"].createElement(EditView,(0,_extends2["default"])({},props,routeProps,{slug:slug}));}})));};var _default=SingleTypeRecursivePath;exports["default"]=_default;

/***/ })

}]);
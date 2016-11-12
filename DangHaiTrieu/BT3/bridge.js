"use strict";
function Bridge(container, superKey) {
    this.container = container;
    this.superKey = superKey;
}

module.exports = function (container, superKey) {
    return new Bridge(container, superKey);
};
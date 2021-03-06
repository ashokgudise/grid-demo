/// <reference path="../../../source/typescript/smart.elements.d.ts" />
window.onload = function () {
    const tabs = [].slice.call(document.getElementsByTagName('smart-tabs')), reorder = document.getElementById('reorder'), log = document.getElementById('log');
    tabs.map(function (t) {
        t.addEventListener('reorder', function (event) {
            const target = event.target;
            log.innerHTML = 'Moved a tab from position ' + event.detail.originalIndex + ' to position ' + event.detail.newIndex + ' in <em>' + target.id + '</em>.';
        });
    });
    reorder.addEventListener('click', function () {
        tabs[0].getElementsByTagName('smart-tab-item')[3].index = 0;
    });
};

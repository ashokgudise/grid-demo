/// <reference path="../../../source/typescript/smart.elements.d.ts" />

import { Table, TableColumn } from "../../../source/typescript/smart.elements"

const data: any[] = [],
    columns: TableColumn[] = [];

for (let i = 65; i < 91; i++) {
    const letter: string = String.fromCharCode(i);

    columns.push({ label: letter, dataField: letter, width: 100 });
}

for (let i = 0; i < 10000; i++) {
    const dataPoint: any = {};

    for (let j = 65; j < 91; j++) {
        const letter: string = String.fromCharCode(j);
        dataPoint[String.fromCharCode(j)] = letter + i;
    }

    data.push(dataPoint);
}

window.Smart('#table', class {
    get properties() {
        return {
            dataSource: data,
            freezeHeader: true,
            keyboardNavigation: true,
            virtualization: true,
            columns: columns
        };
    }
});

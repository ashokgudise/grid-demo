/// <reference path="../../../source/typescript/smart.elements.d.ts" />
const data = Array(10);
data[0] = { A: 10, C: 1, D: 'Hello' };
data[1] = { A: '=A1+1', C: 2, D: 'world' };
data[2] = { A: '=A2+1', C: 3, D: '=D1&" "&D2&"!"' };
data[3] = { C: '=SUM(C1:C3)' };
data[7] = { F: '=8+2' };
data[8] = { F: '=PI()' };
data[9] = { A: 10, B: 20, C: 30, D: 11, E: 21, G: '=MAX(A10:E10)' };
window.Smart('#table', class {
    get properties() {
        return {
            dataSource: new window.Smart.DataAdapter({
                dataSource: data,
                dataFields: [
                    'A: string',
                    'B: string',
                    'C: string',
                    'D: string',
                    'E: string',
                    'F: string',
                    'G: string'
                ]
            }),
            editing: true,
            formulas: true,
            keyboardNavigation: true,
            columns: [
                { label: 'A', dataField: 'A' },
                { label: 'B', dataField: 'B' },
                { label: 'C', dataField: 'C' },
                { label: 'D', dataField: 'D' },
                { label: 'E', dataField: 'E' },
                { label: 'F', dataField: 'F' },
                { label: 'G', dataField: 'G' }
            ]
        };
    }
});

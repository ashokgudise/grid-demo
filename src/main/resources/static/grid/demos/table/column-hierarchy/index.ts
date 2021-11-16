/// <reference path="../../../source/typescript/smart.elements.d.ts" />

import { Table } from "../../../source/typescript/smart.elements"

declare global {
    interface Window {
        generateData: (rowscount: number) => any[];
    }
}

window.Smart('#table', class {
    get properties() {
        return {
            columnReorder: true,
            dataSource: new window.Smart.DataAdapter({
                dataSource: window.generateData(50),
                dataFields: [
                    'id: number',
                    'firstName: string',
                    'lastName: string',
                    'productName: string',
                    'quantity: number',
                    'price: number',
                    'total: number'
                ]
            }),
            freezeHeader: true,
            columns: [
                { label: 'id', dataField: 'id', dataType: 'number', columnGroup: 'productInfo' },
                { label: 'First Name', dataField: 'firstName', dataType: 'string', columnGroup: 'userInfo' },
                { label: 'Last Name', dataField: 'lastName', dataType: 'string', columnGroup: 'userInfo' },
                { label: 'Product Name', dataField: 'productName', dataType: 'string', columnGroup: 'purchaseInfo' },
                { label: 'Quantity', dataField: 'quantity', dataType: 'number', columnGroup: 'productInfo' },
                { label: 'Price', dataField: 'price', dataType: 'number', columnGroup: 'productInfo' },
                { label: 'Total', dataField: 'total', dataType: 'number', columnGroup: 'productInfo' }
            ],
            columnGroups: [
                { label: 'User Info', name: 'userInfo' },
                { label: 'Product Info', name: 'productInfo', parentGroup: 'purchaseInfo' },
                { label: 'Purchase Info', name: 'purchaseInfo' }
            ]
        };
    }
});
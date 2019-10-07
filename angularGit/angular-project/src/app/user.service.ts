import { Injectable } from '@angular/core';

@Injectable({
    providedIn: "root"     //by using this services wikl be available each and every component even we dont need to mention it into app.module.ts also
})

export class UserService{
    users = [
        {
            name: 'rajashekhar',
            company: 'testyantra'
        },
        {
            name: 'sagar',
            company: 'UST Global'
        }
    ];
    printDetails(){
        console.log('the funtion in present inservices is running');
    }

}
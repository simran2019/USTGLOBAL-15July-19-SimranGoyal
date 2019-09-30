 let result = new Promise(function(reject,resolve){
    if(10===10){
         reject('failed');
    }
    else{
        resolve('success');
    }
});
result.then((data)=>{
    console.log('then block='+data);
}).catch((error)=>{
    console.log('catch block='+error);
});

 
let employeeData = new Promise(function(resolve,reject){
    const employee = [
        {
            name: 'sharukh',
            age: 60
        },
        {
            name:'sundari',
            age: 40
        },
        {
            name: 'vikki',
            age: 28
        }
    ];
    if(10>10){
         reject('failed');
    }
    else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    // console.log('then block=',data);
    return data;
}).catch((error)=>{
    console.log('catch block=',error);
}).then(function(data1){
    console.log('This is then block 2',data1);
});

function fun(n){
    if(n===0||n===1){
        return 1;
    }
    else{
        return fun(n-1)*n;
    }
}
let factorialValue = fun(5);
console.log(factorialValue);
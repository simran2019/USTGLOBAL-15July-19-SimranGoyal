// find factorial of function
 var factorial=1;
function getfactorial(n){
 for(var i=1;i<=n;i++)
    {
factorial=factorial*i;
    }
   console.log('factorial='+factorial);
    }
    getfactorial(5);





    var getFact=function(n){
        for(var i=1;i<=n;i++){
        var fact =i*(n-1);
        return fact;
    }
    }
    var fact1=getFact(4);
    console.log(fact1);





    (function(n){
        for(var i=1;i<=n;i++){
            var value=(n-1)*i;
        }
        console.log(value); 
    }(4));




    var fact3=n=>{
        for(var i=1;i<=n;i++){
var d = i*(n-1)
        }
        console.log(d);
    }
    fact3(6)
// fibonacci series

function a(n){
    var n1=0;
    var n2=1;
    var n3=0;
    console.log(n1);
    console.log(n2);
//   var  result=n1+n2;
for(var i=0;i<=n;i++)
{
    n1=n2;
    n2=n3;
    n3=n1+n2;
    console.log(n3);
}
}
console.log(a(3));



var getvalue=function(x){
    var n4=0;
    var n5=1;
    var n6=0;
    console.log(n4);
    console.log(n4);
    for(var i=0;i<=x;i++){
        n4=n5;
        n5=n6;
        n6=n4+n5;
        console.log(n6);
    }
}
var value=getvalue(4);
console.log(value);


(function(y){
    c=0;
    d=1;
    e=0;
    console.log(c);
    console.log(d)
    for(var i=0;i<=y;i++){
        c=d;
        d=e;
        e=c+d;
        console.log(e);

    }
}(3));



var series=z=>{
 c=0;
    d=1;
    e=0;
    console.log(c);
    console.log(d)
    for(var i=0;i<=z;i++){
        c=d;
        d=e;
        e=c+d;
        console.log(e);
}
}
console.log(z(4));

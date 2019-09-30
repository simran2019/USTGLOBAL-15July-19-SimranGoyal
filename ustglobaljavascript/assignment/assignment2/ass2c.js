// circumferance of circle

var circle = function(r){
 return 2*Math.PI*r
}
console.log(circle(3));


function abc(r){
    return 2*Math.PI*r;
}
console.log(abc(3));


var value=(function(r){
    return 2*Math.PI*r;    
}(3))
console.log(value);


var circle=r=>{
    return 2*Math.PI*r;    
}
console.log(circle(3));

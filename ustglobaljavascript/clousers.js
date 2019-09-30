function sum(a,b){
    function addSum(){
        return a+b;
    }
    return addSum;
}
var addFunc = sum(10,20);
var total =addFunc();
console.log('Total',total);

console.log(window);
console.log(this);
console.log(this===window);//for strickly cheack 

var name="simran";
console.log(window.name);
console.log(this.name);

var person={
    name:'simran',
    age:22,
    getName:function(){
        console.log(this);
        console.log(window);
        getData();
        function getData(){
        console.log('Get data Method'+this.name);
        }
        return this.name;

    }
}
var name= person.getName();
console.log('name='+name);

console.log("==============================");

for( var i=0;i<5;i++)
{
    console.log(i);
}
console.log('value of i='+i);

// for( let j=0;j<5;j++)
// {
    // console.log(j);
// }
// console.log('value of j='+j);// hoisting is not possible because it is block scope

var hobbies=['dancing','singing','cricket'];
console.log('hobbies' +hobbies);
var hobbies=['numismatics'];
console.log('Hobbies '+hobbies)
hobbies=['singing'];

// let fruits=['banana','orange','apple'];
// console.log(fruits);
// // let fruits=['mango'];
// console.log(fruits);//re dicleration is not allow in let key word

const vegi=['ladyfingre','tomato','potato'];
console.log(vegi);
vegi[0]=['chips','onion'];
console.log(vegi);




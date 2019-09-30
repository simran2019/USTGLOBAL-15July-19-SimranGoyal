// array

var fruits=['apple','mango','banana','kiwi'];
fruits.push('pineapple');
console.log(fruits);

fruits.pop();
console.log(fruits);

fruits.unshift('cherry');
console.log(fruits);

fruits.shift();
console.log(fruits);

var new_fruits=fruits.includes('apple',0);
console.log(new_fruits);

var new_fruits = fruits.join('-');
console.log( new_fruits);

var new_fruits = fruits.slice('0','3');
console.log( new_fruits);

var new_fruits=fruits.splice(1,1);
console.log(new_fruits);

var new_fruits=fruits.indexOf('chiku')
console.log(new_fruits);






// strings

var name='simran';
var name1 = name.toUpperCase();
console.log(name1);

var name1 = name.charAt(2);
console.log(name1);


var name1 = name.indexOf('r',1);
console.log(name1);


var name1=name.replace('m','p');
console.log(name1);

var name1=name.includes('m',0);
console.log(name1);

var name1=name.indexOf('r',2);
console.log(name1);

var name1=name.search('s');
console.log(name1);

var name1=name.substr('s',4);
console.log(name1);

var name1=name.split('m',2);
console.log(name1);

var name1=name.concat('_goyal');
console.log(name1);


var abc='     goyal     '
var name1=abc.trim();
console.log(name1);


var name2=name1.concat('simran');
console.log(name2);













//  print table in html
document.getElementById('tb1').innerHTML=`
<table>

    <tr>
        <th>enam</th>
        <th>id</th>
        <th>roll</th>
    </tr>
    <tr>
        <td>simran</td>
        <td>23</td>
        <td>123</td>
    </tr>
</table>
`
// create object with new keyword
 person = new Object()
 
     person.age=23;
person.name = "simran";
person.DOB = "27-07-1997";
console.log(person.age);
console.log(person.DOB);
console.log(person.name);


// create object without new keyword
 var iperson = {
    name :'simran',
    age : 23,
    DOB : '27-07-1997'
}
console.log(iperson);
 
var car={
    name:'farari',
    name2:'odi',
}
// for in loop for object
for(var index in car){
    console.log(car[index]);
}
console.log (car);

// crete array without new 
 var Student = ['simran','kartik' , 'luqhmaan' , 'ranu'];
for(i=0;i<Student.length;i++){
    console.log(Student[i]);
}
// for of loop for array
for( var x of Student){
    console.log(x);
}

console.log(Student);
  
// create an array with new keyword
var Student = new Array('nikki' , 'prinya' , 'simi');
console.log(Student[0]);
console.log(Student[1]);
console.log(Student[2]);
console.log(Student);


// create table by using js


let tb = document.createElement('table');
let tr1 = document.createElement('tr')
tb.appendChild(tr1);

let th1 = document.createElement('th');
th1.textContent='name';
tr1.appendChild(th1);


let th2 = document.createElement('th');
th2.textContent='rollno';
tr1.appendChild(th2);

tb.style.border = '2px solid black';
th1.style.border = '2px solid black';
th2.style.border = '2px solid black';

tb.style.borderCollapse = 'collapse';
console.log(tb);
document.body.appendChild(tb);


// normal alert or som eevent

function myFun(){
    alert('hii how are you');
}

function mytext(){
    let t1 = document.getElementById('tex1');
    t1.textContent='my name is simran HAHAHAHA';
}
function mytext1(){
    let t1 = document.getElementById('tex1');
    t1.textContent='';

}

//=========diff types of function===

var person = function(p1){       //type 1
    return p1+6;
}
 var get = person(4);
 console.log(get);

 (function(p2){                // type 2
 var e = p2 +8;
console.log(e);
 }(8))

 function p3(a){                   // type 3
     return a + 6;
 } 
 console.log(p3(6));

 var p4 = z=>{                   // type 4
     return z*9;
 }
 console.log(p4(4));
 

 //===========
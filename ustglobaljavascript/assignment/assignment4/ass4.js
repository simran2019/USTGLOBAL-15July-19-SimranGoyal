let tb=document.createElement('table');
let tr1=document.createElement('tr');
tb.appendChild(tr1);

let trd1=document.createElement('td');
trd1.textContent="name";
tr1.appendChild(trd1);

let trd2=document.createElement('td');
trd2.textContent="age";
tr1.appendChild(trd2);
 
let tr2=document.createElement('tr');
tb.appendChild(tr2);
 
let trd3=document.createElement('td');
trd3.textContent='simran';
tr2.appendChild(trd3);

let trd4=document.createElement('td');
trd4.textContent='21';
tr2.appendChild(trd4);

let tr3=document.createElement('tr');
tb.appendChild(tr3);

let trd5=document.createElement('td');
trd5.textContent='luqhmaan';
tr3.appendChild(trd5);

let trd6=document.createElement('td');
trd6.textContent='22';
tr3.appendChild(trd6);

tb.style.border=' 2px solid black';
tr1.style.border=' 2px solid black';
tr2.style.border= '2px solid black';
tr3.style.border= '2px solid black';

trd1.style.border= '2px solid black';
trd2.style.border='2px solid black';
trd3.style.border='2px solid black';
trd4.style.border='2px solid black';
trd5.style.border='2px solid black';
trd6.style.border='2px solid black';

trd1.style.padding='5px';
trd2.style.padding='5px';
trd3.style.padding='5px';
trd4.style.padding='5px';
trd5.style.padding='5px';
trd6.style.padding='5px';

tb.style.borderCollapse='collapse';

console.log(tb);
document.body.appendChild(tb);




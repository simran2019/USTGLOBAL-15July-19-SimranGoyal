let order=document.createElement('ol');
let list=document.createElement('li');
list.textContent='apple';
order.appendChild(list);
let list1=document.createElement('li');
list1.textContent='banana';
order.appendChild(list1);

console.log(order);
document.body.appendChild(order);

let unorder=document.createElement('ul');
let list2=document.createElement('li');
list2.textContent='simran';
unorder.appendChild(list2);
let list3=document.createElement('li');
list3.textContent='simu';
unorder.appendChild(list3);
let list4=document.createElement('li');
list4.textContent='simi';
unorder.appendChild(list4);

console.log(unorder);
document.body.appendChild(unorder);

